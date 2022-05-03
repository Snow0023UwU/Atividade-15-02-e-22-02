public class Main {
    public static void main (String []args){

        /*Pessoa m = new Pessoa();
        m.nome = "Maria";
        m.idade = 17;
        m.imprimir("primeira");

        Pessoa j = new Pessoa();
        j.nome = "Joao";
        j.idade = 17;
        m.imprimir("segunda");

        if(m.idade >= j.idade)
            System.out.println("Pessoa mais velha: "+m.nome);
        else
            System.out.println("Pessoa mais velha: "+j.nome);
        */
        /*Funcionario c = new Funcionario();
        c.nome="Carlos Silva";
        c.salario = 6300;
        c.imprimir("primeiro");

        Funcionario a = new Funcionario();
        a.nome="Ana Marques";
        a.salario = 6700;
        a.imprimir("segundo");

        //salario medio
        double salarioMedio = (c.salario+a.salario)/2;
        System.out.println("Salario medio: "+salarioMedio);
        */
        Retangulo r = new Retangulo();
        r.largura = 3;
        r.altura = 4;
        System.out.println(r.toString());
        System.out.println("Area: "+r.area());
        System.out.println("Perímetro: "+r.perimetro());
        System.out.println("Diagonal: "+r.diagonal());


    }
}
