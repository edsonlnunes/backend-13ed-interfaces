package Classes;

import Interfaces.IPersonagem;

public class Ninja implements IPersonagem {
    public void mover() {
        System.out.println("Ninja se movendo caminhando");
    }

    public void atacar() {
        System.out.println("Ninja atacando com espada e escudo");
    }

    public void defender() {
        System.out.println("Ninja se defendendo através de escudo");
    }
}
