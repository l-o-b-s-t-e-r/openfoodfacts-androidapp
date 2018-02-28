package openfoodfacts.github.scrachx.openfood.models;

import android.graphics.Bitmap;

import java.util.Date;

public class HistoryItem {

    private String title;
    private String brands;
    private Bitmap url;
    private String barcode;
    private Date lastSeen;
    private String quantity;
    private String nutriScore;

    public HistoryItem() {
    }

    public HistoryItem(String title, String brands, Bitmap url, String barcode, Date lastSeen, String quantity, String nutriScore) {
        this.title = title;
        this.brands = brands;
        this.url = url;
        this.barcode = barcode;
        this.lastSeen = lastSeen;
        this.quantity = quantity;
        this.nutriScore = nutriScore;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bitmap getUrl() {
        return url;
    }

    public void setUrl(Bitmap url) {
        this.url = url;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public void setTime(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Date getTime() {
        return lastSeen;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNutriScore() {
        return nutriScore;
    }

    public void setNutriScore(String nutriScore) {
        this.nutriScore = nutriScore;
    }
}
