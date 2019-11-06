package com.pbo;

public class Main {

    public static void main(String[] args) {
	    Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store\t: ".concat(android.getKeyStore()));

        System.out.println();
        Blackberry blackberry = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        blackberry.setPinBB("BHS249");
        blackberry.displayProduct();
        System.out.println("PIN\t\t\t: ".concat(blackberry.getPinBB()));

        System.out.println();
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("Wp Key Store\t: ".concat(windowsPhone.getWpKeyStore()));
    }
}
