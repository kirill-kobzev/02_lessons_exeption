public class Main {

    public static void main(String[] args) {

        NullPoint nullPoint = new NullPoint();

        try {
            nullPoint.nullPoint(null);
        }catch (NullPointerException e){
            System.out.println("Метод принял объект null");
        }

    }
}
