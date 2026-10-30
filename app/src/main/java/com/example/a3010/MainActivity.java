package com.example.a3010;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    String[] tab ={"Zakupy: chleb, masło, ser",
            "Do zrobienia: obiad, umyć podłogi",
            "weekend: kino, spacer z psem"};

    String[] tab1 = {""};
    String wpisany;
    Button ta;
    EditText wpisywanie;
    ListView lista;
    Adapter adapterNotatek;
    Button reset;
    String[] tekst ={""};

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
        ta = findViewById(R.id.ta);
        lista = findViewById(R.id.lista);
        wpisywanie = findViewById(R.id.edit);
        reset = findViewById(R.id.resetuj);
        wpisany = wpisywanie.getText().toString();
    }


    public void dodawanie(View view) {
//            ta.setOnClickListener(v -> {
//                wpisany = wpisywanie.getText().toString();
//                String wpisany = wpisywanie.getText().toString();
//                lista.()
//        });
            ArrayAdapter<String> adapterNotatek = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tab);
            lista.setAdapter(adapterNotatek);

    }
    public void reset(View view){
        ArrayAdapter<String> adapterNotatek1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tab1);
        lista.setAdapter(adapterNotatek1);
    }


}
