public class Furniture {

    //variable declarations:
    public char size;
    public int red;
    public int green;
    public int blue;
    public String shape;
    public boolean blanket;
    public boolean headboard;

    //it is called a constructor method below
    public Furniture (char fSize, int fRed, int fGreen, int fBlue, String fShape, boolean fBlanket, boolean fHeadboard) {
        size = fSize;
        red = fRed;
        green = fGreen;
        blue = fBlue;
        shape = fShape;
        blanket = fBlanket;
        headboard = fHeadboard;
    }
    //printInfo method
    public void printInfo() {
        System.out.println("The furniture is size " + this.size);
        System.out.println("The furniture is a " + this.shape);
        //if the furniture has blanket, print "the furniture has a blanket"
        if (blanket == true){
            System.out.println("The furniture has a blanket");
        }
        //otherwise, print "the furniture does not have blanket"
        else {
            System.out.println("The furniture does not have a blanket");
        }
        if (headboard == true){
            System.out.println ("The furniture has a headboard");
        }
        else{
            System.out.println("The furniture does not have a headboard");
        }
        System.out.println();
    }

}

