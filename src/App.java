public class App {
    public static void main(String[] args) {
        NuclearPowerPlant plant1 = new NuclearPowerPlant(
            "Dukovany",
            "Jaderná elektrárna v České republice s reaktory VVER-440",
            new CoolingTower(152.6, 120.0),
            new Generator(1013.0, 64),
            new NuclearReactor(3000.0, false)
        );

        NuclearPowerPlant plant2 = new NuclearPowerPlant(
            "Temelín",
            "Největší jaderná elektrárna v České republice s reaktory VVER-1000",
            new CoolingTower(160.0, 125.0),
            new Generator(1200.0, 70),
            new NuclearReactor(3400.0, true)
        );

        System.out.println("Informace o jaderné elektrárně 1: " + formatPlantDetails(plant1));
        System.out.println("Informace o jaderné elektrárně 2: " + formatPlantDetails(plant2));
    }

    private static String formatPlantDetails(NuclearPowerPlant plant) {
        return String.format(
            "%s | %s | %s | %s | %s",
            plant.getName(),
            plant.getDescription(),
            plant.getCoolingTower(),
            plant.getGenerator(),
            plant.getReactor()
        );
    }
}
