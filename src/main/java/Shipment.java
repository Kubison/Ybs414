import es.usc.citius.hipster.algorithm.*;
import es.usc.citius.hipster.graph.GraphSearchProblem;
import es.usc.citius.hipster.model.impl.WeightedNode;
import es.usc.citius.hipster.model.problem.SearchProblem;


public class Shipment{

    private CargoBus cargobus;

    private Map map;


    public void set_Cargobus(CargoBus cargobus) {
        this.cargobus = cargobus;
        }

    public void set_map(Map map) {this.map=map;}


    private WeightedNode calculate_path(String p1,String p2) {
        // calculate shortest path between two nodes
        // nodes must given as parameters

        SearchProblem p = GraphSearchProblem
                .startingFrom(p1)
                .in(map.get_map())
                .takeCostsFromEdges()
                .build();
        Algorithm.SearchResult ali = Hipster.createDijkstra(p).search(p2);
        WeightedNode veli = (WeightedNode) ali.getGoalNode();
        // function returns goal node as weighted node
        return veli;

    }

    private int shipment(String starting_point) {
        // function making shipment until there is no cargo left
        String closest = null;
        int index = 0;
        if(cargobus.get_cargos().isEmpty()){
            return 0;
        }
        WeightedNode closest_city = calculate_path("infinity","infinity1"); // function needs comparable and high value for first comparison
        for (int i=0;i<cargobus.get_cargos().size();i++){
            WeightedNode current_city = calculate_path(starting_point, cargobus.get_cargos().get(i).get_to());
            if (current_city.getCost().compareTo(closest_city.getCost()) < 0){ //if cost is the lowest, current node is the new target
                closest_city = current_city;
                index = i;
                closest=cargobus.get_cargos().get(i).get_to();
            }
        }
        cargobus.show_cargos();
        //System.out.println("Bus followed this path:"); // uncomment to see path
        //System.out.println(closest_city.path());
        System.out.printf("Total Cost of the path: %s\n",closest_city.getCost());
        System.out.printf("Bus moved to %s and delivered related cargos.\n", closest);
        cargobus.deliver_cargo(index); // delete related cargo from cargo bus list
        shipment(closest); // function call itself(recursively)
        return 0;


    }
    public void start(){
        this.shipment(Map.Beachburry.get_name());
    } // give first starting point
}

