package Spellcaster;

public class WildMagicSorcerer extends Sorcerer {
    @Override
    public final void castSpell() {
        super.castSpell();
        System.out.println("Meine Zauber sind unberechenbar");
    }
}
