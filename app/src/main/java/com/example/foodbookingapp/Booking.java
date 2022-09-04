package com.example.foodbookingapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Booking extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    Button menu;
    Button order;
    TextView bill;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        cb1=findViewById(R.id.biriyani);
        cb2=findViewById(R.id.curd);
        cb3=findViewById(R.id.tomato);
        cb4=findViewById(R.id.Lemon);
        cb5=findViewById(R.id.Friedrice);
        cb6=findViewById(R.id.manuchurian);
        cb7=findViewById(R.id.sixty_65);
        //menu=findViewById(R.id.menu);
        order=findViewById(R.id.order);
        bill=findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=0;

                if(cb1.isChecked()){
                    total=total+90;
                }
                if(cb2.isChecked()){
                    total+=50;
                }if(cb3.isChecked()){
                    total+=50;
                }if(cb4.isChecked()){
                    total+=50;
                }if(cb5.isChecked()){
                    total+=80;
                }if(cb6.isChecked()){
                    total+=100;
                }if(cb7.isChecked()){
                    total+=60;
                }

                bill.setText("Your Bill is Rs "+String.valueOf(total));
                Toast.makeText(Booking.this,"Booking Confirmed!",Toast.LENGTH_SHORT).show();


            }
        });


    }

    public void Thanks(View view) {
        Intent intent=new Intent(this,End.class);
        startActivity(intent);
    }
}