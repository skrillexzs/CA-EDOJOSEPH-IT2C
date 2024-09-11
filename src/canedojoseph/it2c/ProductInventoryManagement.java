
package canedojoseph.it2c;

import java.util.Scanner;

public class ProductInventoryManagement {
    
    public void addProducts () {
        
        CANEDOJOSEPHIT2C [] pd = new CANEDOJOSEPHIT2C [100];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no of Products: ");
        int nOp = input.nextInt();
        
            for (int y = 0; y < nOp; y++) {
                System.out.printf("Enter details of Product %d\n", y + 1);
                
                System.out.print("ID: ");
                int pid = input.nextInt();
                input.nextLine();
                
                System.out.print("Name: ");
                String pname = input.nextLine();
                
                System.out.print("Category: ");
                String pcat = input.nextLine();
                                
                System.out.print("Stocks Quantity: ");
                int pstock = input.nextInt();
                
                System.out.print("Price per Unit: ");
                double pprice = input.nextDouble();
                
                pd[y] = new CANEDOJOSEPHIT2C ();
                pd[y].addProducts (pid, pname, pprice, pcat, pstock);
                
                
            }
        
        for (int y = 0; y < nOp; y++) {
            pd[y].viewProducts();
        }
    }
   
    
}

