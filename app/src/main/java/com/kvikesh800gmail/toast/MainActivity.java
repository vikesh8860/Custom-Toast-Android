package com.kvikesh800gmail.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btn,custom_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.toast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"Normal Toast message",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,450);
                toast.show();
            }
        });
        custom_toast= (Button) findViewById(R.id.custom_toast);
        custom_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Toast toast =new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,450);
                toast.setDuration(Toast.LENGTH_SHORT);
                LayoutInflater layout_inflator= getLayoutInflater();
                View appear= layout_inflator.inflate(R.layout.custom_toastfile,(ViewGroup)findViewById(R.id.relative__layout));
                toast.setView(appear);
                toast.show();
}
});
        }
}
