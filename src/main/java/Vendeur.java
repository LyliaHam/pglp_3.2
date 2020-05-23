public class Vendeur extends EmployeAbstractClass
 {
    private final int base = 2000;
    private int comm; 
    
    public Vendeur(final int comm2) {
        this.comm = comm2;
   }
   
    public double salaire() {
        return base + comm;
    }
}
