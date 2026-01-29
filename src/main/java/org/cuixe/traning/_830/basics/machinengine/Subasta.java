package org.cuixe.traning._830.basics.machinengine;

public class Subasta implements Command{

    @Override
    public String getAccion() {
        return "Subastar";
    }

    @Override
    public Long getTime() {
        return 1000L;
    }


}
