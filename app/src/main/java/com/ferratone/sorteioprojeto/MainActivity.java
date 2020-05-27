package com.ferratone.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void numeroSorteado(View view){

        TextView numero = findViewById(R.id.txtValorId);
        int gerarNumero = new Random().nextInt(11);
        numero.setText(""+gerarNumero);
    }

    public void clear(View view){

        TextView clearNumber = findViewById(R.id.txtValorId);
        clearNumber.setText("");
        Toast.makeText(this,"Valor apagado!",Toast.LENGTH_SHORT).show();

    }
}
