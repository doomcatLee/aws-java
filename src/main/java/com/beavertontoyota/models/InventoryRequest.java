package com.beavertontoyota.models;

public class InventoryRequest {
    int id;

    public InventoryRequest() {

    }

    public InventoryRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
