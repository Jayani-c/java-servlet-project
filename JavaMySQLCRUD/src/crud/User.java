package crud;

public class User {
    private int id;
    private String name;
    private String email;
    private String country;

    public User(int id, String name, String email, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Email: " + email + " | Country: " + country;
    }
}



//package crud;
//
//public class User {
//    private int id;
//    private String name;
//    private String email;
//    private String country;
//
//    public User(int id, String name, String email, String country) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.country = country;
//    }
//
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public String getEmail() { return email; }
//    public String getCountry() { return country; }
//
//    @Override
//    public String toString() {
//        return "User [ID=" + id + ", Name=" + name + ", Email=" + email + ", Country=" + country + "]";
//    }
//}
