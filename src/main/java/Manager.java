import java.util.ArrayList;

public class Manager extends EmployeAbstractClass {
    private String nom;
    private ArrayList Em;

    public Manager(String nom, ArrayList Em){
        this.nom = nom;
        this.Em = Em;
    }

    @Override
    public double salaireEmploye(){
        return super.salaireEmploye() + 100*this.Em.size();
    }
}
