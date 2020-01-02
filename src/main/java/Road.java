public class Road
{
    private City from_city;
    private City to_city;
    private double cost;

    public void set_from(City from_city){this.from_city=from_city;}
    public void set_to(City to_city){this.to_city=to_city;}
    public void set_road_cost(double cost){this.cost=cost;}

    public String get_from(){return this.from_city.get_name();}
    public String get_to(){return this.to_city.get_name();}
    public double get_cost(){return this.cost;}
}