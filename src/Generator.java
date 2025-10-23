public class Generator {
    private double electricPower;
    private int numberOfTurbineBlades;

    public Generator(double electricPower, int numberOfTurbineBlades) {
        this.electricPower = electricPower;
        this.numberOfTurbineBlades = numberOfTurbineBlades;
    }

    public double getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(double electricPower) {
        this.electricPower = electricPower;
    }

    public int getNumberOfTurbineBlades() {
        return numberOfTurbineBlades;
    }

    public void setNumberOfTurbineBlades(int numberOfTurbineBlades) {
        this.numberOfTurbineBlades = numberOfTurbineBlades;
    }

    @Override
    public String toString() {
        return String.format(
            "Generator[electricPower=%.2f MW, numberOfTurbineBlades=%d]",
            electricPower,
            numberOfTurbineBlades
        );
    }
}
