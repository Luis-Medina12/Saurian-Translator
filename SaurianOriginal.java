public class SaurianOriginal {
    private String engForm;
    private String saurForm;


    public SaurianOriginal()
    {
        engForm = "";
        saurForm = "";
    }

    public SaurianOriginal(String phrase , Boolean isEng)
    {
        if (isEng)
        {
            engForm = phrase;
            String trans = getEnglish();
            translateEngtoSaur(trans);
        }

        else
        {
            saurForm = phrase;
            String trans = getSaurian();
            translateSaurToEng(trans);
        }
    }

    public String getEnglish()
    {
        return engForm;
    }

    public String getSaurian()
    {
        return saurForm;
    }

    public void setEnglish(String setEnglish)
    {
        engForm = setEnglish;
        String trans = getEnglish();
        translateEngtoSaur(trans);
    }

    public void setSaurian(String setSaurian)
    {
        saurForm = setSaurian;
        String trans = getSaurian();
        translateSaurToEng(trans);

    }

    public void translateSaurToEng(String saurianToEnglish)
    {
        String original = getSaurian();
        char[] arr = original.toCharArray();

        int size = arr.length;
        char[] saurTrans = new char[size];

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < ARRLENGTH; j++)
            {
                if(arr[i] == SAURIANARR[j])
                {
                    saurTrans[i] = ENGLISHARR[j];
                }
            }
        }
        saurianToEnglish = new String(saurTrans);

        engForm = saurianToEnglish;
    }

    public void translateEngtoSaur(String englishToSaurian)
    {
        // "Hello" -> [H,e,l,l,o]
        char[] arr = englishToSaurian.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < ARRLENGTH; j++)
            {
                if(arr[i] == ENGLISHARR[j])
                {
                    arr[i] = SAURIANARR[j];
                }
            }
        }
        englishToSaurian = new String(arr);

        saurForm = englishToSaurian;
    }


    // constants used for translating
    // note M = M and m = m so M and m are not needed
    public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J','K',
            'L','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e',
            'f','g','h','i','j','k','l','n','o','p','q','r','s','t','u','v','w','x','y','z','!', ' ','.','?'};
    public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z','B','C','D',
            'E','F','G','H','J','K','I','L','N','P','O','Q','u','r','s','t','o','v','w','x',
            'a','z','b','c','d','e','f','g','h','j','k','i','l','n','p','o','q','!', ' ','.','?'};
    public static final int ARRLENGTH = ENGLISHARR.length;	// should be the same length for ENGLISHARR and SAURIANARR

}
