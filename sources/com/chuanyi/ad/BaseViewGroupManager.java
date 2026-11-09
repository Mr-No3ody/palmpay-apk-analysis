package com.chuanyi.ad;

import android.app.Activity;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseViewGroupManager extends ViewGroupManager<ViewGroup> {
    public static final String PROP_SLOT_ID = "slotId";
    private WeakReference<ThemedReactContext> mWeakContext;
    protected final WeakHashMap<ViewGroup, Choreographer.FrameCallback> layoutCallbacks = new WeakHashMap<>();
    protected final WeakHashMap<ViewGroup, View.OnAttachStateChangeListener> attachListeners = new WeakHashMap<>();

    public boolean isOwnerActivityValid() {
        Activity currentActivity;
        WeakReference<ThemedReactContext> weakReference = this.mWeakContext;
        ThemedReactContext themedReactContext = weakReference != null ? weakReference.get() : null;
        return (themedReactContext == null || (currentActivity = themedReactContext.getCurrentActivity()) == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) ? false : true;
    }

    public void receiveEvent(int i7, String str, @Nullable WritableMap writableMap) {
        WeakReference<ThemedReactContext> weakReference = this.mWeakContext;
        ThemedReactContext themedReactContext = weakReference != null ? weakReference.get() : null;
        if (themedReactContext == null) {
            return;
        }
        if (str != null && !str.startsWith(ViewProps.TOP) && str.length() > 0) {
            str = ViewProps.TOP + Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, i7);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new c(UIManagerHelper.getSurfaceId(themedReactContext), i7, str, writableMap));
            return;
        }
        try {
            ((RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(i7, str, writableMap);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public ViewGroup createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        this.mWeakContext = new WeakReference<>(themedReactContext);
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ViewGroup viewGroup) {
        Choreographer.FrameCallback frameCallbackRemove = this.layoutCallbacks.remove(viewGroup);
        if (frameCallbackRemove != null) {
            Choreographer.getInstance().removeFrameCallback(frameCallbackRemove);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListenerRemove = this.attachListeners.remove(viewGroup);
        if (onAttachStateChangeListenerRemove != null) {
            viewGroup.removeOnAttachStateChangeListener(onAttachStateChangeListenerRemove);
        }
        super.onDropViewInstance(viewGroup);
    }
}
