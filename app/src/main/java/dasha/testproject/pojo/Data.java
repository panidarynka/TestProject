
package dasha.testproject.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("buildings")
    @Expose
    private List<Building> buildings = new ArrayList<Building>();
    @SerializedName("recent")
    @Expose
    private List<Recent> recent = new ArrayList<Recent>();

    /**
     * 
     * @return
     *     The buildings
     */
    public List<Building> getBuildings() {
        return buildings;
    }

    /**
     * 
     * @param buildings
     *     The buildings
     */
    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    /**
     * 
     * @return
     *     The recent
     */
    public List<Recent> getRecent() {
        return recent;
    }

    /**
     * 
     * @param recent
     *     The recent
     */
    public void setRecent(List<Recent> recent) {
        this.recent = recent;
    }

}
