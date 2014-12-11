/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vipwords;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ole
 */
public class VIPWordsEmbedded implements IVIPWords {

    
    List<VIPWord> mVIPWords;

    public VIPWordsEmbedded()
    {
        mVIPWords = new ArrayList<VIPWord>();
        mVIPWords.add(new VIPWord("class"));
        mVIPWords.add(new VIPWord("int"));
        mVIPWords.add(new VIPWord("void"));
        mVIPWords.add(new VIPWord("String"));
        mVIPWords.add(new VIPWord("public"));
        mVIPWords.add(new VIPWord("private"));
    }

    private VIPWord search(String s)
    {
      for (VIPWord v : mVIPWords)
          if (s.equals(v.getWord())) return v;
      return null;
    }

    public boolean isVIPWord(String s)
    {
        return search(s) != null;
    }

    public void addOne(String s)
    {
        VIPWord v = search(s);
        if (v != null) v.increment();
    }

    public int count(String s)
    {
        VIPWord v = search(s);
        if ( v== null) return 0;
        return v.getCounter();
    }

    public String[] getAllVIPWords()
    {
        String[] res = new String[mVIPWords.size()];
        int i=0;
        for (VIPWord v : mVIPWords)
            res[i++] = v.getWord();
        return res;
    }

    private class VIPWord
    {
        String mStr;
        int m_Counter;
        public VIPWord(String s)
        { mStr = s; m_Counter= 0;}

        public void increment()
        { m_Counter++; }

        public String getWord() { return mStr; }
        public int getCounter() { return m_Counter; }
    }
}
