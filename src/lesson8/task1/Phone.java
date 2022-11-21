package lesson8.task1;

class Phone {

    private final String model;
    private Number number;
    private double weight;
    private int capacity = 5;
    private int size = 0;
    private Contact[] contacts = new Contact[capacity];

    Phone(String model, Number number) {
        this.model = model;
        this.number = number;
    }

    Phone(String model, Number number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    public Number getNumber() {
        return number;
    }

    boolean receiveCall(Contact contact) {
        if (contact != null) {
            System.out.println("\tCalling from\n\t" + contact);
            return true;
        }
        return false;
    }

    boolean receiveCall(String name, Number number) {
        if (number != null) {
            if (name == null) {
                System.out.println("Calling\n" + number);
            } else {
                System.out.println("\tCalling from\n" + name + "\n" + number);
            }
            return true;
        }
        return false;
    }

// тут гораздо лучше подойдут binary серчи, но я не хочу парится с сортировками массива
    Contact findContact(String name) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equals(name)) return contacts[i];
        }
        return null;
    }

    Contact findContact(Number number) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getNumber().equals(number)) return contacts[i];
        }
        return null;
    }

    void sendMessage(String message, Contact ... contacts) {
        System.out.printf("The message \"%s\" will be sent to\n", message);
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        System.out.println();
    }

    private void increaseContactCapacity() {
        Contact[] savedContacts = new Contact[contacts.length * 2];
        System.arraycopy(contacts, 0, savedContacts, 0, contacts.length);
        capacity *= 2;
        contacts = savedContacts;
    }

    boolean addContact(Contact contact) {
        if (contact == null || findContact(contact.getName()) != null) return false;

        if (capacity == size) increaseContactCapacity();

        contacts[size] = contact;
        size++;

        return true;
    }

    void printAllContacts() {
        System.out.println("\tContact list:");
        for (int i = 0; i < size; i++) {
            System.out.println(contacts[i]);
        }
    }
}
