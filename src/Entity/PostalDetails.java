package Entity;

import Entity.Packages;
import Enums.PostSIze;
import Enums.PostType;
import Implementation.PostalDetailsImplementation;

public class PostalDetails {
    private PostSIze postalSize;
    private double price;
    private PostType postType;

    public PostalDetails(PostSIze postalSize, PostType postType) {
        this.postalSize = postalSize;
        this.postType = postType;
        this.price= PostalDetailsImplementation.calculatePrice(postType,postalSize);
    }

    public PostSIze getPostalSize() {
        return postalSize;
    }

    public void setPostalSize(PostSIze postalSize) {
        this.postalSize = postalSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    @Override
    public String toString() {
        return "PostalDetails{" +
                "postalSize=" + postalSize +
                ", price=" + price +
                ", postType=" + postType +
                '}';
    }
}
