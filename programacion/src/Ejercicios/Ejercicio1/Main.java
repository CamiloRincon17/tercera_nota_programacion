class Main{
    public static void main(String[] args) {
        Package package1 = new Package("1234567890", 10.0);
        Package package2 = package1;
        package2.weight = 20.0;

        package1.showInfo();
        package2.showInfo();
        package1.changeWeight(package1, 30.0);
        package1.showInfo();
        package2.showInfo();
    }
}