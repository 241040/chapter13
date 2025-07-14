public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");

        King k = new King();
        k.talk(h);

        Inn i = new Inn();
        i.checkIn(h);

        Matango m = new Matango();
        h.attack(m);
    }
}
