package overloaded_constructors;

public class Pizza {
    String hleb;
    String sos;
    String kackavalj;
    String kulen;

    Pizza(String hleb,String sos,String kackavalj){
        this.hleb = hleb;
        this.sos = sos;
        this.kackavalj = kackavalj;
//        this.kulen;

    }
    Pizza(String hleb,String sos,String kackavalj, String kulen){
        this.hleb = hleb;
        this.sos = sos;
        this.kackavalj = kackavalj;
        this.kulen = kulen;
    }
}
