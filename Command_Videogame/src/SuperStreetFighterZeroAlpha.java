public class SuperStreetFighterZeroAlpha implements JogoReceiver{
    @Override
    public void botaoA() {
        System.out.println("Soco");
    }

    @Override
    public void botaoB() {
        System.out.println("Chute");
    }

    @Override
    public void direcionalCima() {
        System.out.println("Pulo");
    }

    @Override
    public void direcionalBaixo() {
        System.out.println("Abaixa");
    }

    @Override
    public void direcionalEsquerda() {
        System.out.println("Caminha");
    }

    @Override
    public void direcionalDireita() {
        System.out.println("Defende");
    }
}
