public class Retangulo {

    public double largura;
    public double altura;

    @Override
    public String toString() {
        return "Altura: " + altura +"\nLargura: "+largura;
    }
    public double area(){
        return largura * altura;
    }
    public double perimetro(){
        return 2*(altura+largura);
    }
    //Math.Sqrt(largura*largura+altura*altura)
    public double diagonal(){
        return Math.sqrt(largura*largura+altura*altura);
    }

}
