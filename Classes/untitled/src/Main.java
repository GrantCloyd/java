public class Main {

    public static void  main(String[] args){
        Car firstCar = new Car();
        Car secondCar = new Car();

        firstCar.setModel("Porsche");
        System.out.println("Model for first car is " + firstCar.getModel());
        secondCar.setModel("Ford");
        System.out.println("Model for second car is " + secondCar.getModel());
    }
}
