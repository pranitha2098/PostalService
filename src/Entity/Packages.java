package Entity;

import Entity.Address;

public class Packages {

    private int packageID;
    private String senderName;
    private Address senderAddress;
    private Address receiverAddress;
    private PostalDetails postalDetails;

    public Packages(int packageID, String senderName, Address senderAddress, Address receiverAddress, PostalDetails postalDetails) {
        this.packageID = packageID;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.postalDetails = postalDetails;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(Address senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Address getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(Address receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public PostalDetails getPostalDetails() {
        return postalDetails;
    }

    public void setPostalDetails(PostalDetails postalDetails) {
        this.postalDetails = postalDetails;
    }

    @Override
    public String toString() {
        return "Packages{" +
                "packageID=" + packageID +
                ", senderName='" + senderName + '\'' +
                ", senderAddress=" + senderAddress +
                ", receiverAddress=" + receiverAddress +
                ", postalDetails=" + postalDetails +
                '}';
    }
}
