package umbc;



public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        // without threads it takes about 20 seconds to complete
        // System.out.println( Thread.currentThread().getName());
        
        // for (int i = 0; i < 20; i++) {
        //     System.out.println("Practice coding");
        //     Thread.sleep(500);
        // }

        // for (int i = 0; i < 20; i++) {
        //     System.out.println("Play outside");
        //     Thread.sleep(500);
        // }

        // with threads it takes about 10 seconds to completes
        // practice coding thread
        Thread practiceCoding = new PracticeCodingThread();
        // practice coding thread
        Thread playOutside = new Thread(new PlayOutsideThread());


        System.out.println("Practice coding state: " + practiceCoding.getState());
        System.out.println("Play outside state: " + playOutside.getState());
        System.out.println("Main outside state: " + Thread.currentThread().getState());

        // // using lambda expression
        // Thread anotherThing = new Thread(() -> {
            
        //     for (int i = 0; i < 20; i++) {
        //         System.out.println("Practice coding");
        //         try {
        //             Thread.sleep(500);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        practiceCoding.start();
        playOutside.start();

        // wait for threads to complete
        while (practiceCoding.isAlive() || playOutside.isAlive()) {
            Thread.sleep(500);
            System.out.println("Practice coding state: " + practiceCoding.getState());
            System.out.println("Play outside state: " + playOutside.getState());
        }


            
    }
}
