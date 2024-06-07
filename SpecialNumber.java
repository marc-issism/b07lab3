import java.util.List;

public abstract class SpecialNumber {

    abstract SpecialNumber add(SpecialNumber spec_num) throws Lab3Exception;
    abstract SpecialNumber divideByInt(int divisor) throws Lab3Exception;

    public SpecialNumber computeAverage(List<SpecialNumber> spec_nums) throws Lab3Exception {

        if (spec_nums == null || spec_nums.size() == 0) {
            throw new Lab3Exception("List cannot be empty");
        }
        
        SpecialNumber sum = spec_nums.get(0);

        for (int i = 1; i < spec_nums.size(); i++) {
            sum = sum.add(spec_nums.get(i));
        }

        return sum.divideByInt(spec_nums.size());
        
    }

}
