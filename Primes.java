public class Primes {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        boolean[] array = new boolean[p + 1];
        for(int i = 0; i <= p + 1; i++){
            if(i == 0 || i == 1){
                array[i] = false; 
            }
            else{
                array[i] = true;
            }
        }
        for(int i = 2; i <= p + 1; i++){
            for(int j = i + 1; j <= p + 1; j++){
                if(i != j){
                    if(j % i == 0){
                        array[j] = false;
                    } 
                }   
            }
        }
        int count = 0;
        System.out.println("Prime numbers up to " + p + ":");
        for(int i = 0; i <= p + 1; i++){
            if(array[i]){
                count++;
                System.out.println(array[i]);
            }
        }
        System.out.println("There are " + count + "primes between 2 and " + p +" (" + (count/p)*100 + "% are primes)");
    }
}