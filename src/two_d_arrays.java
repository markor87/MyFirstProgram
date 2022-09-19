public class two_d_arrays {
    public static void main(String[] args) {

//        String automobili;
        int i;
        int j;

        String[][] automobili = {
                {"Jugo", "Dacia", "Kia", "Opel"}, {"Audi", "BMW", "Mercedes", "Citroen"}, {"Mazda", "Tojota", "Hyndai", "Mitshubishi"}
        };

        for (i = 0; i < automobili.length; i++) {
            System.out.println();
            for (j = 0; j < automobili[i].length; j++) {
                System.out.print(automobili[i][j] + " ");
            }
        }
        System.out.println();
    }
}
