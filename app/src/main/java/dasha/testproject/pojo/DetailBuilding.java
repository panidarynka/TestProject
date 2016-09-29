
package dasha.testproject.pojo;

import java.util.HashMap;
import java.util.Map;


public class DetailBuilding {

    private DataDetail data;
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The data
     */
    public DataDetail getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(DataDetail data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
