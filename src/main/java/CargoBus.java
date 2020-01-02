import java.util.ArrayList;
import java.util.List;

public class CargoBus {
    private List<Cargo> cargos= new ArrayList<Cargo>();

    public List<Cargo> get_cargos(){return cargos;}

    public void set_cargos(Cargo cargo_object){this.cargos.add(cargo_object);}

    public void deliver_cargo(int index){this.cargos.remove(index);}

    public void show_cargos(){
        System.out.println("   _____________\n" +
                " _/_|[][][][][] | \n" +
                "(    Cargo Bus  | \n" +
                "=--OO-------OO--=**");
        System.out.println("Number   Destination");
        for(int i=0;i<get_cargos().size();i++){
            System.out.println(String.format("%s\n%s%s%s",
                                                            "*******************"
                                                            ,get_cargos().get(i).get_order_number()
                                                            ,"  "
                                                            ,get_cargos().get(i).get_to()));
        }
        System.out.println("*******************");
    }

}
