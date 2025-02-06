public class Main {
    public static void main(String[] args) {
        Quotation.display();
        Quotation.setQuote("This is a new quote!");
        Quotation.display();

        Persona persona = new Persona("Juan");
        persona.decirNombre();
        persona.hablar();
        persona.dormir();

        TShirt tshirt = new TShirt(223388, "Camiseta manga corta mujer Perkins", 'M', 19.90, 100);
        tshirt.displayInformation();
    }
}