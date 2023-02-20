package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule_using_arraylist {
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<List<String>>();
        String ruleKey = "";
        String ruleValue = "";

        int res = countMatches(items,ruleKey,ruleValue);
        System.out.println(res);
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0, count =0;
        //Using switch case identify which against index in the List, ruleValue has to be matched
        switch(ruleKey){
            case "type" : index = 0;
                break;
            case "color" : index = 1;
                break;
            case "name" : index = 2;
                break;
        }

        for (List<String> item : items) {
            //Comparing the value at index i with ruleValue & incrementing count
            if (item.get(index).equals(ruleValue))
                count += 1;
        }

        return count;
    }


    }

