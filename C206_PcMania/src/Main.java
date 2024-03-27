import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente("Henrique", 200112834);

        Computador[] pc = new Computador[3];

        pc[0] = new Computador();
        pc[1] = new Computador();
        pc[2] = new Computador();

        MemoriaUSB[] memoria = new MemoriaUSB[10];

        memoria[0] = new MemoriaUSB();
        memoria[1] = new MemoriaUSB();
        memoria[2] = new MemoriaUSB();

        pc[0].marca = "Positivo";
        pc[0].preco = 3300;
        pc[0].hb[0].nome = "Pentium Core i3";
        pc[0].hb[0].capacidade = 2200;
        pc[0].hb[1].capacidade = 8;
        pc[0].hb[2].capacidade = 500;
        pc[0].hb[2].nome = "Gb";

        pc[0].sop.nome = "Linux Ubuntu";
        pc[0].sop.tipo = 32;

        memoria[0].nome = "Pen-drive";
        memoria[0].capacidade = 16;

        pc[0].addMemoriaUSB(memoria[0]);

        pc[1].marca = "Acer";
        pc[1].preco = 8800;
        pc[1].hb[0].nome = "Pentium Core i5";
        pc[1].hb[0].capacidade = 3370;
        pc[1].hb[1].capacidade = 16;
        pc[1].hb[2].capacidade = 1;
        pc[1].hb[2].nome = "Tb";

        pc[1].sop.nome = "Windows 8";
        pc[1].sop.tipo = 64;

        memoria[1].nome = "Pen-drive";
        memoria[1].capacidade = 32;

        pc[1].addMemoriaUSB(memoria[1]);

        pc[2].marca = "Vaio";
        pc[2].preco = 4800;
        pc[2].hb[0].nome = "Pentium Core i7";
        pc[2].hb[0].capacidade = 4500;
        pc[2].hb[1].capacidade = 32;
        pc[2].hb[2].capacidade = 2;
        pc[2].hb[2].nome = "Tb";

        pc[2].sop.nome = "Windows 10";
        pc[2].sop.tipo = 64;

        memoria[2].nome = "HD Externo";
        memoria[2].capacidade = 1000;

        pc[2].addMemoriaUSB(memoria[2]);

        int op; // selecionar a opção
        int cont = 0; // contador

        System.out.println("==================================");
        System.out.println("Digite o número da promoção: ");
        System.out.println("==================================");
        System.out.println("1 - para a primeira promoção");
        System.out.println("2 - para a segunda promoção");
        System.out.println("3 - para a terceira promoção");
        System.out.println("0 - para fechar a compra");
        System.out.println("==================================");

        for(int i = 0; i < cliente.comp.length; i++){
            op = entrada.nextInt();

            switch (op){
                case 1:
                    cliente.comp[cont] = pc[0];
                    System.out.println("Computador Positivo adicionado ao carrinho");
                    cont++;
                    break;
                case 2:
                    cliente.comp[cont] = pc[1];
                    System.out.println("Computador Acer adicionado ao carrinho");
                    cont++;
                    break;
                case 3:
                    cliente.comp[cont] = pc[2];
                    System.out.println("Computador Vaio adicionado ao carrinho");
                    cont++;
                    break;
                case 0:
                    System.out.println("==================================");
                    System.out.println("Parabéns, você finalizou a compra!");
                    System.out.println("==================================");
                    System.out.println("Cliente: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println("Produtos adquiridos: ");
                    System.out.println();
                    for (i = 0; i < cont; i++){
                        if (cliente.comp[i] != null){
                            cliente.comp[i].mostraPCConfigs();
                        }
                    }
                    System.out.println("==================================");
                    System.out.println("Total gasto: R$" + cliente.calculaTotalCompra());
                    break;
                default:
                    System.out.println("Insira um número válido!");
                    break;
            }
        }
    }
}