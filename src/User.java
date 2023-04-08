import java.util.Date;

public class User {
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date creationDate;
    private Date lastLoginDate;

    public User(String username, String email, String password, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = new Date();
        this.lastLoginDate = null;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void register() {
        // implementation here
        System.out.println("User registered successfully!");
    }

    public void login() {
        // implementation here
        if (this.password.equals(password)) {
            this.lastLoginDate = new Date();
            System.out.println("User logged in successfully!");
        } else {
            System.out.println("Incorrect username or password.");
        }
    }

    public void logout() {
        // implementation here
        this.lastLoginDate = null;
        System.out.println("User logged out successfully!");
    }

    public void resetPassword() {
        // implementation here
        System.out.println("Password reset successfully!");
    }

    public void updateProfile() {
        // implementation here
        System.out.println("User profile updated successfully!");
    }

    public void deleteAccount() {
        // implementation here
        System.out.println("User account deleted successfully!");
    }
}
