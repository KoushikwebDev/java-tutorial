import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1,String s2){
        return s1.length() - s2.length(); // ascending order of length
        // return s2.length() - s1.length(); //* descending order of length
    };
}

class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1,Integer i2){
        return i2 - i1; // descending order
        // return i1 - i2; //* ascending order
    };
}

// compare method if returns negative value => first argument is less than second argument => it will return o1 before o2

// compare method if returns zero => both arguments are equal

// compare method if returns positive value => first argument is greater than second argument => it will return o2 before o1

public class Sorting {
    
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);

        // list.sort(null); // Sorts in natural order => ascending order

        list.sort(new IntegerComparator());

        list.sort((i1, i2) -> i2 - i1); // descending order using lambda expression

        System.out.println(list);


        // 

        List<String> words = Arrays.asList("banana", "apple","date");

        // words.sort(new StringLengthComparator());

        words.sort(new StringLengthComparator(){
            @Override
            public int compare(String s1, String s2){
                return s2.length() - s1.length(); // descending order of length
            }
        });

        // or by using lambda expression
        words.sort((s1,s2) -> s2.length() - s1.length());

        System.out.println(words);
    }
}
