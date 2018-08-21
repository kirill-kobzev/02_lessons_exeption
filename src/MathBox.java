public class MathBox {

    public int summa (Integer a, Integer b){

            return a + b;
        }


    public int diff (Integer a, Integer b){
        return a-b;
    }

    public long factorial (Integer a){

        try{
            factorial(a);
        }catch (StackOverflowError e){
            System.out.println("Поймали StackOverflowError");
        }

        return a;
    }

    public double dividerExceptionInside(Integer a, Integer b) {

        if (a != 0 && b != 0) {
            double res = a / b;
            return res;
        } else {
            return 0;
        }

    }

    public double divider (Integer a, Integer b) throws Exception {

        if (b != 0) {
            double res = a / b;
            return res;
        } else {
            throw new NullPoint("На 0 делить нельзя");
        }

    }



}
