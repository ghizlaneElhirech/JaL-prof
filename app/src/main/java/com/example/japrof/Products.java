package com.example.japrof;

public class Products {
    private String title;
    private String prix;
    private String categorie;

    private String imgURL;

    public Products(String title, String prix, String categorie, String imgURL) {
        this.title = title;
        this.prix=prix;
        this.categorie = categorie;

        this.imgURL=imgURL;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


}
