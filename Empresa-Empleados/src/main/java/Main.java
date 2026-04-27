public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Luis", 150);
        Empleado emp2 = new Empleado("Josue", 400);
        Empleado emp3 = new Empleado("Reynolds", 500);
        Empleado emp4 = new Empleado("Blanca", 600);
        Empleado emp5 = new Empleado("Cristofer", 200);
        Empleado emp6 = new Empleado("Mario", 2300);

        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        empresa.agregarEmpleado(emp4);
        empresa.agregarEmpleado(emp5);
        empresa.agregarEmpleado(emp6);

        System.out.println("\nTotal salarios: " + empresa.calcularTotalSalarios());
        System.out.println("\nDescuentos aplicados:\n ");

        for (Empleado e : empresa.empleados) {
            if (e.aplicaDescuento()) {
                System.out.println(e.nombre + " aplica descuento");
            } else {
                System.out.println(e.nombre + " no aplica descuento");
            }

        }
    }
}