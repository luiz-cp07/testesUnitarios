package testeUnitario;

public class CalculoMedia {
    private double nota1;
    private double nota2;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double CalculoMedia(){
        double media = (this.nota1+this.nota2)/2;
        return media;
    }

    public Boolean isAproved() {
        double situacao = CalculoMedia();
        if (situacao > 60) {
            return true;
        }
        return false;
    }
}
