package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        String[][] myarr = {
                {"phone", "blue", "pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}};

        String key = "type";
        String value ="phone";

        int res = CountItems(myarr,key,value);
        System.out.println(res);
    }

    static int CountItems(String[][] items, String rulekey, String rulevalue) {
        /*0 = type
        1 = color
        2 = name*/
        int res = 0;
        int len = items.length;

        switch (rulekey) {
            case "type" -> {
                int index = 0;
                for (int i = 0; i < len; i++) {
                    if (items[i][index] == rulevalue) {
                        res++;
                    }
                }
                break;
            }
            case "color" -> {
                int index = 1;
                for (int i = 0; i < len; i++) {
                    if(items[i][index]==rulevalue){
                        res++;
                    }
                }
                break;
            }
            case "name" ->{
                int index = 2;
                for (int i = 0; i < len; i++) {
                    if(items[i][index]==rulevalue){
                        res++;
                    }
                }
            }

        }


        return res;
    }
}
