public class NuclearReactor {
    private double heatOutput;
    private boolean requiresHeavyWater;

    public NuclearReactor(double heatOutput, boolean requiresHeavyWater) {
        this.heatOutput = heatOutput;
        this.requiresHeavyWater = requiresHeavyWater;
    }

    public double getHeatOutput() {
        return heatOutput;
    }

    public void setHeatOutput(double heatOutput) {
        this.heatOutput = heatOutput;
    }

    public boolean isRequiresHeavyWater() {
        return requiresHeavyWater;
    }

    public void setRequiresHeavyWater(boolean requiresHeavyWater) {
        this.requiresHeavyWater = requiresHeavyWater;
    }

    @Override
    public String toString() {
        return String.format(
            "NuclearReactor[heatOutput=%.2f MW, requiresHeavyWater=%s]",
            heatOutput,
            requiresHeavyWater ? "yes" : "no"
        );
    }
}
