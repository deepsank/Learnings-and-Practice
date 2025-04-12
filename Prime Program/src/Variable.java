public class Variable {

    public static void main(String[] args) {
        byte a = 12;
        char x= '3';
        int y= 80000000;
        char z= (char) y;
        System.out.println(y);
        System.out.println(z);

        long aaaa = 1;
        int bbbb = (int) aaaa;
        System.out.println(bbbb++);
        System.out.println(++bbbb);
    }
}
