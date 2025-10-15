class Package{
    public String trackingCode;
    public double weight;
    public Package(String trackingCode, double weight){
        this.trackingCode = trackingCode;
        this.weight = weight;
    }
    public void showInfo(){
        System.out.println("Tracking Code: " + trackingCode + " | Weight: " + weight);
    }
    public void changeWeight(Package p,double weight){
        p.weight = weight;
    }
}