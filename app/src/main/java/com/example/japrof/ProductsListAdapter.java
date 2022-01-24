package com.example.japrof;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

public class ProductsListAdapter extends ArrayAdapter<Products> {
    private static final String TAG="ProductsListAdapter";
    private Context mContext;
    int mResource;
    //int lastPosition=-1;
    //TextView title;
    //TextView prix;

    //ImageView imgURL;


    /**
     *
     * @param context
     * @param resource
     * @param objects
     */

    public ProductsListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Products> objects) {
        super(context, resource, objects);
        mContext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        setUpImageLoader();
        String title=getItem(position).getTitle();
        String prix=getItem(position).getPrix();
        String imgURL=getItem(position).getImgURL();
        LayoutInflater inflater= LayoutInflater.from(mContext);
        convertView =inflater.inflate(mResource,parent,false);
        TextView tvTitle=(TextView) convertView.findViewById(R.id.textview_nameproduct);
        TextView tvPrix=(TextView) convertView.findViewById(R.id.textview_priceproduct);

        ImageView tvimg=(ImageView) convertView.findViewById(R.id.image);
        int defaultImg=mContext.getResources().getIdentifier("@drawable/ic_launcher_background",null,mContext.getPackageName());
        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImg)
                .showImageOnFail(defaultImg)
                .showImageOnLoading(defaultImg).build();
        imageLoader.displayImage(imgURL,tvimg,options);
        tvTitle.setText(title);
        tvPrix.setText(prix);

        // tvimg.setImageAlpha(Integer.parseInt(imgURL));
        return convertView;

    }
    private void setUpImageLoader(){
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContext.getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }
}
