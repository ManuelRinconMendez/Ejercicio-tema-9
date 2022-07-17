public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println("Se imprimen los datos del cliente");
        cliente.setNombre("Manuel");
        System.out.println(cliente.getNombre());
        cliente.setEdad(40);
        System.out.println(cliente.getEdad());
        cliente.setTelefono(123);
        System.out.println(cliente.getTelefono());

        Trabajador trabajador = new Trabajador();
        System.out.println("Se imprimen los datos del Trabajador");
        trabajador.setNombre("Alfonso");
        System.out.println(trabajador.getNombre());
        trabajador.setEdad(20);
        System.out.println(trabajador.getEdad());
        trabajador.setTelefono(234);
        System.out.println(trabajador.getTelefono());
        trabajador.setSalario(200);
        System.out.println(trabajador.getSalario());

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona{
    String credito;
}

class Trabajador extends Persona{
    float salario;

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }

}

