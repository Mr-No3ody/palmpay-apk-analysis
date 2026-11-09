package com.facebook.react.uimanager;

import E.AbstractC0198c;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Trace;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherImpl;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.internal.LegacyArchitectureShadowNodeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG;
    public static final String NAME = "UIManager";
    public static final String TAG;
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<UIManagerModuleListener> mListeners;
    private final MemoryTrimCallback mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final UIImplementation mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final ViewManagerRegistry mViewManagerRegistry;

    public interface CustomEventNamesResolver {
        @Nullable
        String resolveCustomEventName(String str);
    }

    public static class MemoryTrimCallback implements ComponentCallbacks2 {
        public /* synthetic */ MemoryTrimCallback(int i7) {
            this();
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i7) {
            if (i7 >= 60) {
                YogaNodePool.get().clear();
            }
        }

        private MemoryTrimCallback() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("UIManagerModule", LegacyArchitectureLogLevel.ERROR);
        TAG = "UIManagerModule";
        p375z2.a tag = A2.a.f34d;
        Intrinsics.checkNotNullParameter(tag, "tag");
        DEBUG = false;
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, int i7) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback(0);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        EventDispatcherImpl eventDispatcherImpl = new EventDispatcherImpl(reactApplicationContext);
        this.mEventDispatcher = eventDispatcherImpl;
        this.mModuleConstants = createConstants(viewManagerResolver);
        this.mCustomDirectEvents = UIManagerModuleConstants.directEventTypeConstants;
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(viewManagerResolver);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcherImpl, i7);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(ViewManagerResolver viewManagerResolver) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        p1.d dVarD = AbstractC0198c.d("CreateUIManagerConstants");
        dVarD.c(Boolean.TRUE, "Lazy");
        dVarD.e();
        try {
            return UIManagerModuleConstantsHelper.internal_createConstants(viewManagerResolver);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap) {
        Intrinsics.checkNotNullParameter("UIManagerModule.addRootView", "sectionName");
        AbstractC0198c.e("UIManagerModule.addRootView");
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        this.mUIImplementation.registerRootView(t, nextRootViewTag, new ThemedReactContext(getReactApplicationContext(), t.getContext(), ((ReactRoot) t).getSurfaceID(), -1));
        Trace.endSection();
        return nextRootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.addUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.add(uIManagerModuleListener);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i7, String str, int i10, ReadableMap readableMap) {
        if (DEBUG) {
            String message = "(UIManager.createView) tag: " + i7 + ", class: " + str + ", props: " + readableMap;
            p229p2.a.a("ReactNative", message);
            p375z2.a tag = A2.a.f34d;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
        this.mUIImplementation.createView(i7, str, i10, readableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i7, int i10, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i7, i10, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i7, Dynamic dynamic, @Nullable ReadableArray readableArray) {
        UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), ViewUtil.getUIManagerType(i7));
        if (uIManager == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManager.dispatchCommand(i7, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManager.dispatchCommand(i7, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i7, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i7, Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @Nullable
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManagerResolveViewManager = this.mUIImplementation.resolveViewManager(str);
        if (viewManagerResolveViewManager == null) {
            return null;
        }
        return getConstantsForViewManager(viewManagerResolveViewManager, this.mCustomDirectEvents);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    @Deprecated
    public CustomEventNamesResolver getDirectEventNamesResolver() {
        return new CustomEventNamesResolver() { // from class: com.facebook.react.uimanager.UIManagerModule.1
            @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
            @Nullable
            public String resolveCustomEventName(@Nullable String str) {
                return UIManagerModule.this.resolveCustomDirectEventName(str);
            }
        };
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    @Deprecated
    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public ViewManagerRegistry getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        this.mUIImplementation.onCatalystInstanceDestroyed();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        YogaNodePool.get().clear();
        ViewManagerPropertyUpdater.clear();
    }

    public void invalidateNodeLayout(int i7) {
        ReactShadowNode reactShadowNodeResolveShadowNode = this.mUIImplementation.resolveShadowNode(i7);
        if (reactShadowNodeResolveShadowNode != null) {
            reactShadowNodeResolveShadowNode.dirty();
            this.mUIImplementation.dispatchViewUpdates(-1);
        } else {
            p229p2.a.v("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i7);
        }
    }

    @ReactMethod
    public void manageChildren(int i7, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        if (DEBUG) {
            String message = "(UIManager.manageChildren) tag: " + i7 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            p229p2.a.a("ReactNative", message);
            p375z2.a tag = A2.a.f34d;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
        this.mUIImplementation.manageChildren(i7, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i7, int i10) {
    }

    @ReactMethod
    public void measure(int i7, Callback callback) {
        this.mUIImplementation.measure(i7, callback);
    }

    @ReactMethod
    public void measureInWindow(int i7, Callback callback) {
        this.mUIImplementation.measureInWindow(i7, callback);
    }

    @ReactMethod
    public void measureLayout(int i7, int i10, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i7, i10, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i7 = this.mBatchId;
        this.mBatchId = i7 + 1;
        p1.d dVarD = AbstractC0198c.d("onBatchCompleteUI");
        dVarD.b(i7, "BatchId");
        dVarD.e();
        Iterator<UIManagerModuleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.getRootViewNum() > 0) {
                this.mUIImplementation.dispatchViewUpdates(i7);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.onHostDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.prependUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.profileNextBatch();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, String str, @Nullable WritableMap writableMap) {
        receiveEvent(-1, i7, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i7) {
        this.mUIImplementation.removeRootView(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.remove(uIManagerModuleListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Nullable
    @Deprecated
    public String resolveCustomDirectEventName(@Nullable String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i7) {
        return ViewUtil.isRootTag(i7) ? i7 : this.mUIImplementation.resolveRootTagFromReactTag(i7);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i7) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.getUIViewOperationQueue().getNativeViewHierarchyManager().resolveView(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i7, int i10) {
        int uIManagerType = ViewUtil.getUIManagerType(i7);
        if (uIManagerType != 2) {
            this.mUIImplementation.sendAccessibilityEvent(i7, i10);
            return;
        }
        UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), uIManagerType);
        if (uIManager != null) {
            uIManager.sendAccessibilityEvent(i7, i10);
        }
    }

    @ReactMethod
    public void setChildren(int i7, ReadableArray readableArray) {
        if (DEBUG) {
            String message = "(UIManager.setChildren) tag: " + i7 + ", children: " + readableArray;
            p229p2.a.a("ReactNative", message);
            p375z2.a tag = A2.a.f34d;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
        this.mUIImplementation.setChildren(i7, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i7, boolean z3) {
        this.mUIImplementation.setJSResponder(i7, z3);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z3) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z3);
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(final int i7, final Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.2
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.setViewLocalData(i7, obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i7, int i10) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i7, ReadableMap readableMap) {
        this.mUIImplementation.synchronouslyUpdateViewOnUIThread(i7, new ReactStylesDiffMap(readableMap));
    }

    public void updateInsetsPadding(int i7, int i10, int i11, int i12, int i13) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateInsetsPadding(i7, i10, i11, i12, i13);
    }

    public void updateNodeSize(int i7, int i10, int i11) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateNodeSize(i7, i10, i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(final int i7, final int i10, final int i11, int i12, int i13) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.3
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.updateRootView(i7, i10, i11);
                UIManagerModule.this.mUIImplementation.dispatchViewUpdates(-1);
            }
        });
    }

    @ReactMethod
    public void updateView(int i7, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String message = "(UIManager.updateView) tag: " + i7 + ", class: " + str + ", props: " + readableMap;
            p229p2.a.a("ReactNative", message);
            p375z2.a tag = A2.a.f34d;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
        this.mUIImplementation.updateView(i7, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i7, int i10, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i7, i10, callback);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i7, String str, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i7, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, int i10, String str, @Nullable WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i10, str, writableMap);
    }

    @Nullable
    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        p1.d dVarD = AbstractC0198c.d("UIManagerModule.getConstantsForViewManager");
        dVarD.c(viewManager.getName(), "ViewManager");
        dVarD.c(Boolean.TRUE, "Lazy");
        dVarD.e();
        try {
            Map<String, Object> mapInternal_createConstantsForViewManager = UIManagerModuleConstantsHelper.internal_createConstantsForViewManager(viewManager, null, null, null, map);
            if (mapInternal_createConstantsForViewManager != null) {
                return Arguments.makeNativeMap(mapInternal_createConstantsForViewManager);
            }
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null);
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        p1.d dVarD = AbstractC0198c.d("CreateUIManagerConstants");
        dVarD.c(Boolean.FALSE, "Lazy");
        dVarD.e();
        try {
            return UIManagerModuleConstantsHelper.internal_createConstants(list, map, map2);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i7) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback(0);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        EventDispatcherImpl eventDispatcherImpl = new EventDispatcherImpl(reactApplicationContext);
        this.mEventDispatcher = eventDispatcherImpl;
        HashMap mapNewHashMap = MapBuilder.newHashMap();
        this.mCustomDirectEvents = mapNewHashMap;
        this.mModuleConstants = createConstants(list, null, mapNewHashMap);
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(list);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcherImpl, i7);
        if (ReactBuildConfig.DEBUG) {
            for (ViewManager viewManager : list) {
                LegacyArchitectureShadowNodeLogger.assertUnsupportedViewManager(reactApplicationContext, viewManager.getShadowNodeClass(), viewManager.getClass().getSimpleName());
            }
        }
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
