package Actividades.Ejercicio1One;

public class Producto{
        public String name;
        public double price;
        public int amount;
        public producto (String name, double price,int quantity){
            this.name =name;
            this.price = price;
            this.amount = amount;

        }
        public void sell(int amount){
            if (amount<=this.amount){
                this.amount-=amount;
                System.out.println("------------------Quantity-----------------------------");
                System.out.println("Product : "+this.name + "\nPay :"+this.price+"\nStock "+this.amount);
                System.out.println("-------------------------------------------------------");
            }else{
                System.out.println("We have limited stock available" +this.amount);
            }

        }
        public void restock(int amount){
            this.amount +=amount;
            System.out.println("----------------------Restock--------------------------");
            System.out.println("Restock the product: "+this.amount);
            System.out.println("-------------------------------------------------------");
        }
        public void showProduct(){
            System.out.println("-------------------ShowProduct-------------------------");
            System.out.println("Product : "+this.name+"\nPrice : "+this.price+"\nQuantity : "+this.amount );
            System.out.println("-------------------------------------------------------");
        }
    }
