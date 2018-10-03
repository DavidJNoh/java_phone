package com;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return (getRingTone());
    }
    @Override
    public String unlock() {
        return ("Kind of Unlocking");
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy" + this.getVersionNumber() + "from" + this.getCarrier());
    }
}
