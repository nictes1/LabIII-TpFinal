package Entities;

import java.util.Date;

public class HistoryEntity {
    private Date Period;
    private boolean goodUse;
    private int quantity;


    public HistoryEntity() {
    }

    public HistoryEntity(Date period, boolean goodUse, int quantity) {
        Period = period;
        this.goodUse = goodUse;
        this.quantity = quantity;

    }

    public Date getPeriod() {
        return Period;
    }

    public void setPeriod(Date period) {
        Period = period;
    }

    public boolean isGoodUse() {
        return goodUse;
    }

    public void setGoodUse(boolean goodUse) {
        this.goodUse = goodUse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}