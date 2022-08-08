public class Main {
        public static void main(String[] args)
        {
            // create the Saurian object using the default constructor
            // this will also create an object of my HashMaps for the translations
            Saurian saur = new Saurian();
            String testText = "If you're looking for random paragraphs, you've come to the right place. When a " +
                    "random word or a random sentence isn't quite enough, the next logical step is to find a " +
                    "random paragraph. We created the Random Paragraph Generator with you in mind. The " +
                    "process is quite simple. Choose the number of random paragraphs you'd like to see and " +
                    "click the button. Your chosen number of paragraphs will instantly appear.";

            System.out.println();
            System.out.println("Original: "+ testText);
            System.out.println();
            System.out.print("Translation: ");
            // start the clock
            long startTime = System.nanoTime();

            saur.setEnglish(testText);
            System.out.print(saur.getSaurian());

            long endTime = System.nanoTime();
            // end the clock

            // The original code takes about 550μs to translate this paragraph.
            // The new code using HashMaps takes about 130μs to translate the same paragraph.

            System.out.println();
            System.out.println();
            System.out.println("*** The translation took " + ((endTime/1000) - (startTime/1000)) + " microseconds. ***");
            System.out.println();
        }
}
