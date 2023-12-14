package com.example.cinemexapp3.adapters;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cinemexapp3.R;
import com.example.cinemexapp3.model.Pelicula;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PeliculaAdapter extends BaseAdapter {
    Activity activity;
    List<Pelicula> data;

    public PeliculaAdapter(Activity activity, List<Pelicula> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v =    convertView;
        if(v==null){
            v=View.inflate(activity, R.layout.template_pelicula,null);
        }
        Pelicula p= data.get(position);


        TextView titulo = (TextView) v.findViewById(R.id.titulo);
        TextView duracion = (TextView) v.findViewById(R.id.txt_duracion);
        TextView fecha = (TextView) v.findViewById(R.id.txt_fecha);
        ImageView img = v.findViewById(R.id.img);


        titulo.setText(p.getNombre());
        duracion.setText(p.getDuracion());
        fecha.setText(p.getFechaestreno());

        Uri uri = Uri.parse(p.getUrlimg());
        Picasso.with(activity).load(uri).into(img);

        return v;
    }
}
