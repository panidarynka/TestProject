
package dasha.testproject.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Building {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("rent")
    @Expose
    private String rent;
    @SerializedName("sale")
    @Expose
    private String sale;
    @SerializedName("coordinate")
    @Expose
    private Coordinate coordinate;
    @SerializedName("min_rent")
    @Expose
    private String minRent;
    @SerializedName("min_sale")
    @Expose
    private String minSale;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The rent
     */
    public String getRent() {
        return rent;
    }

    /**
     * 
     * @param rent
     *     The rent
     */
    public void setRent(String rent) {
        this.rent = rent;
    }

    /**
     * 
     * @return
     *     The sale
     */
    public String getSale() {
        return sale;
    }

    /**
     * 
     * @param sale
     *     The sale
     */
    public void setSale(String sale) {
        this.sale = sale;
    }

    /**
     * 
     * @return
     *     The coordinate
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * 
     * @param coordinate
     *     The coordinate
     */
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 
     * @return
     *     The minRent
     */
    public String getMinRent() {
        return minRent;
    }

    /**
     * 
     * @param minRent
     *     The min_rent
     */
    public void setMinRent(String minRent) {
        this.minRent = minRent;
    }

    /**
     * 
     * @return
     *     The minSale
     */
    public String getMinSale() {
        return minSale;
    }

    /**
     * 
     * @param minSale
     *     The min_sale
     */
    public void setMinSale(String minSale) {
        this.minSale = minSale;
    }

}
