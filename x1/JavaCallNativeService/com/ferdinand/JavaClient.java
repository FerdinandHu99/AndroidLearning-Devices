package com.ferdinand;

import android.util.Log;
import android.os.ServiceManager;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.Parcel;

public class JavaClient {
      public static String TAG = "JavaClient";

      public static void main(String[] args) {
            IBinder binder = ServiceManager.getService("MyHelloService");

            IHello svr = IHello.Stub.asInterface(binder);

            try {
                  svr.hello();
                  Log.i(TAG, "call hello");
            } catch (RemoteException e) {
                  e.printStackTrace();
            }

            try {
                  int result = 0;
                  result = svr.sum(3, 4);
                  Log.i(TAG, "call sum(3, 4) : " + result);
            } catch (RemoteException e) {
                  e.printStackTrace();
            }
      }
}
