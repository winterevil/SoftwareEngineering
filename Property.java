public class Property {

    private int propertyId;
    private String description;
    private int propertyOwnerId;
  
    public Property(int propertyId, String description, int propertyOwnerId) {
      this.propertyId = propertyId;
      this.description = description;
      this.propertyOwnerId = propertyOwnerId;
    }
  
    // Getters for accessing property attributes
    public int getPropertyId() {
      return propertyId;
    }
  
    public String getDescription() {
      return description;
    }
  
    public int getPropertyOwnerId() {
      return propertyOwnerId;
    }
  
    // Setters for modifying property attributes
    public void setDescription(String description) {
      // Implement description validation logic here
      this.description = description;
    }
    
}
