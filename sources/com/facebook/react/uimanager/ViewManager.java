package com.facebook.react.uimanager;

import H3.j;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
@ReactPropertyHolder
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    private static final String TAG = "ViewManager";

    @Nullable
    private ViewManagerDelegate<T> mDelegate;

    @Nullable
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private ViewManagerDelegate<T> getOrCreateViewManagerDelegate() {
        ViewManagerDelegate<T> viewManagerDelegate = this.mDelegate;
        if (viewManagerDelegate != null) {
            return viewManagerDelegate;
        }
        ViewManagerDelegate<T> delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    @Nullable
    private Stack<T> getRecyclableViewStack(int i7, boolean z3) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z3 && !map.containsKey(Integer.valueOf(i7))) {
            this.mRecyclableViews.put(Integer.valueOf(i7), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i7));
    }

    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, @NonNull T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public T createView(int i7, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper, JSResponderHandler jSResponderHandler) {
        T t = (T) createViewInstance(i7, themedReactContext, reactStylesDiffMap, stateWrapper);
        if (t instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) t).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return t;
    }

    @NonNull
    public T createViewInstance(int i7, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), true);
        T t = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(themedReactContext) : (T) recycleView(themedReactContext, recyclableViewStack.pop());
        t.setId(i7);
        addEventEmitters(themedReactContext, t);
        if (reactStylesDiffMap != null) {
            updateProperties(t, reactStylesDiffMap);
        }
        if (stateWrapper != null && (objUpdateState = updateState(t, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(t, objUpdateState);
        }
        return t;
    }

    @NonNull
    public abstract T createViewInstance(@NonNull ThemedReactContext themedReactContext);

    @UnstableReactNativeAPI
    public boolean experimental_isPrefetchingEnabled() {
        return false;
    }

    @UnstableReactNativeAPI
    public void experimental_prefetchResource(ReactContext reactContext, int i7, int i10, MapBuffer mapBuffer) {
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public ViewManagerDelegate<T> getDelegate() {
        if (this instanceof ViewManagerWithGeneratedInterface) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new ViewManagerPropertyUpdater.GenericViewManagerDelegate(this);
    }

    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) ? ViewManagerPropertyUpdater.getNativeProps(getClass(), null) : ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, j jVar, float f11, j jVar2, @Nullable float[] fArr) {
        return 0L;
    }

    public void onAfterUpdateTransaction(@NonNull T t) {
    }

    public void onDropViewInstance(@NonNull T t) {
        View viewPrepareToRecycleView;
        Context context = t.getContext();
        if (context == null) {
            p229p2.a.h(TAG, "onDropViewInstance: view [" + t.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof ThemedReactContext)) {
            p229p2.a.h(TAG, "onDropViewInstance: view [" + t.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), false);
        if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(themedReactContext, t)) == null) {
            return;
        }
        p059e1.a.e(viewPrepareToRecycleView.getParent() == null, "Recycled view [" + t.getId() + "] should not be attached to a parent. View: " + t + " Parent: " + viewPrepareToRecycleView.getParent() + " ThemedReactContext: " + themedReactContext);
        recyclableViewStack.push(viewPrepareToRecycleView);
    }

    public void onSurfaceStopped(int i7) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i7));
        }
    }

    @Nullable
    public abstract T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t);

    @Deprecated
    public void receiveCommand(@NonNull T t, int i7, ReadableArray readableArray) {
    }

    public T recycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t) {
        return t;
    }

    public void setPadding(T t, int i7, int i10, int i11, int i12) {
    }

    public void setupViewRecycling() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(@NonNull T t, Object obj);

    public void updateProperties(@NonNull T t, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerDelegate<T> orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.kotlinCompat$setProperty(t, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t);
    }

    @Nullable
    public Object updateState(@NonNull T t, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        return null;
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public void receiveCommand(@NonNull T t, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().kotlinCompat$receiveCommand(t, str, readableArray);
    }

    public ViewManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }
}
