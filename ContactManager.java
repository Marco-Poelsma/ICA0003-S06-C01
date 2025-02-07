import java.util.ArrayList;
public class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<>();
    /**
     * Muestra el menú de opciones.
     */
    public static void menu() {
        System.out.println("Bienvenido a Contacts Manager!");
        System.out.println("Escoge una opción");
        System.out.println("MENU:");
        System.out.println("[1] Agregar contacto");
        System.out.println("[2] Buscar contacto");
        System.out.println("[3] Salir");
        System.out.println("Escoge una operación [1-3] :");
    }
    /**
     * Agrega un contacto a la lista de contactos.
     * @param name Nombre del contacto
     * @param phoneNumber Número de teléfono del contacto
     * @param email Email del contacto
     */
    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact (name, phoneNumber, email);
        if (contacts.contains(newContact)) {
            System.out.println("Contacto ya existe.");
            return;
        }
        contacts.add(new Contact(name, phoneNumber, email));
    }
    /**
     * Busca un contacto en la lista de contactos.
     * @param searchParam Nombre o número de teléfono del contacto a buscar
     */
    public void searchContact(String searchParam) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(searchParam) || contact.getPhoneNumber().equals(searchParam)) {
                System.out.println("Contacto encontrado:");
                System.out.println("Nombre: " + contact.getName());
                System.out.println("Teléfono: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }
    public static void main() {
        menu();
        byte opcion = Main.scan.nextByte();
        ContactManager contactManager = new ContactManager();
        while (opcion != 3) {
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del contacto:");
                    String name = Main.scan.next();
                    System.out.println("Ingrese el número de teléfono:");
                    String phoneNumber = Main.scan.next();
                    System.out.println("Ingrese el email (Opcional, presione INTRO para saltar):");
                    String email = Main.scan.next();
                    contactManager.addContact(name, phoneNumber, email);
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre o numero de telefono del contacto a buscar:");
                    String searchParam = Main.scan.next();
                    contactManager.searchContact(searchParam);
                }
                case 3 -> { System.out.println("Saliendo...");}
                default -> System.out.println("Opción inválida.");
            }
            menu();
            opcion = Main.scan.nextByte();
        }
    }
    /**
     * Constructor por defecto
     */
    public ContactManager() {
        ArrayList<Contact> contacts = new ArrayList<>();
    }
}
