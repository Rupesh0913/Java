class Tmethord extends Thread {
    public void run() {
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println("The 1st threads are: " + i);
        }
    }
}

class Tmethord2 extends Thread {
    public void run() {
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println("The 2nd threads are: " + i);
        }
    }
}

class Tmethord3 extends Thread {
    public void run() {
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println("The 3rd threads are: " + i);
        }
    }
}

class MainCse {
    public static void main(String[] args) {
        Tmethord obj = new Tmethord();
        Tmethord2 obj2 = new Tmethord2();
        Tmethord3 obj3 = new Tmethord3();

        obj.start();
        obj2.start();
        obj3.start();

    }
}