package com.example.testmd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Pytanie> pytanieArrayList;
    private ImageView imageView;
    private Button buttonTak, buttonNie, buttonNastepny;
    private TextView textViewPytanie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        wystawPytania();
        imageView = findViewById(R.id.imageView2);
        textViewPytanie = findViewById(R.id.textWiew);
        buttonTak = findViewById(R.id.buttonTak);
        buttonNie = findViewById(R.id.buttonNie);
        buttonNastepny = findViewById(R.id.buttonNastepne);
        wyswietlPytanie(0);

    }
    private void wyswietlPytanie(int ktore){
        Pytanie pytanie = pytanieArrayList.get(ktore);
        imageView.setImageResource(pytanie.getIdZdjecia());
        textViewPytanie.setText(pytanie.getTrescPytania());
    }
    private void wystawPytania(){
        pytanieArrayList = new ArrayList<>();
        pytanieArrayList.add(new Pytanie(R.drawable.auto, "Czy te auto to Audi", false));
        pytanieArrayList.add(new Pytanie(R.drawable.jabko, "Czy jablko jest popularne w Polsce", true));
        pytanieArrayList.add(new Pytanie(R.drawable.flaga, "Czy to jest flaga Niemiec", false));


    }
}