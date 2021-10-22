import java.util.Random;

public class Zd3_Metoda2_Oleksandra_Kozhan {
    public static void main(String args[]) {
        System.out.println("*W tej metodzie generujemy liczbę losową za pomocą metody Random () i sprawdzamy, czy jest ona parzysta czy nieparzysta");
        System.out.println();

            Random rand = new Random();
            //Generujemy liczbę losową od 0 do 100 za pomocą metody Random()
            for (int i=0; i < 1; i++) {
                //Wygenerowana liczba jest przechowywana w zmiennej num_Oleksandra_Kozhan
                int num_Oleksandra_Kozhan = rand.nextInt(100);

                System.out.println("*Generujemy liczbę losową od 0 do 100 za pomocą metody Random()");

                System.out.println(num_Oleksandra_Kozhan);
                System.out.println();

                // Jeśli liczba jest podzielna przez 2, jest to liczba parzysta, w przeciwnym razie nieparzysta
                // jeśli reszta z podziału wynosi zero, to liczba jest parzysta
                System.out.println("*Jeśli liczba w tej zmiennej jest podzielna przez 2, jest to liczba parzysta, w przeciwnym razie nieparzysta");
                System.out.println("*jeśli reszta z podziału wynosi zero, to liczba jest parzysta");
                System.out.println();

                if ( num_Oleksandra_Kozhan % 2 == 0 )
                    System.out.println("Liczba " + num_Oleksandra_Kozhan + " jest parzysta");
                else
                    System.out.println("Liczba " + num_Oleksandra_Kozhan + " jest nieparzysta");
            }

    }
}
