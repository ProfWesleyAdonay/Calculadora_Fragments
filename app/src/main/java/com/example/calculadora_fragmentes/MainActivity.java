package com.example.calculadora_fragmentes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_Soma;
    private Soma_Fragment soma_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_Soma = findViewById(R.id.bt_Soma);
        soma_fragment = new Soma_Fragment();

        //Configurar o objeto Fragments
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.replace(R.id.frame_conteudo, soma_fragment);
        transition.commit();

        bt_Soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.frame_conteudo, soma_fragment);
                transition.commit();
            }
        });
    }
}