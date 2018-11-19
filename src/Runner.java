public class Runner {

    public static void main(String[] args) {
        double[] arrayDouble = doubleArrayList(10000);
        String[] arrayString = stringArrayList(10000);
        int[] arrayInteger = intArrayList(10000);
        long time;


        //Selection
        time = System.currentTimeMillis();
        InPlaceSort.selectionSort(arrayDouble);
        time = System.currentTimeMillis() - time;
        System.out.println("Selection Sort: "+ time*.001 + " Seconds");

        //Insertion
        time = System.currentTimeMillis();
        InPlaceSort.insertionSort(arrayInteger);
        time = System.currentTimeMillis() - time;
        System.out.println("Insertion Sort: "+ time*.001 + " Seconds" );

        //Bubble
        time = System.currentTimeMillis();
        InPlaceSort.bubbleSort(arrayString);
        time = System.currentTimeMillis() - time;
        System.out.println("Bubble Sort: "+ time*.001 + " Seconds");


    }


    /**
     *
     * @param length is given by user to determine length of list.
     * @return the generated array with given length size
     */
    public static double[] doubleArrayList(int length)
        {
            double[] array = new double[length];
            for(int i=0; i<array.length; i++)
            {

                array[i] = (Math.random()*1000);
            }
            return array;
        }

    /**
     *
     * @param length is given by user to determine length of list.
     * @return the generated array with given length size
     */
        public static int[] intArrayList(int length)
        {
            int[] array = new int[length];
            for( int i=0; i< array.length; i++)
            {
                array[i] = (int) (Math.random()*1000);

            }
            return array;
        }


    /**
     *
     * @param length is given by user to determine length of list.
     * @return the generated array with given length size
     */
        public static String[] stringArrayList(int length) {

            String[] array = new String[length];
            for (int i = 0; i < array.length; i++) {
                int randWordL = (int) (Math.random() * 10);
                String word = "";
                for (int j = 0; j < randWordL; j++) {
                    int rando = (int) ((Math.random() * 10) + 1);
                    char asd;
                    if (rando > 5) {
                        asd = (char) ((int) ((Math.random() * 26) + 65));
                    } else {
                        asd = (char) ((int) ((Math.random() * 26) + 97));
                    }
                    word += asd;

                }
                array[i] = word;
            }
            return array;
        }





    }













