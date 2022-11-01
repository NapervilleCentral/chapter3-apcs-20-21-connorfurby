package Labs;


/**
 * Write a description of class speechesFileIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;  
import java.util.*;
import java.text.*;
public class speechesFileIO
{
    public static void main(String[] args) throws IOException
    {
        int currWordLen, wordcnt = 1, peoplecnt = 0, governmentcnt = 0, unitedcnt = 0, ourcnt = 0;
        double avgWordLen = 0;
        //Scanner scanFile = new Scanner(new File("obamatakebackamerica.txt"));
        //Scanner scanFile = new Scanner(new File("Jadams inaugural speech.txt"));
        //Scanner scanFile = new Scanner(new File("Rutherford B Hayes Inaugural.txt"));
        //Scanner scanFile = new Scanner(new File("jfk.txt"));
        //Scanner scanFile = new Scanner(new File("taft.txt"));
        Scanner scanFile = new Scanner(new File("tjefferson.txt"));
        String name = new String(scanFile.nextLine());
        String date = new String(scanFile.nextLine());
        String title = new String(scanFile.nextLine());
        String currWord = new String("");
        while (scanFile.hasNext())
        {
            currWord = scanFile.next();
            currWordLen = currWord.length();
            avgWordLen += currWordLen;
            
            wordcnt += 1;
            if (currWord.toLowerCase().compareTo("people") == 0 || currWord.toLowerCase().compareTo("people.") == 0 || currWord.toLowerCase().compareTo("people,") == 0)
                peoplecnt = peoplecnt + 1;
            else if (currWord.toLowerCase().compareTo("government") == 0 || currWord.toLowerCase().compareTo("government.") == 0 || currWord.toLowerCase().compareTo("government,") == 0)
                governmentcnt = governmentcnt + 1;
            else if (currWord.toLowerCase().compareTo("united") == 0 || currWord.toLowerCase().compareTo("united.") == 0 || currWord.toLowerCase().compareTo("united,") == 0)
                unitedcnt = unitedcnt + 1;
            else if (currWord.toLowerCase().compareTo("our") == 0 || currWord.toLowerCase().compareTo("our.") == 0 || currWord.toLowerCase().compareTo("our,") == 0)
                ourcnt = ourcnt + 1;
        }
        float peoplepercent, governmentpercent, unitedpercent, ourpercent;
        DecimalFormat df = new DecimalFormat("##.##");
        peoplepercent = peoplecnt / wordcnt;
        governmentpercent = governmentcnt / wordcnt;
        unitedpercent = unitedcnt / wordcnt;
        ourpercent = ourcnt / wordcnt;
        avgWordLen = avgWordLen / wordcnt;
        System.out.println("President Name: " + name);
        System.out.println("Date of Speech: " + date);
        System.out.println("Title of Speech: " + title);
        System.out.println("Average Word Length: " + df.format(avgWordLen));
        System.out.println("Word Count: " + wordcnt);
        System.out.println("Times 'People' Was Said: " + peoplecnt);
        System.out.println("Percentage of words that were 'People': " + df.format(peoplepercent));
        System.out.println("Times 'Government' Was Said: " + governmentcnt);
        System.out.println("Percentage of words that were 'Government': " + df.format(governmentpercent));
        System.out.println("Times 'United' Was Said: " + unitedcnt);
        System.out.println("Percentage of words that were 'United': " + df.format(unitedpercent));
        System.out.println("Times 'Our' Was Said: " + ourcnt);
        System.out.println("Percentage of words that were 'Our': " + df.format(ourcnt / wordcnt));
    }
}
