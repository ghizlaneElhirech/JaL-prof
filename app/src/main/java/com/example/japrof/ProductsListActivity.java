package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductsListActivity extends AppCompatActivity {

    //TextView nameProduct=findViewById(R.id.textview_nameproduct);
    //TextView priceProduct=findViewById(R.id.textview_priceproduct);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);
        ListView tListView = findViewById(R.id.listview_product);
        Products EI = new Products("Sandwich nadi ", "18DH.00", "boisson", "drawable://" + R.drawable.sandwish);
        Products PI = new Products("Sandawich jambo ", "15DH.00", "breakfast", "drawable://" + R.drawable.sna);
        //add trans to an arraylist
        ArrayList<Products> ProductsList = new ArrayList<>();
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(EI);
        ProductsList.add(PI);

        //adapter
        ProductsListAdapter adapter = new ProductsListAdapter(this, R.layout.adapter_product_list, ProductsList);
        tListView.setAdapter(adapter);
        TextView categorie_product =  findViewById(R.id.textView_categorieProduit);
        if (EI.getCategorie().equals( "boisson")) {


            categorie_product.setText(R.string.boisson);
        }
        else if(EI.getCategorie().equals("breakfast")){

            categorie_product.setText(R.string.breakfast);
        }
        else {
            categorie_product.setText(R.string.lunch);
        }
        if (PI.getCategorie().equals("boisson")) {


            categorie_product.setText(R.string.boisson);
        }
        else if(PI.getCategorie().equals("breakfast")){

            categorie_product.setText(R.string.breakfast);
        }
        else {
            categorie_product.setText(R.string.lunch);
        }
    }


    public void addToBasket(View view){
        SharedPreferences prefs=getSharedPreferences("products_mine",Context.MODE_PRIVATE);
        prefs.edit().putString("name","sandwich").commit();
        prefs.edit().putString("price","10.00DH").commit();


        Toast.makeText(this, "produit ajouté avec succes", Toast.LENGTH_SHORT).show();
    }
    public void returnToCategorie(View view) {
        Intent intent = new Intent(getApplicationContext(), CategoriesActivity.class);

        startActivity(intent);
    }



}