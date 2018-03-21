package com.pertuz.practlabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private TextView textPuntosA;
        private TextView textPuntosB;
        private int puntosA;
        private int puntosB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntosA = puntosB = 0;
        textPuntosA = findViewById(R.id.textView2);
        textPuntosB = findViewById(R.id.textView);
    }

    public void masUno(View v){
        switch (v.getId()) {
            case R.id.masUnoTemaA:
                puntosA++;
                textPuntosA.setText(puntosA + "");
                break;
            case R.id.masUnoTeamB:
                puntosB++;
                textPuntosB.setText(puntosB + "");
                break;
        }
    }

    public void masDos(View v){
        switch (v.getId()){
            case R.id.masDosTeamA:
                puntosA = puntosA +2;
                textPuntosA.setText(puntosA + "");
                break;

            case R.id.masDosTeamB:
                puntosB = puntosB +2;
                textPuntosB.setText(puntosB + "");
                break;
        }
    }

    public void masTres(View v){
        switch (v.getId()){
            case R.id.masTresTeamA:
                puntosA = puntosA +3;
                textPuntosA.setText(puntosA + "");
                break;

            case R.id.masTresTeamB:
                puntosB = puntosB +3;
                textPuntosB.setText(puntosB + "");
                break;
        }
    }
    public void resert(View v){
        switch (v.getId()){
            case R.id.resert:
                puntosA = puntosB = 0;
                textPuntosA.setText(puntosA + "");
                textPuntosB.setText(puntosB + "");
                break;

        }
    }


}
