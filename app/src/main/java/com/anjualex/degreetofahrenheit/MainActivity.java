package com.anjualex.degreetofahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void con(View view)
    {
        EditText editText=(EditText)findViewById(R.id.editText);
        String degree=editText.getText().toString();
        int i=Integer.parseInt(degree);
        Toast.makeText(this,i*1.8+32+"",Toast.LENGTH_LONG).show();

    }
}


