public class SmartTv {

    boolean tvLigada = false;

    int volume = 25;
    int canal = 1;

    public void ligarTv(){
        tvLigada = true;
    }

    public void almentaVolume (){
        volume++;
        System.out.println("Almentando Vol"+volume);
    }
    
    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuido vol" + volume);

    }

    public void subindoCanal (){
        canal++;
        System.out.println("canal atual:"+canal);

    }

    public void descendoCanal (){
        canal--;
        System.out.println("canal atual"+ canal);
    }

    public void setCanal (int setando){
        canal = setando;
        System.out.println("Canal atual:"+canal);
    }

    public void status(){
        if (tvLigada == true){
            System.out.println("TV LIGADA");
            System.out.println("canal"+ canal);
            System.out.println("Volume:" + volume);
        }

        else System.out.println("Tv Desligada");
    }
}
