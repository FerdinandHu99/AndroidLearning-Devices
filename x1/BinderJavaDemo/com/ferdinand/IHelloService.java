/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.ferdinand;
public interface IHelloService extends android.os.IInterface
{
  /** Default implementation for IHelloService. */
  public static class Default implements com.ferdinand.IHelloService
  {
    @Override public void sayhello() throws android.os.RemoteException
    {
    }
    @Override public int sayhello_to(java.lang.String name) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void registerCallback(int pid, com.ferdinand.ICallback callback) throws android.os.RemoteException
    {
    }
    @Override public int sayhelloin(com.ferdinand.Book book) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int sayhelloout(com.ferdinand.Book book) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int sayhelloinout(com.ferdinand.Book book) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void sayhellooneway(com.ferdinand.Book book) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.ferdinand.IHelloService
  {
    private static final java.lang.String DESCRIPTOR = "com.ferdinand.IHelloService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.ferdinand.IHelloService interface,
     * generating a proxy if needed.
     */
    public static com.ferdinand.IHelloService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.ferdinand.IHelloService))) {
        return ((com.ferdinand.IHelloService)iin);
      }
      return new com.ferdinand.IHelloService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_sayhello:
        {
          data.enforceInterface(descriptor);
          this.sayhello();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sayhello_to:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.sayhello_to(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_registerCallback:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.ferdinand.ICallback _arg1;
          _arg1 = com.ferdinand.ICallback.Stub.asInterface(data.readStrongBinder());
          this.registerCallback(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sayhelloin:
        {
          data.enforceInterface(descriptor);
          com.ferdinand.Book _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.ferdinand.Book.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.sayhelloin(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sayhelloout:
        {
          data.enforceInterface(descriptor);
          com.ferdinand.Book _arg0;
          _arg0 = new com.ferdinand.Book();
          int _result = this.sayhelloout(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_sayhelloinout:
        {
          data.enforceInterface(descriptor);
          com.ferdinand.Book _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.ferdinand.Book.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.sayhelloinout(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_sayhellooneway:
        {
          data.enforceInterface(descriptor);
          com.ferdinand.Book _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.ferdinand.Book.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.sayhellooneway(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.ferdinand.IHelloService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void sayhello() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayhello, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sayhello();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int sayhello_to(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayhello_to, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sayhello_to(name);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void registerCallback(int pid, com.ferdinand.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pid);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerCallback(pid, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int sayhelloin(com.ferdinand.Book book) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((book!=null)) {
            _data.writeInt(1);
            book.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayhelloin, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sayhelloin(book);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int sayhelloout(com.ferdinand.Book book) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayhelloout, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sayhelloout(book);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            book.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int sayhelloinout(com.ferdinand.Book book) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((book!=null)) {
            _data.writeInt(1);
            book.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayhelloinout, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sayhelloinout(book);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            book.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void sayhellooneway(com.ferdinand.Book book) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((book!=null)) {
            _data.writeInt(1);
            book.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sayhellooneway, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sayhellooneway(book);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.ferdinand.IHelloService sDefaultImpl;
    }
    static final int TRANSACTION_sayhello = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_sayhello_to = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_sayhelloin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_sayhelloout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_sayhelloinout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_sayhellooneway = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    public static boolean setDefaultImpl(com.ferdinand.IHelloService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.ferdinand.IHelloService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void sayhello() throws android.os.RemoteException;
  public int sayhello_to(java.lang.String name) throws android.os.RemoteException;
  public void registerCallback(int pid, com.ferdinand.ICallback callback) throws android.os.RemoteException;
  public int sayhelloin(com.ferdinand.Book book) throws android.os.RemoteException;
  public int sayhelloout(com.ferdinand.Book book) throws android.os.RemoteException;
  public int sayhelloinout(com.ferdinand.Book book) throws android.os.RemoteException;
  public void sayhellooneway(com.ferdinand.Book book) throws android.os.RemoteException;
}
