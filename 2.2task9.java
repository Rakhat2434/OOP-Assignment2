public class task9 {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov");
        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}
