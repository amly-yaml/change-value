package com.example.metertoinches_21apps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        Button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = 0.0;

                if (editText.getText().toString().equals("")){
                    textView.setText(R.string.error);
                    textView.setTextColor(Color.RED);

                }
                else {

                    double far = Double.parseDouble(editText.getText().toString());
                    result = (far-32)*5/9;

                    //textView.setText(Double.toString(result));
                    textView.setText(String.format("%.2f", result) + " Celsius");
                    textView.setTextColor(Color.BLACK);

                }


            }
        });
    }
}
