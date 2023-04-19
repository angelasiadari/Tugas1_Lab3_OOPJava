public class Main {
    public static void main(String[] args) {
        Suhu suhu1 = new Suhu();
        Suhu suhu2 = new Suhu(30);

        System.out.println("Suhu Awal: "+suhu1.getCelcius());
        System.out.println("Suhu Terbaru: "+suhu2.getCelcius());
        System.out.println("Suhu Celcius ke Fahrenheit: "+suhu1.toFahrenheit());
        System.out.println("Suhu Celcius ke Kelvin: "+suhu2.toKelvin());

        suhu1.setCelcius(28);
        System.out.println("\nSuhu Terbaru: "+suhu2.getCelcius());
        System.out.println("Suhu Celcius ke Fahrenheit: "+suhu1.toFahrenheit());
        System.out.println("Suhu Celcius ke Kelvin: "+suhu2.toKelvin());
    }
}
