package com.facebook.react.fabric;

import C0.G;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FabricEventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.SynchronousEventReceiver;
import com.facebook.react.views.text.PreparedLayout;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.text.TextLayoutManager;
import com.transsnet.analysis.contants.EventsConstants;
import face.security.device.api.FaceSecCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
@SuppressLint({"MissingNativeLoadLibrary"})
@Nullsafe(p245q3.a.f41451a)
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, SynchronousEventReceiver {
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER = new a();
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final BatchEventDispatchedListener mBatchEventDispatchedListener;

    @Nullable
    private FabricUIManagerBinding mBinding;

    @Nullable
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;

    @ThreadConfined("UI")
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final FabricEventDispatcher mEventDispatcher;

    @Nullable
    private InteropUIBlockListener mInteropUIBlockListener;
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;
    private final MountingManager mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final ViewManagerRegistry mViewManagerRegistry;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private List<Integer> mSurfaceIdsWithPendingMountNotification = new ArrayList();

    @ThreadConfined("UI")
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private boolean mDriveCxxNativeAnimated = ReactNativeFeatureFlags.cxxNativeAnimatedEnabled();
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = FaceSecCode.SC_SUCCESS;

    public class DispatchUIFrameCallback extends GuardedFrameCallback {
        private volatile boolean mIsMountingEnabled;

        @ThreadConfined("UI")
        private boolean mIsScheduled;

        @ThreadConfined("UI")
        private boolean mShouldSchedule;

        public /* synthetic */ DispatchUIFrameCallback(FabricUIManager fabricUIManager, ReactApplicationContext reactApplicationContext) {
            this((ReactContext) reactApplicationContext);
        }

        @ThreadConfined("UI")
        @UiThread
        private void schedule() {
            if (this.mIsScheduled || !this.mShouldSchedule) {
                return;
            }
            this.mIsScheduled = true;
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
        }

        @Override // com.facebook.react.uimanager.GuardedFrameCallback
        @ThreadConfined("UI")
        @UiThread
        public void doFrameGuarded(long j6) {
            this.mIsScheduled = false;
            if (!this.mIsMountingEnabled) {
                p229p2.a.v(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                p229p2.a.v(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if ((FabricUIManager.this.mDriveCxxAnimations || FabricUIManager.this.mDriveCxxNativeAnimated) && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j6);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    schedule();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e10) {
                    p229p2.a.i(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e10);
                    this.mIsMountingEnabled = false;
                    throw e10;
                }
            } catch (Throwable th) {
                schedule();
                throw th;
            }
        }

        @ThreadConfined("UI")
        @UiThread
        public void pause() {
            ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        @ThreadConfined("UI")
        @UiThread
        public void resume() {
            this.mShouldSchedule = true;
            schedule();
        }

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }
    }

    public class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {
        public /* synthetic */ MountItemDispatchListener(FabricUIManager fabricUIManager, int i7) {
            this();
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        @ThreadConfined("UI")
        @UiThread
        public void didMountItems(@Nullable List<? extends MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && !FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.contains(Integer.valueOf(mountItem.getSurfaceId()))) {
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.add(Integer.valueOf(mountItem.getSurfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.isEmpty()) {
                return;
            }
            FabricUIManager.this.mMountNotificationScheduled = true;
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.react.fabric.FabricUIManager.MountItemDispatchListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FabricUIManager.this.mMountNotificationScheduled = false;
                    List list2 = FabricUIManager.this.mSurfaceIdsWithPendingMountNotification;
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification = new ArrayList();
                    FabricUIManagerBinding fabricUIManagerBinding = FabricUIManager.this.mBinding;
                    if (fabricUIManagerBinding == null || FabricUIManager.this.mDestroyed) {
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        fabricUIManagerBinding.reportMount(((Integer) it2.next()).intValue());
                    }
                }
            });
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        @ThreadConfined("UI")
        @UiThread
        public void willMountItems(@Nullable List<? extends MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }

        private MountItemDispatchListener() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, BatchEventDispatchedListener batchEventDispatchedListener) {
        MountingManager.MountItemExecutor mountItemExecutor = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = mountItemExecutor;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(this, reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(viewManagerRegistry, mountItemExecutor);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener(this, 0));
        this.mEventDispatcher = new FabricEventDispatcher(reactApplicationContext, new FabricEventEmitter(this));
        this.mBatchEventDispatchedListener = batchEventDispatchedListener;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = viewManagerRegistry;
        reactApplicationContext.registerComponentCallbacks(viewManagerRegistry);
    }

    @AnyThread
    @ThreadConfined("ANY")
    private MountItem createIntBufferBatchMountItem(int i7, @Nullable int[] iArr, @Nullable Object[] objArr, int i10) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i7, iArr, objArr, i10);
    }

    @AnyThread
    @ThreadConfined("ANY")
    private void destroyUnmountedView(int i7, int i10) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createDestroyViewMountItem(i7, i10));
    }

    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    @AnyThread
    @ThreadConfined("ANY")
    @SuppressLint({"NotInvokedPrivateMethod"})
    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        LongStreamingStats longStreamingStats = DevToolsReactPerfLogger.streamingCommitStats;
        longStreamingStats.add(commitDuration);
        LongStreamingStats longStreamingStats2 = DevToolsReactPerfLogger.streamingLayoutStats;
        longStreamingStats2.add(layoutDuration);
        LongStreamingStats longStreamingStats3 = DevToolsReactPerfLogger.streamingDiffStats;
        longStreamingStats3.add(diffDuration);
        LongStreamingStats longStreamingStats4 = DevToolsReactPerfLogger.streamingTransactionEndStats;
        longStreamingStats4.add(transactionEndDuration);
        LongStreamingStats longStreamingStats5 = DevToolsReactPerfLogger.streamingBatchExecutionStats;
        longStreamingStats5.add(batchExecutionDuration);
        p229p2.a.n(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(longStreamingStats.getAverage()), Double.valueOf(longStreamingStats.getMedian()), Long.valueOf(longStreamingStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(longStreamingStats2.getAverage()), Double.valueOf(longStreamingStats2.getMedian()), Long.valueOf(longStreamingStats2.getMax()), Long.valueOf(diffDuration), Double.valueOf(longStreamingStats3.getAverage()), Double.valueOf(longStreamingStats3.getMedian()), Long.valueOf(longStreamingStats3.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(longStreamingStats4.getAverage()), Double.valueOf(longStreamingStats4.getMedian()), Long.valueOf(longStreamingStats4.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(longStreamingStats5.getAverage()), Double.valueOf(longStreamingStats5.getMedian()), Long.valueOf(longStreamingStats5.getMax()));
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11) {
        NativeModule nativeModule = this.mViewManagerRegistry.get("RCTText");
        return (NativeArray) TextLayoutManager.measureLines(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, PixelUtil.toPixelFromDIP(f10), PixelUtil.toPixelFromDIP(f11), nativeModule instanceof ReactTextViewManagerCallback ? (ReactTextViewManagerCallback) nativeModule : null);
    }

    @AnyThread
    @ThreadConfined("ANY")
    private void preallocateView(int i7, int i10, String str, @Nullable Object obj, @Nullable Object obj2, boolean z3) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i7, i10, str, (ReadableMap) obj, (StateWrapper) obj2, z3));
    }

    @AnyThread
    @ThreadConfined("ANY")
    private void scheduleMountItem(@Nullable MountItem mountItem, int i7, long j6, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        boolean z3;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z8 = mountItem instanceof BatchMountItem;
        if (z8) {
            BatchMountItem batchMountItem = (BatchMountItem) mountItem;
            p059e1.a.g(batchMountItem, "BatchMountItem is null");
            z3 = !batchMountItem.isBatchEmpty();
        } else {
            z3 = mountItem != null;
        }
        Iterator<UIManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().didScheduleMountItems(this);
            z3 = z3;
        }
        boolean z10 = z3;
        if (z8) {
            this.mCommitStartTime = j6;
            this.mLayoutTime = j13 - j12;
            this.mFinishTransactionCPPTime = j15 - j14;
            this.mFinishTransactionTime = jUptimeMillis - j14;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z10) {
            p059e1.a.g(mountItem, "MountItem is null");
            this.mMountItemDispatcher.addMountItem(mountItem);
            GuardedRunnable guardedRunnable = new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.3
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                guardedRunnable.run();
            }
        }
        if (z8) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i7, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i7, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i7, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i7, j10);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i7, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i7, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i7, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i7, j13, i10);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @ThreadConfined("UI")
    @UiThread
    @Deprecated
    public <T extends View> int addRootView(T t, @Nullable WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        ReactRoot reactRoot = (ReactRoot) t;
        int rootViewTag = reactRoot.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new ThemedReactContext(this.mReactApplicationContext, t.getContext(), reactRoot.getSurfaceID(), rootViewTag), t);
        String jSModuleName = reactRoot.getJSModuleName();
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            p229p2.a.d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        p059e1.a.g(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(SurfaceHandlerBinding surfaceHandlerBinding, View view) {
        this.mMountingManager.attachRootView(surfaceHandlerBinding.getSurfaceId(), view, new ThemedReactContext(this.mReactApplicationContext, view.getContext(), surfaceHandlerBinding.getModuleName(), surfaceHandlerBinding.getSurfaceId()));
        surfaceHandlerBinding.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.5
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }
        });
    }

    public DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i7, int i10, String str, @Nullable ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i7, i10, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i7, i10, str, readableArray);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @ThreadConfined("ANY")
    @Deprecated
    public void dispatchCommand(int i7, int i10, @Nullable ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @UnstableReactNativeAPI
    public void experimental_prefetchResource(String str, int i7, int i10, ReadableMapBuffer readableMapBuffer) {
        this.mMountingManager.experimental_prefetchResource(this.mReactApplicationContext, str, i7, i10, readableMapBuffer);
    }

    @Nullable
    public Integer findNextFocusableElement(int i7, int i10, int i11) {
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding == null) {
            return null;
        }
        int i12 = 1;
        if (i11 == 1) {
            i12 = 5;
        } else if (i11 == 2) {
            i12 = 4;
        } else if (i11 == 17) {
            i12 = 3;
        } else if (i11 != 33) {
            if (i11 == 66) {
                i12 = 2;
            } else {
                if (i11 != 130) {
                    return null;
                }
                i12 = 0;
            }
        }
        int iFindNextFocusableElement = fabricUIManagerBinding.findNextFocusableElement(i7, i10, i12);
        if (iFindNextFocusableElement == -1) {
            return null;
        }
        return Integer.valueOf(iFindNextFocusableElement);
    }

    public int getColor(int i7, String[] strArr) {
        ThemedReactContext context = this.mMountingManager.getSurfaceManagerEnforced(i7, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    @Nullable
    public int[] getRelativeAncestorList(int i7, int i10) {
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding != null) {
            return fabricUIManagerBinding.getRelativeAncestorList(i7, i10);
        }
        return null;
    }

    public boolean getThemeData(int i7, float[] fArr) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i7);
        ThemedReactContext context = surfaceManager != null ? surfaceManager.getContext() : null;
        if (context == null) {
            p229p2.a.x(TAG, "Couldn't get context for surfaceId %d in getThemeData", Integer.valueOf(i7));
            return false;
        }
        float[] defaultTextInputPadding = UIManagerHelper.getDefaultTextInputPadding(context);
        fArr[0] = defaultTextInputPadding[0];
        fArr[1] = defaultTextInputPadding[1];
        fArr[2] = defaultTextInputPadding[2];
        fArr[3] = defaultTextInputPadding[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.addBatchEventDispatchedListener(this.mBatchEventDispatchedListener);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @ThreadConfined("ANY")
    public void invalidate() {
        String str = TAG;
        p229p2.a.k(str, "FabricUIManager.invalidate");
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mEventDispatcher.removeBatchEventDispatchedListener(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.invalidate();
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.invalidate();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding != null) {
            fabricUIManagerBinding.unregister();
        }
        this.mBinding = null;
        ViewManagerPropertyUpdater.clear();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i7, int i10) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i7);
        if (surfaceManager != null) {
            surfaceManager.markActiveTouchForTag(i10);
        }
    }

    @AnyThread
    @ThreadConfined("ANY")
    public long measure(int i7, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, float f11, float f12, float f13) {
        ReactContext context;
        if (i7 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i7, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
            p059e1.a.g(context, "Context in SurfaceMountingManager is null. surfaceId: " + i7);
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(context, str, readableMap, readableMap2, readableMap3, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), null);
    }

    @AnyThread
    @ThreadConfined("ANY")
    @UnstableReactNativeAPI
    public float[] measurePreparedLayout(PreparedLayout preparedLayout, float f10, float f11, float f12, float f13) {
        return TextLayoutManager.measurePreparedLayout(preparedLayout, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13));
    }

    @AnyThread
    @ThreadConfined("ANY")
    @UnstableReactNativeAPI
    public long measureText(int i7, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11, float f12, float f13, @Nullable float[] fArr) {
        Context context;
        if (i7 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i7, "measureText");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
            p059e1.a.g(context, "Context in SurfaceMountingManager is null. surfaceId: " + i7);
        } else {
            context = this.mReactApplicationContext;
        }
        Context context2 = context;
        NativeModule nativeModule = this.mViewManagerRegistry.get("RCTText");
        return TextLayoutManager.measureText(context2, readableMapBuffer, readableMapBuffer2, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), nativeModule instanceof ReactTextViewManagerCallback ? (ReactTextViewManagerCallback) nativeModule : null, fArr);
    }

    @AnyThread
    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    @AnyThread
    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mDispatchUIFrameCallback.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mDispatchUIFrameCallback.resume();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.dispatchAllEvents();
    }

    @AnyThread
    @ThreadConfined("ANY")
    @UnstableReactNativeAPI
    public PreparedLayout prepareTextLayout(int i7, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11, float f12, float f13) {
        SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i7, "prepareTextLayout");
        NativeModule nativeModule = this.mViewManagerRegistry.get("RCTText");
        ThemedReactContext context = surfaceManagerEnforced.getContext();
        context.getClass();
        return TextLayoutManager.createPreparedLayout(context, readableMapBuffer, readableMapBuffer2, LayoutMetricsConversions.getYogaSize(f10, f11), LayoutMetricsConversions.getYogaMeasureMode(f10, f11), LayoutMetricsConversions.getYogaSize(f12, f13), LayoutMetricsConversions.getYogaMeasureMode(f12, f13), nativeModule instanceof ReactTextViewManagerCallback ? (ReactTextViewManagerCallback) nativeModule : null);
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, String str, @Nullable WritableMap writableMap) {
        receiveEvent(-1, i7, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Nullable
    @Deprecated
    public String resolveCustomDirectEventName(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(ViewProps.TOP)) {
            return str;
        }
        return ViewProps.ON + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    @Nullable
    public View resolveView(int i7) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i7);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @ThreadConfined("ANY")
    public void sendAccessibilityEvent(int i7, int i10) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i7, i10));
    }

    @AnyThread
    @ThreadConfined("ANY")
    public void sendAccessibilityEventFromJS(int i7, int i10, String str) {
        int i11;
        if ("focus".equals(str)) {
            i11 = 8;
        } else if ("windowStateChange".equals(str)) {
            i11 = 32;
        } else if (EventsConstants.CLICK.equals(str)) {
            i11 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException(G.o("sendAccessibilityEventFromJS: invalid eventType ", str));
            }
            i11 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i7, i10, i11));
    }

    public void setBinding(FabricUIManagerBinding fabricUIManagerBinding) {
        this.mBinding = fabricUIManagerBinding;
    }

    public void setJSResponder(final int i7, final int i10, final int i11, final boolean z3) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i7);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i10, i11, z3);
                    return;
                }
                p229p2.a.h(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i7 + "]");
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return i7;
            }

            @SuppressLint({"DefaultLocale"})
            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i10), Integer.valueOf(i7));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @ThreadConfined("ANY")
    public <T extends View> int startSurface(T t, String str, @Nullable WritableMap writableMap, int i7, int i10) {
        int rootViewTag = ((ReactRoot) t).getRootViewTag();
        Context context = t.getContext();
        ThemedReactContext themedReactContext = new ThemedReactContext(this.mReactApplicationContext, context, str, rootViewTag);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            p229p2.a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, themedReactContext, t);
        Point viewportOffset = UiThreadUtil.isOnUiThread() ? RootViewUtil.getViewportOffset(t) : new Point(0, 0);
        p059e1.a.g(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, LayoutMetricsConversions.getMinSize(i7), LayoutMetricsConversions.getMaxSize(i7), LayoutMetricsConversions.getMinSize(i10), LayoutMetricsConversions.getMaxSize(i10), viewportOffset.x, viewportOffset.y, I18nUtil.getInstance().isRTL(context), I18nUtil.getInstance().doLeftAndRightSwapInRTL(context));
        return rootViewTag;
    }

    public void stopSurface(SurfaceHandlerBinding surfaceHandlerBinding) {
        if (!surfaceHandlerBinding.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(surfaceHandlerBinding.getSurfaceId());
        p059e1.a.g(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.stopSurfaceWithSurfaceHandler(surfaceHandlerBinding);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i7, int i10) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i7);
        if (surfaceManager != null) {
            surfaceManager.sweepActiveTouchForTag(i10);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @ThreadConfined("UI")
    @UiThread
    public void synchronouslyUpdateViewOnUIThread(final int i7, final ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i10 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i10 + 1;
        MountItem mountItem = new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.2
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                try {
                    mountingManager.updateProps(i7, readableMap);
                } catch (Exception unused) {
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i7), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
            }
        };
        if (!this.mMountingManager.getViewExists(i7)) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i10);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            p229p2.a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i7), IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
        }
        mountItem.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ThreadConfined("UI")
    @UiThread
    public void updateRootLayoutSpecs(int i7, int i10, int i11, int i12, int i13) {
        boolean z3;
        boolean zDoLeftAndRightSwapInRTL;
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            p229p2.a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i7));
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i7);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException(G.m(i7, "Cannot updateRootLayoutSpecs on surfaceId that does not exist: ")));
            return;
        }
        ThemedReactContext context = surfaceManager.getContext();
        if (context != null) {
            boolean zIsRTL = I18nUtil.getInstance().isRTL(context);
            zDoLeftAndRightSwapInRTL = I18nUtil.getInstance().doLeftAndRightSwapInRTL(context);
            z3 = zIsRTL;
        } else {
            z3 = false;
            zDoLeftAndRightSwapInRTL = false;
        }
        p059e1.a.g(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.setConstraints(i7, LayoutMetricsConversions.getMinSize(i10), LayoutMetricsConversions.getMaxSize(i10), LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), i12, i13, z3, zDoLeftAndRightSwapInRTL);
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @ThreadConfined("ANY")
    @Deprecated
    public void dispatchCommand(int i7, String str, @Nullable ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, int i10, String str, @Nullable WritableMap writableMap) {
        receiveEvent(i7, i10, str, false, writableMap, 2);
    }

    @AnyThread
    @ThreadConfined("ANY")
    @Deprecated
    public void dispatchCommand(int i7, int i10, int i11, @Nullable ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i7, i10, i11, readableArray));
    }

    public void receiveEvent(int i7, int i10, String str, boolean z3, @Nullable WritableMap writableMap, int i11) {
        receiveEvent(i7, i10, str, z3, writableMap, i11, false);
    }

    @Override // com.facebook.react.uimanager.events.SynchronousEventReceiver
    public void receiveEvent(int i7, int i10, String str, boolean z3, @Nullable WritableMap writableMap, int i11, boolean z8) {
        if (ReactBuildConfig.DEBUG && i7 == -1) {
            p229p2.a.d(TAG, "Emitted event without surfaceId: [%d] %s", Integer.valueOf(i10), str);
        }
        if (this.mDestroyed) {
            p229p2.a.h(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i7, i10);
        if (eventEmitter == null) {
            if (this.mMountingManager.getViewExists(i10)) {
                this.mMountingManager.enqueuePendingEvent(i7, i10, str, z3, writableMap, i11);
                return;
            }
            p229p2.a.k(TAG, "Unable to invoke event: " + str + " for reactTag: " + i10);
            return;
        }
        if (z8) {
            UiThreadUtil.assertOnUiThread();
            if (this.mSynchronousEvents.add(new SynchronousEvent(i7, i10, str))) {
                eventEmitter.dispatchEventSynchronously(str, writableMap);
                return;
            }
            return;
        }
        if (z3) {
            eventEmitter.dispatchUnique(str, writableMap);
        } else {
            eventEmitter.dispatch(str, writableMap, i11);
        }
    }

    @AnyThread
    @ThreadConfined("ANY")
    public void dispatchCommand(int i7, int i10, String str, @Nullable ReadableArray readableArray) {
        if (ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i7, i10, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i7, i10, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @ThreadConfined("ANY")
    public void stopSurface(int i7) {
        this.mMountingManager.stopSurface(i7);
        p059e1.a.g(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.stopSurface(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startSurface(SurfaceHandlerBinding surfaceHandlerBinding, Context context, @Nullable View view) {
        int nextRootViewTag;
        if (view instanceof ReactRoot) {
            nextRootViewTag = ((ReactRoot) view).getRootViewTag();
        } else {
            nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        }
        this.mMountingManager.startSurface(nextRootViewTag, new ThemedReactContext(this.mReactApplicationContext, context, surfaceHandlerBinding.getModuleName(), nextRootViewTag), view);
        p059e1.a.g(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurfaceWithSurfaceHandler(nextRootViewTag, surfaceHandlerBinding, view != 0);
    }
}
