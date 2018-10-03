package com;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return (getRingTone());
    }
    @Override
    public String unlock() {
        return ("Sneaky Unlocking");
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone" + this.getVersionNumber() + "from" + this.getCarrier());
    }
}
