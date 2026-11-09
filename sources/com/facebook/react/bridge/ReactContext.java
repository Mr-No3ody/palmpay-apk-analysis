package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReactContext extends ContextWrapper {
    private static final String TAG = "ReactContext";
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners;

    @Nullable
    private WeakReference<Activity> mCurrentActivity;

    @Nullable
    private JSExceptionHandler mExceptionHandlerWrapper;

    @Nullable
    private LayoutInflater mInflater;

    @Nullable
    protected InteropModuleRegistry mInteropModuleRegistry;
    private boolean mIsInitialized;

    @Nullable
    private JSExceptionHandler mJSExceptionHandler;

    @Nullable
    private MessageQueueThread mJSMessageQueueThread;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners;
    private LifecycleState mLifecycleState;

    @Nullable
    private MessageQueueThread mNativeModulesMessageQueueThread;

    @Nullable
    private ReactQueueConfiguration mQueueConfig;

    @Nullable
    private MessageQueueThread mUiMessageQueueThread;
    private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners;

    /* JADX INFO: renamed from: com.facebook.react.bridge.ReactContext$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            $SwitchMap$com$facebook$react$common$LifecycleState = iArr;
            try {
                iArr[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class ExceptionHandlerWrapper implements JSExceptionHandler {
        public ExceptionHandlerWrapper() {
        }

        @Override // com.facebook.react.bridge.JSExceptionHandler
        public void handleException(Exception exc) {
            ReactContext.this.handleException(exc);
        }
    }

    @DoNotStrip
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(@NonNull String str, @Nullable Object obj);
    }

    public ReactContext(Context context) {
        super(context);
        this.mLifecycleEventListeners = new CopyOnWriteArraySet<>();
        this.mActivityEventListeners = new CopyOnWriteArraySet<>();
        this.mWindowFocusEventListeners = new CopyOnWriteArraySet<>();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        this.mIsInitialized = false;
    }

    @ThreadConfined("UI")
    private void onHostDestroyImpl() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        int i7;
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if ((!hasActiveReactInstance() && !isBridgeless()) || (i7 = AnonymousClass2.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()]) == 1 || i7 == 2) {
            return;
        }
        if (i7 != 3) {
            throw new IllegalStateException("Unhandled lifecycle state.");
        }
        runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.bridge.ReactContext.1
            @Override // java.lang.Runnable
            public void run() {
                if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                    try {
                        lifecycleEventListener.onHostResume();
                    } catch (RuntimeException e10) {
                        ReactContext.this.handleException(e10);
                    }
                }
            }
        });
    }

    public void addWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.add(windowFocusChangeListener);
    }

    public void assertOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        if (!this.mIsInitialized) {
            throw new IllegalStateException("Tried to call assertOnNativeModulesQueueThread() on an uninitialized ReactContext");
        }
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    @ThreadConfined("UI")
    public abstract void destroy();

    public void emitDeviceEvent(String str, @Nullable Object obj) {
        RCTDeviceEventEmitter rCTDeviceEventEmitter = (RCTDeviceEventEmitter) getJSModule(RCTDeviceEventEmitter.class);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit(str, obj);
        }
    }

    public abstract CatalystInstance getCatalystInstance();

    @Nullable
    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public JSExceptionHandler getExceptionHandler() {
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    @Nullable
    @Deprecated(since = "This method is deprecated, please use UIManagerHelper.getUIManager() instead.")
    public abstract UIManager getFabricUIManager();

    @Nullable
    public abstract CallInvokerHolder getJSCallInvokerHolder();

    public JSExceptionHandler getJSExceptionHandler() {
        return this.mJSExceptionHandler;
    }

    @Nullable
    public MessageQueueThread getJSMessageQueueThread() {
        return this.mJSMessageQueueThread;
    }

    public abstract <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    @Nullable
    public abstract JavaScriptContextHolder getJavaScriptContextHolder();

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    @Nullable
    public abstract <T extends NativeModule> T getNativeModule(Class<T> cls);

    @Nullable
    public abstract NativeModule getNativeModule(String str);

    public abstract Collection<NativeModule> getNativeModules();

    @Nullable
    public MessageQueueThread getNativeModulesMessageQueueThread() {
        return this.mNativeModulesMessageQueueThread;
    }

    @Nullable
    public abstract String getSourceURL();

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    @Nullable
    public MessageQueueThread getUiMessageQueueThread() {
        return this.mUiMessageQueueThread;
    }

    public abstract void handleException(Exception exc);

    @Deprecated
    public abstract boolean hasActiveCatalystInstance();

    public abstract boolean hasActiveReactInstance();

    @Deprecated
    public abstract boolean hasCatalystInstance();

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public abstract <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    public abstract boolean hasReactInstance();

    public void initializeFromOther(ReactContext reactContext) {
        if (reactContext.hasReactInstance()) {
            initializeMessageQueueThreads(reactContext.mQueueConfig);
        }
        this.mInteropModuleRegistry = reactContext.mInteropModuleRegistry;
    }

    public void initializeInteropModules() {
        this.mInteropModuleRegistry = new InteropModuleRegistry();
    }

    public synchronized void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        p229p2.a.a(TAG, "initializeMessageQueueThreads() is called.");
        if (this.mUiMessageQueueThread != null || this.mNativeModulesMessageQueueThread != null || this.mJSMessageQueueThread != null) {
            throw new IllegalStateException("Message queue threads already initialized");
        }
        this.mQueueConfig = reactQueueConfiguration;
        this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
        this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
        MessageQueueThread jSQueueThread = reactQueueConfiguration.getJSQueueThread();
        this.mJSMessageQueueThread = jSQueueThread;
        if (this.mUiMessageQueueThread == null) {
            throw new IllegalStateException("UI thread is null");
        }
        if (this.mNativeModulesMessageQueueThread == null) {
            throw new IllegalStateException("NativeModules thread is null");
        }
        if (jSQueueThread == null) {
            throw new IllegalStateException("JavaScript thread is null");
        }
        this.mIsInitialized = true;
    }

    public <T extends JavaScriptModule> void internal_registerInteropModule(Class<T> cls, Object obj) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null) {
            interopModuleRegistry.registerInteropModule(cls, obj);
        }
    }

    @Deprecated
    public abstract boolean isBridgeless();

    public boolean isOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public void onActivityResult(Activity activity, int i7, int i10, @Nullable Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i7, i10, intent);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    @ThreadConfined("UI")
    public void onHostDestroy() {
        onHostDestroyImpl();
        this.mCurrentActivity = null;
    }

    @ThreadConfined("UI")
    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    @ThreadConfined("UI")
    public void onHostResume(@Nullable Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    @ThreadConfined("UI")
    public void onNewIntent(@Nullable Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    @ThreadConfined("UI")
    public void onUserLeaveHint(@Nullable Activity activity) {
        ReactMarker.logMarker(ReactMarkerConstants.ON_USER_LEAVE_HINT_START);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onUserLeaveHint(activity);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_USER_LEAVE_HINT_END);
    }

    @ThreadConfined("UI")
    public void onWindowFocusChange(boolean z3) {
        UiThreadUtil.assertOnUiThread();
        Iterator<WindowFocusChangeListener> it = this.mWindowFocusEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onWindowFocusChange(z3);
            } catch (RuntimeException e10) {
                handleException(e10);
            }
        }
    }

    public abstract void registerSegment(int i7, String str, Callback callback);

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void removeWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.remove(windowFocusChangeListener);
    }

    public void resetPerfStats() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        if (messageQueueThread != null) {
            messageQueueThread.resetPerfStats();
        }
        MessageQueueThread messageQueueThread2 = this.mJSMessageQueueThread;
        if (messageQueueThread2 != null) {
            messageQueueThread2.resetPerfStats();
        }
    }

    public boolean runOnJSQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        return messageQueueThread.runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        p059e1.a.f(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void setJSExceptionHandler(@Nullable JSExceptionHandler jSExceptionHandler) {
        this.mJSExceptionHandler = jSExceptionHandler;
    }

    public boolean startActivityForResult(Intent intent, int i7, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        currentActivity.startActivityForResult(intent, i7, bundle);
        return true;
    }

    public void emitDeviceEvent(String str) {
        emitDeviceEvent(str, null);
    }

    @ThreadConfined("UI")
    public void onHostDestroy(boolean z3) {
        if (!z3) {
            onHostDestroy();
        } else {
            onHostDestroyImpl();
        }
    }

    public void assertOnNativeModulesQueueThread(String str) {
        if (this.mIsInitialized) {
            MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
            p059e1.a.f(messageQueueThread);
            messageQueueThread.assertIsOnThread(str);
            return;
        }
        throw new IllegalStateException("Tried to call assertOnNativeModulesQueueThread(message) on an uninitialized ReactContext");
    }
}
