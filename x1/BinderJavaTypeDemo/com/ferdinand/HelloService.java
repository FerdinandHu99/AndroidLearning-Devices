package com.ferdinand;

import android.R.interpolator;
import android.os.RemoteException;
import android.util.Log;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HelloService extends IHelloService.Stub {

      private static final String TAG = "HelloType";
      private int cnt1 = 0;
      private int cnt2 = 0;

      public void sayhello() throws RemoteException {
            cnt1++;
            Log.i(TAG, "sayhello: " + cnt1);
      }

      public int sayhello_to(java.lang.String name) throws android.os.RemoteException {
            cnt2++;
            Log.i(TAG, "sayhello_to "+name+" : cnt = "+cnt2);
            return cnt2;
      }

      public int printList(List<String> strs) throws android.os.RemoteException {
            for (int i = 0; i < strs.size(); i++) {   
                  Log.i(TAG, strs.get(i));
            }
            return 1;
      }
      
      public int printMap(Map maps) throws android.os.RemoteException {
            Iterator it = maps.entrySet().iterator();
            while (it.hasNext()) {
                  Map.Entry entry = (Map.Entry) it.next();
                  Log.i(TAG, entry.getKey() + " = " + entry.getValue());
            }
            return 1;
      }

      public int printStudent(Student student) throws android.os.RemoteException {  
            Log.i(TAG, "name = " + student.name + ", age = " + student.age);
            return 1;
      }
}
