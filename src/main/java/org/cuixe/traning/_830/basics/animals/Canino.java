package org.cuixe.traning._830.basics.animals;

public interface Canino extends Animal {

    @Override
    default void hazSonido() {
        this.ladrar();
    }

    void ladrar();

    boolean esRastreador();
}
