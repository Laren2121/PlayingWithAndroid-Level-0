package com.example.textbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
//https://www.studytonight.com/android/get-edittext-set-textview
public class MainActivity extends AppCompatActivity {

    EditText editMatrix;
    TextView number;
    Button btnSubmit, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMatrix = (EditText)findViewById(R.id.etMatrix);
        number = (TextView)findViewById(R.id.txtNumber);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnReset = (Button)findViewById(R.id.btnReset);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String matrix = editMatrix.getText().toString();
                number.setText(matrix);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("");
            }
        });
    }
}