package com.hz.greendao.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "MAP_LINE_ITEM_ENTITY".
 */
public class MapLineItemEntity implements java.io.Serializable {

    /** Not-null value. */
    private String lineItemId;
    private String lineItemModeId;
    private int lineItemWireType;
    private int lineItemNum;
    private int lineItemStatus;
    private int lineItemRemoved;
    /** Not-null value. */
    private String LineItemLineId;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public MapLineItemEntity() {
    }

    public MapLineItemEntity(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public MapLineItemEntity(String lineItemId, String lineItemModeId, int lineItemWireType, int lineItemNum, int lineItemStatus, int lineItemRemoved, String LineItemLineId) {
        this.lineItemId = lineItemId;
        this.lineItemModeId = lineItemModeId;
        this.lineItemWireType = lineItemWireType;
        this.lineItemNum = lineItemNum;
        this.lineItemStatus = lineItemStatus;
        this.lineItemRemoved = lineItemRemoved;
        this.LineItemLineId = LineItemLineId;
    }

    /** Not-null value. */
    public String getLineItemId() {
        return lineItemId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public String getLineItemModeId() {
        return lineItemModeId;
    }

    public void setLineItemModeId(String lineItemModeId) {
        this.lineItemModeId = lineItemModeId;
    }

    public int getLineItemWireType() {
        return lineItemWireType;
    }

    public void setLineItemWireType(int lineItemWireType) {
        this.lineItemWireType = lineItemWireType;
    }

    public int getLineItemNum() {
        return lineItemNum;
    }

    public void setLineItemNum(int lineItemNum) {
        this.lineItemNum = lineItemNum;
    }

    public int getLineItemStatus() {
        return lineItemStatus;
    }

    public void setLineItemStatus(int lineItemStatus) {
        this.lineItemStatus = lineItemStatus;
    }

    public int getLineItemRemoved() {
        return lineItemRemoved;
    }

    public void setLineItemRemoved(int lineItemRemoved) {
        this.lineItemRemoved = lineItemRemoved;
    }

    /** Not-null value. */
    public String getLineItemLineId() {
        return LineItemLineId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLineItemLineId(String LineItemLineId) {
        this.LineItemLineId = LineItemLineId;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public String toString() {
        return "MapLineItemEntity{" +
                "lineItemId='" + lineItemId + '\'' +
                ", lineItemModeId='" + lineItemModeId + '\'' +
                ", lineItemWireType=" + lineItemWireType +
                ", lineItemNum=" + lineItemNum +
                ", lineItemStatus=" + lineItemStatus +
                ", lineItemRemoved=" + lineItemRemoved +
                ", LineItemLineId='" + LineItemLineId + '\'' +
                '}';
    }


    // KEEP METHODS END

}