package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView ans;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn= findViewById(R.id.button);
        ans=findViewById(R.id.textView);
        input= findViewById(R.id.editTextTextPersonName);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputans= input.getText().toString();

                //Converting int to double for kilos
                double kilos= Double.parseDouble(inputans);
                //Converting kilos into pounds
                double pounds= convertfn(kilos);

                //Display the conversion results
                ans.setText(""+ pounds);

            }
        });
    }

    public double convertfn(double kilos){
        return kilos * 2.20462;

    }
}