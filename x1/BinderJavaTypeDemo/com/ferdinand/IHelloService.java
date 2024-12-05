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
    @Override public int printList(java.util.List<java.lang.String> strs) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int printMap(java.util.Map maps) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int printStudent(com.ferdinand.Student student) throws android.os.RemoteException
    {
      return 0;
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
        case TRANSACTION_printList:
        {
          data.enforceInterface(descriptor);
          java.util.List<java.lang.String> _arg0;
          _arg0 = data.createStringArrayList();
          int _result = this.printList(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printMap:
        {
          data.enforceInterface(descriptor);
          java.util.Map _arg0;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg0 = data.readHashMap(cl);
          int _result = this.printMap(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printStudent:
        {
          data.enforceInterface(descriptor);
          com.ferdinand.Student _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.ferdinand.Student.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.printStudent(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
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
      @Override public int printList(java.util.List<java.lang.String> strs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringList(strs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printList(strs);
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
      @Override public int printMap(java.util.Map maps) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeMap(maps);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printMap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printMap(maps);
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
      @Override public int printStudent(com.ferdinand.Student student) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((student!=null)) {
            _data.writeInt(1);
            student.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_printStudent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printStudent(student);
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
      public static com.ferdinand.IHelloService sDefaultImpl;
    }
    static final int TRANSACTION_sayhello = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_sayhello_to = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_printList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_printMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_printStudent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
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
  public int printList(java.util.List<java.lang.String> strs) throws android.os.RemoteException;
  public int printMap(java.util.Map maps) throws android.os.RemoteException;
  public int printStudent(com.ferdinand.Student student) throws android.os.RemoteException;
}
