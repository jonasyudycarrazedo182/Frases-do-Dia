package com.jonas.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributos
    String frases[] = {
                "frase 01",
                "frase 02",
                "frase 03",
                "frase 04",
                "frase 05",
                "frase 06",

    };

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
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(6);
        String frase = frases[ numeroAleatorio ];

        texto.setText(frase);



    }
    public void exibirTodas(View view) {
        TextView texto = findViewById(R.id.textResultado);


        String textoResultado = "";
        for (String frase : frases) {
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);
    }

}