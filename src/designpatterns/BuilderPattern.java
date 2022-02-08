package designpatterns;

class User {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private int age;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String phone;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
public class BuilderPattern {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Rajiv", "Kumar")
                    .age(40)
                    .address("Greater Noida")
                    .phone("6883982398").build();
        System.out.println(user);
    }
}
