class base {
    base() {
        System.out.println("I am a constructor.");
    }

    base(int x) {
        System.out.println("I am a Overloaded constructor with value of x: " + x);
    }
}

class derive extends base {
    derive() {
        // super(4);
        System.out.println("I am a constructor too.");
    }

    derive(int x, int y) {
        super(x);
        System.out.println("I am overloaded constructor with a value of y: " + y);
    }
}

class childOfDerive extends derive {
    childOfDerive() {
        System.out.println("I am a child of derive class.");
    }

    childOfDerive(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a overloaded constructor with a value of z: " + z);
    }
}

public class ConsInheritance {
    public static void main(String[] args) {
        childOfDerive c = new childOfDerive(1,2,3);
    }
}
