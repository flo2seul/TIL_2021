package self.bank;

public class Address {
    private int zipCode;
    private String region;
    private String City;

    public Address(int zipCode, String region, String city) {
        this.zipCode = zipCode;
        this.region = region;
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", region='" + region + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
