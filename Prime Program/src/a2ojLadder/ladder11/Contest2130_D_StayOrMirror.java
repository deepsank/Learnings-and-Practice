package a2ojLadder.ladder11;

import java.util.*;

public class Contest2130_D_StayOrMirror {

    static class FenwickTree {
        int[] tree;
        int size;

        FenwickTree(int n) {
            size = n + 2;
            tree = new int[size];
        }

        void update(int index, int value) {
            while (index < size) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int query(int index) {
            int result = 0;
            while (index > 0) {
                result += tree[index];
                index -= index & -index;
            }
            return result;
        }

        int query(int left, int right) {
            return query(right) - query(left - 1);
        }

        void reset() {
            Arrays.fill(tree, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();

            int[] option1 = new int[n];
            int[] option2 = new int[n];
            for (int i = 0; i < n; i++) {
                option1[i] = p[i];
                option2[i] = 2 * n - p[i] + 1;
            }

            // Collect all values for coordinate compression
            int[] all = new int[2 * n];
            for (int i = 0; i < n; i++) {
                all[i] = option1[i];
                all[n + i] = option2[i];
            }

            // Coordinate compression
            Map<Integer, Integer> map = new HashMap<>();
            Arrays.sort(all);
            int idx = 1;
            for (int x : all) {
                if (!map.containsKey(x)) map.put(x, idx++);
            }

            for (int i = 0; i < n; i++) {
                option1[i] = map.get(option1[i]);
                option2[i] = map.get(option2[i]);
            }

            // DP to try each option
            int[] dp0 = new int[n]; // using option1
            int[] dp1 = new int[n]; // using option2

            FenwickTree ft = new FenwickTree(2 * n);
            for (int i = n - 1; i >= 0; i--) ft.update(option1[i], 1);
            for (int i = 0; i < n; i++) {
                ft.update(option1[i], -1);
                dp0[i] = ft.query(option1[i] - 1);
                ft.update(option1[i], 1);
            }

            ft.reset();
            for (int i = n - 1; i >= 0; i--) ft.update(option2[i], 1);
            for (int i = 0; i < n; i++) {
                ft.update(option2[i], -1);
                dp1[i] = ft.query(option2[i] - 1);
                ft.update(option2[i], 1);
            }

            // Try combination
            int total = Integer.MAX_VALUE;
            for (int mask = 0; mask < (1 << n); mask++) {
                if (n > 20) break; // brute-force only for small n
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) == 0) a[i] = option1[i];
                    else a[i] = option2[i];
                }
                total = Math.min(total, countInversions(a));
            }

            if (n <= 20) {
                System.out.println(total + " ");
            } else {
                // Greedy pick
                int totalGreedy = 0;
                List<Integer> arr = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int inv0 = dp0[i];
                    int inv1 = dp1[i];
                    if (inv0 <= inv1) arr.add(option1[i]);
                    else arr.add(option2[i]);
                }
                System.out.println(countInversions(arr) + " ");
            }
        }
    }

    static int countInversions(int[] arr) {
        int max = 0;
        for (int val : arr) max = Math.max(max, val);
        FenwickTree ft = new FenwickTree(max + 2);
        int inv = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            inv += ft.query(arr[i] - 1);
            ft.update(arr[i], 1);
        }
        return inv;
    }

    static int countInversions(List<Integer> list) {
        int max = Collections.max(list);
        FenwickTree ft = new FenwickTree(max + 2);
        int inv = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            inv += ft.query(list.get(i) - 1);
            ft.update(list.get(i), 1);
        }
        return inv;
    }
}
