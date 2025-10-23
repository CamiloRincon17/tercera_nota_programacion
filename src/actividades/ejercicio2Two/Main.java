package actividades.ejercicio2Two;
class Main{
    public static void main(String[] args) {
        Package package1 = new Package("1234567890", 10.0);
        Package package2 = package1;
        package2.weight = 20.0;

        package1.showPackage();
        package2.showPackage();
        System.out.println("changing the weight");
        package1.changeWeight(package1, 30.0);
        package1.showPackage();
        package2.showPackage();
    }
}
