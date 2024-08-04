public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Fido", 3);
        Gato gato = new Gato("Misu", 2);

        perro.hacerSonido();
        perro.comer();
        perro.beber();
        perro.dormir();
        perro.hacerTruco();
        perro.hacerTruco("dar la pata");

        gato.hacerSonido();
        gato.comer();
        gato.beber();
        gato.dormir();
    }
}
