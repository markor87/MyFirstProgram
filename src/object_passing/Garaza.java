package object_passing;

import org.jetbrains.annotations.NotNull;

public class Garaza {
    void park(@NotNull Automobil automobil) {
        System.out.println("Auto " + automobil.ime + " je parkiran u garazi.");
    }

    void park(Bicikla bicikla){
        System.out.println("Bicikla "+bicikla.ime+" je parkirana u garazi");
    }
}
