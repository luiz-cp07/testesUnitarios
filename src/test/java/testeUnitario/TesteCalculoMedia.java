package testeUnitario;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteCalculoMedia {
    @Test
    public void testeReprovado(){
        CalculoMedia primeiroBimestre = new CalculoMedia();
        primeiroBimestre.setNota1(35);
        primeiroBimestre.setNota2(50);
        assertEquals(false, primeiroBimestre.isAproved());
    }

   @Test
    public void testeAprovado(){
       CalculoMedia primeiroBimestre = new CalculoMedia();
       primeiroBimestre.setNota1(80);
       primeiroBimestre.setNota2(90);
       assertEquals(true, primeiroBimestre.isAproved());
    }
}
