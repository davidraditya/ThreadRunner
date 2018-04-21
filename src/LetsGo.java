import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class is used for run the threading
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.21
 */

public class LetsGo {
    // deklarasi variabel
    private static int[] delay = new int[3];
    private static int[][] finaldelay = new int[3][20];
    private static int counter=0;

    /**
     * program utama ThreadRunner
     *
     * @param args
     */
    public static void main(String args[]) {
        Random();
        RunForYourLife R1 = new RunForYourLife( "Messi");
        R1.start();

        RunForYourLife R2 = new RunForYourLife( "Lionel");
        R2.start();

        RunForYourLife R3 = new RunForYourLife( "Andres");
        R3.start();
    }

    /*
     * method untuk me-random waktu jeda berlari setiap kontestan
     */
    public static void Random(){
        while(counter<20)
        {
            for (int x=0;x<3;x++){
                delay[x]=ThreadLocalRandom.current().nextInt(100, 500 + 1);
            }
            Arrays.sort(delay);

            for (int x=0;x<3;x++){
                finaldelay[x][counter]=delay[x];

            }
            counter++;
        }

    }

    /*
     * mengatur delay sesuai ketentuan pada soal
     */
    public static int getRandom(String name, int id){
        if(name=="Messi"){
            return finaldelay[0][id];
        } else if(name=="Andres"){
            return finaldelay[1][id];
        } else return finaldelay[2][id];
    }
}