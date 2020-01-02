public class Main {
    public static final Map map1 = new Map();
    public static final Cargo cargo1=new Cargo(){{set_to(Map.Hamcarla.get_name());set_order_number(1);}};
    public static final Cargo cargo2 = new Cargo(){{set_to(Map.South_Payley.get_name());set_order_number(2);}};
    public static final Cargo cargo3 = new Cargo(){{set_to(Map.Kettleford.get_name());set_order_number(3);}};
    public static final Cargo cargo4 = new Cargo(){{set_to(Map.Clamdol.get_name());set_order_number(4);}};
    public static final Cargo cargo5 = new Cargo(){{set_to(Map.Southingstead.get_name());set_order_number(5);}};
    public static final Cargo cargo6 = new Cargo(){{set_to(Map.Saltby.get_name());set_order_number(6);}};
    public static final Cargo cargo7 = new Cargo(){{set_to(Map.Saltby.get_name());set_order_number(7);}};
    public static final CargoBus cargobus1=new CargoBus(){{set_cargos(cargo1);
                                                           set_cargos(cargo2);
                                                           set_cargos(cargo3);
                                                           set_cargos(cargo4);
                                                           set_cargos(cargo5);
                                                           set_cargos(cargo6);
                                                           set_cargos(cargo7);}};
    public static final Shipment shipment1= new Shipment(){{set_Cargobus(cargobus1);set_map(map1);}};

    public static void main(String[] args) {
        shipment1.start();



    }
}
