class Automobil {
    public int Geschwindigkeit;
    public int Pferdestaerke;
 
    public Automobil(int speed, int PS)
    {
        this.Geschwindigkeit = speed;
        this.Pferdestaerke = PS;
    }
 
    public void bremsen(int decrement)
    {
        Geschwindigkeit -= decrement;
    }
 
    public void beschleunigen(int increment)
    {
    	Geschwindigkeit += increment;
    }
 
    public String toString()
    {
        return ("Geschwindigkeit des Wagens liegt bei " + Geschwindigkeit + "\n"
                + "Der Wagen hat " + Pferdestaerke + " PS");
    }
}
 
class BMW extends Automobil {
 
    public int Preis;
 
    public BMW(int Geschwindigkeit, int Pferdestaerke,
                        int startPreis)
    {
        super(Geschwindigkeit, Pferdestaerke);
        Preis = startPreis;
    }
 
    public void setPreis(int newValue)
    {
        Preis = newValue;
    }
 
    @Override public String toString()
    {
        return (super.toString() + "\nDer Preist liegt bei "
                + Preis + "€");
    }
}
    class Audi extends Automobil {
    	 
        public int Preis;
     
        public Audi(int Geschwindigkeit, int Pferdestaerke,
                            int startPreis)
        {
            super(Geschwindigkeit, Pferdestaerke);
            Preis = startPreis;
        }
     
        public void setPreis(int newValue)
        {
            Preis = newValue;
        }
     
        @Override public String toString()
        {
            return (super.toString() + "\nDer Preist liegt bei "
                    + Preis + "€");
        }

}
