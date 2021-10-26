public class MediaAritmetica implements ICalcMedia{
    @Override
    public void CalculaMedia(Disciplina d) {
        float calculo = (d.p1+d.p2)/2;
        if(calculo > 5.0){
            System.out.println("Aprovado(a) com Média Aritmética = " + calculo);
        }
        else{
            System.out.println("Não Aprovado(a) com Média Aritmética = " + calculo);
        }
    }
}