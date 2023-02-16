public class Main {
        public static void main(String[] args)
        {
                // create the Saurian object using the default constructor
                // this will also create an object of my HashMaps for the translations
                Saurian saurHash = new Saurian();
                SaurianOriginal saurOrig = new SaurianOriginal();
                String testText = "If you're looking for random paragraphs, you've come to the right place. When a " +
                        "random word or a random sentence isn't quite enough, the next logical step is to find a " +
                        "random paragraph. We created the Random Paragraph Generator with you in mind. The " +
                        "process is quite simple. Choose the number of random paragraphs you'd like to see and " +
                        "click the button. Your chosen number of paragraphs will instantly appear.";


                for(int i =0; i< 10; i++)
                {                
                        if(i>0){
                                testText = testText+ " " + testText;
                        }

                        // start the clock
                        long startTimeH = System.nanoTime();

                        saurHash.setEnglish(testText);

                        long endTimeH = System.nanoTime();
                        // end the clock

                        saurHash.setEnglish(testText);

                        // start the clock
                        long startTimeO = System.nanoTime();

                        saurOrig.setEnglish(testText);

                        long endTimeO = System.nanoTime();

                        // The original code takes about 550 microseconds to translate this paragraph.
                        // The new code using HashMaps takes about 130 microseconds to translate the same paragraph.

                        System.out.println();
                        System.out.println();
                        System.out.println("*** The translation took " + ((endTimeH/1000) - (startTimeH/1000)) + " microseconds using HashMaps for " +(i+1)+ " paragraphs. ***");
                        
                        System.out.println();
                        System.out.println();
                        System.out.println("*** The translation took " + ((endTimeO/1000) - (startTimeO/1000)) + " microseconds using Original program for " +(i+1)+ " paragraphs. ***");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                }
                
                
                System.out.println();
        }
}
