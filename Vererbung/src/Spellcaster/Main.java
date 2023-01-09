package Spellcaster;

public class Main {
    public static void main(String[] args) {
        WildMagicSorcerer w = new WildMagicSorcerer();
        IllusionWizard i = new IllusionWizard();
        w.castSpell();
        System.out.println();
        i.castSpell();
    }
}
