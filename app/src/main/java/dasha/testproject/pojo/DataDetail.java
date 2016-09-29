
package dasha.testproject.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DataDetail {

    private Integer id;
    private String title;
    private String address;
    private String image;
    private String description;
    private List<Object> recent = new ArrayList<Object>();
    private List<Object> amenities = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The recent
     */
    public List<Object> getRecent() {
        return recent;
    }

    /**
     * @param recent The recent
     */
    public void setRecent(List<Object> recent) {
        this.recent = recent;
    }

    /**
     * @return The amenities
     */
    public List<Object> getAmenities() {
        return amenities;
    }

    /**
     * @param amenities The amenities
     */
    public void setAmenities(List<Object> amenities) {
        this.amenities = amenities;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
