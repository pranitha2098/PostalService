public class PostalDetails {
    private String postalServiceName;
    private double price;
    private double distance;
    private String postType;
    private Packages[] pack;

    public PostalDetails(String postalServiceName, double price, double distance, String postType, Packages[] pack) {
        this.postalServiceName = postalServiceName;
        this.price = price;
        this.distance = distance;
        this.postType = postType;
        this.pack = pack;
    }

    public String getPostalServiceName() {
        return postalServiceName;
    }

    public void setPostalServiceName(String postalServiceName) {
        this.postalServiceName = postalServiceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Packages[] getPack() {
        return pack;
    }

    public void setPack(Packages[] pack) {
        this.pack = pack;
    }

    public double calculatePrice(){
        double total_price=0.0;
        if(this.distance>500 && this.postType="A")
           total_price=this.price *300;
        else if(this.distance>1000 & this.postType="B")
            total_price=this.price *600;
        else if(this.distance>2000 & this.postType="C")
            total_price=this.price*1000;
        else
            total_price=this.price;
        return total_price;
    }

}
