package Classes;

import Interfaces.IPersonagem;

public class Guerreiro implements IPersonagem {
    @Override
    public void mover() {
        System.out.println("Guerreiro se movendo caminhando");
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro atacando com espada e escudo");
    }

    @Override
    public void defender() {
        System.out.println("Guerreiro se defendendo através de escudo");
    }
}
