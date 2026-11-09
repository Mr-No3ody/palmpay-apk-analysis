package com.facebook.react.defaults;

import Wd.G;
import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.cxxreactpackage.CxxReactPackage;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\nH\u0007J\u0092\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\n2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0090\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\n2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007Jn\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\nH\u0007J$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\r\u0010 \u001a\u00020\u001aH\u0000¢\u0006\u0002\b!R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHost;", "", "<init>", "()V", "reactHost", "Lcom/facebook/react/ReactHost;", "getDefaultReactHost", "context", "Landroid/content/Context;", "packageList", "", "Lcom/facebook/react/ReactPackage;", "jsMainModulePath", "", "jsBundleAssetPath", "jsBundleFilePath", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "useDevSupport", "", "cxxReactPackageProviders", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "exceptionHandler", "Ljava/lang/Exception;", "", "bindingsInstaller", "Lcom/facebook/react/runtime/BindingsInstaller;", "isHermesEnabled", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "invalidate", "invalidate$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultReactHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultReactHost.kt\ncom/facebook/react/defaults/DefaultReactHost\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,307:1\n1869#2,2:308\n*S KotlinDebug\n*F\n+ 1 DefaultReactHost.kt\ncom/facebook/react/defaults/DefaultReactHost\n*L\n130#1:308,2\n*E\n"})
public final class DefaultReactHost {

    @NotNull
    public static final DefaultReactHost INSTANCE = new DefaultReactHost();

    @Nullable
    private static ReactHost reactHost;

