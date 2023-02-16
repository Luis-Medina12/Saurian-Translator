public class Saurian
{
    private String engForm;
    private String saurForm;

    // I created a class to store two HashMaps containing the translation of each char,
    // which will be used to make the translation instead of running through a nested loop each time
    hashedChars chars = new hashedChars();

    public Saurian()
    {
        engForm = "";
        saurForm = "";
    }

    public Saurian(String phrase , Boolean isEng)
    {
        if (isEng)
        {
            engForm = phrase;
            translateEngToSaur(phrase);
        }
        else
        {
            saurForm = phrase;
            translateSaurToEng(phrase);
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

    public void setEnglish(String engInput)
    {
        engForm = engInput;
        translateEngToSaur(engInput);
    }

    public void setSaurian(String setSaurian)
    {
        saurForm = setSaurian;
        String trans = getSaurian();
        translateSaurToEng(trans);
    }

    // This will go through the saurian input and replace
    // each char with its english counterpart
    // Using a HashMap saves me a lot of time by not
    // having to use a nested loop
    public void translateSaurToEng(String saurianToEnglish)
    {
        char[] arr = saurianToEnglish.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = chars.getEngChar(arr[i]);
        }
        engForm = new String(arr);
    }

    // This will go through the entire english input and replace
    // each char with its saurian counterpart
    // Using a HashMap saves me a lot of time by not
    // having to use a nested loop
    public void translateEngToSaur(String engInput)
    {
        char[] arr = engInput.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = chars.getSaurChar(arr[i]);
        }
        saurForm = new String(arr);
    }
}
