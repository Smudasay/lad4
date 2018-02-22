package com.sayapplication.applicationlab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Double baht,rin,rin2,baht2;
    private String rins,bahts ;
    private EditText T1,T2,T3,T4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = findViewById(R.id.baht1);
        T2 = findViewById(R.id.rin1);
        T3 = findViewById(R.id.rin2);
        T4 = findViewById(R.id.baht2);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                baht= Double.parseDouble(T1.getText().toString());
                rin = baht*0.124754;
                rins= String.valueOf(rin);
                T2.setText(rins);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rin2= Double.parseDouble(T3.getText().toString());
                baht2 = rin2*8.09;
                bahts= String.valueOf(baht2);
                T4.setText(bahts);

            }

        });

    }

//    public void  button1 (View view)  {
//        baht= Double.parseDouble(T1.getText().toString());
//        rin = baht*0.124754;
//        rins= String.valueOf(rin);
//        T2.setText(rins);
//
//    }


//    public void button2 (View view){
//        rin2= Double.parseDouble(T3.getText().toString());
//        baht2 = rin2*8.09;
//        bahts= String.valueOf(baht2);
//        T4.setText(bahts);
//
//    }
//
//
}
