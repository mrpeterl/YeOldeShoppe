import java.util.Scanner;

public class Shop {

    public static void main(String[] args){

        welcome();
    }

    public static void welcome(){
        String itemName = null;

        System.out.println("Welcome to Ye Olde Shoppe");
        System.out.println("\nPlease enter the number of the corresponding item you wish to purchase");
        System.out.println("\n1 : Tractor");
        System.out.println("\n2 : Shed");
        System.out.println("\n3 : Handbag");

        buyerSelect(itemName);
    }

    public static void buyerSelect(String itemName){
        Scanner scanner = new Scanner(System.in);


        int itemSelection = scanner.nextInt();
        if (itemSelection==1){
            itemName="Tractor";
        } else if(itemSelection==2){
            itemName="Shed";
        } else if(itemSelection==3){
            itemName="Handbag";
        }
        int buyerCount;
        do {
            System.out.println("\nYou have selected : " + itemName);
            System.out.println("\nHow many people are buying a " + itemName);
            buyerCount=scanner.nextInt();
            if (buyerCount>5){
                System.out.println("\nMaximum number of 5 customers at a time");
            }
        }while(buyerCount>6);

        addressEntry(buyerCount);
    }

    public static void addressEntry(int buyerCount){

        String[] address;
        address = new String[4];

        for(int i=0;i<buyerCount;i++){
            System.out.println("\nPlease enter the address of customer number "+ (i+1));
            Scanner scannerTwo= new Scanner(System.in);
            address[i]=scannerTwo.nextLine();
        }

        for (int i=0;i<address.length;i++){

            System.out.println("\nThe address of customer "+ (i+1) + " is :");
            System.out.println();
            System.out.println(address[i]);

        }
    }
}
