public class NuclearPowerPlant {
    private String name;
    private String description;
    private CoolingTower coolingTower;
    private Generator generator;
    private NuclearReactor reactor;

    public NuclearPowerPlant(String name, String description, CoolingTower coolingTower, 
                             Generator generator, NuclearReactor reactor) {
        this.name = name;
        this.description = description;
        this.coolingTower = coolingTower;
        this.generator = generator;
        this.reactor = reactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoolingTower getCoolingTower() {
        return coolingTower;
    }

    public void setCoolingTower(CoolingTower coolingTower) {
        this.coolingTower = coolingTower;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public NuclearReactor getReactor() {
        return reactor;
    }

    public void setReactor(NuclearReactor reactor) {
        this.reactor = reactor;
    }

    @Override
    public String toString() {
        return String.format(
            "NuclearPowerPlant[name='%s', description='%s', coolingTower=%s, generator=%s, reactor=%s]",
            name,
            description,
            coolingTower,
            generator,
            reactor
        );
    }
}
