package Classes;

import Interfaces.IPersonagem;

public class Batalha {

    public void duelar(IPersonagem p1, IPersonagem p2){
        p1.atacar();
        p2.defender();

        p2.atacar();
        p1.defender();

        p1.mover();
    }
}
