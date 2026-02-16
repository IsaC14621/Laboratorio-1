import java.util.*;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public Vehiculo[] LlenarRegistros(Vehiculo[] r) {
        for (int i = 0; i < r.length; i++) {
            Vehiculo o = new Vehiculo();
            System.out.println("Ingrese la marca");
            o.setMarca(sc.next());
            System.out.println("Ingrese tipo vehiculo");
            o.setTipo(sc.next());
            System.out.println("Ingrese el cilindraje");
            o.setCilindraje(sc.nextInt());
            r[i] = o;

        }
        return r;
    }
}