    private DefaultReactHost() {
    }

    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, @Nullable String jsBundleFilePath, @Nullable JSRuntimeFactory jsRuntimeFactory, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        return getDefaultReactHost(context, packageList, jsMainModulePath, jsBundleAssetPath, jsBundleFilePath, jsRuntimeFactory, useDevSupport, cxxReactPackageProviders, new G(28), (BindingsInstaller) null);
    }

    public static ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, JSRuntimeFactory jSRuntimeFactory, boolean z3, List list2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 8) != 0) {
            str2 = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            jSRuntimeFactory = null;
        }
        if ((i7 & 64) != 0) {
            z3 = ReactBuildConfig.DEBUG;
        }
        if ((i7 & 128) != 0) {
            list2 = z.f38935a;
        }
        return getDefaultReactHost(context, (List<? extends ReactPackage>) list, str, str2, str3, jSRuntimeFactory, z3, (List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>>) list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReactHost$lambda$0(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReactHost$lambda$1(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReactHost$lambda$3(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    public final void invalidate$ReactAndroid_release() {
        reactHost = null;
    }

    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, @Nullable String jsBundleFilePath, @Nullable JSRuntimeFactory jsRuntimeFactory, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders, @NotNull Function1<? super Exception, Unit> exceptionHandler, @Nullable BindingsInstaller bindingsInstaller) {
        JSBundleLoader jSBundleLoaderCreateAssetLoader;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        if (reactHost == null) {
            if (jsBundleFilePath != null) {
                if (y.m(jsBundleFilePath, CodePushConstants.ASSETS_BUNDLE_PREFIX, false)) {
                    jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(context, jsBundleFilePath, true);
                } else {
                    jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createFileLoader(jsBundleFilePath);
                }
            } else {
                jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(context, CodePushConstants.ASSETS_BUNDLE_PREFIX + jsBundleAssetPath, true);
            }
            JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
            DefaultTurboModuleManagerDelegate.Builder builder = new DefaultTurboModuleManagerDelegate.Builder();
            Iterator<T> it = cxxReactPackageProviders.iterator();
            while (it.hasNext()) {
                builder.addCxxReactPackage((Function1<? super ReactApplicationContext, ? extends CxxReactPackage>) it.next());
            }
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jsMainModulePath, jSBundleLoader, packageList, jsRuntimeFactory == null ? new HermesInstance() : jsRuntimeFactory, bindingsInstaller, exceptionHandler, builder);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            reactHost = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, useDevSupport);
        }
        ReactHost reactHost2 = reactHost;
        Intrinsics.f(reactHost2, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return reactHost2;
    }

    public static ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, JSRuntimeFactory jSRuntimeFactory, boolean z3, List list2, Function1 function1, BindingsInstaller bindingsInstaller, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 8) != 0) {
            str2 = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            jSRuntimeFactory = null;
        }
        if ((i7 & 64) != 0) {
            z3 = ReactBuildConfig.DEBUG;
        }
        if ((i7 & 128) != 0) {
            list2 = z.f38935a;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            function1 = new G(26);
        }
        if ((i7 & 512) != 0) {
            bindingsInstaller = null;
        }
        return getDefaultReactHost(context, (List<? extends ReactPackage>) list, str, str2, str3, jSRuntimeFactory, z3, (List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>>) list2, (Function1<? super Exception, Unit>) function1, bindingsInstaller);
    }

    public static ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, boolean z3, boolean z8, List list2, Function1 function1, BindingsInstaller bindingsInstaller, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 8) != 0) {
            str2 = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            z3 = true;
        }
        if ((i7 & 64) != 0) {
            z8 = ReactBuildConfig.DEBUG;
        }
        if ((i7 & 128) != 0) {
            list2 = z.f38935a;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            function1 = new G(27);
        }
        if ((i7 & 512) != 0) {
            bindingsInstaller = null;
        }
        return getDefaultReactHost(context, (List<? extends ReactPackage>) list, str, str2, str3, z3, z8, (List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>>) list2, (Function1<? super Exception, Unit>) function1, bindingsInstaller);
    }

    public static ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, boolean z3, boolean z8, List list2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 8) != 0) {
            str2 = FirebaseAnalytics.Param.INDEX;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            z3 = true;
        }
        if ((i7 & 64) != 0) {
            z8 = ReactBuildConfig.DEBUG;
        }
        if ((i7 & 128) != 0) {
            list2 = z.f38935a;
        }
        return getDefaultReactHost(context, (List<? extends ReactPackage>) list, str, str2, str3, z3, z8, (List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>>) list2);
    }

    public static /* synthetic */ ReactHost getDefaultReactHost$default(Context context, ReactNativeHost reactNativeHost, JSRuntimeFactory jSRuntimeFactory, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            jSRuntimeFactory = null;
        }
        return getDefaultReactHost(context, reactNativeHost, jSRuntimeFactory);
    }

    @Deprecated(message = "Use `getDefaultReactHost`  with `jsRuntimeFactory` instead", replaceWith = @ReplaceWith(expression = "\n      fun getDefaultReactHost(\n        context: Context,\n        packageList: List<ReactPackage>,\n        jsMainModulePath: String,\n        jsBundleAssetPath: String,\n        jsBundleFilePath: String?,\n        jsRuntimeFactory: JSRuntimeFactory?,\n        useDevSupport: Boolean,\n        cxxReactPackageProviders: List<(ReactContext) -> CxxReactPackage>,\n        exceptionHandler: (Exception) -> Unit,\n        bindingsInstaller: BindingsInstaller?,\n      ): ReactHost\n    ", imports = {}))
    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, @Nullable String jsBundleFilePath, boolean isHermesEnabled, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders, @NotNull Function1<? super Exception, Unit> exceptionHandler, @Nullable BindingsInstaller bindingsInstaller) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        return getDefaultReactHost(context, packageList, jsMainModulePath, jsBundleAssetPath, jsBundleFilePath, new HermesInstance(), useDevSupport, cxxReactPackageProviders, exceptionHandler, bindingsInstaller);
    }

    @Deprecated(message = "Use `getDefaultReactHost`  with `jsRuntimeFactory` instead", replaceWith = @ReplaceWith(expression = "\n      fun getDefaultReactHost(\n        context: Context,\n        packageList: List<ReactPackage>,\n        jsMainModulePath: String,\n        jsBundleAssetPath: String,\n        jsBundleFilePath: String?,\n        jsRuntimeFactory: JSRuntimeFactory?,\n        useDevSupport: Boolean,\n        cxxReactPackageProviders: List<(ReactContext) -> CxxReactPackage>,\n      ): ReactHost\n    ", imports = {}))
    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, @Nullable String jsBundleFilePath, boolean isHermesEnabled, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        return getDefaultReactHost(context, packageList, jsMainModulePath, jsBundleAssetPath, jsBundleFilePath, new HermesInstance(), useDevSupport, cxxReactPackageProviders);
    }

    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull ReactNativeHost reactNativeHost, @Nullable JSRuntimeFactory jsRuntimeFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        if (reactNativeHost instanceof DefaultReactNativeHost) {
            return ((DefaultReactNativeHost) reactNativeHost).toReactHost$ReactAndroid_release(context, jsRuntimeFactory);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost");
    }
}
