package ca.bcit.comp2522.idevices;

class IPod extends IDevice {

    private static final int MIN_NUMBER_OF_SONGS = 0;
    private static final double MIN_MAX_VOLUME = 0.0;

    private int numberOfSongs;
    private double maxVolume;

    IPod(final int numberOfSongs, final double maxVolume)
    {
        super("music");
        validateNumberOfSongs(numberOfSongs);
        validateMaxVolume(maxVolume);

        this.numberOfSongs = numberOfSongs;
        this.maxVolume = maxVolume;
    }

    public int getNumberOfSongs()
    {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs)
    {
        validateNumberOfSongs(numberOfSongs);
        this.numberOfSongs = numberOfSongs;
    }

    public double getMaxVolume()
    {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume)
    {
        validateMaxVolume(maxVolume);
        this.maxVolume = maxVolume;
    }

    @Override
    protected void printDetails()
    {
        System.out.println("IPod Details: " + toString());
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder(super.toString());

        builder.append(", Songs: ")
                .append(numberOfSongs)
                .append(", Max Volume: ")
                .append(maxVolume)
                .append(" dB");
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null ||
                getClass() != obj.getClass())
        {
            return false;
        }

        IPod ipod = (IPod) obj;
        return numberOfSongs == ipod.numberOfSongs;
    }

    @Override
    public int hashCode()
    {
        return Integer.hashCode(numberOfSongs);
    }

    private static void validateNumberOfSongs(final int numberOfSongs)
    {
        if (numberOfSongs < MIN_NUMBER_OF_SONGS)
        {
            throw new IllegalArgumentException("Number of songs cannot be negative.");
        }
    }

    private static void validateMaxVolume(final double maxVolume)
    {
        if (maxVolume <= MIN_MAX_VOLUME)
        {
            throw new IllegalArgumentException("Max volume must be a positive value.");
        }
    }
}

