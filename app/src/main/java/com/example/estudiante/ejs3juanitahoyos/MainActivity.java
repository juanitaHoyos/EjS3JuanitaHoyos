package com.example.estudiante.ejs3juanitahoyos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_masa;
    EditText et_altura;
    TextView tv_imc;
    TextView tv_res;
    Button btn_calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_altura = findViewById(R.id.et_altura);
        et_masa = findViewById(R.id.et_masa);
        tv_res = findViewById(R.id.tv_resp);


        btn_calcular = findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int masaE = Integer.parseInt(et_masa.getText().toString());
                float alturaE = Float.parseFloat(et_altura.getText().toString());

                float total = (float) (masaE / (alturaE * alturaE));


                String Total = "" + total;

                tv_res.setText(Total);

            }
        });
    }
}
