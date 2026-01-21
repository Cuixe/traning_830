package org.cuixe.traning._830.basics.animals;

public interface Felino extends Animal{

    @Override
    default void hazSonido() {
        this.maullar();
    }

    void maullar();

    void agilidad();

}
