public class Main {
    public static void main(String[] args) {
        Quotation.display();
        Quotation.setQuote("This is a new quote!");
        Quotation.display();

        Persona persona = new Persona("Juan");
        persona.decirNombre();
        persona.hablar();
        persona.dormir();

        

    }
}