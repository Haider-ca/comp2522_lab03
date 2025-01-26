package ca.bcit.comp2522.idevices;

abstract class IDevice {
    private final String purpose;

    protected IDevice(final String purpose) {
        this.purpose = purpose;
    }

    protected final String getPurpose() {
        return purpose;
    }

    protected abstract void printDetails();

    @Override
    public final String toString() {
        return "Purpose: " + purpose;
    }
}

