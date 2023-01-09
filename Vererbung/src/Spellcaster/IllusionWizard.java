package Spellcaster;

public class IllusionWizard extends Wizard {
    @Override
    public final void castSpell() {
        super.castSpell();
        System.out.println("Ich habe mich auf Illusionszauber spezialisiert");
    }
}
