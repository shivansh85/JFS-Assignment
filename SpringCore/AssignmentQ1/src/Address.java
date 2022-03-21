public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address() {
    }

    public Address(String street, String city,
                   String state, String zip, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{\n\t\t" +
                "street='" + street + '\'' +
                ", \n\t\tcity='" + city + '\'' +
                ", \n\t\tstate='" + state + '\'' +
                ", \n\t\tzip='" + zip + '\'' +
                ", \n\t\tcountry='" + country + '\'' +
                '}';
    }
}
