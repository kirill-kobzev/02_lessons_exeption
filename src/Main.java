public class Main {

    public static void main(String[] args) {

        NullPoint nullPoint = new NullPoint();

        try {
            nullPoint.nullPoint(null, "Здесь могла быть ваша реклама");
        }catch (NullPointerException e){
            System.out.println("Метод принял объект null");
        }

    }
}
