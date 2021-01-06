import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> populations = new HashMap<String, Integer>();

        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);


//        Integer ukPopulation = populations.get("UK");
//        Collection allPopulations = populations.values();
          Set keySetPopulations = populations.keySet();

//        String output = "The population of UK is " + ukPopulation.toString();
//        String output = "All the populations: " + allPopulations.toString();
          String output = "All the countries: " + keySetPopulations.toString();
        System.out.println(output);
    }
}
