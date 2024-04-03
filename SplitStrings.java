import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.size(); i++){
            String temp = words.get(i);

            String out = "";
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j) == separator){
                    if(out.length() != 0){
                        list.add(out);
                    }
                    out = "";
                }else{
                    out += temp.charAt(j);
                }
            }
            if(out.length()!=0){
                list.add(out);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        List<String> inp = List.of("@..@@.s.@u@.@");
        System.out.println(splitWordsBySeparator(inp, '.'));
    }
}
