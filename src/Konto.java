public class Konto {

    private String kontoInhaber ="";
    private double kontostand = 0;
    private static int anzKtn = 0;

    public Konto(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
        anzKtn++;
    }

    public static int getAnzKtn() {
        return anzKtn;
    }

    private void setInhaber(String inhaber){
        this.kontoInhaber = inhaber;
        this.kontostand = 0;
    }

    private void aufbuchen(double amount){
        this.kontostand += amount;
    }

    private void abbuchen(double amount){
        if(this.kontostand - amount >= 0){
            this.kontostand -= amount;
        }
    }


    public static void main(String[] args) {
        Konto konto1 = new Konto("Alex Behek");
        Konto konto2 = new Konto("Alex Kirschner");

        System.out.println(konto1.kontoInhaber + " " + konto1.kontostand);
        System.out.println(konto2.kontoInhaber + " " + konto2.kontostand);

        konto1.aufbuchen(100);
        konto2.aufbuchen(100);
        System.out.println(konto1.kontoInhaber + " " + konto1.kontostand);
        System.out.println(konto2.kontoInhaber + " " + konto2.kontostand);
        konto1.abbuchen(50);
        konto2.abbuchen(25);
        System.out.println(konto1.kontoInhaber + " " + konto1.kontostand);
        System.out.println(konto2.kontoInhaber + " " + konto2.kontostand);

        System.out.println(Konto.getAnzKtn());
    }
}
