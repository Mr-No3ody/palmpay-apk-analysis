package com.facebook.react.uimanager;

import C0.G;
import E.AbstractC0198c;
import H3.e;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class UIImplementation {
    protected final EventDispatcher mEventDispatcher;
    private long mLastCalculateLayoutTime;

    @Nullable
    protected LayoutUpdateListener mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    private final UIViewOperationQueue mOperationsQueue;
    protected final ReactApplicationContext mReactContext;
    protected final ShadowNodeRegistry mShadowNodeRegistry;
    private final ViewManagerRegistry mViewManagers;
    private volatile boolean mViewOperationsEnabled;
    protected Object uiImplementationThreadLock;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("UIImplementation", LegacyArchitectureLogLevel.ERROR);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i7) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i7), eventDispatcher);
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        NativeModule nativeModule = this.mViewManagers.get(reactShadowNode.getViewClass());
        p059e1.a.f(nativeModule);
        if (!(nativeModule instanceof IViewManagerWithChildren)) {
            throw new IllegalViewOperationException("Trying to use view " + reactShadowNode.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        if (((IViewManagerWithChildren) nativeModule).needsCustomLayoutForChildren()) {
            throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + reactShadowNode.getViewClass() + "). Use measure instead.");
        }
    }

    private boolean checkOrAssertViewExists(int i7, String str) {
        if (this.mShadowNodeRegistry.getNode(i7) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i7 + ", since the view does not exist";
        if (ReactBuildConfig.DEBUG) {
            throw new IllegalViewOperationException(str2);
        }
        p229p2.a.v("ReactNative", str2);
        return false;
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int iRound;
        int iRound2;
        if (reactShadowNode == reactShadowNode2 || reactShadowNode.isVirtual()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(reactShadowNode.getLayoutX());
            iRound2 = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                p059e1.a.f(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                iRound += Math.round(parent.getLayoutX());
                iRound2 += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i7 = 0; i7 < reactShadowNode.getChildCount(); i7++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i7));
            }
            reactShadowNode.onBeforeLayout(this.mNativeViewHierarchyOptimizer);
        }
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f10, float f11, List<ReactShadowNode> list) {
        if (reactShadowNode.hasUpdates()) {
            if (reactShadowNode.dispatchUpdatesWillChangeLayout(f10, f11) && reactShadowNode.shouldNotifyOnLayout() && !this.mShadowNodeRegistry.isRootNode(reactShadowNode.getReactTag())) {
                list.add(reactShadowNode);
            }
            Iterable<? extends ReactShadowNode> iterableCalculateLayoutOnChildren = reactShadowNode.calculateLayoutOnChildren();
            if (iterableCalculateLayoutOnChildren != null) {
                Iterator<? extends ReactShadowNode> it = iterableCalculateLayoutOnChildren.iterator();
                while (it.hasNext()) {
                    applyUpdatesRecursive(it.next(), reactShadowNode.getLayoutX() + f10, reactShadowNode.getLayoutY() + f11, list);
                }
            }
            reactShadowNode.dispatchUpdates(f10, f11, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer);
            reactShadowNode.markUpdateSeen();
            this.mNativeViewHierarchyOptimizer.onViewUpdatesCompleted(reactShadowNode);
        }
    }

    public void calculateRootLayout(ReactShadowNode reactShadowNode) {
        p1.d dVarD = AbstractC0198c.d("cssRoot.calculateLayout");
        dVarD.b(reactShadowNode.getReactTag(), "rootTag");
        dVarD.e();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = reactShadowNode.getWidthMeasureSpec().intValue();
            int iIntValue2 = reactShadowNode.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            reactShadowNode.calculateLayout(size2, size);
        } finally {
            Trace.endSection();
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback);
    }

    public ReactShadowNode createRootShadowNode() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(e.RTL);
        }
        reactShadowNodeImpl.setViewClassName(Consts.SUFFIX_ROOT);
        return reactShadowNodeImpl;
    }

    public ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public void createView(int i7, String str, int i10, ReadableMap readableMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode<?> reactShadowNodeCreateShadowNode = createShadowNode(str);
                    ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
                    p059e1.a.g(node, "Root node with tag " + i10 + " doesn't exist");
                    reactShadowNodeCreateShadowNode.setReactTag(i7);
                    reactShadowNodeCreateShadowNode.setViewClassName(str);
                    reactShadowNodeCreateShadowNode.setRootTag(node.getReactTag());
                    reactShadowNodeCreateShadowNode.setThemedContext(node.getThemedContext());
                    this.mShadowNodeRegistry.addNode(reactShadowNodeCreateShadowNode);
                    if (readableMap != null) {
                        reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                        reactShadowNodeCreateShadowNode.updateProperties(reactStylesDiffMap);
                    } else {
                        reactStylesDiffMap = null;
                    }
                    handleCreateView(reactShadowNodeCreateShadowNode, i10, reactStylesDiffMap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Deprecated
    public void dispatchViewManagerCommand(int i7, int i10, @Nullable ReadableArray readableArray) {
        if (checkOrAssertViewExists(i7, G.m(i10, "dispatchViewManagerCommand: "))) {
            this.mOperationsQueue.enqueueDispatchCommand(i7, i10, readableArray);
        }
    }

    public void dispatchViewUpdates(int i7) {
        p1.d dVarD = AbstractC0198c.d("UIImplementation.dispatchViewUpdates");
        dVarD.b(i7, "batchId");
        dVarD.e();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i7, jUptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            Trace.endSection();
        }
    }

    public void findSubviewIn(int i7, float f10, float f11, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i7, f10, f11, callback);
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public int getRootViewNum() {
        return this.mOperationsQueue.getNativeViewHierarchyManager().getRootViewNum();
    }

    public UIViewOperationQueue getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i7, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
    }

    public void manageChildren(int i7, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        ReadableArray readableArray6 = readableArray;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
                    int size = readableArray6 == null ? 0 : readableArray6.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                    }
                    int i10 = size + size2;
                    ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[i10];
                    int i11 = size + size3;
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        p059e1.a.f(readableArray6);
                        p059e1.a.f(readableArray2);
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = size;
                            int i14 = readableArray6.getInt(i12);
                            int reactTag = node.getChildAt(i14).getReactTag();
                            viewAtIndexArr[i12] = new ViewAtIndex(reactTag, readableArray2.getInt(i12));
                            iArr[i12] = i14;
                            iArr2[i12] = reactTag;
                            i12++;
                            readableArray6 = readableArray;
                            size = i13;
                            i11 = i11;
                        }
                    }
                    int i15 = size;
                    int i16 = i11;
                    if (size2 > 0) {
                        p059e1.a.f(readableArray3);
                        p059e1.a.f(readableArray4);
                        for (int i17 = 0; i17 < size2; i17++) {
                            viewAtIndexArr[i15 + i17] = new ViewAtIndex(readableArray3.getInt(i17), readableArray4.getInt(i17));
                        }
                    }
                    if (size3 > 0) {
                        p059e1.a.f(readableArray5);
                        for (int i18 = 0; i18 < size3; i18++) {
                            int i19 = readableArray5.getInt(i18);
                            int reactTag2 = node.getChildAt(i19).getReactTag();
                            int i20 = i15 + i18;
                            iArr[i20] = i19;
                            iArr2[i20] = reactTag2;
                            iArr3[i18] = reactTag2;
                        }
                    }
                    Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
                    Arrays.sort(iArr);
                    int i21 = -1;
                    for (int i22 = i16 - 1; i22 >= 0; i22--) {
                        int i23 = iArr[i22];
                        if (i23 == i21) {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i7);
                        }
                        node.removeChildAt(i23);
                        i21 = iArr[i22];
                    }
                    for (int i24 = 0; i24 < i10; i24++) {
                        ViewAtIndex viewAtIndex = viewAtIndexArr[i24];
                        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag);
                        }
                        node.addChildAt(node2, viewAtIndex.mIndex);
                    }
                    this.mNativeViewHierarchyOptimizer.handleManageChildren(node, iArr, iArr2, viewAtIndexArr, iArr3);
                    for (int i25 = 0; i25 < size3; i25++) {
                        removeShadowNode(this.mShadowNodeRegistry.getNode(iArr3[i25]));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void measure(int i7, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasure(i7, callback);
        }
    }

    public void measureInWindow(int i7, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasureInWindow(i7, callback);
        }
    }

    public void measureLayout(int i7, int i10, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayout(i7, i10, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    public void measureLayoutRelativeToParent(int i7, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayoutRelativeToParent(i7, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    public void onCatalystInstanceDestroyed() {
        this.mViewOperationsEnabled = false;
        this.mViewManagers.invalidate();
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    public <T extends View> void registerRootView(T t, int i7, ThemedReactContext themedReactContext) {
        synchronized (this.uiImplementationThreadLock) {
            final ReactShadowNode reactShadowNodeCreateRootShadowNode = createRootShadowNode();
            reactShadowNodeCreateRootShadowNode.setReactTag(i7);
            reactShadowNodeCreateRootShadowNode.setThemedContext(themedReactContext);
            themedReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.UIImplementation.1
                @Override // java.lang.Runnable
                public void run() {
                    UIImplementation.this.mShadowNodeRegistry.addRootNode(reactShadowNodeCreateRootShadowNode);
                }
            });
            this.mOperationsQueue.addRootView(i7, t);
        }
    }

    public void removeLayoutUpdateListener() {
        this.mLayoutUpdateListener = null;
    }

    public void removeRootShadowNode(int i7) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.removeRootNode(i7);
        }
    }

    public void removeRootView(int i7) {
        removeRootShadowNode(i7);
        this.mOperationsQueue.enqueueRemoveRootView(i7);
    }

    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    public void replaceExistingNonRootView(int i7, int i10) {
        if (this.mShadowNodeRegistry.isRootNode(i7) || this.mShadowNodeRegistry.isRootNode(i10)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node == null) {
            throw new IllegalViewOperationException(G.m(i7, "Trying to replace unknown view tag: "));
        }
        ReactShadowNode parent = node.getParent();
        if (parent == null) {
            throw new IllegalViewOperationException(G.m(i7, "Node is not attached to a parent: "));
        }
        int iIndexOf = parent.indexOf(node);
        if (iIndexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i10);
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        writableArrayCreateArray2.pushInt(iIndexOf);
        WritableArray writableArrayCreateArray3 = Arguments.createArray();
        writableArrayCreateArray3.pushInt(iIndexOf);
        manageChildren(parent.getReactTag(), null, null, writableArrayCreateArray, writableArrayCreateArray2, writableArrayCreateArray3);
    }

    public int resolveRootTagFromReactTag(int i7) {
        if (this.mShadowNodeRegistry.isRootNode(i7)) {
            return i7;
        }
        ReactShadowNode reactShadowNodeResolveShadowNode = resolveShadowNode(i7);
        if (reactShadowNodeResolveShadowNode != null) {
            return reactShadowNodeResolveShadowNode.getRootTag();
        }
        p229p2.a.v("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i7);
        return 0;
    }

    public final ReactShadowNode resolveShadowNode(int i7) {
        return this.mShadowNodeRegistry.getNode(i7);
    }

    @Nullable
    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.getViewManagerIfExists(str);
    }

    public void sendAccessibilityEvent(int i7, int i10) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i7, i10);
    }

    public void setChildren(int i7, ReadableArray readableArray) {
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
                    for (int i10 = 0; i10 < readableArray.size(); i10++) {
                        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i10));
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i10));
                        }
                        node.addChildAt(node2, i10);
                    }
                    this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setJSResponder(int i7, boolean z3) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node == null) {
            return;
        }
        while (node.getNativeKind() == NativeKind.NONE) {
            node = node.getParent();
        }
        this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i7, z3);
    }

    public void setLayoutAnimationEnabledExperimental(boolean z3) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z3);
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
        this.mLayoutUpdateListener = layoutUpdateListener;
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mOperationsQueue.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(int i7, Object obj) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node != null) {
            node.setLocalData(obj);
            dispatchViewUpdatesIfNeeded();
        } else {
            p229p2.a.v("ReactNative", "Attempt to set local data for view with unknown tag: " + i7);
        }
    }

    public void synchronouslyUpdateViewOnUIThread(int i7, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i7, reactStylesDiffMap);
    }

    public void updateInsetsPadding(int i7, int i10, int i11, int i12, int i13) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node == null) {
            p229p2.a.v("ReactNative", "Tried to update size of non-existent tag: " + i7);
        } else {
            node.setPadding(4, i11);
            node.setPadding(1, i10);
            node.setPadding(5, i13);
            node.setPadding(3, i12);
            dispatchViewUpdatesIfNeeded();
        }
    }

    public void updateNodeSize(int i7, int i10, int i11) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node == null) {
            p229p2.a.v("ReactNative", "Tried to update size of non-existent tag: " + i7);
        } else {
            node.setStyleWidth(i10);
            node.setStyleHeight(i11);
            dispatchViewUpdatesIfNeeded();
        }
    }

    public void updateRootView(int i7, int i10, int i11) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node != null) {
            updateRootView(node, i10, i11);
            return;
        }
        p229p2.a.v("ReactNative", "Tried to update non-existent root tag: " + i7);
    }

    public void updateView(int i7, String str, ReadableMap readableMap) {
        if (this.mViewOperationsEnabled) {
            if (this.mViewManagers.get(str) == null) {
                throw new IllegalViewOperationException(G.o("Got unknown view type: ", str));
            }
            ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
            if (node == null) {
                throw new IllegalViewOperationException(G.m(i7, "Trying to update non-existent view with tag "));
            }
            if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
            }
        }
    }

    public void updateViewHierarchy() {
        Intrinsics.checkNotNullParameter("UIImplementation.updateViewHierarchy", "sectionName");
        Trace.beginSection(AbstractC0198c.m0("UIImplementation.updateViewHierarchy"));
        for (int i7 = 0; i7 < this.mShadowNodeRegistry.getRootNodeCount(); i7++) {
            try {
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(this.mShadowNodeRegistry.getRootTag(i7));
                if (node.getWidthMeasureSpec() != null && node.getHeightMeasureSpec() != null) {
                    p1.d dVarD = AbstractC0198c.d("UIImplementation.notifyOnBeforeLayoutRecursive");
                    dVarD.b(node.getReactTag(), "rootTag");
                    dVarD.e();
                    try {
                        notifyOnBeforeLayoutRecursive(node);
                        Trace.endSection();
                        calculateRootLayout(node);
                        p1.d dVarD2 = AbstractC0198c.d("UIImplementation.applyUpdatesRecursive");
                        dVarD2.b(node.getReactTag(), "rootTag");
                        dVarD2.e();
                        try {
                            ArrayList<ReactShadowNode> arrayList = new ArrayList();
                            applyUpdatesRecursive(node, 0.0f, 0.0f, arrayList);
                            for (ReactShadowNode reactShadowNode : arrayList) {
                                this.mEventDispatcher.dispatchEvent(OnLayoutEvent.obtain(-1, reactShadowNode.getReactTag(), reactShadowNode.getScreenX(), reactShadowNode.getScreenY(), reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight()));
                            }
                            Trace.endSection();
                            LayoutUpdateListener layoutUpdateListener = this.mLayoutUpdateListener;
                            if (layoutUpdateListener != null) {
                                this.mOperationsQueue.enqueueLayoutUpdateFinished(node, layoutUpdateListener);
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        Trace.endSection();
    }

    @Deprecated
    public void viewIsDescendantOf(int i7, int i10, Callback callback) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(i10);
        if (node == null || node2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(node.isDescendantOf(node2)));
        }
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.uiImplementationThreadLock = new Object();
        ShadowNodeRegistry shadowNodeRegistry = new ShadowNodeRegistry();
        this.mShadowNodeRegistry = shadowNodeRegistry;
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0L;
        this.mViewOperationsEnabled = true;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(uIViewOperationQueue, shadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i7, int i10) {
        reactShadowNode.setMeasureSpecs(i7, i10);
    }

    private void measureLayout(int i7, int i10, int[] iArr) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(i10);
        if (node == null || node2 == null) {
            StringBuilder sb2 = new StringBuilder("Tag ");
            if (node != null) {
                i7 = i10;
            }
            throw new IllegalViewOperationException(G.n(i7, " does not exist", sb2));
        }
        if (node != node2) {
            for (ReactShadowNode<?> parent = node.getParent(); parent != node2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new IllegalViewOperationException(u.h(i10, "Tag ", i7, " is not an ancestor of tag "));
                }
            }
        }
        measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
    }

    private void measureLayoutRelativeToParent(int i7, int[] iArr) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i7);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
                return;
            }
            throw new IllegalViewOperationException(F.c(i7, "View with tag ", " doesn't have a parent!"));
        }
        throw new IllegalViewOperationException(F.c(i7, "No native view for tag ", " exists!"));
    }

    public void dispatchViewManagerCommand(int i7, String str, @Nullable ReadableArray readableArray) {
        if (checkOrAssertViewExists(i7, G.o("dispatchViewManagerCommand: ", str))) {
            this.mOperationsQueue.enqueueDispatchCommand(i7, str, readableArray);
        }
    }
}
