package models;

public class WidgetsRequest {
    private String id;
    public WidgetsRequest() {
    }
    public WidgetsRequest(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
