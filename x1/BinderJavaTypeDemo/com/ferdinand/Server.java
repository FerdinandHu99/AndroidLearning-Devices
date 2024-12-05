package com.ferdinand;

import android.util.Log;
import android.os.ServiceManager;

public class Server {
      
      private static final String TAG = "BinderJavaTypeDemo";
      
      public static void main(String[] args) {
            Log.d(TAG, "start service");
            ServiceManager.addService("hello", new HelloService());

            while (true) {
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
      }
}
