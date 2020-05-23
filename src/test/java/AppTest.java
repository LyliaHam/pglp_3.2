import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class AppTest 
{
    @Test
    public void creaEmp(){
        Employe e = new Employe("Alice", 2);
        assertTrue(e != null);
    }

    @Test
    public void salaireEmp(){
        Employe e = new Employe("Alice", 2);
        assertTrue(e.salaireEmploye() == 1540);
    }

    @Test
    public void creaVend(){
        Vendeur v = new Vendeur("Bob", 200);
        assertTrue(v != null);
    }

    @Test
    public void verifsalVend(){
        Vendeur v = new Vendeur("Bob", 200);
        assertTrue(v.salaireEmploye() == 1700);
    }

    @Test
    public void creaManag(){
        Employe em = new Employe("Charlie", 2);
        ArrayList EM = new ArrayList<Employe>();
        EM.add(em);
        Manager m = new Manager("Doris", EM);
        assertTrue(m != null);
    }

    @Test
    public void verSalManag(){
        Employe em = new Employe("Alice", 2);
        ArrayList EM = new ArrayList<Employe>();
        EM.add(em);
        Manager m = new Manager("Bob", EM);
        assertTrue(m.salaireEmploye() == 1600);
    }
}
