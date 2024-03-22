package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Computador computador[] = new Computador[10];
        Hardware hardware = new Hardware();
        SistemaOperacional so = new SistemaOperacional();
        Cliente cliente = new Cliente();
        MemoriaUSB musb = new MemoriaUSB();
        int menu, i=0;
        String M;

        System.out.println("Bem-vindo a loja PCMania!");
        System.out.println("Temos várias promoções aqui,");
        System.out.println("escolha a que mais lhe agradar,");
        System.out.println("mas antes precisamos que forneça o seu nome e cpf:");

        cliente.nome = scanner.nextLine();
        cliente.cpf = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Muito obrigado, siga as instruções do menu" + "\n e aproveite as nossas ofertas");
        System.out.println("\n");
        System.out.println("Digite 1 para aproveitar as ofertas da Promoção 1");
        System.out.println("Digite 2 para aproveitar as ofertas da Promoção 2");
        System.out.println("Digite 3 para aproveitar as ofertas da Promoção 3");

        menu = scanner.nextInt();

        while(menu<1 || menu>5){
            System.out.println("Opção inexistente, digite outra opção");
            menu = scanner.nextInt();
        }

        while(menu!=5){
            switch(menu){
                case 1:
                    hardware.nome = "Pentium Core I3";
                    hardware.capacidade = 8;
                    so.nome = "Linux Ubuntu";
                    so.tipo = 32;
                    computador[i] = new Computador(hardware, so);

                    computador[i].marca = "Positivo";
                    computador[i].preco = 3300;

                    System.out.println("Deseja adicionar uma memória USB?[S/N]");
                    M = scanner.next();
                    if(M.equalsIgnoreCase("S")){
                        musb.nome = "PenDrive";
                        musb.capacidade = 16;
                        computador[i].addMemoriaUSB(musb);
                    }
                    i++;
                    break;
                case 2:

                    hardware.nome = "Pentium Core I5";
                    hardware.capacidade = 1000;
                    so.nome = "Windows 8";
                    so.tipo = 64;
                    computador[i] = new Computador(hardware, so);

                    computador[i].marca = "Acer";
                    computador[i].preco = 8800;

                    System.out.println("Deseja adicionar uma memória USB?[S/N]");
                    M = scanner.next();
                    if(M.equalsIgnoreCase("S")){
                        musb.nome = "PenDrive";
                        musb.capacidade = 32;
                        computador[i].addMemoriaUSB(musb);
                    }
                    i++;

                    break;

                case 3:

                    hardware.nome = "Pentium Core I7";
                    hardware.capacidade = 2000;
                    so.nome = "Windows 10";
                    so.tipo = 64;
                    computador[i] = new Computador(hardware, so);

                    computador[i].marca = "Vaio";
                    computador[i].preco = 4800;

                    System.out.println("Deseja adicionar uma memória USB?[S/N]");
                    M = scanner.next();
                    if(M.equalsIgnoreCase("S")){
                        musb.nome = "HD Externo";
                        musb.capacidade = 1000;
                        computador[i].addMemoriaUSB(musb);
                    }
                    i++;

                    break;

                case 4:

                    for(int j = 0; j<10;j++){
                        if(computador[j]!=null){
                            computador[j].mostrarPCConfigs();
                        }
                    }

                    break;
            }

            System.out.println("Digite 1 para aproveitar as ofertas da Promoção 1");
            System.out.println("Digite 2 para aproveitar as ofertas da Promoção 2");
            System.out.println("Digite 3 para aproveitar as ofertas da Promoção 3");
            System.out.println("Digite 4 para ver o carrinho");
            System.out.println("Digite 5 para fechar o carrinho");

            menu = scanner.nextInt();
        }

        System.out.println("Valor total da compra: R$"+cliente.calcularCompra());

    }
}