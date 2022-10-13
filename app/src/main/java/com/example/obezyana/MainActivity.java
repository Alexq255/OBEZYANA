package com.example.obezyana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ImageButton(View view) {
        Toast myToast= Toast.makeText(getApplicationContext(),"Картинка1", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }

    public void imageButton2(View view) {
        Toast myToast= Toast.makeText(getApplicationContext(),"Картинка2", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.CENTER,0,0);
    }

    public void imageButton3(View view) {
        Toast myToast= Toast.makeText(getApplicationContext(),"Картинка3", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.TOP,0,0);
    }
}