package dsa.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

    /*
        h1 -> country, continent
        h2 -> country,url
     */

    public static List<String> getUrl(Map<String,String> h1, Map<String,String> h2, String continent){

        List<String> result = new ArrayList<>();
        for(Map.Entry<String,String> en : h1.entrySet()){
            System.out.println(en.getKey());
            if(en.getValue().equals(continent)){
                result.add(en.getKey()+ "--"+ h2.get(en.getKey()));

            }
        }

        List<String> result1= h1.entrySet().stream().filter(en->en.getValue().equals(continent))
                .map(en -> en.getKey()+"--"+h2.get(en.getKey())).toList();

        System.out.println(result1);
        return result;
    }

    public static void main( String[] args) {


        Map<String,String> h1 = new HashMap<>();
        h1.put("India","Asia");
        h1.put("France","Europe");
        h1.put("Nepal","Asia");
        Map<String,String> h2 = new HashMap<>();
        h2.put("India","http://india.org");
        h2.put("France","http://france.org");
        h2.put("Nepal","http://nepal.org");
        System.out.println(getUrl(h1,h2,"Asia"));
    }
}
