package com.facebook.react.uimanager;

import E.AbstractC0198c;
import H3.e;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class UIViewOperationQueue {
    public static final int DEFAULT_MIN_TIME_LEFT_IN_FRAME_FOR_NONBATCHED_OPERATION_MS = 8;
    private static final String TAG;
    private long mCreateViewCount;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final NativeViewHierarchyManager mNativeViewHierarchyManager;
    private long mNonBatchedExecutionTotalTime;
    private long mProfiledBatchBatchedExecutionTime;
    private long mProfiledBatchCommitEndTime;
    private long mProfiledBatchCommitStartTime;
    private long mProfiledBatchDispatchViewUpdatesTime;
    private long mProfiledBatchLayoutTime;
    private long mProfiledBatchNonBatchedExecutionTime;
    private long mProfiledBatchRunEndTime;
    private long mProfiledBatchRunStartTime;
    private final ReactApplicationContext mReactApplicationContext;
    private long mThreadCpuTime;
    private long mUpdatePropertiesOperationCount;

    @Nullable
    private NotThreadSafeViewHierarchyUpdateDebugListener mViewHierarchyUpdateDebugListener;
    private final int[] mMeasureBuffer = new int[4];
    private final Object mDispatchRunnablesLock = new Object();
    private final Object mNonBatchedOperationsLock = new Object();
    private ArrayList<DispatchCommandViewOperation> mViewCommandOperations = new ArrayList<>();
    private ArrayList<UIOperation> mOperations = new ArrayList<>();

    @GuardedBy("mDispatchRunnablesLock")
    private ArrayList<Runnable> mDispatchUIRunnables = new ArrayList<>();

    @GuardedBy("mNonBatchedOperationsLock")
    private ArrayDeque<UIOperation> mNonBatchedOperations = new ArrayDeque<>();
    private boolean mIsDispatchUIFrameCallbackEnqueued = false;
    private boolean mIsInIllegalUIState = false;
    private boolean mIsProfilingNextBatch = false;

    public static abstract class AnimationOperation implements UIOperation {
        protected final int mAnimationID;

        public AnimationOperation(int i7) {
            this.mAnimationID = i7;
        }
    }

    public final class ChangeJSResponderOperation extends ViewOperation {
        private final boolean mBlockNativeResponder;
        private final boolean mClearResponder;
        private final int mInitialTag;

        public ChangeJSResponderOperation(int i7, int i10, boolean z3, boolean z8) {
            super(i7);
            this.mInitialTag = i10;
            this.mClearResponder = z3;
            this.mBlockNativeResponder = z8;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            if (this.mClearResponder) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearJSResponder();
            } else {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.setJSResponder(this.mTag, this.mInitialTag, this.mBlockNativeResponder);
            }
        }
    }

    public class ConfigureLayoutAnimationOperation implements UIOperation {
        private final Callback mAnimationComplete;
        private final ReadableMap mConfig;

        public /* synthetic */ ConfigureLayoutAnimationOperation(UIViewOperationQueue uIViewOperationQueue, ReadableMap readableMap, Callback callback, int i7) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.configureLayoutAnimation(this.mConfig, this.mAnimationComplete);
        }

        private ConfigureLayoutAnimationOperation(ReadableMap readableMap, Callback callback) {
            this.mConfig = readableMap;
            this.mAnimationComplete = callback;
        }
    }

    public final class CreateViewOperation extends ViewOperation {
        private final String mClassName;

        @Nullable
        private final ReactStylesDiffMap mInitialProps;
        private final ThemedReactContext mThemedContext;

        public CreateViewOperation(ThemedReactContext themedReactContext, int i7, @Nullable String str, ReactStylesDiffMap reactStylesDiffMap) {
            super(i7);
            this.mThemedContext = themedReactContext;
            this.mClassName = str;
            this.mInitialProps = reactStylesDiffMap;
            int i10 = this.mTag;
            Intrinsics.checkNotNullParameter("createView", "sectionName");
            Intrinsics.checkNotNullParameter("createView", "sectionName");
            AbstractC0198c.c("createView", i10);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            int i7 = this.mTag;
            Intrinsics.checkNotNullParameter("createView", "sectionName");
            Intrinsics.checkNotNullParameter("createView", "sectionName");
            AbstractC0198c.r("createView", i7);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.createView(this.mThemedContext, this.mTag, this.mClassName, this.mInitialProps);
        }
    }

    @Deprecated
    public final class DispatchCommandOperation extends ViewOperation implements DispatchCommandViewOperation {

        @Nullable
        private final ReadableArray mArgs;
        private final int mCommand;
        private int numRetries;

        public DispatchCommandOperation(int i7, @Nullable int i10, ReadableArray readableArray) {
            super(i7);
            this.numRetries = 0;
            this.mCommand = i10;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    public interface DispatchCommandViewOperation {
        void executeWithExceptions();

        int getRetries();

        void incrementRetries();
    }

    public final class DispatchStringCommandOperation extends ViewOperation implements DispatchCommandViewOperation {

        @Nullable
        private final ReadableArray mArgs;
        private final String mCommand;
        private int numRetries;

        public DispatchStringCommandOperation(int i7, @Nullable String str, ReadableArray readableArray) {
            super(i7);
            this.numRetries = 0;
            this.mCommand = str;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    public class DispatchUIFrameCallback extends GuardedFrameCallback {
        private static final int FRAME_TIME_MS = 16;
        private final int mMinTimeLeftInFrameForNonBatchedOperationMs;

        public /* synthetic */ DispatchUIFrameCallback(UIViewOperationQueue uIViewOperationQueue, ReactApplicationContext reactApplicationContext, int i7) {
            this((ReactContext) reactApplicationContext, i7);
        }

        private void dispatchPendingNonBatchedOperations(long j6) throws Exception {
            UIOperation uIOperation;
            while (16 - ((System.nanoTime() - j6) / 1000000) >= this.mMinTimeLeftInFrameForNonBatchedOperationMs) {
                synchronized (UIViewOperationQueue.this.mNonBatchedOperationsLock) {
                    try {
                        if (UIViewOperationQueue.this.mNonBatchedOperations.isEmpty()) {
                            return;
                        } else {
                            uIOperation = (UIOperation) UIViewOperationQueue.this.mNonBatchedOperations.pollFirst();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    uIOperation.execute();
                    UIViewOperationQueue uIViewOperationQueue = UIViewOperationQueue.this;
                    uIViewOperationQueue.mNonBatchedExecutionTotalTime = (SystemClock.uptimeMillis() - jUptimeMillis) + uIViewOperationQueue.mNonBatchedExecutionTotalTime;
                } catch (Exception e10) {
                    UIViewOperationQueue.this.mIsInIllegalUIState = true;
                    throw e10;
                }
            }
        }

        @Override // com.facebook.react.uimanager.GuardedFrameCallback
        public void doFrameGuarded(long j6) {
            if (UIViewOperationQueue.this.mIsInIllegalUIState) {
                p229p2.a.v("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            Intrinsics.checkNotNullParameter("dispatchNonBatchedUIOperations", "sectionName");
            Trace.beginSection(AbstractC0198c.m0("dispatchNonBatchedUIOperations"));
            try {
                dispatchPendingNonBatchedOperations(j6);
                Trace.endSection();
                UIViewOperationQueue.this.flushPendingBatches();
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        private DispatchUIFrameCallback(ReactContext reactContext, int i7) {
            super(reactContext);
            this.mMinTimeLeftInFrameForNonBatchedOperationMs = i7;
        }
    }

    public final class FindTargetForTouchOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        public /* synthetic */ FindTargetForTouchOperation(UIViewOperationQueue uIViewOperationQueue, int i7, float f10, float f11, Callback callback, int i10) {
            this(i7, f10, f11, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float f10 = UIViewOperationQueue.this.mMeasureBuffer[0];
                float f11 = UIViewOperationQueue.this.mMeasureBuffer[1];
                int iFindTargetTagForTouch = UIViewOperationQueue.this.mNativeViewHierarchyManager.findTargetTagForTouch(this.mReactTag, this.mTargetX, this.mTargetY);
                try {
                    UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(iFindTargetTagForTouch, UIViewOperationQueue.this.mMeasureBuffer);
                    this.mCallback.invoke(Integer.valueOf(iFindTargetTagForTouch), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0] - f10)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1] - f11)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
                } catch (IllegalViewOperationException unused) {
                    this.mCallback.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private FindTargetForTouchOperation(int i7, float f10, float f11, Callback callback) {
            this.mReactTag = i7;
            this.mTargetX = f10;
            this.mTargetY = f11;
            this.mCallback = callback;
        }
    }

    public final class LayoutUpdateFinishedOperation implements UIOperation {
        private final UIImplementation.LayoutUpdateListener mListener;
        private final ReactShadowNode mNode;

        public /* synthetic */ LayoutUpdateFinishedOperation(UIViewOperationQueue uIViewOperationQueue, ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener, int i7) {
            this(reactShadowNode, layoutUpdateListener);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mListener.onLayoutUpdated(this.mNode);
        }

        private LayoutUpdateFinishedOperation(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
            this.mNode = reactShadowNode;
            this.mListener = layoutUpdateListener;
        }
    }

    public final class ManageChildrenOperation extends ViewOperation {

        @Nullable
        private final int[] mIndicesToRemove;

        @Nullable
        private final int[] mTagsToDelete;

        @Nullable
        private final ViewAtIndex[] mViewsToAdd;

        public ManageChildrenOperation(@Nullable int i7, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
            super(i7);
            this.mIndicesToRemove = iArr;
            this.mViewsToAdd = viewAtIndexArr;
            this.mTagsToDelete = iArr2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() throws Throwable {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.manageChildren(this.mTag, this.mIndicesToRemove, this.mViewsToAdd, this.mTagsToDelete);
        }
    }

    public final class MeasureInWindowOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        public /* synthetic */ MeasureInWindowOperation(UIViewOperationQueue uIViewOperationQueue, int i7, Callback callback, int i10) {
            this(i7, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measureInWindow(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureInWindowOperation(int i7, Callback callback) {
            this.mReactTag = i7;
            this.mCallback = callback;
        }
    }

    public final class MeasureOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        public /* synthetic */ MeasureOperation(UIViewOperationQueue uIViewOperationQueue, int i7, Callback callback, int i10) {
            this(i7, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(0, 0, Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureOperation(int i7, Callback callback) {
            this.mReactTag = i7;
            this.mCallback = callback;
        }
    }

    public final class RemoveRootViewOperation extends ViewOperation {
        public RemoveRootViewOperation(int i7) {
            super(i7);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.removeRootView(this.mTag);
        }
    }

    public final class SendAccessibilityEvent extends ViewOperation {
        private final int mEventType;

        public /* synthetic */ SendAccessibilityEvent(UIViewOperationQueue uIViewOperationQueue, int i7, int i10, int i11) {
            this(i7, i10);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.sendAccessibilityEvent(this.mTag, this.mEventType);
            } catch (RetryableMountingLayerException e10) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, e10);
            }
        }

        private SendAccessibilityEvent(int i7, int i10) {
            super(i7);
            this.mEventType = i10;
        }
    }

    public final class SetChildrenOperation extends ViewOperation {
        private final ReadableArray mChildrenTags;

        public SetChildrenOperation(int i7, ReadableArray readableArray) {
            super(i7);
            this.mChildrenTags = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setChildren(this.mTag, this.mChildrenTags);
        }
    }

    public class SetLayoutAnimationEnabledOperation implements UIOperation {
        private final boolean mEnabled;

        public /* synthetic */ SetLayoutAnimationEnabledOperation(UIViewOperationQueue uIViewOperationQueue, boolean z3, int i7) {
            this(z3);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setLayoutAnimationEnabled(this.mEnabled);
        }

        private SetLayoutAnimationEnabledOperation(boolean z3) {
            this.mEnabled = z3;
        }
    }

    public class UIBlockOperation implements UIOperation {
        private final UIBlock mBlock;

        public UIBlockOperation(UIBlock uIBlock) {
            this.mBlock = uIBlock;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mBlock.execute(UIViewOperationQueue.this.mNativeViewHierarchyManager);
        }
    }

    public interface UIOperation {
        void execute();
    }

    public final class UpdateInstanceHandleOperation extends ViewOperation {
        private final long mInstanceHandle;

        public /* synthetic */ UpdateInstanceHandleOperation(UIViewOperationQueue uIViewOperationQueue, int i7, long j6, int i10) {
            this(i7, j6);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateInstanceHandle(this.mTag, this.mInstanceHandle);
        }

        private UpdateInstanceHandleOperation(int i7, long j6) {
            super(i7);
            this.mInstanceHandle = j6;
        }
    }

    public final class UpdateLayoutOperation extends ViewOperation {
        private final int mHeight;
        private final e mLayoutDirection;
        private final int mParentTag;
        private final int mWidth;
        private final int mX;
        private final int mY;

        public UpdateLayoutOperation(int i7, int i10, int i11, int i12, int i13, int i14, e eVar) {
            super(i10);
            this.mParentTag = i7;
            this.mX = i11;
            this.mY = i12;
            this.mWidth = i13;
            this.mHeight = i14;
            this.mLayoutDirection = eVar;
            int i15 = this.mTag;
            Intrinsics.checkNotNullParameter("updateLayout", "sectionName");
            Intrinsics.checkNotNullParameter("updateLayout", "sectionName");
            AbstractC0198c.c("updateLayout", i15);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() throws Throwable {
            int i7 = this.mTag;
            Intrinsics.checkNotNullParameter("updateLayout", "sectionName");
            Intrinsics.checkNotNullParameter("updateLayout", "sectionName");
            AbstractC0198c.r("updateLayout", i7);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateLayout(this.mParentTag, this.mTag, this.mX, this.mY, this.mWidth, this.mHeight, this.mLayoutDirection);
        }
    }

    public final class UpdatePropertiesOperation extends ViewOperation {
        private final ReactStylesDiffMap mProps;

        public /* synthetic */ UpdatePropertiesOperation(UIViewOperationQueue uIViewOperationQueue, int i7, ReactStylesDiffMap reactStylesDiffMap, int i10) {
            this(i7, reactStylesDiffMap);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateProperties(this.mTag, this.mProps);
        }

        private UpdatePropertiesOperation(int i7, ReactStylesDiffMap reactStylesDiffMap) {
            super(i7);
            this.mProps = reactStylesDiffMap;
        }
    }

    public final class UpdateViewExtraData extends ViewOperation {
        private final Object mExtraData;

        public UpdateViewExtraData(int i7, Object obj) {
            super(i7);
            this.mExtraData = obj;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewExtraData(this.mTag, this.mExtraData);
        }
    }

    public abstract class ViewOperation implements UIOperation {
        public int mTag;

        public ViewOperation(int i7) {
            this.mTag = i7;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("UIViewOperationQueue", LegacyArchitectureLogLevel.ERROR);
        TAG = "UIViewOperationQueue";
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i7) {
        this.mNativeViewHierarchyManager = nativeViewHierarchyManager;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(this, reactApplicationContext, i7 == -1 ? 8 : i7);
        this.mReactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushPendingBatches() {
        if (this.mIsInIllegalUIState) {
            p229p2.a.v("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.mDispatchRunnablesLock) {
            if (this.mDispatchUIRunnables.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.mDispatchUIRunnables;
            this.mDispatchUIRunnables = new ArrayList<>();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.mIsProfilingNextBatch) {
                this.mProfiledBatchBatchedExecutionTime = SystemClock.uptimeMillis() - jUptimeMillis;
                this.mProfiledBatchNonBatchedExecutionTime = this.mNonBatchedExecutionTotalTime;
                this.mIsProfilingNextBatch = false;
                Intrinsics.checkNotNullParameter("batchedExecutionTime", "sectionName");
                Intrinsics.checkNotNullParameter("batchedExecutionTime", "sectionName");
                AbstractC0198c.c("batchedExecutionTime", 0);
                Intrinsics.checkNotNullParameter("batchedExecutionTime", "sectionName");
                AbstractC0198c.r("batchedExecutionTime", 0);
            }
            this.mNonBatchedExecutionTotalTime = 0L;
        }
    }

    public void addRootView(int i7, View view) {
        this.mNativeViewHierarchyManager.addRootView(i7, view);
    }

    public void dispatchViewUpdates(final int i7, final long j6, final long j10) {
        ArrayList<DispatchCommandViewOperation> arrayList;
        final ArrayList<UIOperation> arrayList2;
        p1.d dVarD = AbstractC0198c.d("UIViewOperationQueue.dispatchViewUpdates");
        dVarD.b(i7, "batchId");
        dVarD.e();
        try {
            final long jUptimeMillis = SystemClock.uptimeMillis();
            final long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque<UIOperation> arrayDeque = null;
            if (this.mViewCommandOperations.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = this.mViewCommandOperations;
                this.mViewCommandOperations = new ArrayList<>();
            }
            if (this.mOperations.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<UIOperation> arrayList3 = this.mOperations;
                this.mOperations = new ArrayList<>();
                arrayList2 = arrayList3;
            }
            synchronized (this.mNonBatchedOperationsLock) {
                try {
                    if (!this.mNonBatchedOperations.isEmpty()) {
                        arrayDeque = this.mNonBatchedOperations;
                        this.mNonBatchedOperations = new ArrayDeque<>();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener = this.mViewHierarchyUpdateDebugListener;
            if (notThreadSafeViewHierarchyUpdateDebugListener != null) {
                notThreadSafeViewHierarchyUpdateDebugListener.onViewHierarchyUpdateEnqueued();
            }
            final ArrayDeque<UIOperation> arrayDeque2 = arrayDeque;
            final ArrayList<DispatchCommandViewOperation> arrayList4 = arrayList;
            Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.UIViewOperationQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    p1.d dVarD2 = AbstractC0198c.d("DispatchUI");
                    dVarD2.b(i7, "BatchId");
                    dVarD2.e();
                    try {
                        try {
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            ArrayList<DispatchCommandViewOperation> arrayList5 = arrayList4;
                            if (arrayList5 != null) {
                                for (DispatchCommandViewOperation dispatchCommandViewOperation : arrayList5) {
                                    try {
                                        dispatchCommandViewOperation.executeWithExceptions();
                                    } catch (RetryableMountingLayerException e10) {
                                        if (dispatchCommandViewOperation.getRetries() == 0) {
                                            dispatchCommandViewOperation.incrementRetries();
                                            UIViewOperationQueue.this.mViewCommandOperations.add(dispatchCommandViewOperation);
                                        } else {
                                            ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new ReactNoCrashSoftException(e10));
                                        }
                                    } catch (Throwable th2) {
                                        ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, th2);
                                    }
                                }
                            }
                            ArrayDeque arrayDeque3 = arrayDeque2;
                            if (arrayDeque3 != null) {
                                Iterator it = arrayDeque3.iterator();
                                while (it.hasNext()) {
                                    ((UIOperation) it.next()).execute();
                                }
                            }
                            ArrayList arrayList6 = arrayList2;
                            if (arrayList6 != null) {
                                Iterator it2 = arrayList6.iterator();
                                while (it2.hasNext()) {
                                    ((UIOperation) it2.next()).execute();
                                }
                            }
                            if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                                UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j6;
                                UIViewOperationQueue.this.mProfiledBatchCommitEndTime = SystemClock.uptimeMillis();
                                UIViewOperationQueue.this.mProfiledBatchLayoutTime = j10;
                                UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = jUptimeMillis;
                                UIViewOperationQueue.this.mProfiledBatchRunStartTime = jUptimeMillis2;
                                UIViewOperationQueue uIViewOperationQueue = UIViewOperationQueue.this;
                                uIViewOperationQueue.mProfiledBatchRunEndTime = uIViewOperationQueue.mProfiledBatchCommitEndTime;
                                UIViewOperationQueue.this.mThreadCpuTime = jCurrentThreadTimeMillis;
                                long unused = UIViewOperationQueue.this.mProfiledBatchCommitStartTime;
                                Intrinsics.checkNotNullParameter("delayBeforeDispatchViewUpdates", "sectionName");
                                Intrinsics.checkNotNullParameter("delayBeforeDispatchViewUpdates", "sectionName");
                                AbstractC0198c.c("delayBeforeDispatchViewUpdates", 0);
                                UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime;
                                Intrinsics.checkNotNullParameter("delayBeforeDispatchViewUpdates", "sectionName");
                                Intrinsics.checkNotNullParameter("delayBeforeDispatchViewUpdates", "sectionName");
                                AbstractC0198c.r("delayBeforeDispatchViewUpdates", 0);
                                UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime;
                                Intrinsics.checkNotNullParameter("delayBeforeBatchRunStart", "sectionName");
                                Intrinsics.checkNotNullParameter("delayBeforeBatchRunStart", "sectionName");
                                AbstractC0198c.c("delayBeforeBatchRunStart", 0);
                                UIViewOperationQueue.this.mProfiledBatchRunStartTime;
                                Intrinsics.checkNotNullParameter("delayBeforeBatchRunStart", "sectionName");
                                Intrinsics.checkNotNullParameter("delayBeforeBatchRunStart", "sectionName");
                                AbstractC0198c.r("delayBeforeBatchRunStart", 0);
                            }
                            UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                            if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                                UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                            }
                            Trace.endSection();
                        } catch (Exception e11) {
                            UIViewOperationQueue.this.mIsInIllegalUIState = true;
                            throw e11;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            };
            p1.d dVarD2 = AbstractC0198c.d("acquiring mDispatchRunnablesLock");
            dVarD2.b(i7, "batchId");
            dVarD2.e();
            synchronized (this.mDispatchRunnablesLock) {
                Trace.endSection();
                this.mDispatchUIRunnables.add(runnable);
            }
            if (!this.mIsDispatchUIFrameCallbackEnqueued) {
                UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.uimanager.UIViewOperationQueue.2
                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        UIViewOperationQueue.this.flushPendingBatches();
                    }
                });
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void enqueueClearJSResponder() {
        this.mOperations.add(new ChangeJSResponderOperation(0, 0, true, false));
    }

    public void enqueueConfigureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new ConfigureLayoutAnimationOperation(this, readableMap, callback, 0));
    }

    public void enqueueCreateView(ThemedReactContext themedReactContext, int i7, String str, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.mNonBatchedOperationsLock) {
            this.mCreateViewCount++;
            this.mNonBatchedOperations.addLast(new CreateViewOperation(themedReactContext, i7, str, reactStylesDiffMap));
        }
    }

    @Deprecated
    public void enqueueDispatchCommand(int i7, int i10, @Nullable ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchCommandOperation(i7, i10, readableArray));
    }

    public void enqueueFindTargetForTouch(int i7, float f10, float f11, Callback callback) {
        this.mOperations.add(new FindTargetForTouchOperation(this, i7, f10, f11, callback, 0));
    }

    public void enqueueLayoutUpdateFinished(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
        this.mOperations.add(new LayoutUpdateFinishedOperation(this, reactShadowNode, layoutUpdateListener, 0));
    }

    public void enqueueManageChildren(int i7, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        this.mOperations.add(new ManageChildrenOperation(i7, iArr, viewAtIndexArr, iArr2));
    }

    public void enqueueMeasure(int i7, Callback callback) {
        this.mOperations.add(new MeasureOperation(this, i7, callback, 0));
    }

    public void enqueueMeasureInWindow(int i7, Callback callback) {
        this.mOperations.add(new MeasureInWindowOperation(this, i7, callback, 0));
    }

    public void enqueueRemoveRootView(int i7) {
        this.mOperations.add(new RemoveRootViewOperation(i7));
    }

    public void enqueueSendAccessibilityEvent(int i7, int i10) {
        this.mOperations.add(new SendAccessibilityEvent(this, i7, i10, 0));
    }

    public void enqueueSetChildren(int i7, ReadableArray readableArray) {
        this.mOperations.add(new SetChildrenOperation(i7, readableArray));
    }

    public void enqueueSetJSResponder(int i7, int i10, boolean z3) {
        this.mOperations.add(new ChangeJSResponderOperation(i7, i10, false, z3));
    }

    public void enqueueSetLayoutAnimationEnabled(boolean z3) {
        this.mOperations.add(new SetLayoutAnimationEnabledOperation(this, z3, 0));
    }

    public void enqueueUIBlock(UIBlock uIBlock) {
        this.mOperations.add(new UIBlockOperation(uIBlock));
    }

    public void enqueueUIOperation(UIOperation uIOperation) {
        SoftAssertions.assertNotNull(uIOperation);
        this.mOperations.add(uIOperation);
    }

    public void enqueueUpdateExtraData(int i7, Object obj) {
        this.mOperations.add(new UpdateViewExtraData(i7, obj));
    }

    public void enqueueUpdateInstanceHandle(int i7, long j6) {
        this.mOperations.add(new UpdateInstanceHandleOperation(this, i7, j6, 0));
    }

    @Deprecated
    public void enqueueUpdateLayout(int i7, int i10, int i11, int i12, int i13, int i14) {
        enqueueUpdateLayout(i7, i10, i11, i12, i13, i14, e.INHERIT);
    }

    public void enqueueUpdateProperties(int i7, String str, ReactStylesDiffMap reactStylesDiffMap) {
        this.mUpdatePropertiesOperationCount++;
        this.mOperations.add(new UpdatePropertiesOperation(this, i7, reactStylesDiffMap, 0));
    }

    public NativeViewHierarchyManager getNativeViewHierarchyManager() {
        return this.mNativeViewHierarchyManager;
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mProfiledBatchCommitStartTime));
        map.put("CommitEndTime", Long.valueOf(this.mProfiledBatchCommitEndTime));
        map.put("LayoutTime", Long.valueOf(this.mProfiledBatchLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mProfiledBatchDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mProfiledBatchRunStartTime));
        map.put("RunEndTime", Long.valueOf(this.mProfiledBatchRunEndTime));
        map.put("BatchedExecutionTime", Long.valueOf(this.mProfiledBatchBatchedExecutionTime));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.mProfiledBatchNonBatchedExecutionTime));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.mThreadCpuTime));
        map.put("CreateViewCount", Long.valueOf(this.mCreateViewCount));
        map.put("UpdatePropsCount", Long.valueOf(this.mUpdatePropertiesOperationCount));
        return map;
    }

    public boolean isEmpty() {
        return this.mOperations.isEmpty() && this.mViewCommandOperations.isEmpty();
    }

    public void pauseFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = false;
        ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
        flushPendingBatches();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperations.add(0, new UIBlockOperation(uIBlock));
    }

    public void profileNextBatch() {
        this.mIsProfilingNextBatch = true;
        this.mProfiledBatchCommitStartTime = 0L;
        this.mCreateViewCount = 0L;
        this.mUpdatePropertiesOperationCount = 0L;
    }

    public void resumeFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = true;
        ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mViewHierarchyUpdateDebugListener = notThreadSafeViewHierarchyUpdateDebugListener;
    }

    public void enqueueUpdateLayout(int i7, int i10, int i11, int i12, int i13, int i14, e eVar) {
        this.mOperations.add(new UpdateLayoutOperation(i7, i10, i11, i12, i13, i14, eVar));
    }

    public void enqueueDispatchCommand(int i7, String str, @Nullable ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchStringCommandOperation(i7, str, readableArray));
    }
}
