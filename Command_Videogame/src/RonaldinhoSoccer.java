public class RonaldinhoSoccer implements JogoReceiver{
    @Override
    public void botaoA() {
        System.out.println("Chute a gol");
    }

    @Override
    public void botaoB() {
        System.out.println("Passe");
    }

    @Override
    public void direcionalCima() {
        System.out.println("Corre pra cima");
    }

    @Override
    public void direcionalBaixo() {
        System.out.println("Corre pra baixo");
    }

    @Override
    public void direcionalEsquerda() {
        System.out.println("Corre pra defesa");
    }

    @Override
    public void direcionalDireita() {
        System.out.println("Corre pro ataque");
    }
}
