package com.beavertontoyota.data;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.ArrayList;

@DynamoDBTable(tableName = "coverages")
public class Coverages {

    private String coveragesID;
    private ArrayList<Object> content;
    private double Id;

    @DynamoDBHashKey(attributeName="Id")
    public double getId() {
        return Id;
    }

    public void setId(double id) {
        this.Id = id;
    }


    @DynamoDBAttribute(attributeName = "coveragesID")
    public String getCoveragesID() {
        return coveragesID;
    }

    public void setCoveragesID(String coveragesID) {
        this.coveragesID = coveragesID;
    }

    @DynamoDBAttribute(attributeName = "content")
    public ArrayList<Object> getContent() {
        return content;
    }

    public void setContent(ArrayList<Object> content) {
        this.content = content;
    }

}


