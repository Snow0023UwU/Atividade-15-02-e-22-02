public class Pessoa {
    public String nome;
    public int idade;

    public void imprimir(String n){
        System.out.println("Dados da "+n+" pessoa:\n" +
                "Nome: " + nome+"\nIdade: "+idade);
    }

}
