package com.ferdinand;

import android.util.Log;
import android.os.ServiceManager;
import android.os.IBinder;

public class Client {

    private static final String TAG = "BinderClient";

    public static void main(String args[])
    {
        
        //获取服务
        IBinder binder = ServiceManager.getService("hello");
        
        if (binder == null)
        {
            Log.i(TAG, "can not get hello service");
            return;
        }

        //转换接口
        IHelloService svr = IHelloService.Stub.asInterface(binder);

        // ICallback callback = new ICallback.Stub() {
        //     @Override
        //     public void onMessage(String message) throws android.os.RemoteException {
        //         Log.i(TAG, "onMessage : " + message);
        //     }
        // };

        // try {
        //     svr.registerCallback(android.os.Process.myPid(), callback);
        // } catch (Exception e) {
        //     Log.i(TAG, "call registerCallback , err : "+e);
        // }

        // //发起远程调用
        // try {
	    //     svr.sayhello();
	    //     Log.i(TAG, "call sayhello");
        // } catch (Exception e) {

        // }
           
        // try {
	    //     int cnt = svr.sayhello_to("hello");
	    
	    //     Log.i(TAG, "call sayhello_to " + " : cnt = " + cnt);
        // } catch (Exception e) {
        //     System.out.println("call sayhello_to , err :"+e);
        //     Log.i(TAG, "call sayhello_to , err : "+e);
        // }

        // in out inout oneway
        try {
            Book book_in = new Book();
            book_in.setName("hello");
            book_in.setPrice(100);
            Log.i(TAG, "call sayhelloin before " + book_in.toString());
            int cnt = svr.sayhelloin(book_in);
            Log.i(TAG, "call sayhelloin after " + book_in.toString());
        } catch (Exception e) {
            System.out.println("call sayhelloin , err :"+e);
            Log.i(TAG, "call sayhelloin , err : "+e);
        }

        try {
            Book book_out = new Book();
            book_out.setName("hello");
            book_out.setPrice(100);
            Log.i(TAG, "call sayhelloout before " + book_out.toString());
            int cnt = svr.sayhelloout(book_out);
            Log.i(TAG, "call sayhelloout after " + book_out.toString());
        } catch (Exception e) {
            System.out.println("call sayhelloout , err :"+e);
            Log.i(TAG, "call sayhelloout , err : "+e);
        }

        try {
            Book book_inout = new Book();
            book_inout.setName("hello");
            book_inout.setPrice(100);
            Log.i(TAG, "call sayhelloinout before " + book_inout.toString());
            int cnt = svr.sayhelloinout(book_inout);
            Log.i(TAG, "call sayhelloinout after " + book_inout.toString());
        } catch (Exception e) {
            System.out.println("call sayhelloinout , err :"+e);
            Log.i(TAG, "call sayhelloinout , err : "+e);
        }

        try {
            Book book_oneway = new Book();
            book_oneway.setName("hello");
            book_oneway.setPrice(100);
            Log.i(TAG, "call sayhellooneway before " + book_oneway.toString());
            svr.sayhellooneway(book_oneway);
            Log.i(TAG, "call sayhellooneway after" + book_oneway.toString());
        } catch (Exception e) {
            System.out.println("call sayhellooneway , err :"+e);
            Log.i(TAG, "call sayhellooneway , err : "+e);
        }
    }
}