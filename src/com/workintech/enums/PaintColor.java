package com.workintech.enums;

public enum PaintColor {
    BLUE("#0000FF"),
    RED("#FF0000"),
    GREEN("#008000"),
    WHITE("#FFFFFF");

    private String hexCode;

    PaintColor(String hexCode){
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}

