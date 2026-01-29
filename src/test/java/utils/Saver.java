package utils;

public class Saver extends Box {

    private Box box;

    public Saver() {
        box = new Box();
    }

    @Override
    public boolean isEmpty() {
        return box.isEmpty();
    }

    @Override
    public void putElement(Object element) {
        box.putElement(element);
    }

    @Override
    public void removeElement() {
        box.removeElement();
    }
    /*
    @Override
    public boolean findElement() {
        box.findElement();
    }
    */

}
