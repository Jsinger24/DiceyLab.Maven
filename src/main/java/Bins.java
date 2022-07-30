import java.util.ArrayList;
import java.util.Collections;
public class Bins {
    private ArrayList<Integer> results;

    public Bins (int maxBinNum) {
        results = new ArrayList<Integer>(Collections.nCopies(maxBinNum + 1, 0));
    }
    public Integer getBin(int binNum) {
        return this.results.get(binNum);
    }
    public void addToBin(int binNum) {
        results.set(binNum, results.get(binNum) +1);
    }
    public int size() {
        return results.size();
    }

}
