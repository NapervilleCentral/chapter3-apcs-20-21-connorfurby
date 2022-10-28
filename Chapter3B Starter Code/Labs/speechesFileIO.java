package Labs;


/**
 * Write a description of class speechesFileIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;  
import java.util.*;
public class speechesFileIO
{
    public static void main(String[] args) throws IOException
    {
        int currWordLen, wordcnt = 1, avgWordLen = 0;
        
        Scanner scanFile = new Scanner(new File("obamatakebackamerica.txt"));
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
        }
        
        avgWordLen = avgWordLen / wordcnt;
        System.out.println("President Name: " + name);
        System.out.println("Date of Speech: " + date);
        System.out.println("Title of Speech: " + title);
        System.out.println("Average Word Length: " + avgWordLen);
        System.out.println("Word Count: " + wordcnt);
    }
}
