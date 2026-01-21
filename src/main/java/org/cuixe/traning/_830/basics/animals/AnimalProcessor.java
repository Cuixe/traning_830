package org.cuixe.traning._830.basics.animals;

public class AnimalProcessor {


    public void ejecutarAccion(Animal animal) {

        boolean accion = switch (animal) {
            case Canino a when a.esRastreador() -> true;
            case Canino a -> {
                a.ladrar();
                yield false;
            }
            case Felino a -> true;
            default -> false;
        };




    }





}
