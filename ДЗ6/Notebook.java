package ДЗ6;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private String name;
    private int ram;
    private String operatingSystem;
    private int cdV;
    private String colN;

    public Notebook(String name, int ram, String operatingSystem, int cdV, String colN) {
        this.name = name;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.cdV = cdV;
        this.colN = colN;
    }

    public boolean validateObject() {
        return true;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("ram");
        list.add("operatingSystem");
        list.add("cd");
        list.add("color");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + ram +
                ", операционная система: " + operatingSystem + '\'' +
                 
                ", обьем CD " + cdV  + ", цвет: " + colN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getCdV() {
        return cdV;
    }

    public void setCdV(int cdV) {
        this.cdV = cdV;
    }

    public String getCol() {
        return colN;
    }

    public void setCol(String colN) {
        this.colN = colN;
    }
}