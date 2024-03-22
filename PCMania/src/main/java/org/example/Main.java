package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        int menu;
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
                    Computador comp1 = new Computador(new Hardware(), new SistemaOperacional());

                    comp1.hardware.nome = "Pentium Core I3";
                    comp1.hardware.capacidade = 8;
                    comp1.sistemaOperacional.nome = "Linux Ubuntu";
                    comp1.sistemaOperacional.tipo = 32;

                   comp1.marca = "Positivo";
                   comp1.preco = 3300;

                    System.out.println("Deseja adicionar uma memória USB?[S/N]");
                    M = scanner.next();
                    if(M.equalsIgnoreCase("S")){
                        MemoriaUSB musb = new MemoriaUSB();
                        musb.nome = "PenDrive";
                        musb.capacidade = 16;
                        comp1.addMemoriaUSB(musb);
                    }
                    cliente.comprar(comp1);

                    break;
                case 2:

                    Computador comp2 = new Computador(new Hardware(), new SistemaOperacional());
                    comp2.hardware.nome = "Pentium Core I5";
                    comp2.hardware.capacidade = 1000;
                    comp2.sistemaOperacional.nome = "Windows 8";
                    comp2.sistemaOperacional.tipo = 64;


                    comp2.marca = "Acer";
                    comp2.preco = 8800;

                    System.out.println("Deseja adicionar uma memória USB?[S/N]");
                    M = scanner.next();
                    if(M.equalsIgnoreCase("S")){
                        MemoriaUSB musb = new MemoriaUSB();
                        musb.nome = "PenDrive";
                        musb.capacidade = 32;
                        comp2.addMemoriaUSB(musb);
                    }
                    cliente.comprar(comp2);

                    break;

                case 3:

                    Computador comp3 = new Computador(new Hardware(), new SistemaOperacional());
                    comp3.hardware.nome = "Pentium Core I7";
                    comp3.hardware.capacidade = 2000;
                    comp3.sistemaOperacional.nome = "Windows 10";
                    comp3.sistemaOperacional.tipo = 64;

                    comp3.marca = "Vaio";
                    comp3.preco = 4800;

                    System.out.println("Deseja adicionar uma memória USB?[S/N]");
                    M = scanner.next();
                    if(M.equalsIgnoreCase("S")){
                        MemoriaUSB musb = new MemoriaUSB();
                        musb.nome = "HD Externo";
                        musb.capacidade = 1000;
                        comp3.addMemoriaUSB(musb);
                    }
                    cliente.comprar(comp3);

                    break;

                case 4:

                    for(int j = 0; j<10;j++){
                        if(cliente.computador[j]!=null){
                            cliente.computador[j].mostrarPCConfigs();
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