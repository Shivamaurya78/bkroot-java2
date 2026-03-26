package com.ps.java.oops.thread;
// Music class Runnable interface implement kar rahi hai
// Matlab: ye class ek task define karegi jo thread run karega
class Music implements Runnable {

    //  run() method wo kaam batata hai jo thread karega
    public void run() {
        //  Ye loop 3 baar chalega
        for(int i = 1; i <= 3; i++) {
            System.out.println("Playing music");
        }
    }
}
// Download class bhi Runnable implement kar rahi hai
// Ye dusra task define kar rahi hai
class Download implements Runnable {

    public void run() {

        //  Ye bhi 3 baar chalega
        for(int i = 1; i <= 3; i++) {

            //  Ye downloading message print karega
            System.out.println("Downloading music");
        }
    }
}
//  Main class (program yahi se start hota hai)
public class thread1 {

    public static void main(String args[]) {
        // Music task ka object banaya
        Music m = new Music();
        Download d = new Download();
        //  Thread banaya aur usme Music task diya
        Thread t1 = new Thread(m);
        //  Thread banaya aur usme Download task diya
        Thread t2 = new Thread(d);
        t1.start();
        //  Dusra thread bhi start kiya
        t2.start();
    }
}