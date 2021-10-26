public class MediaGeometrica implements ICalcMedia{
    @Override
    public void CalculaMedia(Disciplina d) {
        float calculo = (float) Math.sqrt(d.p1*d.p2);
        if(calculo > 7){
            System.out.println("Aprovado(a) com Média Geométrica = " + calculo);
        }
        else{
            System.out.println("Não Aprovado(a) com Média Geométrica = " + calculo);
        }
    }
}