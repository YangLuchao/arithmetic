import me.xdrop.fuzzywuzzy.FuzzySearch;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ylc
 * @date 2018/4/24 16:59
 */
public class Fuzzywuzzys {


    public static void main(String[] args) {
        //Simple Ratio
        System.out.println("Simple Ratio---->" + FuzzySearch.ratio("mysmilarstring", "myawfullysimilarstirng"));
        //Partial Ratio
        System.out.println("Partial Ratio------>" + FuzzySearch.partialRatio("similar", "somewhresimlrbetweenthisstring"));
        //Token Sort Ratio
        System.out.println("Token Sort Ratio----->" + FuzzySearch.tokenSortPartialRatio("order words out of", "  words out of order"));
        // Token Set Ratio
        System.out.println("Token Set Ratio----->" + FuzzySearch.tokenSetPartialRatio("fuzzy was a bear", "fuzzy fuzzy fuzzy bear"));
        // Weighted Ratio
        System.out.println("Weighted Ratio----->" + FuzzySearch.weightedRatio("The quick brown fox jimps ofver the small lazy dog", "the quick brown fox jumps over the small lazy dog"));
        // Extract
        // extractOne
        String[] sOne = new String[]{"Atlanta Falcons", "New York Jets", "New York Giants", "Dallas Cowboys"};
        ArrayList<String> lOne = new ArrayList<String>();
        for (String s : sOne) {
            lOne.add(s);
        }
        System.out.println("Extract----->" + FuzzySearch.extractOne("cowboys", lOne));

        //extractTop
        String[] sTop = {"google", "bing", "facebook", "linkedin", "twitter", "googleplus", "bingnews", "plexoogl"};
        ArrayList<String> lTop = new ArrayList<String>();
        for (String s : sTop) {
            lTop.add(s);
        }
        System.out.println("extractTop---->" + FuzzySearch.extractTop("goolge", lTop, 3));

        // extractAll
        System.out.println("extractAll----->" + FuzzySearch.extractAll("goolge", lTop,3));

        // extractSorted
        System.out.println("extractSorted---->" + FuzzySearch.extractSorted("goolge", lTop, 3));

    }

}
