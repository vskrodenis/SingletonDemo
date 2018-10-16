package lt.kaunascoding;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getinstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;

    }
    public void showMessage(){
        System.out.println("hello");
    }


}
