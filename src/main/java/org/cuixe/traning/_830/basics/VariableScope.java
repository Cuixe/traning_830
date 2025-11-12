package org.cuixe.traning._830.basics;

public class VariableScope {

    static int classVariable;
    int instanceVariable;
    public void tryThis(boolean hungry) {
        int methodVariable = 20;
        if(hungry) {
            int ifVariable = 15;
            System.out.println(ifVariable);
        } else {
            System.out.println(ifVariable);
        }
        System.out.println(blockVariable);
        System.out.println(methodVariable);
        System.out.println(new VariableScope().instanceVariable);
        System.out.println(VariableScope.classVariable);
    }
}
