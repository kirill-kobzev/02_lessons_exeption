public class Main {

    public static void main(String[] args) {

        MathBox mathBox = new MathBox();

//        System.out.println(mathBox.summa(5,5));

//        System.out.println(mathBox.diff(10,5));

//        System.out.println(mathBox.factorial(17));

//        System.out.println( mathBox.dividerExceptionInside(5, 0));

        try {
            System.out.println(mathBox.divider(0,2));
        }catch(Exception e){
            System.out.println(e);
        }






    }
}
