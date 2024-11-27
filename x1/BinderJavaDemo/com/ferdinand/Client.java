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

        //发起远程调用
        try {
	        svr.sayhello();
	        Log.i(TAG, "call sayhello");
        } catch (Exception e) {

        }
           
        try {
	        int cnt = svr.sayhello_to("hello");
	    
	        Log.i(TAG, "call sayhello_to " + " : cnt = " + cnt);
        } catch (Exception e) {
            System.out.println("call sayhello_to , err :"+e);
            Log.i(TAG, "call sayhello_to , err : "+e);
        }
    }
}