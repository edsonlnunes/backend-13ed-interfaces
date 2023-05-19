package Classes;

import Interfaces.IPersonagem;

public class Mago implements IPersonagem {
    @Override
    public void mover() {
        System.out.println("Mago se movendo através de teleporte");
    }

    @Override
    public void atacar() {
        System.out.println("Mago atacando através de magias");
    }

    @Override
    public void defender() {
        System.out.println("Mago não tem defesa");
    }
}
