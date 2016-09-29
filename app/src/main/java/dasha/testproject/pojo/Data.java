
package dasha.testproject.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("buildings")
    @Expose
    private List<Building> buildings = new ArrayList<Building>();
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

}
