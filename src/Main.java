class Printer{
    public void doPrint(String ink){
        System.out.println("Printing");
    }
}

class Colored_printer extends Printer{
    @Override
    public void doPrint(String ink){
        if(ink.toLowerCase().equals("colored")){
            System.out.println("Printed with colored");
        }
        else{
            System.out.println("Print failed!");
        }
    }
}

class Black_White_printer extends Printer{
    @Override
    public void doPrint(String ink){
        if(ink.toLowerCase().equals("black")){
            System.out.println("Printed with black");
        }
        else{
            System.out.println("Print failed!");
        }
    }
}

public class Main{
    public static void main(String[] args){
        Printer multiple = new Colored_printer();
        multiple.doPrint("Colored");
        Printer single = new Black_White_printer();
        single.doPrint("Black");
    }
}