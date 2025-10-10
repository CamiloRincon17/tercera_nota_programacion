package weekunknown.clase;

public class Employee {
    public String role;

    public Employee(String role) {
        this.role = role;
    }
    void showRespinsabilites(){
        switch (role) {
            case "Manager":
            System.out.println("Maneja el Equipo");

                break;
            case "Developer":
            System.out.println("Programa y testea");

            break;
            case "Designer":
            System.out.println("Disena ui/ux");
        
            default:
            System.out.println("no e conoce");
                break;
        }
    }

}
