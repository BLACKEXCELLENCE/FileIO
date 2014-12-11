/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ole
 */
public class MainApp {
    
    public void run()
    {
        searchWord("C:\\Users\\Christopher\\Dropbox\\Skole\\WordDistance\\words.txt");
        //printAllLines("C:\\Users\\Christopher\\Dropbox\\Skole\\WordDistance\\words.txt");
        //printTeachers("C:\\Users\\Christopher\\Dropbox\\Skole\\WordDistance\\words.txt");
        //printAll("kurt.txt");
    }
    
     private void searchWord(String fileName)
    {
        try {
            Scanner s = new Scanner(new FileReader(fileName));
            int lineNo = 0;
            System.out.println("Welcome to Word Distance App");
            System.out.println("Enter a keyword: ");
            while (s.hasNext())
            {
                lineNo++;
                String line = s.nextLine();
                //System.out.println(lineNo + ": " + line);
            }
            System.out.println(": " + lineNo);
        } catch (FileNotFoundException ex)
        {
            System.out.println("File " + fileName + " not found");
        }
    }
     
    private void printAllLines(String fileName)
    {
        try {
            Scanner s = new Scanner(new FileReader(fileName));
            int lineNo = 0;
            System.out.println("Started...");
            while (s.hasNext())
            {
                lineNo++;
                String line = s.nextLine();
                //System.out.println(lineNo + ": " + line);
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("File " + fileName + " not found");
        }
    }
    
    void printAll(String file)
    {
        try 
        {
            Scanner scan = new Scanner(new FileReader(file));
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println(file + " findes IKKE");
        }
    }
    private void printTeachers(String fileName)
    {
        try
        {
            Scanner s = new Scanner(new File(fileName));
            int totalHeight = 0;
            int totalShoeSize = 0;
            int lineCount = 0;
            while (s.hasNextLine())
            {
                 
                String name = s.next();
                int height = s.nextInt();
                int ss = s.nextInt();
                lineCount++;
                System.out.println(name + " is " + height + " cm tall, and used size " + ss + " in shoes");
                totalHeight += height;
                totalShoeSize += ss;
            }
            System.out.println("Total height: " + totalHeight);
            System.out.println("Average shoe size : " + totalShoeSize/lineCount);
        } catch (FileNotFoundException ex)
        {
            System.out.print("File " + fileName + " not found");
        }
    }
}
