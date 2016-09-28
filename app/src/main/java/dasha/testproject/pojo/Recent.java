
package dasha.testproject.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Recent {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("unit_number")
    @Expose
    private String unitNumber;
    @SerializedName("building_title")
    @Expose
    private String buildingTitle;
    @SerializedName("building_id")
    @Expose
    private Integer buildingId;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_year")
    @Expose
    private String dateYear;
    @SerializedName("bedroom")
    @Expose
    private Integer bedroom;
    @SerializedName("bath_full")
    @Expose
    private Integer bathFull;
    @SerializedName("living_area")
    @Expose
    private String livingArea;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("percent")
    @Expose
    private String percent;
    @SerializedName("status")
    @Expose
    private Integer status;

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
     *     The unitNumber
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * 
     * @param unitNumber
     *     The unit_number
     */
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    /**
     * 
     * @return
     *     The buildingTitle
     */
    public String getBuildingTitle() {
        return buildingTitle;
    }

    /**
     * 
     * @param buildingTitle
     *     The building_title
     */
    public void setBuildingTitle(String buildingTitle) {
        this.buildingTitle = buildingTitle;
    }

    /**
     * 
     * @return
     *     The buildingId
     */
    public Integer getBuildingId() {
        return buildingId;
    }

    /**
     * 
     * @param buildingId
     *     The building_id
     */
    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The dateYear
     */
    public String getDateYear() {
        return dateYear;
    }

    /**
     * 
     * @param dateYear
     *     The date_year
     */
    public void setDateYear(String dateYear) {
        this.dateYear = dateYear;
    }

    /**
     * 
     * @return
     *     The bedroom
     */
    public Integer getBedroom() {
        return bedroom;
    }

    /**
     * 
     * @param bedroom
     *     The bedroom
     */
    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * 
     * @return
     *     The bathFull
     */
    public Integer getBathFull() {
        return bathFull;
    }

    /**
     * 
     * @param bathFull
     *     The bath_full
     */
    public void setBathFull(Integer bathFull) {
        this.bathFull = bathFull;
    }

    /**
     * 
     * @return
     *     The livingArea
     */
    public String getLivingArea() {
        return livingArea;
    }

    /**
     * 
     * @param livingArea
     *     The living_area
     */
    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The percent
     */
    public String getPercent() {
        return percent;
    }

    /**
     * 
     * @param percent
     *     The percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
