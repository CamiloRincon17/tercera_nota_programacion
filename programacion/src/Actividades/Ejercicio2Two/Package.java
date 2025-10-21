package Actividades.Ejercicio2Two;
class Package{
    public String trackingCode;
    public double weight;
    public Package(String trackingCode, double weight){
        this.trackingCode = trackingCode;
        this.weight = weight;
    }
    public void showPackage(){
        System.out.println("Tracking Code: "
         + trackingCode + " | Weight: " + weight);
    }
    public void changeWeight(Package p,double newWeight){
        p.weight = newWeight;
    }
}