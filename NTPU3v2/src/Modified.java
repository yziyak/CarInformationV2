public class Modified {
    private static int count;

    public static void modifiedCar(Car car, Color newColor) {
        System.out.println("\n Renk değiştiriliyor...");
        car.changeColor(newColor);
        count++;
    }

    public static void modifiedInfo() {
        System.out.println("Modifiye Edilen Araç Sayısı = " + getCount());
    }

    public static int getCount() {
        return count;
    }




}
