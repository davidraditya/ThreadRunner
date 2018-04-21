/**
 * This class contains the threading process
 *
 * @author David Raditya K - 1506690372
 * @version 2018.04.21
 */

public class RunForYourLife implements Runnable {
    private Thread tes;
    private String nama;

    /**
     * Constructor for objects of class RunForYourLife
     *
     * @param nama
     */
    RunForYourLife (String nama){
        this.nama = nama;
        System.out.println(nama+", ready.");
    }

    /*
     * method untuk menjalankan lomba lari seperti ketentuan soal
     */
    public void run(){
        System.out.println(getNama()+", go!" );
        try {
            for(int i = 0; i <=19; i++) {
                // Let the thread sleep for a while.
                Thread.sleep(LetsGo.getRandom(getNama(),i));
                int check=i+1;
                System.out.println(getNama()+" has passed checkpoint ("+ check +") with "+LetsGo.getRandom(getNama(),i)+"ms delay");
            }
        } catch (InterruptedException e) {
            System.out.println(getNama()+" was interupted.");
        }
        System.out.println(getNama()+" has finished");
    }

    /*
     * method untuk menjalankan thread
     */
    public void start () {
        System.out.println(getNama()+", set..." );
        if (tes == null) {
            tes = new Thread (this, getNama());
            tes.start ();
        }
    }

    /**
     * Accessor for objects of class RunForYourLife
     * untuk meminta nama
     *
     * @return nama.
     */
    public String getNama(){
        return nama;
    }
}
