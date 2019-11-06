package com.pbo;

public class Handphone {

    protected String manufacture, operatingSystem, model;
    protected int harga;

    Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.println("Manufaktur\t: ".concat(manufacture));
        System.out.println("OS\t\t\t: ".concat(operatingSystem));
        System.out.println("Model\t\t: ".concat(model));
        System.out.println("Harga\t\t: ".concat(String.valueOf(harga)));
    }

}
