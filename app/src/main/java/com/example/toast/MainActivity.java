package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirToast(View view) {
        /*
        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_SHORT
        ).show();
        */
        //Toast Customizado
        ImageView imagem = new ImageView(getApplicationContext());
        TextView textView = new TextView(getApplicationContext());
        textView.setText("Olá Toast");
        textView.setBackgroundResource(R.color.purple_500);

        imagem.setImageResource(android.R.drawable.star_big_off);
        Toast Toast = new Toast(getApplicationContext());
        Toast.setDuration(Toast.LENGTH_LONG);
        Toast.setView(textView);
        Toast.show();
    }
}