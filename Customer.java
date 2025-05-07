package BOOK_STORE;

public class Customer {
    private int customerID;
    private String name;
    private String email;
    private int phone;

    // Relationship: each customer has one membership card
    private MemberShipCard membershipCard;

    // Constructor
    public Customer(int customerID, String name, String email, int phone, MemberShipCard membershipCard) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.membershipCard = membershipCard;
    }

    // Getters
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public MemberShipCard getMembershipCard() {
        return membershipCard;
    }

    // Setters (optional if you want mutability)
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMembershipCard(MemberShipCard membershipCard) {
        this.membershipCard = membershipCard;
    }
}
