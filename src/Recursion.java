public class Recursion {

    static int count;

    public static void recursion(){

        count++;
        try{
            recursion();
        }catch (StackOverflowError e){
            System.out.println("Exeption вылетел при count = " + count);
        }

    }

}
