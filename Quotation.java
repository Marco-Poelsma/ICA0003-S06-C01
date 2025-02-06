public class Quotation {
    private static String quote = "Welcome to Oracle, the new home of Java!";
    
    public static String getQuote() {
        return quote;
    }
    
    public static void setQuote(String newQuote) {
        Quotation.quote = newQuote;
    }
    
    public static void display() {
        System.out.println(Quotation.getQuote());
    }
}
