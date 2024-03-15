public class CarTest {
    public static void main(String[] args) {
        Car araba1 = new Car();
        araba1.carInfo();

        Car araba2 = new Car(Color.SARI);
        araba2.carInfo();

        Car araba3 = new Car("BMW");
        araba3.carInfo();

        Car araba4 = new Car(2.1);
        araba4.carInfo();

        Car araba5 = new Car(Color.MAVI,"Mercedes");
        araba5.carInfo();

        Car araba6 = new Car(Color.YESIL, 3.4);
        araba6.carInfo();

        Car araba7 = new Car("Fiat", 1.9);
        araba7.carInfo();

        Car araba8 = new Car(Color.KIRMIZI, "Tesla", 3.8);
        araba8.carInfo();

        Modified.modifiedCar(araba1, Color.YESIL);
        araba1.carInfo();

        Modified.modifiedInfo();
    }
}