package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import androidx.camera.core.impl.L;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0002\b\u0018R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\r8TX\u0095\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactNativeHost;", "Lcom/facebook/react/ReactNativeHost;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getReactPackageTurboModuleManagerDelegateBuilder", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "getUIManagerProvider", "Lcom/facebook/react/bridge/UIManagerProvider;", "clear", "", "isNewArchEnabled", "", "()Z", "isHermesEnabled", "isHermesEnabled$annotations", "()V", "toReactHost", "Lcom/facebook/react/ReactHost;", "context", "Landroid/content/Context;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "toReactHost$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DefaultReactNativeHost extends ReactNativeHost {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactNativeHost(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager getUIManagerProvider$lambda$0(final DefaultReactNativeHost defaultReactNativeHost, ReactApplicationContext reactApplicationContext) {
        ViewManagerRegistry viewManagerRegistry;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        if (defaultReactNativeHost.getLazyViewManagersEnabled()) {
            viewManagerRegistry = new ViewManagerRegistry(new ViewManagerResolver() { // from class: com.facebook.react.defaults.DefaultReactNativeHost$getUIManagerProvider$1$viewManagerRegistry$1
                @Override // com.facebook.react.uimanager.ViewManagerResolver
                public ViewManager getViewManager(String viewManagerName) {
                    Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
                    return this.this$0.getReactInstanceManager().createViewManager(viewManagerName);
                }

                @Override // com.facebook.react.uimanager.ViewManagerResolver
                public Collection<String> getViewManagerNames() {
                    return this.this$0.getReactInstanceManager().getViewManagerNames();
                }
            });
        } else {
            List<ViewManager> orCreateViewManagers = defaultReactNativeHost.getReactInstanceManager().getOrCreateViewManagers(reactApplicationContext);
            Intrinsics.checkNotNullExpressionValue(orCreateViewManagers, "getOrCreateViewManagers(...)");
            viewManagerRegistry = new ViewManagerRegistry(orCreateViewManagers);
        }
        return new FabricUIManagerProviderImpl(componentFactory, viewManagerRegistry).createUIManager(reactApplicationContext);
    }

    @Deprecated(message = "Setting isHermesEnabled inside `ReactNativeHost` is deprecated and this field will be ignored. If this field is set to true, you can safely remove it. If this field is set to false, please follow the setup on https://github.com/react-native-community/javascriptcore to continue using JSC", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void isHermesEnabled$annotations() {
    }

    public static /* synthetic */ ReactHost toReactHost$ReactAndroid_release$default(DefaultReactNativeHost defaultReactNativeHost, Context context, JSRuntimeFactory jSRuntimeFactory, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toReactHost");
        }
        if ((i7 & 2) != 0) {
            jSRuntimeFactory = null;
        }
        return defaultReactNativeHost.toReactHost$ReactAndroid_release(context, jSRuntimeFactory);
    }

    @Override // com.facebook.react.ReactNativeHost
    public void clear() {
        super.clear();
        DefaultReactHost.INSTANCE.invalidate$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactNativeHost
    @Nullable
    public ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        if (isNewArchEnabled()) {
            return new DefaultTurboModuleManagerDelegate.Builder();
        }
        return null;
    }

    @Override // com.facebook.react.ReactNativeHost
    @Nullable
    public UIManagerProvider getUIManagerProvider() {
        if (isNewArchEnabled()) {
            return new L(this, 16);
        }
        return null;
    }

    public boolean isHermesEnabled() {
        return true;
    }

    public boolean isNewArchEnabled() {
        return false;
    }

    @UnstableReactNativeAPI
    @NotNull
    public final ReactHost toReactHost$ReactAndroid_release(@NotNull Context context, @Nullable JSRuntimeFactory jsRuntimeFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (jsRuntimeFactory == null) {
            jsRuntimeFactory = new HermesInstance();
        }
        JSRuntimeFactory jSRuntimeFactory = jsRuntimeFactory;
        List<ReactPackage> packages = getPackages();
        Intrinsics.checkNotNullExpressionValue(packages, "getPackages(...)");
        String jSMainModuleName = getJSMainModuleName();
        Intrinsics.checkNotNullExpressionValue(jSMainModuleName, "getJSMainModuleName(...)");
        String bundleAssetName = getBundleAssetName();
        if (bundleAssetName == null) {
            bundleAssetName = FirebaseAnalytics.Param.INDEX;
        }
        return DefaultReactHost.getDefaultReactHost$default(context, packages, jSMainModuleName, bundleAssetName, getJSBundleFile(), jSRuntimeFactory, getUseDeveloperSupport(), (List) null, 128, (Object) null);
    }
}
