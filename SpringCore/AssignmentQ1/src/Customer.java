public class Customer {
    private int cstId;
    private String cstName;
    private String cstNumber;

    public Customer() {
    }

    private Address customerAddress;


    public Customer(int cstId, String cstName, String cstNumber,
                    Address customerAddress) {
        this.customerId = cstId;
        this.customerName = cstName;
        this.customerContact = cstNumber;
        this.customerAddress = customerAddress;
    }

    public int getcstId() {
        return cstId;
    }

    public String getcstName() {
        return cstName;
    }

    public String getcstNumber() {
        return cstNumber;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setcstId(int cstId) {
        this.cstId = cstId;
    }

    public void setcstName(String cstName) {
        this.cstName = cstName;
    }

    public void setcstNumber(String cstNumber) {
        this.customerContact = customerContact;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{\n" +
                "customerId=" + cstId +
                ", \ncustomerName='" + cstName + '\'' +
                ", \ncustomerContact='" + cstNumber + '\'' +
                ", \ncustomerAddress=" + customerAddress +
                '}';
    }

}
