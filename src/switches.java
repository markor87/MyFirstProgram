public class switches {
    public static void main(String[] args) {

        String dan = "Petak";

        switch (dan){
            case "Nedelja":
                System.out.println("Nedelja je!");
                break;
            case "Ponedeljak":
                System.out.println("Ponedeljak je");
                break;
            case "Petak":
                System.out.println("Petak je konacno!");
                break;
            default:
                System.out.println("Nijedan dan!");

        }

    }
}
