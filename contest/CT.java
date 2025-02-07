package contest;

import java.util.ArrayList;
import java.util.List;

public class CT {
    
    public static List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char start = 'a';
        while(sb.toString().compareTo(target) < 0){
            if(sb.length() == 0) {
                sb.append(start);
            } else {
            for(int i = sb.length() - 1; i >= 0;i--) {
                if(sb.charAt(i) == 'z') {
                    sb.setCharAt(i, 'a');
                    if(i == 0) {
                        sb.insert(0, 'a');
                        break;
                    }
                }
                else {
                    if(sb.toString().length() % 2 != 0) {
                        sb.append(start);
                    } else {
                        sb.setCharAt(sb.length() - 1, (char)(sb.charAt(sb.length() - 1) + 1));
                    }
                    break;
                }
            }
        }
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringSequence("zbc"));
    }
}
