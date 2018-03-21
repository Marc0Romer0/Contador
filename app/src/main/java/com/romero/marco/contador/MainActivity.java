package com.romero.marco.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView txtAviso, Contador0;
    int i=0;
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAviso = (TextView) findViewById(R.id.Aviso);
        Contador0 = (TextView) findViewById(R.id.Contador);
    }

    public void counter(View v) {
        if(flag){
            i++;
            this.Contador0.setText(""+i);
            if(i==7)
                this.txtAviso.setText("Ya casi llega");
            if(i==9)
                this.txtAviso.setText("Ya merito");
            if(i==10){
                flag = false;
                Log.e("Van 5", "Vamos bien");
            }
        }
        else{
            i--;
            this.Contador0.setText(""+i);
            if(i==3)
                this.txtAviso.setText("muy bajo");
            if(i==2)
                this.txtAviso.setText("bajito");

            if(i==0){
                flag = true;
            }
        }
    }
}
