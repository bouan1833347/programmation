package Arme;

import Personnage.*;

public interface Tranchant {
    public abstract void Trancher(Personnage attaque, Personnage attaquant,Tranchant arme);
}
