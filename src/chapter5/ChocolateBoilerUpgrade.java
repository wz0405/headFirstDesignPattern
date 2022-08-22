package chapter5;

public class ChocolateBoilerUpgrade {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerUpgrade instance;
    private ChocolateBoilerUpgrade(){
        empty = true;
        boiled = false;
    }
    public static synchronized ChocolateBoilerUpgrade getInstance(){
        if(instance.isEmpty()){
            instance = new ChocolateBoilerUpgrade();
        }
        return instance;
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
