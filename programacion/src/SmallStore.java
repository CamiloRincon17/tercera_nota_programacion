public class SmallStore {
    public static void main(String[] args) {
        producto product1 = new producto("buso",50,30);
        producto product2 = new producto("pantalon", 70, 20);
        product1.showProduct();
        product1.sell(1);
        product1.restock(30);
        product2.showProduct();
        product2.sell(3);
        product2.restock(21);
    }
    public static class producto{
        public String name;
        public double price;
        public int quantity;
        public producto (String name, double price,int quantity){
            this.name =name;
            this.price = price;
            this.quantity = quantity;

        }
        public void sell(int quantity){
            if (quantity<=this.quantity){
                this.quantity-=quantity;
                System.out.println("product "+this.name + " PAGA "+this.price+" y queda en stock "+this.quantity);
            }else{
                System.out.println("insuficiente stock");
            }

        }
        public void restock(int quantity){
            this.quantity +=quantity;
        }
        public void showProduct(){
            System.out.println("!product "+this.name+"! price "+this.price+"! quantity"+this.quantity );
        }
    }
}
