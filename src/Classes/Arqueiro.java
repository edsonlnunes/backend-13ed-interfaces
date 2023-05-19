package Classes;

import Interfaces.IPersonagem;

public class Arqueiro implements IPersonagem {
    @Override
    public void mover() {
        System.out.println("Arqueiro se movendo através de uma bike");
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro atacando com um arco e flecha");
    }

    @Override
    public void defender() {
        System.out.println("Arqueiro se defendo através de esquivas");
    }
}
