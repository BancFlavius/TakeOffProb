import java.util.HashSet;

public class TakeOffTesting {

    static boolean pairs(int[] n, int s){
        boolean result = false;

        for(int i = 0; i<n.length; i++) {

            for(int j = i; j<n.length; j++){

                if((n[i] + n[j])==s){
                    System.out.println("Perechea cu suma "+ s +" este " + n[i] + " si "+ n[j]);
                    result = true;
                }
            }
        }

        return result;
    }

    static void findNumber(int[] n){

        boolean result = false;
        int ln = n.length / 2;

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i<n.length; i++){
            int counter = 0;
            for(int j = i; j<n.length; j++){
                if(n[i] == n[j]) counter++;
            }
            if(counter >= ln) hs.add(n[i]);
        }

        for(int i : hs){
            result = true;
            System.out.println(i);
        }

        if(result == false) System.out.println("Nu a fost gasit un numar care apare de " + ln + " ori sau mai multe.");

    }


    public static void main (String[] args) {

        int n[] = {3, 4, 45, 3, 3, 4, 4};
        int s = 51;

        //method call
        if(!pairs(n, s)) System.out.println("Nu a fost gasita o pereche.");

        //method call
        findNumber(n);

    }
}
