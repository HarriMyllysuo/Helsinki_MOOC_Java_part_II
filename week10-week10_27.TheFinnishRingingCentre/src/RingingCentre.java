
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> birds;

    public RingingCentre() {
        this.birds = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        List<String> places = new ArrayList<String>();
        if (birds.keySet().contains(bird)) {
            birds.get(bird).add(place);
        } else {
            birds.put(bird, places);
            birds.get(bird).add(place);
        }
    }

    public void observations(Bird bird) {
        if (birds.get(bird) == null) {
            System.out.println(bird + " observations: 0");
        } else {
            System.out.println(bird + " observations: " + birds.get(bird).size());
            for (int i = 0; i < birds.get(bird).size(); i++) {
                System.out.println(birds.get(bird).get(i));
            }
            //System.out.println(birds.get(bird));
        }
        /* for (Bird b : birds.keySet()) {
            if (b.equals(bird)) {
                System.out.println(b + " observations: " + birds.get(b).size());
                for (int i = 0; i < birds.get(b).size(); i++) {
                    System.out.println(birds.get(b).get(i));
                }
            } else {
                // System.out.println(b + " observations: " + birds.get(b).size());
                System.out.println("observations: 0");
            }
        } */
    }
}
