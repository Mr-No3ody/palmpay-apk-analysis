package N9;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final ViewGroup getRNView(@NotNull Context context) {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentCallbacks2 componentCallbacks2 = BaseApplication.get();
        if (!(componentCallbacks2 instanceof ReactApplication) || (reactNativeHost = ((ReactApplication) componentCallbacks2).getReactNativeHost()) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return null;
        }
        try {
            ReactRootView reactRootView = new ReactRootView(context);
            reactRootView.startReactApplication(reactInstanceManager, "PalmPayGHApp", null);
            F6.d.h("PPRNModule", 3, "getRNView: react native engine initialized");
            return reactRootView;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final ReactContext getReactContext() {
        ComponentCallbacks2 componentCallbacks2 = BaseApplication.get();
        Intrinsics.f(componentCallbacks2, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) componentCallbacks2).getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
    }

    public final void preCreateReactContextInBackground() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ComponentCallbacks2 componentCallbacks2 = BaseApplication.get();
        if (componentCallbacks2 != null) {
            if (!(componentCallbacks2 instanceof ReactApplication)) {
                componentCallbacks2 = null;
            }
            if (componentCallbacks2 == null || (reactNativeHost = ((ReactApplication) componentCallbacks2).getReactNativeHost()) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
                return;
            }
            reactInstanceManager.createReactContextInBackground();
        }
    }

    public final void sendEvent(@NotNull String eventName, @NotNull Map<String, ? extends Object> paramsMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(paramsMap, "paramsMap");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        if (!paramsMap.isEmpty()) {
            for (Map.Entry<String, ? extends Object> entry : paramsMap.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Long) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    Intrinsics.f(value2, "null cannot be cast to non-null type kotlin.Long");
                    writableMapCreateMap.putInt(key, (int) ((Long) value2).longValue());
                } else if (value instanceof String) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    Intrinsics.f(value3, "null cannot be cast to non-null type kotlin.String");
                    writableMapCreateMap.putString(key2, (String) value3);
                } else if (value instanceof Double) {
                    String key3 = entry.getKey();
                    Object value4 = entry.getValue();
                    Intrinsics.f(value4, "null cannot be cast to non-null type kotlin.Double");
                    writableMapCreateMap.putDouble(key3, ((Double) value4).doubleValue());
                } else if (value instanceof Integer) {
                    String key4 = entry.getKey();
                    Object value5 = entry.getValue();
                    Intrinsics.f(value5, "null cannot be cast to non-null type kotlin.Int");
                    writableMapCreateMap.putInt(key4, ((Integer) value5).intValue());
                } else if (value instanceof Boolean) {
                    String key5 = entry.getKey();
                    Object value6 = entry.getValue();
                    Intrinsics.f(value6, "null cannot be cast to non-null type kotlin.Boolean");
                    writableMapCreateMap.putBoolean(key5, ((Boolean) value6).booleanValue());
                }
            }
        }
        ReactContext reactContext = getReactContext();
        if (reactContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, writableMapCreateMap);
        }
    }

    public final void unmountRNView(@Nullable Activity activity, @Nullable ViewGroup viewGroup) {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        unmountRNView(viewGroup);
        ComponentCallbacks2 componentCallbacks2 = BaseApplication.get();
        ReactApplication reactApplication = componentCallbacks2 instanceof ReactApplication ? (ReactApplication) componentCallbacks2 : null;
        if (reactApplication == null || (reactNativeHost = reactApplication.getReactNativeHost()) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.onHostDestroy(activity);
    }

    private a() {
    }

    public final void unmountRNView(@Nullable ViewGroup viewGroup) {
        if (viewGroup instanceof ReactRootView) {
            ((ReactRootView) viewGroup).unmountReactApplication();
        }
    }
}
