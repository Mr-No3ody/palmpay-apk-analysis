package com.facebook.react.bridge;

import C0.G;
import E.AbstractC0198c;
import android.content.res.AssetManager;
import android.os.Trace;
import androidx.annotation.Nullable;
import com.alibaba.android.arouter.utils.Consts;
import com.didiglobal.booster.instrument.ShadowThread;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.systrace.TraceListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace;
    private volatile boolean mAcceptCalls;
    private final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;

    @Nullable
    private UIManager mFabricUIManager;
    private final HybridData mHybridData;
    private boolean mInitialized;

    @Nullable
    private ReactInstanceManagerInspectorTarget mInspectorTarget;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final JSExceptionHandler mJSExceptionHandler;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    private JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    private final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;

    @Nullable
    private String mSourceURL;
    private final TraceListener mTraceListener;

    @Nullable
    private TurboModuleRegistry mTurboModuleRegistry;

    public static class Builder {

        @Nullable
        private ReactInstanceManagerInspectorTarget mInspectorTarget;

        @Nullable
        private JSBundleLoader mJSBundleLoader;

        @Nullable
        private JSExceptionHandler mJSExceptionHandler;

        @Nullable
        private JavaScriptExecutor mJSExecutor;

        @Nullable
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;

        @Nullable
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            ReactQueueConfigurationSpec reactQueueConfigurationSpec = this.mReactQueueConfigurationSpec;
            p059e1.a.f(reactQueueConfigurationSpec);
            JavaScriptExecutor javaScriptExecutor = this.mJSExecutor;
            p059e1.a.f(javaScriptExecutor);
            NativeModuleRegistry nativeModuleRegistry = this.mRegistry;
            p059e1.a.f(nativeModuleRegistry);
            JSBundleLoader jSBundleLoader = this.mJSBundleLoader;
            p059e1.a.f(jSBundleLoader);
            JSExceptionHandler jSExceptionHandler = this.mJSExceptionHandler;
            p059e1.a.f(jSExceptionHandler);
            return new CatalystInstanceImpl(reactQueueConfigurationSpec, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, jSExceptionHandler, this.mInspectorTarget, 0);
        }

        public Builder setInspectorTarget(@Nullable ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget) {
            this.mInspectorTarget = reactInstanceManagerInspectorTarget;
            return this;
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExceptionHandler(JSExceptionHandler jSExceptionHandler) {
            this.mJSExceptionHandler = jSExceptionHandler;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    @DoNotStripAny
    public static class InstanceCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public InstanceCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onBatchComplete$0(CatalystInstanceImpl catalystInstanceImpl) {
            catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
        }

        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new a(catalystInstanceImpl, 0));
            }
        }
    }

    public static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.systrace.TraceListener
        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        @Override // com.facebook.systrace.TraceListener
        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    public class NativeExceptionHandler implements QueueThreadExceptionHandler {
        public /* synthetic */ NativeExceptionHandler(CatalystInstanceImpl catalystInstanceImpl, int i7) {
            this();
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }

        private NativeExceptionHandler() {
        }
    }

    public static class PendingJSCall {

        @Nullable
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, @Nullable NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray writableNativeArray = this.mArguments;
            if (writableNativeArray == null) {
                writableNativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, writableNativeArray);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.mModule);
            sb2.append(Consts.DOT);
            sb2.append(this.mMethod);
            sb2.append("(");
            NativeArray nativeArray = this.mArguments;
            return G.r(sb2, nativeArray == null ? "" : nativeArray.toString(), ")");
        }
    }

    static {
        BridgeSoLoader.staticInit();
        LegacyArchitectureLogger.assertLegacyArchitecture("CatalystInstanceImpl", LegacyArchitectureLogLevel.WARNING);
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    public /* synthetic */ CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, JSExceptionHandler jSExceptionHandler, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget, int i7) {
        this(reactQueueConfigurationSpec, javaScriptExecutor, nativeModuleRegistry, jSBundleLoader, jSExceptionHandler, reactInstanceManagerInspectorTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int iDecrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z3 = iDecrementAndGet == 0;
        String counterName = this.mJsPendingCallsTitleForTrace;
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        AbstractC0198c.Z(iDecrementAndGet, counterName);
        if (!z3 || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new a(this, 7));
    }

    private native long getJavaScriptContext();

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return reactModule.name();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
    }

    private TurboModuleRegistry getTurboModuleRegistry() {
        if (!ReactNativeNewArchitectureFeatureFlags.useTurboModules()) {
            return null;
        }
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        p059e1.a.g(turboModuleRegistry, "TurboModules are enabled, but mTurboModuleRegistry hasn't been set.");
        return turboModuleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z3 = andIncrement == 0;
        String counterName = this.mJsPendingCallsTitleForTrace;
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        AbstractC0198c.Z(andIncrement + 1, counterName);
        if (!z3 || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new a(this, 5));
    }

    private static native HybridData initHybrid();

    private native void initializeBridge(InstanceCallback instanceCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2, @Nullable ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget);

    private native void jniCallJSCallback(int i7, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i7);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z3);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z3);

    private native void jniRegisterSegment(int i7, String str);

    private native void jniSetSourceURL(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decrementPendingJSCalls$5() {
        Iterator<NotThreadSafeBridgeIdleDebugListener> it = this.mBridgeIdleListeners.iterator();
        while (it.hasNext()) {
            it.next().onTransitionToBridgeIdle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$0() {
        this.mJavaScriptContextHolder.clear();
        this.mHybridData.resetNative();
        getReactQueueConfiguration().destroy();
        p229p2.a.v("ReactNative", "CatalystInstanceImpl.destroy() end");
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$1() {
        TurboModuleRegistry turboModuleRegistry = this.mTurboModuleRegistry;
        if (turboModuleRegistry != null) {
            turboModuleRegistry.invalidate();
        }
        ShadowThread.setThreadName(new ShadowThread(new a(this, 4), "destroy_react_context", "\u200bcom.facebook.react.bridge.CatalystInstanceImpl"), "\u200bcom.facebook.react.bridge.CatalystInstanceImpl").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$2() {
        this.mNativeModuleRegistry.notifyJSInstanceDestroy();
        UIManager uIManager = this.mFabricUIManager;
        if (uIManager != null) {
            uIManager.invalidate();
        }
        boolean z3 = this.mPendingJSCalls.getAndSet(0) == 0;
        if (!this.mBridgeIdleListeners.isEmpty()) {
            for (NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener : this.mBridgeIdleListeners) {
                if (!z3) {
                    notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                }
                notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
            }
        }
        getReactQueueConfiguration().getJSQueueThread().runOnQueue(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementPendingJSCalls$4() {
        Iterator<NotThreadSafeBridgeIdleDebugListener> it = this.mBridgeIdleListeners.iterator();
        while (it.hasNext()) {
            it.next().onTransitionToBridgeBusy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$3() {
        this.mNativeModuleRegistry.notifyJSInstanceInitialized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        this.mJSExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new a(this, 3));
    }

    private native void unregisterFromInspector();

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @ThreadConfined("UI")
    /* JADX INFO: renamed from: destroy, reason: merged with bridge method [inline-methods] */
    public void lambda$onNativeException$6() {
        p229p2.a.a("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = this.mInspectorTarget;
        if (reactInstanceManagerInspectorTarget != null) {
            p059e1.a.e(reactInstanceManagerInspectorTarget.isValid(), "ReactInstanceManager inspector target destroyed before instance was unregistered");
        }
        unregisterFromInspector();
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesQueueThread.runOnQueue(new a(this, 1));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public UIManager getFabricUIManager() {
        return this.mFabricUIManager;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    @Override // com.facebook.react.bridge.CatalystInstance
    @Nullable
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) getNativeModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mNativeModuleRegistry.getAllModules());
        if (getTurboModuleRegistry() != null) {
            Iterator<NativeModule> it = getTurboModuleRegistry().getModules().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native RuntimeExecutor getRuntimeExecutor();

    @Override // com.facebook.react.bridge.CatalystInstance
    public native RuntimeScheduler getRuntimeScheduler();

    @Override // com.facebook.react.bridge.CatalystInstance
    @Nullable
    public String getSourceURL() {
        return this.mSourceURL;
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i7) {
        if (this.mDestroyed) {
            return;
        }
        jniHandleMemoryPressure(i7);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        String nameFromAnnotation = getNameFromAnnotation(cls);
        if (getTurboModuleRegistry() == null || !getTurboModuleRegistry().hasModule(nameFromAnnotation)) {
            return this.mNativeModuleRegistry.hasModule(nameFromAnnotation);
        }
        return true;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        boolean z3;
        synchronized (this.mJSCallsPendingInitLock) {
            try {
                z3 = this.mJSBundleHasLoaded && this.mAcceptCalls;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @VisibleForTesting
    public void initialize() {
        p229p2.a.a("ReactNative", "CatalystInstanceImpl.initialize()");
        p059e1.a.e(!this.mInitialized, "This catalyst instance has already been initialized");
        p059e1.a.e(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new a(this, 6));
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i7, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            p229p2.a.v("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i7, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z3) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z3);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z3) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z3);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String str, String str2) {
        jniLoadScriptFromFile(str, str2, false);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i7, String str) {
        jniRegisterSegment(i7, str);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        p229p2.a.a("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        p059e1.a.e(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            try {
                this.mAcceptCalls = true;
                Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
                while (it.hasNext()) {
                    it.next().call(this);
                }
                this.mJSCallsPendingInit.clear();
                this.mJSBundleHasLoaded = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setFabricUIManager(UIManager uIManager) {
        this.mFabricUIManager = uIManager;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        this.mTurboModuleRegistry = turboModuleRegistry;
    }

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, JSExceptionHandler jSExceptionHandler, @Nullable ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        p229p2.a.a("ReactNative", "Initializing React Xplat Bridge.");
        Intrinsics.checkNotNullParameter("createCatalystInstanceImpl", "sectionName");
        Trace.beginSection(AbstractC0198c.m0("createCatalystInstanceImpl"));
        this.mHybridData = initHybrid();
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler(this, 0));
        this.mReactQueueConfiguration = reactQueueConfigurationImplCreate;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mJSExceptionHandler = jSExceptionHandler;
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        this.mNativeModulesQueueThread = nativeModulesQueueThread;
        this.mTraceListener = new JSProfilerTraceListener(this);
        this.mInspectorTarget = reactInstanceManagerInspectorTarget;
        Trace.endSection();
        p229p2.a.a("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        Intrinsics.checkNotNullParameter("initializeCxxBridge", "sectionName");
        Trace.beginSection(AbstractC0198c.m0("initializeCxxBridge"));
        initializeBridge(new InstanceCallback(this), javaScriptExecutor, reactQueueConfigurationImplCreate.getJSQueueThread(), nativeModulesQueueThread, nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules(), this.mInspectorTarget);
        p229p2.a.a("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
        Trace.endSection();
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            p229p2.a.v("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall.toString());
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                try {
                    if (!this.mAcceptCalls) {
                        this.mJSCallsPendingInit.add(pendingJSCall);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pendingJSCall.call(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @Nullable
    public NativeModule getNativeModule(String str) {
        NativeModule module;
        if (getTurboModuleRegistry() != null && (module = getTurboModuleRegistry().getModule(str)) != null) {
            return module;
        }
        if (this.mNativeModuleRegistry.hasModule(str)) {
            return this.mNativeModuleRegistry.getModule(str);
        }
        return null;
    }
}
