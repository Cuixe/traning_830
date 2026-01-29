package utils;

public class Box {

    protected Object element = null;

     boolean isEmpty() {
         return findElement();
     }

     private boolean findElement() {
        return element == null;
     }

      protected void putElement(Object element) {
         this.element = element;
     }

     protected void removeElement() {
        this.element = null;
     }


}
