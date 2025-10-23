public class Bank {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.owner ="camilo";
        account.accounNumber ="192531";
        account.balance = 1000000.0;
        System.out.println(" Propietario: "+account.owner);
        System.out.println("Tiene actualmente:  "+account.balance);
        account.deposit(500000);
        account.withdraw(600);
        account.showBalance();
    }
    public static class BankAccount {
        //atributos
        String accounNumber;
        String owner;
        Double balance;
        //metodos
        void deposit(double amount){
            balance += amount;
            System.out.println("Deposito: "+amount+" nuevo balance: "+ balance );
        }
        void withdraw(double amount){
          if(balance>= amount){
              balance -=amount;
            System.out.println("Retiro: "+amount);
          }
          else{
            System.out.println("vaya a trabajar");
          }
        }
        void showBalance(){
            System.out.println("Balance: "+ balance);
        }
        
    }
}
