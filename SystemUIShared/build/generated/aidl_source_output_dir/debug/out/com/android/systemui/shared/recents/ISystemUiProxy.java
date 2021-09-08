/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.android.systemui.shared.recents;
/**
 * Temporary callbacks into SystemUI.
 * Next id = 27
 */
public interface ISystemUiProxy extends android.os.IInterface
{
  /** Default implementation for ISystemUiProxy. */
  public static class Default implements com.android.systemui.shared.recents.ISystemUiProxy
  {
    /**
         * Proxies SurfaceControl.screenshotToBuffer().
         * @Removed
         * GraphicBufferCompat screenshot(in Rect sourceCrop, int width, int height, int minLayer,
         *             int maxLayer, boolean useIdentityTransform, int rotation) = 0;
         *//**
         * Begins screen pinning on the provided {@param taskId}.
         */
    @Override public void startScreenPinning(int taskId) throws android.os.RemoteException
    {
    }
    /**
         * Notifies SystemUI that split screen has been invoked.
         */
    @Override public void onSplitScreenInvoked() throws android.os.RemoteException
    {
    }
    /**
         * Notifies SystemUI that Overview is shown.
         */
    @Override public void onOverviewShown(boolean fromHome) throws android.os.RemoteException
    {
    }
    /**
         * Get the secondary split screen app's rectangle when not minimized.
         */
    @Override public android.graphics.Rect getNonMinimizedSplitScreenSecondaryBounds() throws android.os.RemoteException
    {
      return null;
    }
    /**
         * Control the {@param alpha} of the back button in the navigation bar and {@param animate} if
         * needed from current value
         * @deprecated
         */
    @Override public void setBackButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException
    {
    }
    /**
         * Control the {@param alpha} of the option nav bar button (back-button in 2 button mode
         * and home bar in no-button mode) and {@param animate} if needed from current value
         */
    @Override public void setNavBarButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException
    {
    }
    /**
         * Proxies motion events from the homescreen UI to the status bar. Only called when
         * swipe down is detected on WORKSPACE. The sender guarantees the following order of events on
         * the tracking pointer.
         *
         * Normal gesture: DOWN, MOVE/POINTER_DOWN/POINTER_UP)*, UP or CANCLE
         */
    @Override public void onStatusBarMotionEvent(android.view.MotionEvent event) throws android.os.RemoteException
    {
    }
    /**
         * Proxies the assistant gesture's progress started from navigation bar.
         */
    @Override public void onAssistantProgress(float progress) throws android.os.RemoteException
    {
    }
    /**
        * Proxies the assistant gesture fling velocity (in pixels per millisecond) upon completion.
        * Velocity is 0 for drag gestures.
        */
    @Override public void onAssistantGestureCompletion(float velocity) throws android.os.RemoteException
    {
    }
    /**
         * Start the assistant.
         */
    @Override public void startAssistant(android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    /**
         * Creates a new gesture monitor
         */
    @Override public android.os.Bundle monitorGestureInput(java.lang.String name, int displayId) throws android.os.RemoteException
    {
      return null;
    }
    /**
         * Notifies that the accessibility button in the system's navigation area has been clicked
         */
    @Override public void notifyAccessibilityButtonClicked(int displayId) throws android.os.RemoteException
    {
    }
    /**
         * Notifies that the accessibility button in the system's navigation area has been long clicked
         */
    @Override public void notifyAccessibilityButtonLongClicked() throws android.os.RemoteException
    {
    }
    /**
         * Ends the system screen pinning.
         */
    @Override public void stopScreenPinning() throws android.os.RemoteException
    {
    }
    /**
         * Sets the shelf height and visibility.
         */
    @Override public void setShelfHeight(boolean visible, int shelfHeight) throws android.os.RemoteException
    {
    }
    /**
         * Handle the provided image as if it was a screenshot.
         *
         * Deprecated, use handleImageBundleAsScreenshot with image bundle and UserTask
         * @deprecated
         */
    @Override public void handleImageAsScreenshot(android.graphics.Bitmap screenImage, android.graphics.Rect locationInScreen, android.graphics.Insets visibleInsets, int taskId) throws android.os.RemoteException
    {
    }
    /**
         * Sets the split-screen divider minimized state
         */
    @Override public void setSplitScreenMinimized(boolean minimized) throws android.os.RemoteException
    {
    }
    /*
         * Notifies that the swipe-to-home (recents animation) is finished.
         */
    @Override public void notifySwipeToHomeFinished() throws android.os.RemoteException
    {
    }
    /**
         * Sets listener to get pinned stack animation callbacks.
         */
    @Override public void setPinnedStackAnimationListener(com.android.systemui.shared.recents.IPinnedStackAnimationListener listener) throws android.os.RemoteException
    {
    }
    /**
         * Notifies that quickstep will switch to a new task
         * @param rotation indicates which Surface.Rotation the gesture was started in
         */
    @Override public void onQuickSwitchToNewTask(int rotation) throws android.os.RemoteException
    {
    }
    /**
         * Handle the provided image as if it was a screenshot.
         */
    @Override public void handleImageBundleAsScreenshot(android.os.Bundle screenImageBundle, android.graphics.Rect locationInScreen, android.graphics.Insets visibleInsets, com.android.systemui.shared.recents.model.Task.TaskKey task) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.systemui.shared.recents.ISystemUiProxy
  {
    private static final java.lang.String DESCRIPTOR = "com.android.systemui.shared.recents.ISystemUiProxy";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.systemui.shared.recents.ISystemUiProxy interface,
     * generating a proxy if needed.
     */
    public static com.android.systemui.shared.recents.ISystemUiProxy asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.systemui.shared.recents.ISystemUiProxy))) {
        return ((com.android.systemui.shared.recents.ISystemUiProxy)iin);
      }
      return new com.android.systemui.shared.recents.ISystemUiProxy.Stub.Proxy(obj);
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
        case TRANSACTION_startScreenPinning:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.startScreenPinning(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onSplitScreenInvoked:
        {
          data.enforceInterface(descriptor);
          this.onSplitScreenInvoked();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onOverviewShown:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.onOverviewShown(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getNonMinimizedSplitScreenSecondaryBounds:
        {
          data.enforceInterface(descriptor);
          android.graphics.Rect _result = this.getNonMinimizedSplitScreenSecondaryBounds();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_setBackButtonAlpha:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setBackButtonAlpha(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setNavBarButtonAlpha:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setNavBarButtonAlpha(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onStatusBarMotionEvent:
        {
          data.enforceInterface(descriptor);
          android.view.MotionEvent _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onStatusBarMotionEvent(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onAssistantProgress:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          this.onAssistantProgress(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onAssistantGestureCompletion:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          this.onAssistantGestureCompletion(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_startAssistant:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.startAssistant(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_monitorGestureInput:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _result = this.monitorGestureInput(_arg0, _arg1);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_notifyAccessibilityButtonClicked:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.notifyAccessibilityButtonClicked(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_notifyAccessibilityButtonLongClicked:
        {
          data.enforceInterface(descriptor);
          this.notifyAccessibilityButtonLongClicked();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stopScreenPinning:
        {
          data.enforceInterface(descriptor);
          this.stopScreenPinning();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setShelfHeight:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          int _arg1;
          _arg1 = data.readInt();
          this.setShelfHeight(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleImageAsScreenshot:
        {
          data.enforceInterface(descriptor);
          android.graphics.Bitmap _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.graphics.Rect _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.graphics.Insets _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.graphics.Insets.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          int _arg3;
          _arg3 = data.readInt();
          this.handleImageAsScreenshot(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setSplitScreenMinimized:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setSplitScreenMinimized(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_notifySwipeToHomeFinished:
        {
          data.enforceInterface(descriptor);
          this.notifySwipeToHomeFinished();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPinnedStackAnimationListener:
        {
          data.enforceInterface(descriptor);
          com.android.systemui.shared.recents.IPinnedStackAnimationListener _arg0;
          _arg0 = com.android.systemui.shared.recents.IPinnedStackAnimationListener.Stub.asInterface(data.readStrongBinder());
          this.setPinnedStackAnimationListener(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onQuickSwitchToNewTask:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onQuickSwitchToNewTask(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleImageBundleAsScreenshot:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.graphics.Rect _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.graphics.Insets _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.graphics.Insets.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          com.android.systemui.shared.recents.model.Task.TaskKey _arg3;
          if ((0!=data.readInt())) {
            _arg3 = com.android.systemui.shared.recents.model.Task.TaskKey.CREATOR.createFromParcel(data);
          }
          else {
            _arg3 = null;
          }
          this.handleImageBundleAsScreenshot(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.android.systemui.shared.recents.ISystemUiProxy
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
      /**
           * Proxies SurfaceControl.screenshotToBuffer().
           * @Removed
           * GraphicBufferCompat screenshot(in Rect sourceCrop, int width, int height, int minLayer,
           *             int maxLayer, boolean useIdentityTransform, int rotation) = 0;
           *//**
           * Begins screen pinning on the provided {@param taskId}.
           */
      @Override public void startScreenPinning(int taskId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(taskId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startScreenPinning, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().startScreenPinning(taskId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Notifies SystemUI that split screen has been invoked.
           */
      @Override public void onSplitScreenInvoked() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSplitScreenInvoked, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onSplitScreenInvoked();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Notifies SystemUI that Overview is shown.
           */
      @Override public void onOverviewShown(boolean fromHome) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((fromHome)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onOverviewShown, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onOverviewShown(fromHome);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Get the secondary split screen app's rectangle when not minimized.
           */
      @Override public android.graphics.Rect getNonMinimizedSplitScreenSecondaryBounds() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.graphics.Rect _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNonMinimizedSplitScreenSecondaryBounds, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNonMinimizedSplitScreenSecondaryBounds();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.graphics.Rect.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * Control the {@param alpha} of the back button in the navigation bar and {@param animate} if
           * needed from current value
           * @deprecated
           */
      @Override public void setBackButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(alpha);
          _data.writeInt(((animate)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBackButtonAlpha, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBackButtonAlpha(alpha, animate);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Control the {@param alpha} of the option nav bar button (back-button in 2 button mode
           * and home bar in no-button mode) and {@param animate} if needed from current value
           */
      @Override public void setNavBarButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(alpha);
          _data.writeInt(((animate)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNavBarButtonAlpha, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setNavBarButtonAlpha(alpha, animate);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Proxies motion events from the homescreen UI to the status bar. Only called when
           * swipe down is detected on WORKSPACE. The sender guarantees the following order of events on
           * the tracking pointer.
           *
           * Normal gesture: DOWN, MOVE/POINTER_DOWN/POINTER_UP)*, UP or CANCLE
           */
      @Override public void onStatusBarMotionEvent(android.view.MotionEvent event) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((event!=null)) {
            _data.writeInt(1);
            event.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStatusBarMotionEvent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onStatusBarMotionEvent(event);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Proxies the assistant gesture's progress started from navigation bar.
           */
      @Override public void onAssistantProgress(float progress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(progress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAssistantProgress, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onAssistantProgress(progress);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Proxies the assistant gesture fling velocity (in pixels per millisecond) upon completion.
          * Velocity is 0 for drag gestures.
          */
      @Override public void onAssistantGestureCompletion(float velocity) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(velocity);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAssistantGestureCompletion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onAssistantGestureCompletion(velocity);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Start the assistant.
           */
      @Override public void startAssistant(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_startAssistant, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().startAssistant(bundle);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Creates a new gesture monitor
           */
      @Override public android.os.Bundle monitorGestureInput(java.lang.String name, int displayId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeInt(displayId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_monitorGestureInput, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().monitorGestureInput(name, displayId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.os.Bundle.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * Notifies that the accessibility button in the system's navigation area has been clicked
           */
      @Override public void notifyAccessibilityButtonClicked(int displayId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(displayId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyAccessibilityButtonClicked, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().notifyAccessibilityButtonClicked(displayId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Notifies that the accessibility button in the system's navigation area has been long clicked
           */
      @Override public void notifyAccessibilityButtonLongClicked() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyAccessibilityButtonLongClicked, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().notifyAccessibilityButtonLongClicked();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Ends the system screen pinning.
           */
      @Override public void stopScreenPinning() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopScreenPinning, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stopScreenPinning();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Sets the shelf height and visibility.
           */
      @Override public void setShelfHeight(boolean visible, int shelfHeight) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((visible)?(1):(0)));
          _data.writeInt(shelfHeight);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setShelfHeight, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setShelfHeight(visible, shelfHeight);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Handle the provided image as if it was a screenshot.
           *
           * Deprecated, use handleImageBundleAsScreenshot with image bundle and UserTask
           * @deprecated
           */
      @Override public void handleImageAsScreenshot(android.graphics.Bitmap screenImage, android.graphics.Rect locationInScreen, android.graphics.Insets visibleInsets, int taskId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((screenImage!=null)) {
            _data.writeInt(1);
            screenImage.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((locationInScreen!=null)) {
            _data.writeInt(1);
            locationInScreen.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((visibleInsets!=null)) {
            _data.writeInt(1);
            visibleInsets.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(taskId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleImageAsScreenshot, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleImageAsScreenshot(screenImage, locationInScreen, visibleInsets, taskId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Sets the split-screen divider minimized state
           */
      @Override public void setSplitScreenMinimized(boolean minimized) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((minimized)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSplitScreenMinimized, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setSplitScreenMinimized(minimized);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /*
           * Notifies that the swipe-to-home (recents animation) is finished.
           */
      @Override public void notifySwipeToHomeFinished() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifySwipeToHomeFinished, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().notifySwipeToHomeFinished();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Sets listener to get pinned stack animation callbacks.
           */
      @Override public void setPinnedStackAnimationListener(com.android.systemui.shared.recents.IPinnedStackAnimationListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPinnedStackAnimationListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPinnedStackAnimationListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Notifies that quickstep will switch to a new task
           * @param rotation indicates which Surface.Rotation the gesture was started in
           */
      @Override public void onQuickSwitchToNewTask(int rotation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(rotation);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onQuickSwitchToNewTask, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onQuickSwitchToNewTask(rotation);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Handle the provided image as if it was a screenshot.
           */
      @Override public void handleImageBundleAsScreenshot(android.os.Bundle screenImageBundle, android.graphics.Rect locationInScreen, android.graphics.Insets visibleInsets, com.android.systemui.shared.recents.model.Task.TaskKey task) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((screenImageBundle!=null)) {
            _data.writeInt(1);
            screenImageBundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((locationInScreen!=null)) {
            _data.writeInt(1);
            locationInScreen.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((visibleInsets!=null)) {
            _data.writeInt(1);
            visibleInsets.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((task!=null)) {
            _data.writeInt(1);
            task.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleImageBundleAsScreenshot, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleImageBundleAsScreenshot(screenImageBundle, locationInScreen, visibleInsets, task);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.android.systemui.shared.recents.ISystemUiProxy sDefaultImpl;
    }
    static final int TRANSACTION_startScreenPinning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onSplitScreenInvoked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onOverviewShown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getNonMinimizedSplitScreenSecondaryBounds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setBackButtonAlpha = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setNavBarButtonAlpha = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_onStatusBarMotionEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onAssistantProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_onAssistantGestureCompletion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_startAssistant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_monitorGestureInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_notifyAccessibilityButtonClicked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_notifyAccessibilityButtonLongClicked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_stopScreenPinning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_setShelfHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_handleImageAsScreenshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_setSplitScreenMinimized = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_notifySwipeToHomeFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_setPinnedStackAnimationListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_onQuickSwitchToNewTask = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_handleImageBundleAsScreenshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    public static boolean setDefaultImpl(com.android.systemui.shared.recents.ISystemUiProxy impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.android.systemui.shared.recents.ISystemUiProxy getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Proxies SurfaceControl.screenshotToBuffer().
       * @Removed
       * GraphicBufferCompat screenshot(in Rect sourceCrop, int width, int height, int minLayer,
       *             int maxLayer, boolean useIdentityTransform, int rotation) = 0;
       *//**
       * Begins screen pinning on the provided {@param taskId}.
       */
  public void startScreenPinning(int taskId) throws android.os.RemoteException;
  /**
       * Notifies SystemUI that split screen has been invoked.
       */
  public void onSplitScreenInvoked() throws android.os.RemoteException;
  /**
       * Notifies SystemUI that Overview is shown.
       */
  public void onOverviewShown(boolean fromHome) throws android.os.RemoteException;
  /**
       * Get the secondary split screen app's rectangle when not minimized.
       */
  public android.graphics.Rect getNonMinimizedSplitScreenSecondaryBounds() throws android.os.RemoteException;
  /**
       * Control the {@param alpha} of the back button in the navigation bar and {@param animate} if
       * needed from current value
       * @deprecated
       */
  public void setBackButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException;
  /**
       * Control the {@param alpha} of the option nav bar button (back-button in 2 button mode
       * and home bar in no-button mode) and {@param animate} if needed from current value
       */
  public void setNavBarButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException;
  /**
       * Proxies motion events from the homescreen UI to the status bar. Only called when
       * swipe down is detected on WORKSPACE. The sender guarantees the following order of events on
       * the tracking pointer.
       *
       * Normal gesture: DOWN, MOVE/POINTER_DOWN/POINTER_UP)*, UP or CANCLE
       */
  public void onStatusBarMotionEvent(android.view.MotionEvent event) throws android.os.RemoteException;
  /**
       * Proxies the assistant gesture's progress started from navigation bar.
       */
  public void onAssistantProgress(float progress) throws android.os.RemoteException;
  /**
      * Proxies the assistant gesture fling velocity (in pixels per millisecond) upon completion.
      * Velocity is 0 for drag gestures.
      */
  public void onAssistantGestureCompletion(float velocity) throws android.os.RemoteException;
  /**
       * Start the assistant.
       */
  public void startAssistant(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * Creates a new gesture monitor
       */
  public android.os.Bundle monitorGestureInput(java.lang.String name, int displayId) throws android.os.RemoteException;
  /**
       * Notifies that the accessibility button in the system's navigation area has been clicked
       */
  public void notifyAccessibilityButtonClicked(int displayId) throws android.os.RemoteException;
  /**
       * Notifies that the accessibility button in the system's navigation area has been long clicked
       */
  public void notifyAccessibilityButtonLongClicked() throws android.os.RemoteException;
  /**
       * Ends the system screen pinning.
       */
  public void stopScreenPinning() throws android.os.RemoteException;
  /**
       * Sets the shelf height and visibility.
       */
  public void setShelfHeight(boolean visible, int shelfHeight) throws android.os.RemoteException;
  /**
       * Handle the provided image as if it was a screenshot.
       *
       * Deprecated, use handleImageBundleAsScreenshot with image bundle and UserTask
       * @deprecated
       */
  public void handleImageAsScreenshot(android.graphics.Bitmap screenImage, android.graphics.Rect locationInScreen, android.graphics.Insets visibleInsets, int taskId) throws android.os.RemoteException;
  /**
       * Sets the split-screen divider minimized state
       */
  public void setSplitScreenMinimized(boolean minimized) throws android.os.RemoteException;
  /*
       * Notifies that the swipe-to-home (recents animation) is finished.
       */
  public void notifySwipeToHomeFinished() throws android.os.RemoteException;
  /**
       * Sets listener to get pinned stack animation callbacks.
       */
  public void setPinnedStackAnimationListener(com.android.systemui.shared.recents.IPinnedStackAnimationListener listener) throws android.os.RemoteException;
  /**
       * Notifies that quickstep will switch to a new task
       * @param rotation indicates which Surface.Rotation the gesture was started in
       */
  public void onQuickSwitchToNewTask(int rotation) throws android.os.RemoteException;
  /**
       * Handle the provided image as if it was a screenshot.
       */
  public void handleImageBundleAsScreenshot(android.os.Bundle screenImageBundle, android.graphics.Rect locationInScreen, android.graphics.Insets visibleInsets, com.android.systemui.shared.recents.model.Task.TaskKey task) throws android.os.RemoteException;
}
