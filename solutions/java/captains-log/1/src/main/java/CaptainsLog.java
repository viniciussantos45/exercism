import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return this.PLANET_CLASSES[random.nextInt(this.PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + (1000 + random.nextInt(9000));
    }

    double randomStardate() {
        double randomDouble = random.nextDouble();

        return 41000.0 + ((double) 1000.0 * randomDouble);
    }
}
