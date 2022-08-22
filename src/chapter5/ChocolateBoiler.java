package chapter5;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private  ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public void fill(){
        if (isEmpty()) {
            empty =false;
            boiled = false;
        }
    }
    public void drain(){
        if(!isEmpty() && isBoilded()){
            empty = true;
        }
    }
    public void boil(){
        if(!isEmpty() && !isBoilded()){
            empty = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoilded(){
        return boiled;
    }
}
