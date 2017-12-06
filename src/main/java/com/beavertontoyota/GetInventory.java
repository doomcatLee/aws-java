package com.beavertontoyota;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.beavertontoyota.models.Inventory;
import com.beavertontoyota.models.InventoryRequest;

public class GetInventory implements RequestHandler<InventoryRequest, Inventory> {
    public Inventory handleRequest(InventoryRequest inventoryRequest, Context context) {
        Inventory inventory = new Inventory();
        inventory.setBody("4d Sport Utility");
        inventory.setYear("2018");
        inventory.setMake("Toyota");
        inventory.setModel("Highlander");
        inventory.setTrim("Limited Premium");
        inventory.setVin("5TDDGRFH5JS039616");
        inventory.setFingerprint("3123412");
        inventoryRequest.setId(1);

        return inventory;
    }

}
