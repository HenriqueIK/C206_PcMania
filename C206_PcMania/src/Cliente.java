public class Cliente {
    String nome;
    long cpf;
    Computador[] comp = new Computador[3]; // criando array para computador
    public Cliente(String nome, long cpf){
        for (int i = 0; i < comp.length; i++){
            if (comp[i] == null){
                comp[i] = new Computador();
            }
        }
        this.nome = nome;
        this.cpf = cpf;
    }
    float calculaTotalCompra(){
        float total = 0;

        for(int i = 0; i < comp.length; i++) { // varrendo o array a comp
            if(comp != null){
                total = total + comp[i].preco; // calculando o preco total
            }
        }
        return total;
    }
}
