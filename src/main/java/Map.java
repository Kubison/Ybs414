import es.usc.citius.hipster.graph.GraphBuilder;
import es.usc.citius.hipster.graph.HipsterGraph;

public class Map {
    public static final City Beachburry = new City(){{set_name("Beachburry");}};
    public static final City Saltby = new City(){{set_name("Saltby");}};
    public static final City Clamdol = new City(){{set_name("Clamdol");}};
    public static final City Springburry = new City(){{set_name("Springburry");}};
    public static final City Kettleford = new City(){{set_name("Kettleford");}};
    public static final City South_Payley = new City(){{set_name("South Payley");}};
    public static final City James_Hampton = new City(){{set_name("James Hampton");}};
    public static final City Southingstead = new City(){{set_name("Southingstead");}};
    public static final City Hamcarla = new City(){{set_name("Hamcarla");}};

    public static final Road road1 = new Road(){{set_from(Beachburry);set_to(Saltby);set_road_cost(4);}};
    public static final Road road2 = new Road(){{set_from(Beachburry);set_to(Clamdol);set_road_cost(8);}};
    public static final Road road3 = new Road(){{set_from(Saltby);set_to(Springburry);set_road_cost(8);}};
    public static final Road road4 = new Road(){{set_from(Saltby);set_to(Clamdol);set_road_cost(11);}};
    public static final Road road5 = new Road(){{set_from(Clamdol);set_to(South_Payley);set_road_cost(1);}};
    public static final Road road6 = new Road(){{set_from(Clamdol);set_to(Kettleford);set_road_cost(7);}};
    public static final Road road7 = new Road(){{set_from(Springburry);set_to(James_Hampton);set_road_cost(7);}};
    public static final Road road8 = new Road(){{set_from(Springburry);set_to(Kettleford);set_road_cost(2);}};
    public static final Road road9 = new Road(){{set_from(Kettleford);set_to(South_Payley);set_road_cost(6);}};
    public static final Road road10 = new Road(){{set_from(Springburry);set_to(Southingstead);set_road_cost(4);}};
    public static final Road road11= new Road(){{set_from(South_Payley);set_to(Southingstead);set_road_cost(2);}};
    public static final Road road12 = new Road(){{set_from(James_Hampton);set_to(Southingstead);set_road_cost(14);}};
    public static final Road road13 = new Road(){{set_from(James_Hampton);set_to(Hamcarla);set_road_cost(9);}};
    public static final Road road14 = new Road(){{set_from(Southingstead);set_to(Hamcarla);set_road_cost(10);}};

    // create map
    HipsterGraph<String,Double> map = GraphBuilder.<String,Double>create()
            .connect(road1.get_from()).to(road1.get_to()).withEdge(road1.get_cost())
            .connect(road2.get_from()).to(road2.get_to()).withEdge(road2.get_cost())
            .connect(road3.get_from()).to(road3.get_to()).withEdge(road3.get_cost())
            .connect(road4.get_from()).to(road4.get_to()).withEdge(road4.get_cost())
            .connect(road5.get_from()).to(road5.get_to()).withEdge(road5.get_cost())
            .connect(road6.get_from()).to(road6.get_to()).withEdge(road6.get_cost())
            .connect(road7.get_from()).to(road7.get_to()).withEdge(road7.get_cost())
            .connect(road8.get_from()).to(road8.get_to()).withEdge(road8.get_cost())
            .connect(road9.get_from()).to(road9.get_to()).withEdge(road9.get_cost())
            .connect(road10.get_from()).to(road10.get_to()).withEdge(road10.get_cost())
            .connect(road11.get_from()).to(road11.get_to()).withEdge(road11.get_cost())
            .connect(road12.get_from()).to(road12.get_to()).withEdge(road12.get_cost())
            .connect(road13.get_from()).to(road13.get_to()).withEdge(road13.get_cost())
            .connect(road14.get_from()).to(road14.get_to()).withEdge(road14.get_cost())
            .connect("infinity").to("infinity1").withEdge(2000.0) // function need high cost node for comparison
            .createUndirectedGraph();
    public HipsterGraph<String,Double> get_map(){
        return this.map;
    }

}
