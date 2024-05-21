public class User {

    private String userId;
    private String password;
    private String email;
    private String userType;
  
    public User(String userId, String password, String email, String userType) {
      this.userId = userId;
      this.password = password;
      this.email = email;
      this.userType = userType;
    }
  
    public static User createUser(String userId, String password, String email, String userType) {
      return new User(userId, password, email, userType);
    }
  
    public void resetPassword(String newPassword) {
      // Implement password validation logic here
      this.password = newPassword;
    }
  
    // Getters for accessing user attributes
    public String getUserId() {
      return userId;
    }
  
    public String getEmail() {
      return email;
    }
  
    public String getUserType() {
      return userType;
    }
  
    // Setters for modifying user attributes
    public void setEmail(String email) {
      // Implement email validation logic here
      this.email = email;
    }
  }
  