package entidades;

public class nota {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double resultado(){
        return nota1 + nota2 + nota3;
    }

    public double teste() {
        if (resultado() < 60.0){
            return 60.0 - resultado();
        }
        else{
            return 0.0;
        }
    }   
}
