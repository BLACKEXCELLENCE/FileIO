/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vipwords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ole
 */
public class VIPWordApp {

    public void run()
    {
        IVIPWords vipWords = new VIPWordsEmbedded();
        String fileName;
        System.out.print("Enter a filename: ");
        fileName = new Scanner(System.in).next();
        try
        {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext())
            {
                String w = input.next();
                System.out.println(w);
                vipWords.addOne(w);
            }
            input.close();

            for (String vipWord : vipWords.getAllVIPWords())
            {
                System.out.println(vipWord + ": " + vipWords.count(vipWord));
            }

        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(VIPWordApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
