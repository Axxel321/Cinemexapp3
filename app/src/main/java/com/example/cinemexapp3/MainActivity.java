package com.example.cinemexapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cinemexapp3.adapters.PeliculaAdapter;
import com.example.cinemexapp3.model.Pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView List;
//String Peliculas[];
ArrayList<Pelicula> data;
Pelicula_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List= (ListView) findViewById(R.id.list);
        List.setOnItemClickListener(this);
        //Peliculas=getResources() .getStringArray(R.array.peliculas);

        data = new ArrayList<>();
        adapter= new Pelicula_Adapter(this,data);


    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //String p = Peliculas[position];
        //Toast.makeText(this, "selecciono pelicula "+p,Toast.LENGTH_SHORT).show();
    }

}