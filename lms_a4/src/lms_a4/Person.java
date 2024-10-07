abstract class Person {
    private String name;
    private String contactInfo;

    public Person(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
}