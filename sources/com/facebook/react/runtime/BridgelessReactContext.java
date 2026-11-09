package com.facebook.react.runtime;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001FB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0017J\b\u0010\u001a\u001a\u00020\u0018H\u0017J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J \u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0016J'\u0010(\u001a\u0004\u0018\u0001H)\"\b\b\u0000\u0010)*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0,H\u0016¢\u0006\u0002\u0010-J\u001a\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u000101H\u0016J \u00102\u001a\u00020\u0018\"\b\b\u0000\u0010)*\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H)0,H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020306H\u0016J'\u00107\u001a\u0004\u0018\u0001H)\"\b\b\u0000\u0010)*\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H)0,H\u0016¢\u0006\u0002\u00108J\u0012\u00107\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u000bH\u0016J\n\u0010:\u001a\u0004\u0018\u00010;H\u0017J\u0014\u0010<\u001a\u00020\u00112\n\u0010=\u001a\u00060>j\u0002`?H\u0016J\n\u0010@\u001a\u0004\u0018\u00010AH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/facebook/react/runtime/BridgelessReactContext;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/uimanager/events/EventDispatcherProvider;", "context", "Landroid/content/Context;", "reactHost", "Lcom/facebook/react/runtime/ReactHostImpl;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostImpl;)V", "sourceURLRef", "Ljava/util/concurrent/atomic/AtomicReference;", "", "TAG", "getEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getSourceURL", "setSourceURL", "", "sourceURL", "getFabricUIManager", "Lcom/facebook/react/bridge/UIManager;", "getCatalystInstance", "Lcom/facebook/react/bridge/CatalystInstance;", "hasActiveCatalystInstance", "", "isBridgeless", "hasCatalystInstance", "hasActiveReactInstance", "hasReactInstance", "destroy", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "registerSegment", "segmentId", "", "path", "callback", "Lcom/facebook/react/bridge/Callback;", "getJSModule", "T", "Lcom/facebook/react/bridge/JavaScriptModule;", "jsInterface", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "emitDeviceEvent", "eventName", "args", "", "hasNativeModule", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "getNativeModules", "", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "name", "getJavaScriptContextHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getJSCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "getDefaultHardwareBackBtnHandler", "()Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "BridgelessJSModuleInvocationHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgelessReactContext extends ReactApplicationContext implements EventDispatcherProvider {

    @NotNull
    private final String TAG;

    @NotNull
    private final ReactHostImpl reactHost;

    @NotNull
    private final AtomicReference<String> sourceURLRef;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/runtime/BridgelessReactContext$BridgelessJSModuleInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "reactHost", "Lcom/facebook/react/runtime/ReactHostImpl;", "jsModuleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/Class;)V", "invoke", "", "proxy", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BridgelessJSModuleInvocationHandler implements InvocationHandler {

        @NotNull
        private final Class<? extends JavaScriptModule> jsModuleInterface;

        @NotNull
        private final ReactHostImpl reactHost;

        public BridgelessJSModuleInvocationHandler(@NotNull ReactHostImpl reactHost, @NotNull Class<? extends JavaScriptModule> jsModuleInterface) {
            Intrinsics.checkNotNullParameter(reactHost, "reactHost");
            Intrinsics.checkNotNullParameter(jsModuleInterface, "jsModuleInterface");
            this.reactHost = reactHost;
            this.jsModuleInterface = jsModuleInterface;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) {
            WritableNativeArray writableNativeArray;
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (args != null) {
                writableNativeArray = Arguments.fromJavaArgs(args);
                Intrinsics.checkNotNullExpressionValue(writableNativeArray, "fromJavaArgs(...)");
            } else {
                writableNativeArray = new WritableNativeArray();
            }
            ReactHostImpl reactHostImpl = this.reactHost;
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.jsModuleInterface);
            String name = method.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            reactHostImpl.callFunctionOnModule$ReactAndroid_release(jSModuleName, name, writableNativeArray);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgelessReactContext(@NotNull Context context, @NotNull ReactHostImpl reactHost) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        this.reactHost = reactHost;
        this.sourceURLRef = new AtomicReference<>();
        Intrinsics.checkNotNullExpressionValue("BridgelessReactContext", "getSimpleName(...)");
        this.TAG = "BridgelessReactContext";
        if (ReactNativeNewArchitectureFeatureFlags.useFabricInterop()) {
            initializeInteropModules();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(@NotNull String eventName, @Nullable Object args) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        ReactHostImpl reactHostImpl = this.reactHost;
        WritableNativeArray writableNativeArrayFromJavaArgs = Arguments.fromJavaArgs(new Object[]{eventName, args});
        Intrinsics.checkNotNullExpressionValue(writableNativeArrayFromJavaArgs, "fromJavaArgs(...)");
        reactHostImpl.callFunctionOnModule$ReactAndroid_release("RCTDeviceEventEmitter", "emit", writableNativeArrayFromJavaArgs);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @NotNull
    public CatalystInstance getCatalystInstance() {
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            throw new UnsupportedOperationException("CatalystInstance is not supported when Bridgeless mode is enabled.");
        }
        return new BridgelessCatalystInstance(this.reactHost);
    }

    @NotNull
    public final DefaultHardwareBackBtnHandler getDefaultHardwareBackBtnHandler() {
        return this.reactHost.getDefaultBackButtonHandler$ReactAndroid_release();
    }

    @NotNull
    public final DevSupportManager getDevSupportManager() {
        return this.reactHost.getDevSupportManager();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherProvider
    @NotNull
    public EventDispatcher getEventDispatcher() {
        return this.reactHost.getEventDispatcher$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated(message = "This method is deprecated, please use UIManagerHelper.getUIManager() instead.")
    @Nullable
    public UIManager getFabricUIManager() {
        return this.reactHost.getUiManager$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.reactHost.getJsCallInvokerHolder$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public <T extends JavaScriptModule> T getJSModule(@NotNull Class<T> jsInterface) {
        T t;
        Intrinsics.checkNotNullParameter(jsInterface, "jsInterface");
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null && (t = (T) interopModuleRegistry.getInteropModule(jsInterface)) != null) {
            return t;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(jsInterface.getClassLoader(), new Class[]{jsInterface}, new BridgelessJSModuleInvocationHandler(this.reactHost, jsInterface));
        Intrinsics.f(objNewProxyInstance, "null cannot be cast to non-null type com.facebook.react.bridge.JavaScriptModule");
        return (T) objNewProxyInstance;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @FrameworkAPI
    @UnstableReactNativeAPI
    @Nullable
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.reactHost.getJavaScriptContextHolder$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public <T extends NativeModule> T getNativeModule(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return (T) this.reactHost.getNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @NotNull
    public Collection<NativeModule> getNativeModules() {
        return this.reactHost.getNativeModules$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public String getSourceURL() {
        return this.sourceURLRef.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(@NotNull Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.reactHost.handleHostException$ReactAndroid_release(e10);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated(message = "This API has been deprecated due to naming consideration, please use hasActiveReactInstance() instead")
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.reactHost.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated(message = "This API has been deprecated due to naming consideration, please use hasReactInstance() instead")
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        return this.reactHost.hasNativeModule$ReactAndroid_release(nativeModuleInterface);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.reactHost.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated(message = "DO NOT USE, this method will be removed in the near future.")
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int segmentId, @NotNull String path, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.reactHost.registerSegment$ReactAndroid_release(segmentId, path, callback);
    }

    public final void setSourceURL(@Nullable String sourceURL) {
        this.sourceURLRef.set(sourceURL);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public NativeModule getNativeModule(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.reactHost.getNativeModule$ReactAndroid_release(name);
    }
}
