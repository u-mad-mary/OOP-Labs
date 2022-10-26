public class Monitor
{
    private String color;
    private String dimensions;
    public String resolution;

    public Monitor(String color, String dimensions, String  resolution)
    {
        this.color = color;
        this.dimensions = dimensions;
        this.resolution = resolution;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getDimensions()
    {
        return dimensions;
    }

    public void setDimensions(String dimensions)
    {
        this.dimensions = dimensions;
    }

    public String getResolution()
    {
        return resolution;
    }

    public void setResolution(String resolution)
    {
        this.resolution = resolution;
    }

    @Override public String toString()
    {
        return color + ' ' +  dimensions
                + " " + resolution ;
    }
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Monitor))
        {
            return false;
        }
        Monitor mon = (Monitor) obj;
        return color.equals(mon.color) && resolution.equals(mon.resolution) && dimensions.equals(mon.dimensions);
    }
}
