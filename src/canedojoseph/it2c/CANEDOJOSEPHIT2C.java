
package canedojoseph.it2c;


public class CANEDOJOSEPHIT2C {

   int id, stockq;
   String name, category;
   double ppu;
           
           public void addProducts (int pid, String pname, double pprice, String pcat, int pstock) {
               
               this.id = pid;
               this.name = pname;
               this.ppu = pprice;
               this.category = pcat;
               this.stockq = pstock;
    }
           public void viewProducts (){
               
               
               String status = (this.stockq >= 1 && this.ppu >= 1) ? "Valid" : "Invalid";
        
               System.out.printf("%-10d %-10s %-10.2f %-10s %-10d %-10s\n",
               this.id, this.name, this.ppu, this.category, this.stockq, status);
           }
}