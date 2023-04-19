public class Suhu {
    private double celcius;

    // Overloading constructor
    public Suhu() {
        this(0);
    }

    public Suhu(double celcius) {
        this.celcius = celcius;
    }

    // Overloading method
    public double toFahrenheit() {
        return (celcius *  9 / 5) + 32;
    }

    public double toFahrenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    public double toKelvin() {
        return celcius + 273.15;
    }

    public double toKelvin(double celcius) {
        return celcius + 273.15;
    }

    // Method non-void
    public double getCelcius() {
        return celcius;
    }

    // Method void
    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
}
