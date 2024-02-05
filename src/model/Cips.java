package model;

import model.enums.CipsType;

public class Cips {

    private CipsType cips;

    public Cips(CipsType cips) {
        this.cips = cips;
    }

    public CipsType getCips() {
        return cips;
    }
}
