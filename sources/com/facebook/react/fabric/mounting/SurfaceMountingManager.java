package com.facebook.react.fabric.mounting;

import C0.G;
import M.k;
import M.o;
import N8.q0;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p024b9.g;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private JSResponderHandler mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private o mTagSetForStoppedSurface;

    @Nullable
    private ThemedReactContext mThemedReactContext;
    private ViewManagerRegistry mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();

    @ThreadConfined("UI")
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();

    @ThreadConfined("UI")
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();

    @ThreadConfined("UI")
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();

    public static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;

        @Nullable
        private final WritableMap mParams;

        public PendingViewEvent(String str, @Nullable WritableMap writableMap, int i7, boolean z3) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i7;
            this.mCanCoalesceEvent = z3;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    public static class ViewState {

        @Nullable
        ReadableMap mCurrentLocalData;

        @Nullable
        ReactStylesDiffMap mCurrentProps;

        @Nullable
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;

        @Nullable
        @ThreadConfined("UI")
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;

        @Nullable
        StateWrapper mStateWrapper;

        @Nullable
        View mView;

        @Nullable
        ViewManager mViewManager;

        public /* synthetic */ ViewState(int i7, int i10) {
            this(i7);
        }

        @NonNull
        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }

        public /* synthetic */ ViewState(int i7, View view, ViewManager viewManager) {
            this(i7, view, viewManager, true);
        }

        private ViewState(int i7) {
            this(i7, null, null, false);
        }

        private ViewState(int i7, @Nullable View view, @Nullable ViewManager viewManager, boolean z3) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i7;
            this.mView = view;
            this.mIsRoot = z3;
            this.mViewManager = viewManager;
        }
    }

    static {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i7, @NonNull JSResponderHandler jSResponderHandler, @NonNull ViewManagerRegistry viewManagerRegistry, @NonNull RootViewManager rootViewManager, @NonNull MountingManager.MountItemExecutor mountItemExecutor, @NonNull ThemedReactContext themedReactContext) {
        this.mSurfaceId = i7;
        this.mJSResponderHandler = jSResponderHandler;
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = themedReactContext;
    }

    @AnyThread
    private void addRootView(@NonNull final View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager));
        ThemedReactContext themedReactContext = this.mThemedReactContext;
        a.f(themedReactContext);
        GuardedRunnable guardedRunnable = new GuardedRunnable(themedReactContext) { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                if (SurfaceMountingManager.this.isStopped()) {
                    return;
                }
                if (view.getId() == SurfaceMountingManager.this.mSurfaceId) {
                    ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + SurfaceMountingManager.this.mSurfaceId + "] on the RootView, but that id has already been set. "));
                } else if (view.getId() != -1) {
                    String str = SurfaceMountingManager.TAG;
                    p229p2.a.j(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(SurfaceMountingManager.this.mSurfaceId));
                    ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
                }
                view.setId(SurfaceMountingManager.this.mSurfaceId);
                KeyEvent.Callback callback = view;
                if (callback instanceof ReactRoot) {
                    ((ReactRoot) callback).setRootViewTag(SurfaceMountingManager.this.mSurfaceId);
                }
                SurfaceMountingManager.this.executeMountItemsOnViewAttach();
                SurfaceMountingManager.this.mRootViewAttached = true;
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            guardedRunnable.run();
        } else {
            UiThreadUtil.runOnUiThread(guardedRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ThreadConfined("UI")
    @UiThread
    public void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    @Nullable
    private ViewState getNullableViewState(int i7) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i7));
    }

    @NonNull
    private static IViewGroupManager<ViewGroup> getViewGroupManager(@NonNull ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (IViewGroupManager) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    @NonNull
    private ViewState getViewState(int i7) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i7));
        if (viewState != null) {
            return viewState;
        }
        StringBuilder sbE = F.e(i7, "Unable to find viewState for tag ", ". Surface stopped: ");
        sbE.append(isStopped());
        throw new RetryableMountingLayerException(sbE.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$0() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mViewManagerRegistry.onSurfaceStopped(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new o();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.d(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        p229p2.a.h(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z3) {
        int id2 = viewGroup.getId();
        String str = TAG;
        StringBuilder sbE = F.e(id2, "  <ViewGroup tag=", " class=");
        sbE.append(viewGroup.getClass().toString());
        sbE.append(">");
        p229p2.a.h(str, sbE.toString());
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            String str2 = TAG;
            StringBuilder sbE2 = F.e(i7, "     <View idx=", " tag=");
            sbE2.append(viewGroup.getChildAt(i7).getId());
            sbE2.append(" class=");
            sbE2.append(viewGroup.getChildAt(i7).getClass().toString());
            sbE2.append(">");
            p229p2.a.h(str2, sbE2.toString());
        }
        String str3 = TAG;
        p229p2.a.h(str3, "  </ViewGroup tag=" + id2 + ">");
        if (z3) {
            p229p2.a.h(str3, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                String str4 = TAG;
                StringBuilder sbE3 = F.e(id3, "<ViewParent tag=", " class=");
                sbE3.append(parent.getClass().toString());
                sbE3.append(">");
                p229p2.a.h(str4, sbE3.toString());
            }
        }
    }

    @UiThread
    private void onViewStateDeleted(ViewState viewState) {
        StateWrapper stateWrapper = viewState.mStateWrapper;
        if (stateWrapper != null) {
            stateWrapper.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    @UiThread
    public void addViewAt(final int i7, final int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: [", "] for addViewAt")));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            StringBuilder sbP = q0.p(i7, "Unable to add a view into a view that is not a ViewGroup. ParentTag: ", i10, " - Tag: ", " - Index: ");
            sbP.append(i11);
            String string = sbP.toString();
            p229p2.a.h(TAG, string);
            throw new IllegalStateException(string);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        ViewState nullableViewState2 = getNullableViewState(i10);
        if (nullableViewState2 == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i10, "Unable to find viewState for tag: [", "] for addViewAt")));
            return;
        }
        View view2 = nullableViewState2.mView;
        if (view2 == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(G.n(i11, "]", q0.p(i10, "Unable to find view for tag: [", i7, "] for addViewAt. Parent tag: [", "] index: ["))));
            return;
        }
        boolean z3 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z3) {
            String str = TAG;
            StringBuilder sbP2 = q0.p(i10, "addViewAt: [", i7, "] -> [", "] idx: ");
            sbP2.append(i11);
            sbP2.append(" BEFORE");
            p229p2.a.h(str, sbP2.toString());
            logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z8 = parent instanceof ViewGroup;
            int id2 = z8 ? ((ViewGroup) parent).getId() : -1;
            String str2 = TAG;
            StringBuilder sbP3 = q0.p(i10, "addViewAt: cannot insert view [", i7, "] into parent [", "]: View already has a parent: [");
            sbP3.append(id2);
            sbP3.append("]  Parent: ");
            sbP3.append(parent.getClass().getSimpleName());
            sbP3.append(" View: ");
            sbP3.append(view2.getClass().getSimpleName());
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException(sbP3.toString()));
            if (z8) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i10));
        }
        IViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
        int childCount = viewGroupManager.getChildCount(viewGroup);
        final int iMax = Math.max(0, Math.min(i11, childCount));
        if (iMax != i11) {
            StringBuilder sbP4 = q0.p(i10, "addViewAt: clamping invalid index. Child [", i7, "] parent [", "] requested index [");
            u.u(sbP4, i11, "] safe index [", iMax, "] parent childCount [");
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(G.n(childCount, "]", sbP4)));
        }
        try {
            viewGroupManager.addView(viewGroup, view2, iMax);
            if (z3) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        p229p2.a.h(SurfaceMountingManager.TAG, "addViewAt: [" + i10 + "] -> [" + i7 + "] idx: " + iMax + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            StringBuilder sbP5 = q0.p(i10, "addViewAt recovered from IllegalStateException. Child [", i7, "] parent [", "] requested index [");
            u.u(sbP5, i11, "] safe index [", iMax, "] parent childCount [");
            sbP5.append(viewGroupManager.getChildCount(viewGroup));
            sbP5.append("]. ");
            sbP5.append(e10.getMessage());
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(sbP5.toString()));
        } catch (IndexOutOfBoundsException e11) {
            StringBuilder sbP6 = q0.p(i10, "addViewAt recovered from invalid index. Child [", i7, "] parent [", "] requested index [");
            u.u(sbP6, i11, "] safe index [", iMax, "] parent childCount [");
            sbP6.append(viewGroupManager.getChildCount(viewGroup));
            sbP6.append("]. ");
            sbP6.append(e11.getMessage());
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(sbP6.toString()));
            if (view2.getParent() == null) {
                try {
                    viewGroupManager.addView(viewGroup, view2, Math.max(0, viewGroupManager.getChildCount(viewGroup)));
                } catch (RuntimeException e12) {
                    StringBuilder sbP7 = q0.p(i10, "addViewAt fallback failed. Child [", i7, "] parent [", "] requested index [");
                    sbP7.append(i11);
                    sbP7.append("] parent childCount [");
                    sbP7.append(viewGroupManager.getChildCount(viewGroup));
                    sbP7.append("]. ");
                    sbP7.append(e12.getMessage());
                    ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(sbP7.toString()));
                }
            }
        }
    }

    public void attachRootView(View view, ThemedReactContext themedReactContext) {
        this.mThemedReactContext = themedReactContext;
        addRootView(view);
    }

    @UiThread
    public void createView(@NonNull String str, int i7, @Nullable ReadableMap readableMap, @Nullable StateWrapper stateWrapper, @Nullable EventEmitterWrapper eventEmitterWrapper, boolean z3) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i7, readableMap, stateWrapper, eventEmitterWrapper, z3);
        }
    }

    @UiThread
    public void createViewUnsafe(@NonNull String str, int i7, @Nullable ReadableMap readableMap, @Nullable StateWrapper stateWrapper, @Nullable EventEmitterWrapper eventEmitterWrapper, boolean z3) {
        D3.a.a("SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
            ViewState viewState = new ViewState(i7, 0);
            viewState.mCurrentProps = reactStylesDiffMap;
            viewState.mStateWrapper = stateWrapper;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i7), viewState);
            if (z3) {
                ViewManager<?, ?> viewManager = this.mViewManagerRegistry.get(str);
                viewState.mView = viewManager.createView(i7, this.mThemedReactContext, reactStylesDiffMap, stateWrapper, this.mJSResponderHandler);
                viewState.mViewManager = viewManager;
            }
        } finally {
            Trace.endSection();
        }
    }

    @UiThread
    public void deleteView(int i7) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: ", " for deleteView")));
        } else if (this.mViewsWithActiveTouches.contains(Integer.valueOf(i7))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i7));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i7));
            onViewStateDeleted(nullableViewState);
        }
    }

    @AnyThread
    public void enqueuePendingEvent(int i7, String str, boolean z3, @Nullable WritableMap writableMap, int i10) {
        final ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i7))) == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(str, writableMap, i10, z3);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.4
            @Override // java.lang.Runnable
            public void run() {
                ViewState viewState2 = viewState;
                EventEmitterWrapper eventEmitterWrapper = viewState2.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    pendingViewEvent.dispatch(eventEmitterWrapper);
                    return;
                }
                if (viewState2.mPendingEventQueue == null) {
                    viewState2.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    @Nullable
    public ThemedReactContext getContext() {
        return this.mThemedReactContext;
    }

    @Nullable
    @AnyThread
    @ThreadConfined("ANY")
    public EventEmitterWrapper getEventEmitter(int i7) {
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    @UiThread
    public View getView(int i7) {
        ViewState nullableViewState = getNullableViewState(i7);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException(F.c(i7, "Trying to resolve view with tag ", " which doesn't exist"));
    }

    public boolean getViewExists(int i7) {
        o oVar = this.mTagSetForStoppedSurface;
        if (oVar != null) {
            if (oVar.f5696a) {
                k.a(oVar);
            }
            if (N.a.a(oVar.f5699d, i7, oVar.f5697b) >= 0) {
                return true;
            }
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i7));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i7) {
        this.mViewsWithActiveTouches.add(Integer.valueOf(i7));
    }

    @UiThread
    public void preallocateView(@NonNull String str, int i7, @Nullable ReadableMap readableMap, @Nullable StateWrapper stateWrapper, boolean z3) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i7) == null) {
            createViewUnsafe(str, i7, readableMap, stateWrapper, null, z3);
        }
    }

    public void printSurfaceState() {
        p229p2.a.j(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            p229p2.a.j(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i7, int i10, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException(u.h(i7, "Unable to find viewState for tag: [", i10, "] for commandId: "));
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException(G.m(i7, "Unable to find viewManager for tag "));
        }
        View view = nullableViewState.mView;
        if (view == null) {
            throw new RetryableMountingLayerException(G.m(i7, "Unable to find viewState view for tag "));
        }
        viewManager.receiveCommand(view, i10, readableArray);
    }

    @UiThread
    public void removeViewAt(final int i7, final int i10, int i11) {
        final int i12;
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i7))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException(F.c(i7, "removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [", "]")));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i10);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new IllegalStateException(F.c(i10, "Unable to find viewState for tag: [", "] for removeViewAt")));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            StringBuilder sbP = q0.p(i10, "Unable to remove a view from a view that is not a ViewGroup. ParentTag: ", i7, " - Tag: ", " - Index: ");
            sbP.append(i11);
            String string = sbP.toString();
            p229p2.a.h(TAG, string);
            throw new IllegalStateException(string);
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException(F.c(i10, "Unable to find view for tag [", "]"));
        }
        int i13 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            String str = TAG;
            StringBuilder sbP2 = q0.p(i7, "removeViewAt: [", i10, "] -> [", "] idx: ");
            sbP2.append(i11);
            sbP2.append(" BEFORE");
            p229p2.a.h(str, sbP2.toString());
            logViewHierarchy(viewGroup, false);
        }
        IViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i11);
        int id2 = childAt != null ? childAt.getId() : -1;
        if (id2 != i7) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i13 >= childCount) {
                    i13 = -1;
                    break;
                } else if (viewGroup.getChildAt(i13).getId() == i7) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 == -1) {
                String str2 = TAG;
                StringBuilder sbP3 = q0.p(i7, "removeViewAt: [", i10, "] -> [", "] @");
                sbP3.append(i11);
                sbP3.append(": view already removed from parent! Children in parent: ");
                sbP3.append(childCount);
                p229p2.a.h(str2, sbP3.toString());
                return;
            }
            logViewHierarchy(viewGroup, true);
            String str3 = TAG;
            StringBuilder sbP4 = q0.p(i7, "Tried to remove view [", i10, "] of parent [", "] at index ");
            u.u(sbP4, i11, ", but got view tag ", id2, " - actual index of view: ");
            sbP4.append(i13);
            ReactSoftExceptionLogger.logSoftException(str3, new IllegalStateException(sbP4.toString()));
            i12 = i13;
        } else {
            i12 = i11;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i12);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        p229p2.a.h(SurfaceMountingManager.TAG, "removeViewAt: [" + i7 + "] -> [" + i10 + "] idx: " + i12 + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (RuntimeException e10) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            StringBuilder sbE = F.e(i12, "Cannot remove child at index ", " from parent ViewGroup [");
            sbE.append(viewGroup.getId());
            sbE.append("], only ");
            sbE.append(childCount2);
            sbE.append(" children in parent. Warning: childCount may be incorrect!");
            throw new IllegalStateException(sbE.toString(), e10);
        }
    }

    @ThreadConfined("UI")
    @UiThread
    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i7, int i10) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i7);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException(G.m(i7, "Unable to find viewState manager for tag "));
        }
        View view = viewState.mView;
        if (view == null) {
            throw new RetryableMountingLayerException(G.m(i7, "Unable to find viewState view for tag "));
        }
        view.sendAccessibilityEvent(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @UiThread
    public synchronized void setJSResponder(int i7, int i10, boolean z3) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z3) {
            this.mJSResponderHandler.setJSResponder(i10, null);
            return;
        }
        ViewState viewState = getViewState(i7);
        View view = viewState.mView;
        if (i10 != i7 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.setJSResponder(i10, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i7 + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i7 + "] that is a root view");
        }
        this.mJSResponderHandler.setJSResponder(i10, view.getParent());
    }

    @AnyThread
    public void stopSurface() {
        p229p2.a.h(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            StateWrapper stateWrapper = viewState.mStateWrapper;
            if (stateWrapper != null) {
                stateWrapper.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        g gVar = new g(this, 4);
        if (UiThreadUtil.isOnUiThread()) {
            gVar.run();
        } else {
            UiThreadUtil.runOnUiThread(gVar);
        }
    }

    public void sweepActiveTouchForTag(int i7) {
        this.mViewsWithActiveTouches.remove(Integer.valueOf(i7));
        if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i7))) {
            this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i7));
            deleteView(i7);
        }
    }

    @UiThread
    public void updateEventEmitter(int i7, @NonNull EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i7));
        if (viewState == null) {
            viewState = new ViewState(i7, 0);
            this.mTagToViewState.put(Integer.valueOf(i7), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @UiThread
    public void updateLayout(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        IViewGroupManager iViewGroupManager;
        int i17;
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: [", "] for updateLayout")));
            return;
        }
        if (nullableViewState.mIsRoot) {
            return;
        }
        View view = nullableViewState.mView;
        if (view == null) {
            throw new IllegalStateException(G.m(i7, "Unable to find View for tag: "));
        }
        int i18 = 1;
        if (i16 == 1) {
            i18 = 0;
        } else if (i16 != 2) {
            i18 = 2;
        }
        view.setLayoutDirection(i18);
        view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        ViewState nullableViewState2 = getNullableViewState(i10);
        if (nullableViewState2 != null) {
            NativeModule nativeModule = nullableViewState2.mViewManager;
            iViewGroupManager = nativeModule != null ? (IViewGroupManager) nativeModule : null;
            if (iViewGroupManager != null || !iViewGroupManager.needsCustomLayoutForChildren()) {
                view.layout(i11, i12, i13 + i11, i14 + i12);
            }
            i17 = i15 == 0 ? 4 : 0;
            if (view.getVisibility() != i17) {
                view.setVisibility(i17);
            }
        }
        ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i10, "Unable to find viewState for tag: ", " for updateLayout")));
        if (iViewGroupManager != null) {
            view.layout(i11, i12, i13 + i11, i14 + i12);
        } else {
            view.layout(i11, i12, i13 + i11, i14 + i12);
        }
        if (i15 == 0) {
        }
        if (view.getVisibility() != i17) {
            view.setVisibility(i17);
        }
    }

    @UiThread
    public void updateOverflowInset(int i7, int i10, int i11, int i12, int i13) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: [", "] for updateOverflowInset")));
            return;
        }
        if (nullableViewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = nullableViewState.mView;
        if (callback == null) {
            throw new IllegalStateException(G.m(i7, "Unable to find View for tag: "));
        }
        if (callback instanceof ReactOverflowViewWithInset) {
            ((ReactOverflowViewWithInset) callback).setOverflowInset(i10, i11, i12, i13);
        }
    }

    @UiThread
    public void updatePadding(int i7, int i10, int i11, int i12, int i13) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: [", "] for updatePadding")));
            return;
        }
        if (nullableViewState.mIsRoot) {
            return;
        }
        View view = nullableViewState.mView;
        if (view == null) {
            throw new IllegalStateException(G.m(i7, "Unable to find View for tag: "));
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager != null) {
            viewManager.setPadding(view, i10, i11, i12, i13);
        } else {
            throw new IllegalStateException("Unable to find ViewManager for view: " + nullableViewState);
        }
    }

    public void updateProps(int i7, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: [", "] for updateProps")));
            return;
        }
        ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
        nullableViewState.mCurrentProps = reactStylesDiffMap;
        View view = nullableViewState.mView;
        if (view == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find view for tag: [", "] for updateProps")));
            return;
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewManager for tag: [", "] for updateProps")));
        } else {
            viewManager.updateProperties(view, reactStylesDiffMap);
        }
    }

    @UiThread
    public void updateState(int i7, @Nullable StateWrapper stateWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(F.c(i7, "Unable to find viewState for tag: [", "] for updateState")));
            return;
        }
        StateWrapper stateWrapper2 = nullableViewState.mStateWrapper;
        nullableViewState.mStateWrapper = stateWrapper;
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException(G.m(i7, "Unable to find ViewManager for tag: "));
        }
        Object objUpdateState = viewManager.updateState(nullableViewState.mView, nullableViewState.mCurrentProps, stateWrapper);
        if (objUpdateState != null) {
            viewManager.updateExtraData(nullableViewState.mView, objUpdateState);
        }
        if (stateWrapper2 != null) {
            stateWrapper2.destroyState();
        }
    }

    public void receiveCommand(int i7, @NonNull String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i7);
        if (nullableViewState != null) {
            ViewManager viewManager = nullableViewState.mViewManager;
            if (viewManager != null) {
                View view = nullableViewState.mView;
                if (view != null) {
                    viewManager.receiveCommand(view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException(G.m(i7, "Unable to find viewState view for tag "));
            }
            throw new RetryableMountingLayerException(G.m(i7, "Unable to find viewState manager for tag "));
        }
        throw new RetryableMountingLayerException(d.j("Unable to find viewState for tag: ", i7, " for commandId: ", str));
    }
}
