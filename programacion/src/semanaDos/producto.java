package semanaDos;

public class producto{
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
                System.out.println("------------------Quantity-----------------------------");
                System.out.println("Product : "+this.name + "\nPay :"+this.price+"\nStock "+this.quantity);
                System.out.println("-------------------------------------------------------");
            }else{
                System.out.println("We have limited stock available" +this.quantity);
            }

        }
        public void restock(int quantity){
            this.quantity +=quantity;
            System.out.println("----------------------Restock--------------------------");
            System.out.println("Restock the product: "+this.quantity);
            System.out.println("-------------------------------------------------------");
        }
        public void showProduct(){
            System.out.println("-------------------ShowProduct-------------------------");
            System.out.println("Product : "+this.name+"\nPrice : "+this.price+"\nQuantity : "+this.quantity );
            System.out.println("-------------------------------------------------------");
        }
    }
