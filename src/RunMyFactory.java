public class RunMyFactory {

    public static void main(String[] args) {//essentially the same meaning as public void go
        RunMyFactory runMyFactory = new RunMyFactory();
    }

    public RunMyFactory(){
        Furniture couch;
        couch = new Furniture('t', 79, 97, 81, "L-shape", true, false);
        couch.printInfo();

        Furniture bed;
        bed = new Furniture('k', 72, 90, 184, "square", false, true);
        bed.printInfo();
    }

}
