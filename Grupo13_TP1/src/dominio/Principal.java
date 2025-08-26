package dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		//Empleados creados con constructores vacíos
        
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		
        // Empleados con constructores con parámetros
        Empleado e3 = new Empleado(
                LocalDate.of(2003, 9, 20),
                "45292157",
                "Marcos",
                "Colombres",
                "Masculino",
                "1135157104",
                "Francia 1508",
                "marcos.ccc@gmail.com",
                "Programador"
        );

        Empleado e4 = new Empleado(
                LocalDate.of(1985, 10, 20),
                "28765432",
                "María",
                "López",
                "Femenino",
                "1199887766",
                "Av. Siempre Viva 742",
                "maria.lopez@email.com",
                "Diseñadora"
        );
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        

	}

}
