package com.facebook.react.shell;

import android.annotation.SuppressLint;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ClassFinder;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolsruntimesettings.ReactDevToolsRuntimeSettingsModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.reactdevtoolssettings.ReactDevToolsSettingsManagerModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.runtime.a;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.PreparedLayoutTextViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.collections.r;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/shell/MainReactPackage;", "Lcom/facebook/react/BaseReactPackage;", "Lcom/facebook/react/ViewManagerOnDemandReactPackage;", "config", "Lcom/facebook/react/shell/MainPackageConfig;", "<init>", "(Lcom/facebook/react/shell/MainPackageConfig;)V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "", "Lcom/facebook/react/uimanager/ViewManager;", "viewManagersMap", "", "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagersMap", "()Ljava/util/Map;", "getViewManagers", "getViewManagerNames", "", "createViewManager", "viewManagerName", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "fallbackForMissingClass", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainReactPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainReactPackage.kt\ncom/facebook/react/shell/MainReactPackage\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n37#2:287\n36#2,3:288\n3829#3:291\n4344#3,2:292\n1193#4,2:294\n1267#4,4:296\n*S KotlinDebug\n*F\n+ 1 MainReactPackage.kt\ncom/facebook/react/shell/MainReactPackage\n*L\n267#1:287\n267#1:288,3\n271#1:291\n271#1:292,2\n272#1:294,2\n272#1:296,4\n*E\n"})
public final class MainReactPackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    @Nullable
    private final MainPackageConfig config;

    @SuppressLint({"VisibleForTests"})
    @NotNull
    private final Map<String, ModuleSpec> viewManagersMap;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MainReactPackage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ReactModuleInfoProvider fallbackForMissingClass() {
        Class[] clsArr = (Class[]) C1847n.r(new Class[]{AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, ReactNativeFeatureFlags.cxxNativeAnimatedEnabled() ? null : NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ReactDevToolsSettingsManagerModule.class, ReactDevToolsRuntimeSettingsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class}).toArray(new Class[0]);
        ArrayList<Class<?>> arrayList = new ArrayList();
        for (Class cls : clsArr) {
            if (cls.isAnnotationPresent(ReactModule.class)) {
                arrayList.add(cls);
            }
        }
        int iA = F.a(r.l(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Class<?> cls2 : arrayList) {
            Annotation annotation = cls2.getAnnotation(ReactModule.class);
            if (annotation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReactModule reactModule = (ReactModule) annotation;
            String strName = reactModule.name();
            String strName2 = reactModule.name();
            String name = cls2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            linkedHashMap.put(strName, new ReactModuleInfo(strName2, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), ReactModuleInfo.INSTANCE.classIsTurboModule(cls2)));
        }
        return new a(linkedHashMap, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map fallbackForMissingClass$lambda$19(Map map) {
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$0() {
        return new ReactDrawerLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$1() {
        return new ReactHorizontalScrollViewManager(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$10() {
        return new ReactModalHostManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$11() {
        return new ReactRawTextManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$12() {
        return new ReactTextInputManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$13() {
        int i7 = 1;
        return ReactNativeFeatureFlags.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(null, i7, 0 == true ? 1 : 0) : new ReactTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$14() {
        return new ReactViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$15() {
        return new ReactVirtualTextViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$16() {
        return new ReactUnimplementedViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$2() {
        return new ReactHorizontalScrollContainerViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$3() {
        return new ReactProgressBarViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$4() {
        return new ReactSafeAreaViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$5() {
        return new ReactScrollViewManager(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$6() {
        return new ReactSwitchManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$7() {
        return new SwipeRefreshLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NativeModule viewManagersMap$lambda$8() {
        return new FrescoBasedReactTextInlineImageViewManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule viewManagersMap$lambda$9() {
        return new ReactImageManager(null, null, null, 7, null);
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @Nullable
    public ViewManager<?, ?> createViewManager(@NotNull ReactApplicationContext reactContext, @NotNull String viewManagerName) {
        Provider<? extends NativeModule> provider;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = this.viewManagersMap.get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        int i7 = 1;
        return C1850q.h(new ReactDrawerLayoutManager(), new ReactHorizontalScrollViewManager(null, i7, 0 == true ? 1 : 0), new ReactHorizontalScrollContainerViewManager(), new ReactProgressBarViewManager(), new ReactScrollViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0), new ReactSwitchManager(), new ReactSafeAreaViewManager(), new SwipeRefreshLayoutManager(), new FrescoBasedReactTextInlineImageViewManager(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), new ReactImageManager(null, null, null, 7, null), new ReactModalHostManager(), new ReactRawTextManager(), new ReactTextInputManager(), ReactNativeFeatureFlags.enablePreparedTextLayout() ? new PreparedLayoutTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0) : new ReactTextViewManager(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0), new ReactViewManager(), new ReactVirtualTextViewManager(), new ReactUnimplementedViewManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.c(name, "AccessibilityInfo")) {
            return new AccessibilityInfoModule(reactContext);
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (Intrinsics.c(name, "Appearance")) {
            return new AppearanceModule(reactContext, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        }
        if (Intrinsics.c(name, "AppState")) {
            return new AppStateModule(reactContext);
        }
        if (Intrinsics.c(name, "BlobModule")) {
            return new BlobModule(reactContext);
        }
        if (Intrinsics.c(name, "DevLoadingView")) {
            return new DevLoadingModule(reactContext);
        }
        if (Intrinsics.c(name, FileReaderModule.INSTANCE.getNAME())) {
            return new FileReaderModule(reactContext);
        }
        if (Intrinsics.c(name, "Clipboard")) {
            return new ClipboardModule(reactContext);
        }
        if (Intrinsics.c(name, "DialogManagerAndroid")) {
            return new DialogModule(reactContext);
        }
        if (Intrinsics.c(name, FrescoModule.NAME)) {
            MainPackageConfig mainPackageConfig = this.config;
            return new FrescoModule(reactContext, true, mainPackageConfig != null ? mainPackageConfig.getFrescoConfig() : null);
        }
        if (Intrinsics.c(name, "I18nManager")) {
            return new I18nManagerModule(reactContext);
        }
        if (Intrinsics.c(name, "ImageLoader")) {
            return new ImageLoaderModule(reactContext);
        }
        if (Intrinsics.c(name, "ImageStoreManager")) {
            return new ImageStoreManager(reactContext);
        }
        if (Intrinsics.c(name, "IntentAndroid")) {
            return new IntentModule(reactContext);
        }
        if (Intrinsics.c(name, "NativeAnimatedModule")) {
            if (!ReactNativeFeatureFlags.cxxNativeAnimatedEnabled()) {
                return new NativeAnimatedModule(reactContext);
            }
        } else {
            if (Intrinsics.c(name, "Networking")) {
                return new NetworkingModule(reactContext);
            }
            if (Intrinsics.c(name, "PermissionsAndroid")) {
                return new PermissionsModule(reactContext);
            }
            if (Intrinsics.c(name, "ShareModule")) {
                return new ShareModule(reactContext);
            }
            if (Intrinsics.c(name, "StatusBarManager")) {
                return new StatusBarModule(reactContext);
            }
            if (Intrinsics.c(name, "SoundManager")) {
                return new SoundManagerModule(reactContext);
            }
            if (Intrinsics.c(name, "ToastAndroid")) {
                return new ToastModule(reactContext);
            }
            if (Intrinsics.c(name, "Vibration")) {
                return new VibrationModule(reactContext);
            }
            if (Intrinsics.c(name, "WebSocketModule")) {
                return new WebSocketModule(reactContext);
            }
            if (Intrinsics.c(name, "ReactDevToolsSettingsManager")) {
                return new ReactDevToolsSettingsManagerModule(reactContext);
            }
            if (Intrinsics.c(name, "ReactDevToolsRuntimeSettingsModule")) {
                return new ReactDevToolsRuntimeSettingsModule(reactContext);
            }
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (!ClassFinder.canLoadClassesFromAnnotationProcessors()) {
            return fallbackForMissingClass();
        }
        try {
            Class<?> clsFindClass = ClassFinder.findClass("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider");
            Object objNewInstance = clsFindClass != null ? clsFindClass.newInstance() : null;
            ReactModuleInfoProvider reactModuleInfoProvider = objNewInstance instanceof ReactModuleInfoProvider ? (ReactModuleInfoProvider) objNewInstance : null;
            return reactModuleInfoProvider == null ? fallbackForMissingClass() : reactModuleInfoProvider;
        } catch (ClassNotFoundException unused) {
            return fallbackForMissingClass();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @NotNull
    public Collection<String> getViewManagerNames(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return this.viewManagersMap.keySet();
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.Y(this.viewManagersMap.values());
    }

    @NotNull
    public final Map<String, ModuleSpec> getViewManagersMap() {
        return this.viewManagersMap;
    }

    public /* synthetic */ MainReactPackage(MainPackageConfig mainPackageConfig, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : mainPackageConfig);
    }

    @JvmOverloads
    public MainReactPackage(@Nullable MainPackageConfig mainPackageConfig) {
        this.config = mainPackageConfig;
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        this.viewManagersMap = G.g(new Pair(ReactDrawerLayoutManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(8))), new Pair(ReactHorizontalScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(16))), new Pair(ReactHorizontalScrollContainerViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(0))), new Pair(ReactProgressBarViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(1))), new Pair(ReactSafeAreaViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(2))), new Pair(ReactScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(3))), new Pair(ReactSwitchManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(4))), new Pair(SwipeRefreshLayoutManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(5))), new Pair(FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(6))), new Pair(ReactImageManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(7))), new Pair(ReactModalHostManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(9))), new Pair(ReactRawTextManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(10))), new Pair(ReactTextInputManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(11))), new Pair("RCTText", companion.viewManagerSpec(new A3.a(12))), new Pair("RCTView", companion.viewManagerSpec(new A3.a(13))), new Pair(ReactVirtualTextViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(14))), new Pair(ReactUnimplementedViewManager.REACT_CLASS, companion.viewManagerSpec(new A3.a(15))));
    }
}
