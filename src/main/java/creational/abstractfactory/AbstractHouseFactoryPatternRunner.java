package creational.abstractfactory;

final class AbstractHouseFactoryPatternRunner {

    private AbstractHouseFactoryPatternRunner(){}

    public static void main(final String[] args) {
        System.out.println(HouseFactory.buildHouse(HouseType.DETACHED) + "\n");
        System.out.println(HouseFactory.buildHouse(HouseType.SEMI) + "\n");
        System.out.println(HouseFactory.buildHouse(HouseType.BUNGALOW) + "\n");
        System.out.println(HouseFactory.buildHouse(HouseType.COTTAGE));
    }
}
