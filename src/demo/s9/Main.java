package demo.s9;

public class Main {
    public static void main(String[] args){
        Human.Male m = new Human().new Male();// non static
        Human.Female f = new Human.Female(); // static
        m.run();
    }
}
