package Learning.OOPs.Polymorphism;

public class MethodOverloading {

    private int id;
    private String name;
    final private static int roll = 0;

    public MethodOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static float add (float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverloading.add((int) 5.5, (int) 6.5));
    }

    public static void main(String[] args,int a) {

    }

}
