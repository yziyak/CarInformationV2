public class Car {
    private double motor;
    private String model;
    private Color color;
    private static int count;

    Car() {
        this(Color.BEYAZ, "Belli Değil", 0.0);
    }

    Car(String model, double motor) {
        this(Color.BEYAZ, model, motor);
    }

    Car(Color color, double motor) {
        this(color, "Belli değil", motor);
    }

    Car(Color color, String model) {
        this(color, model, 0.0);
    }

    Car(Color color) {
        this(color, "Belli değil", 0.0);
    }

    Car(String model) {
        this(Color.BEYAZ, model, 0.0);
    }

    Car(double motor) {
        this(Color.BEYAZ, "Belli değil", motor);
    }

    public Car(Color color, String model, double motor) {
        this.color = color;
        this.model = model;
        this.motor = motor;
        count++;
    }

    public void carInfo() {
        System.out.println("Renk = " + color.getAvatar());
        System.out.println("Model = " + model);
        System.out.println("Motor = " + motor);
        System.out.println("Üretilen Toplam Araba Adedi = " + count);
        System.out.println();
    }

    public void setCar(Color color, String model, double motor) {
        this.color = color;
        this.model = model;
        this.motor = motor;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    public static int getCount() {
        return count;
    }
}
