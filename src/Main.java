public class Main {
    public static void main(String[] args) {
        double numbers[] = {1.2,3.4,-5.6,-7.8,9.10,-11.12,-13.14,-15.8,4.5,9.3,7.4,1.3,9.2,13.4,14.4};
        double sum = 0;
        int kolichestvo = 0;
        boolean isNegative = false;
        for (double play:numbers) {
            if(play < 0){
                isNegative = true;
        } else if (play > 0 && isNegative ) {
                sum = play;
                kolichestvo++;
                System.out.println(play);

            }
        }
        System.out.println( "среднее арифметическое число: " + sum / kolichestvo);

        }
    }
