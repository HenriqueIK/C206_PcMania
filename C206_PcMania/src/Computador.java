public class Computador {
    String marca;
    float preco;
    MemoriaUSB memusb;
    SistemaOperacional sop;
    HardwareBasico[] hb;

    public Computador() { // construtor para computador
        this.hb = new HardwareBasico[10];
        this.hb[0] = new HardwareBasico();
        this.hb[1] = new HardwareBasico();
        this.hb[2] = new HardwareBasico();

        this.sop = new SistemaOperacional();
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println(hb[0].nome + " (" + hb[0].capacidade + "Mhz)"); // processador
        System.out.println(hb[1].capacidade + "GB de Memória RAM");
        System.out.println(hb[2].capacidade + " " + hb[2].nome + " de HD"); // HD
        System.out.println("Sistema Operacional " + sop.nome + " (" + sop.tipo + "bits)");
        System.out.println("Acompanha " + memusb.nome + " de " + memusb.capacidade + "Gb");
        System.out.println();
    }
    void addMemoriaUSB(MemoriaUSB musb){
        memusb = musb;
    }
}
