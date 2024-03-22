package org.example;

public class Cliente {

    public String nome;
    public String cpf;
    Computador computador[] = new Computador[10];

    public Cliente() {
    }

    public void comprar(Computador computador){
        for(int i = 0; i<10; i++){
            if(this.computador[i]==null){
                this.computador[i] = computador;
                break;
            }
        }
    }

    public float calcularCompra(){
        float soma = 0;

        for(int i = 0; i < 10; i++){
            if(computador[i]!=null){
                soma += computador[i].preco;

            }
        }
        return soma;
    }
}
