package com.example.basicsensoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;
    TextView textView;
    List<Sensor> sensorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textview1);

        sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);

        sensorList=sensorManager.getSensorList(Sensor.TYPE_ALL);

        //(jab yeh hoga toh saare sensors display honge)
        textView.setText(String.valueOf(sensorList));

        //(jab uppar wala textview execute karenge toh yeh wala nhi karenge)
       // for(Sensor s:sensorList) {

       // textView.setText(textView.getText() + "///" +s.getName());
       //     Log.d("mysensorName","Sensor Name:"+s.getName()+",Sensor Vendor:"+s.getVendor()+",Sensor Type:"+s.getType() + ", Sensor Power:"+s.getPower());
     //   }
    }

}