package RealExampleMongo.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

public class Produto {
    public Produto(String id, String name, String modelNumber, String brand, String url, String image, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.url = url;
        this.image = image;
        this.price = price;
    }

    @Id
    private String id;
    private String name;
    private String modelNumber;
    private String brand;
    private String url;
    @Field("imageUrl")
    private String image;
    private BigDecimal price;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
