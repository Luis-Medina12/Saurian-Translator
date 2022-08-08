import java.util.HashMap;

public class hashedChars {

    HashMap<Integer,Character> engToSaurChars = new HashMap<Integer,Character>(ENGLISHARR.length);
    HashMap<Integer,Character> saurToEngChars = new HashMap<Integer,Character>(SAURIANARR.length);

    public hashedChars()
    {
        int counter = 0;
        int curr = 0;

        // This fills the HashMaps by using the origin char as a key and stores
        // its counterpart as the value.

        // This will save me compute time by only needing to iterate through
        // the alphabet arrays once instead of at every translation
        while(counter< SAURIANARR.length)
        {
            curr = ENGLISHARR[counter];
            engToSaurChars.put(curr, SAURIANARR[counter]);

            curr = SAURIANARR[counter];
            saurToEngChars.put(curr, ENGLISHARR[counter]);
            counter++;
        }
    }

    // We can use the value of the origin char to pull its counterpart
    // from the HashMap

    char getSaurChar(int num)
    {
        return engToSaurChars.get(num);
    }

    char getEngChar(int num)
    {
        return saurToEngChars.get(num);
    }

    public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
            'r','s','t','u','v','w','x','y','z','!', ' ','.','?',',','\''};
    public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z','B','C','M','D','E','F','G',
            'H','J','K','I','L','N','P','O','Q','u','r','s','t','o','v','w','x','a','z','b','c','m','d','e','f','g',
            'h','j','k','i','l','n','p','o','q','!', ' ','.','?',',','\''};
}
