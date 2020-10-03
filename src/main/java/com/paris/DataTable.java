package com.paris;

public class DataTable {

    private String name;
    private int column;
    private int i = 1;
    private String columnT = "?";

    public DataTable(String name, int column) {
        this.name = name;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public String insertInToData(){
        if(this.column>i){
            columnT += ",?";
            i++;
        }
        return "Insert into ville values"+"("+columnT+")";
    }
}
