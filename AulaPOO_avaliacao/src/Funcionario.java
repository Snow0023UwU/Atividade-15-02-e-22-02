public class Funcionario {

    public String nome;
    public double salario;

    public void imprimir(String n){
        System.out.println("Dados do "+n+" funcionário\n"
                +"Nome: " + nome + "\nSalário: "+salario+"\n");
    }
}
