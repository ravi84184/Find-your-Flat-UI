package devsnik.com.findyourflat.model;

import java.io.Serializable;

public class ApartmentModel implements Serializable {

    String apartmentName,price,review;
    int img;


    public ApartmentModel(String apartmentName, String price, String review, int img) {
        this.apartmentName = apartmentName;
        this.price = price;
        this.review = review;
        this.img = img;
    }


    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
