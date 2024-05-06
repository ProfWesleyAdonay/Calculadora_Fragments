package com.example.calculadora_fragmentes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Soma_Fragment extends Fragment {

    private EditText et_Num1, et_Num2;
    private TextView tx_Resultado;
    private Button bt_Calcular;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_soma_, container, false);

        et_Num1 = view.findViewById(R.id.et_Num1);
        et_Num2 = view.findViewById(R.id.et_Num2);
        tx_Resultado = view.findViewById(R.id.tx_Resultado);
        bt_Calcular = view.findViewById(R.id.bt_Calcular);

        bt_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Soma();
            }
        });

        return view;
    }
    public void Soma() {

        //Recuperar Dados
        String Num1 = et_Num1.getText().toString();
        String Num2 = et_Num2.getText().toString();

        //Converter String para Int
        int numero1 = Integer.parseInt(Num1);
        int numero2 = Integer.parseInt(Num2);

        int Resultado = numero1 + numero2;

        tx_Resultado.setText(String.valueOf(Resultado));
    }

}