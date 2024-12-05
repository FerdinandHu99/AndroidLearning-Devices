package com.ferdinand;

import android.util.Log;

public class HelloService extends IHelloService.Stub {
    private static final String TAG = "HelloService";
    private int cnt1 = 0;
    private int cnt2 = 0;
    private ICallback mCallback;

    public void sayhello() throws android.os.RemoteException {
        cnt1++;
        Log.i(TAG, "sayhello : cnt = "+cnt1);

        if (mCallback != null) {
            mCallback.onMessage("message from HelloService");
        }
    }
    
    public int sayhello_to(java.lang.String name) throws android.os.RemoteException {
        cnt2++;
        Log.i(TAG, "sayhello_to "+name+" : cnt = "+cnt2);
        return cnt2;
    }

    public void registerCallback(int pid, ICallback callback) {
        Log.i(TAG, "registerCallback : pid = "+pid);
        mCallback = callback;
    }

    public int sayhelloin(Book book) throws android.os.RemoteException {
        // Log.i(TAG, "sayhelloin : book = "+book);
        book.setName("world");
        book.setPrice(1000);
        return 1;
    }

    public int sayhelloout(Book book) throws android.os.RemoteException {
        // Log.i(TAG, "sayhelloout : book = "+book);
        book.setName("world");
        book.setPrice(1000);
        return 1;
    }

    public int sayhelloinout(Book book) throws android.os.RemoteException {
        // Log.i(TAG, "sayhelloinout : book = "+book);
        book.setName("world");
        book.setPrice(1000);
        return 1;
    }

    public void sayhellooneway(Book book) throws android.os.RemoteException {
        // Log.i(TAG, "sayhellooneway : book = "+book);
        book.setName("world");
        book.setPrice(1000);
    }
}