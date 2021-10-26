public class Disciplina {
    float p1;
    float p2;
    //float media;
    String nome;
    ICalcMedia calculo;

    //Métodos Set
    public void setP1(float p1) {
        this.p1 = p1;
    }
    public void setP2(float p2) {
        this.p2 = p2;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos Get
    public float getP1() {
        return p1;
    }
    public float getP2() {
        return p2;
    }
    public String getNome() {
        return nome;
    }
    /*
    public float getMedia() {
        return media;
    }*/

    //Método para realizar Cálculo desejado
    public void setCalculo(ICalcMedia calculo) {
        this.calculo = calculo;
    }
}