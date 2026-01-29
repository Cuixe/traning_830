package org.cuixe.traning._830.basics.animals;

public class PastorIngles implements Canino {

    @Override
    public void ladrar() {
        System.out.println("Guau Guau");
    }

    @Override
    public boolean esRastreador() {
        return true;
    }
    @Override
    public void hazSonido() {
        this.ladrar();
    }


}
