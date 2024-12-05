package com.ferdinand;

import android.util.Log;
import android.os.ServiceManager;
import android.os.RemoteException;
import android.os.IBinder;

import com.ferdinand.IHelloService;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;


public class Client {
      private static final String TAG = "BinderJavaTypeDemo";

      public static void main(String[] args) {
            IBinder binder = ServiceManager.getService("hello");

            if (binder == null) {
                  Log.i(TAG, "service not found");
            }

            IHelloService service = IHelloService.Stub.asInterface(binder);

            try {
                  int cnt = service.sayhello_to("ferdinand");
                  Log.i(TAG, "sayhello_to " + "ferdinand" + " : cnt = " + cnt);
            } catch (RemoteException e) {
                  e.printStackTrace();
            }

            try {
                  List list = new ArrayList<String>();
                  list.add("hello");
                  list.add("world");
                  service.printList(list);
                  Log.i(TAG, "printList");
            } catch (RemoteException e) {
                  e.printStackTrace();
            }

            try {
                  HashMap map = new HashMap();
                  map.put("key1", "value1");
                  map.put("key2", "value2");
                  service.printMap(map);
                  Log.i(TAG, "printMap");
            } catch (RemoteException e) {
                  e.printStackTrace();
            }

            try {
                  Student student = new Student();
                  student.name = "ferdinand";
                  student.age = 20;
                  service.printStudent(student);
                  Log.i(TAG, "printStudent");
            } catch (RemoteException e) {
                  e.printStackTrace();
            }
      }
}
