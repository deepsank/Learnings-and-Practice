package Learning.ExceptionHandling;

public class FinallyBlock {

    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            System.out.println(arr[8]);
        }
        catch (Exception e)
        {
            System.out.println("Exception Handled");
            throw e;
        }
        finally {
            System.out.println("Inside finally");
        }
        System.out.println("Out of try catch");
    }
}
