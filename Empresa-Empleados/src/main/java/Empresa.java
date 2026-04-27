import java.util.ArrayList;

class Empresa {
    ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public double calcularTotalSalarios() {
        double total = 0;

        for (Empleado e : empleados) {
            total += e.calcularSalarioTotal();
        }
        return total;
    }
}