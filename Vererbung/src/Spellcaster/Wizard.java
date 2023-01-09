package Spellcaster;

import Spellcaster.Spellcaster;

public class Wizard extends Spellcaster {
    @Override
    public void castSpell() {
        super.castSpell();
        System.out.println("Für meine Zaberkraft musste ich hart arbeiten");
    }
}
