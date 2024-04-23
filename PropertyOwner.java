
import java.util.List;

public class PropertyOwner {
    private User user;
    private List<Property> properties;

    public PropertyOwner() {
    }

    public PropertyOwner(User user, List<Property> properties) {
        this.user = user;
        this.properties = properties;
    }

    public boolean addProperty(Property property) {
        return properties.add(property);
    }

    public boolean removeProperty(Property property) {
        return properties.remove(property);
    }
}
