public class PairEqualsSum {
    public static void main (String args[]){
        int[] setOne = {1, 2, 3, 9};
        int[] setTwo = {1, 2, 4, 4};
        int pairedSum = 6;

        int i = 0 ;
        int j = setTwo.length - 1;

        int mem = 0;

        while(i < j){
            mem = setTwo[i] + setTwo[j];
            
            if(mem < pairedSum){
            i++;
            }

            if(mem > pairedSum){
                j--;
                }


            if(mem == pairedSum){
                System.out.println("Pair found");
             break;
            }
            
        } 
        if(mem != pairedSum){
            System.out.println("No Pair found");
        }
    }
    }

