package com.ferdinand;

import android.util.Log;
import android.os.ServiceManager;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.Parcel;

public class JavaClient {
      public static void main(String[] args) {
            IBinder binder = ServiceManager.getService("MyHelloService");
            String DESCRIPTOR = "com.ferdinand.IHello";

            try {
                  if (binder != null) {
                        Log.d("JavaClient", "get binder");
                        Parcel data = Parcel.obtain();
                        Parcel reply = Parcel.obtain();
                        try {
                              data.writeInterfaceToken(DESCRIPTOR);
                              binder.transact(IBinder.FIRST_CALL_TRANSACTION + 0, data, reply, 0);
                              int result = reply.readInt();
                              Log.i("JavaClient", "get result : " + result);
                        } finally {
                              reply.recycle();
                              data.recycle();
                        }
                  }
            } catch (RemoteException e) {
                  e.printStackTrace();
            }
      }
}