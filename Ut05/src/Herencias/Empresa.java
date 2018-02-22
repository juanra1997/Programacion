package Herencias;

public class Empresa extends Personas {

	public class Empleado {
		
		public class Fijo {
			String fechAlta, puesto;
			int sueldo;
		}
		
		public class Temporal {
			String FechAlta, FechSalida, puesto;
			int sueldo;
		}
	}
}
