package Assignment3;

public class Info
{
    private String state;
    private String city;
    private String country;
    private String pin;

    public String getState()
    {
        return state;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getZip()
    {
        return zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZip(String zip) {
        this.pin = pin;
    }

    public Info()
    {
    }

    public Info(String state, String city, String country, String zip)
    {
        super();
        this.city = city;
        this.country = country;
        this.pin = pin;
        this.state = state;
    }
}
