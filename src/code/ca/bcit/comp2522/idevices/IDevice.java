package ca.bcit.comp2522.idevices;

/**
 * An abstract representation of an IDevice.
 * This class provides a structure for devices with a specific purpose.
 * Subclasses must implement the {@link #printDetails()} method.
 *
 * @author Haider
 * @version 1.0
 */
abstract class IDevice {
    private final String purpose;

    /**
     * Constructs an IDevice with the specified purpose.
     *
     * @param purpose the purpose of the device. Cannot be null or blank.
     */
    IDevice(final String purpose) {
        validatePurpose(purpose);
        this.purpose = purpose;
    }

    /**
     * Returns the purpose of the device.
     *
     * @return the purpose of the device.
     */
    public String getPurpose() {
        return purpose;
    }

    protected abstract void printDetails();

    /**
     * Returns a string representation of the device.
     *
     * @return a string representation of the device in the format "Purpose: {purpose}".
     */
    @Override
    public String toString() {
        return "Purpose: " + purpose;
    }

    /**
     * Validates the purpose of the device.
     * Ensures the purpose is not null or blank.
     *
     * @param purpose the purpose to validate.
     */
    protected static void validatePurpose(final String purpose) {
        if (purpose == null ||
                purpose.isBlank()) {
            throw new IllegalArgumentException("Purpose cannot be null or blank.");
        }
    }

}

