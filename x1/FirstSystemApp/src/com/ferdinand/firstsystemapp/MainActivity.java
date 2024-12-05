package com.ferdinand.firstsystemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.ServiceManager;
import com.ferdinand.IJavaHelloService;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            IJavaHelloService service = IJavaHelloService.Stub.asInterface(ServiceManager.getService("JavaHelloService"));
            service.sayhello();
            service.sayhello_to("Ferdinand");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
