package ca.bcit.comp2522.idevices;

abstract class IDevice {
    private final String purpose;

    IDevice(final String purpose) {
        validatePurpose(purpose);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    protected abstract void printDetails();

    @Override
    public String toString() {
        return "Purpose: " + purpose;
    }

    protected static void validatePurpose(final String purpose) {
        if (purpose == null || purpose.isBlank()) {
            throw new IllegalArgumentException("Purpose cannot be null or blank.");
        }
    }

}

