package org.example;

public class Computador {

    public String marca;
    public float preco;
    Hardware hardware = new Hardware();
    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    MemoriaUSB mUSB = new MemoriaUSB();

    public Computador(Hardware hardware, SistemaOperacional sistemaOperacional) {
        this.hardware = hardware;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        mUSB.nome = musb.nome;
        mUSB.capacidade = musb.capacidade;
    }

    public void mostrarPCConfigs(){
        System.out.println("Marca do PC: " + marca);
        System.out.println("Informações sobre hardware:");
        System.out.println("  Nome: " + hardware.nome);
        System.out.println("  Capacidade: " + hardware.capacidade + "Gb");
        System.out.println("Informações sobre sistema operacional:");
        System.out.println("  Nome: " + sistemaOperacional.nome);
        System.out.println("  Tipo: " + sistemaOperacional.tipo + " bits");
        if(mUSB != null){
            System.out.println("Informações sobre a memoria externa:");
            System.out.println("  Nome: " + mUSB.nome);
            System.out.println("  Capacidade: " + mUSB.capacidade + "Gb");
        }
        System.out.println("----------------------------");


    }

}
