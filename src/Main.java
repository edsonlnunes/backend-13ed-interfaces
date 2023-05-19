import Classes.*;

public class Main {
    public static void main(String[] args) {
        var guerreiro = new Guerreiro();
        var mago =  new Mago();
        var arqueiro = new Arqueiro();
        var ninja = new Ninja();

        var batalha = new Batalha();

        batalha.duelar(guerreiro, arqueiro);
        System.out.println();

        batalha.duelar(arqueiro, mago);
        System.out.println();

        batalha.duelar(ninja, mago);
    }
}