package com.example.alertdialogsecondexample4;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3;
TextView tv1, tv2,tv3;
ImageView img;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= findViewById(R.id.btnname);
        btn2 = findViewById(R.id.btnreceivername);
        btn3 = findViewById(R.id.btnack);
        tv1 = findViewById(R.id.tvname);
        tv2 = findViewById(R.id.tvreceiver);
        tv3 = findViewById(R.id.tvbalance);
        img = findViewById(R.id.imgapp);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tv1.setText("Malik Mushee");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText(".....");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog ad = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Acceptance of Happy Birthday wish")
                        .setMessage("R u sure to heartly accept the birthday")
                        .setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Thank you ....Happy Birthday to you", Toast.LENGTH_LONG).show();
                                ;
                            img.setImageResource(R.drawable.pic);
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "why u", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .create();
                        ad.show();



            }
        });
    }
}