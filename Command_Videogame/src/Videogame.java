public class Videogame {

    private JogoReceiver jogo;
    private Invoker invoker = new Invoker();

    public void insereJogo(JogoReceiver jogoReceiver){
        this.jogo = jogoReceiver;
    }

    public void botaoA(){
        invoker.addCommand(new BotaoACommand(jogo));
        invoker.execute();
    }
    public void botaoB(){
        invoker.addCommand(new BotaoBCommand(jogo));
        invoker.execute();
    }
    public void direcionalCima(){
        invoker.addCommand(new DirecionalCimaCommand(jogo));
        invoker.execute();
    }
    public void direcionalBaixo(){
        invoker.addCommand(new DirecionalBaixoCommand(jogo));
        invoker.execute();
    }
    public void direcionalEsquerda(){
        invoker.addCommand(new DirecionalEsquerdaCommand(jogo));
        invoker.execute();
    }

    public void direcionalDireita(){
        invoker.addCommand(new DirecionalDireitaCommand(jogo));
        invoker.execute();
    }

    public static void main(String[] args){
        JogoReceiver jogo = new RonaldinhoSoccer();
        Videogame videogame = new Videogame();
        videogame.insereJogo(jogo);
        videogame.direcionalBaixo();
        videogame.botaoB();
        videogame.direcionalEsquerda();
        videogame.botaoA();
    }
}
