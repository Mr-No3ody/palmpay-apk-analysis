package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.core.view.N;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.airbnb.lottie.EnumC1317i;
import com.airbnb.lottie.H;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.k;
import com.airbnb.lottie.utils.e;
import com.alibaba.android.arouter.utils.Consts;
import com.chuanyi.ad.AdBannerManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerDelegate;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.transsnet.palmpay.managemoney.ui.activity.C1555a;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p179m1.b;
import p179m1.c;
import p179m1.g;
import p179m1.i;
import p179m1.m;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "LottieAnimationView")
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010\u0019J!\u0010)\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b,\u0010*J!\u0010.\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b.\u0010*J!\u0010/\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b/\u0010*J\u001f\u00102\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b5\u0010*J!\u00107\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b7\u0010*J\u001f\u0010:\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0017¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010@\u001a\u000200H\u0017¢\u0006\u0004\bA\u00103J\u001f\u0010C\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010B\u001a\u000200H\u0017¢\u0006\u0004\bC\u00103J!\u0010E\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\bE\u0010*J\u001f\u0010G\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010F\u001a\u000200H\u0017¢\u0006\u0004\bG\u00103J\u001f\u0010I\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010H\u001a\u000200H\u0017¢\u0006\u0004\bI\u00103J\u001f\u0010K\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010J\u001a\u000200H\u0017¢\u0006\u0004\bK\u00103J!\u0010M\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bM\u0010NJ!\u0010P\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\bP\u0010NJ#\u0010R\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010Q\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bR\u0010NJ!\u0010T\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010Q\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020V2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020V0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/airbnb/lottie/LottieAnimationView;", "Lcom/facebook/react/viewmanagers/LottieAnimationViewManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/airbnb/lottie/LottieAnimationView;", "", "getExportedCustomDirectEventTypeConstants", "view", "", "onAfterUpdateTransaction", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "startFrame", "endFrame", "play", "(Lcom/airbnb/lottie/LottieAnimationView;II)V", "reset", "pause", "resume", "name", "setSourceName", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "setSourceDotLottieURI", "", "cacheComposition", "setCacheComposition", "(Lcom/airbnb/lottie/LottieAnimationView;Z)V", ViewProps.RESIZE_MODE, "setResizeMode", "renderMode", "setRenderMode", "", ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Lcom/airbnb/lottie/LottieAnimationView;F)V", "", "speed", "setSpeed", "(Lcom/airbnb/lottie/LottieAnimationView;D)V", "loop", "setLoop", AdBannerManager.PROP_AUTO_PLAY, "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePathsAndroidForKitKatAndAbove", "enableSafeMode", "setEnableSafeModeAndroid", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "colorFilters", "setColorFilters", "(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFiltersAndroid", "value", "setTextFiltersIOS", "Lcom/facebook/react/bridge/ReadableMap;", "setDummy", "(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableMap;)V", "Lm1/g;", "getOrCreatePropertyManager", "(Lcom/airbnb/lottie/LottieAnimationView;)Lm1/g;", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "lottie-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> implements LottieAnimationViewManagerInterface<LottieAnimationView> {

    @NotNull
    private final WeakHashMap<LottieAnimationView, g> propManagersMap = new WeakHashMap<>();

    @NotNull
    private final ViewManagerDelegate<LottieAnimationView> delegate = new LottieAnimationViewManagerDelegate(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(LottieAnimationView view, Throwable error) {
        Intrinsics.e(error);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new i(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$1(LottieAnimationView view, k kVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new m(themedReactContext.getSurfaceId(), view.getId()));
        }
    }

    private final g getOrCreatePropertyManager(LottieAnimationView view) {
        g gVar = this.propManagersMap.get(view);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        this.propManagersMap.put(view, gVar2);
        return gVar2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LottieAnimationView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lottieAnimationView.setFailureListener(new C1555a(lottieAnimationView, 1));
        LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener = new LottieOnCompositionLoadedListener() { // from class: m1.a
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(k kVar) {
                LottieAnimationViewManager.createViewInstance$lambda$1(lottieAnimationView, kVar);
            }
        };
        k composition = lottieAnimationView.getComposition();
        if (composition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(composition);
        }
        lottieAnimationView.t.add(lottieOnCompositionLoadedListener);
        lottieAnimationView.f19579e.f20305b.addListener(new b(lottieAnimationView, 0));
        return lottieAnimationView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<LottieAnimationView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topAnimationFinish", MapBuilder.of("registrationName", "onAnimationFinish"), "topAnimationFailure", MapBuilder.of("registrationName", "onAnimationFailure"), "topAnimationLoaded", MapBuilder.of("registrationName", "onAnimationLoaded"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.builder().put("VERSION", 1).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "LottieAnimationView";
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void pause(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new c(view, 2));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void play(@NotNull final LottieAnimationView view, final int startFrame, final int endFrame) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        final boolean z3 = (startFrame == -1 || endFrame == -1) ? false : true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: m1.d
            @Override // java.lang.Runnable
            public final void run() {
                boolean z8 = z3;
                LottieAnimationView lottieAnimationView = view;
                if (z8) {
                    int i7 = startFrame;
                    int i10 = endFrame;
                    if (i7 > i10) {
                        lottieAnimationView.f19579e.s(i10, i7);
                        if (lottieAnimationView.getSpeed() > 0.0f) {
                            e eVar = lottieAnimationView.f19579e.f20305b;
                            eVar.f20230d = -eVar.f20230d;
                        }
                    } else {
                        lottieAnimationView.f19579e.s(i7, i10);
                        if (lottieAnimationView.getSpeed() < 0.0f) {
                            e eVar2 = lottieAnimationView.f19579e.f20305b;
                            eVar2.f20230d = -eVar2.f20230d;
                        }
                    }
                } else {
                    k composition = lottieAnimationView.getComposition();
                    Integer numValueOf = composition != null ? Integer.valueOf((int) composition.f19885l) : null;
                    k composition2 = lottieAnimationView.getComposition();
                    Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.f19886m) : null;
                    int minFrame = (int) lottieAnimationView.getMinFrame();
                    int maxFrame = (int) lottieAnimationView.getMaxFrame();
                    if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                        lottieAnimationView.f19579e.s(numValueOf.intValue(), numValueOf2.intValue());
                    }
                }
                WeakHashMap weakHashMap = N.f16168a;
                if (!lottieAnimationView.isAttachedToWindow()) {
                    lottieAnimationView.addOnAttachStateChangeListener(new com.chuanyi.ad.b(lottieAnimationView, z8));
                } else if (z8) {
                    lottieAnimationView.e();
                } else {
                    lottieAnimationView.f19585p.add(EnumC1317i.f19870f);
                    lottieAnimationView.f19579e.o();
                }
            }
        });
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void reset(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new c(view, 0));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void resume(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new c(view, 1));
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "cacheComposition")
    public void setCacheComposition(@NotNull LottieAnimationView view, boolean cacheComposition) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(cacheComposition);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void setDummy(@NotNull LottieAnimationView view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    public void setTextFiltersIOS(@Nullable LottieAnimationView view, @Nullable ReadableArray value) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        getOrCreatePropertyManager(view).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull LottieAnimationView root, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.delegate.kotlinCompat$receiveCommandNullableArgs(root, commandId, args);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = AdBannerManager.PROP_AUTO_PLAY)
    public void setAutoPlay(@NotNull LottieAnimationView view, boolean autoPlay) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39457q = Boolean.valueOf(autoPlay);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "colorFilters")
    public void setColorFilters(@NotNull LottieAnimationView view, @Nullable ReadableArray colorFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39448h = colorFilters;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePathsAndroidForKitKatAndAbove(@NotNull LottieAnimationView view, boolean enableMergePaths) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39446f = Boolean.valueOf(enableMergePaths);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "enableSafeModeAndroid")
    public void setEnableSafeModeAndroid(@NotNull LottieAnimationView view, boolean enableSafeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39447g = Boolean.valueOf(enableSafeMode);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "hardwareAccelerationAndroid")
    public void setHardwareAccelerationAndroid(@NotNull LottieAnimationView view, boolean hardwareAccelerationAndroid) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39451k = hardwareAccelerationAndroid ? 2 : 1;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "imageAssetsFolder")
    public void setImageAssetsFolder(@NotNull LottieAnimationView view, @Nullable String imageAssetsFolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39445e = imageAssetsFolder;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "loop")
    public void setLoop(@NotNull LottieAnimationView view, boolean loop) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39456p = Boolean.valueOf(loop);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = ReactProgressBarViewManager.PROP_PROGRESS)
    public void setProgress(@NotNull LottieAnimationView view, float progress) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39455o = Float.valueOf(progress);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "renderMode")
    public void setRenderMode(@NotNull LottieAnimationView view, @Nullable String renderMode) {
        H h7;
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (renderMode == null) {
            h7 = null;
        } else {
            int iHashCode = renderMode.hashCode();
            if (iHashCode != 165298699) {
                if (iHashCode != 899536360) {
                    if (iHashCode == 2101957031 && renderMode.equals("SOFTWARE")) {
                        h7 = H.f19569c;
                    } else {
                        h7 = null;
                    }
                } else if (renderMode.equals("HARDWARE")) {
                    h7 = H.f19568b;
                } else {
                    h7 = null;
                }
            } else if (renderMode.equals("AUTOMATIC")) {
                h7 = H.f19567a;
            } else {
                h7 = null;
            }
        }
        viewManager.f39450j = h7;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(@NotNull LottieAnimationView view, @Nullable String resizeMode) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (resizeMode == null) {
            scaleType = null;
        } else {
            int iHashCode = resizeMode.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612 && resizeMode.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = null;
                    }
                } else if (resizeMode.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = null;
                }
            } else if (resizeMode.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = null;
            }
        }
        viewManager.f39444d = scaleType;
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceDotLottieURI")
    public void setSourceDotLottieURI(@NotNull LottieAnimationView view, @Nullable String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39454n = urlString;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceJson")
    public void setSourceJson(@NotNull LottieAnimationView view, @Nullable String json) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39452l = json;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceName")
    public void setSourceName(@NotNull LottieAnimationView view, @Nullable String name) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (name != null && !StringsKt.A(name, Consts.DOT, false)) {
            name = name.concat(".json");
        }
        viewManager.f39443c = name;
        viewManager.f39442b = true;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "sourceURL")
    public void setSourceURL(@NotNull LottieAnimationView view, @Nullable String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39453m = urlString;
        viewManager.a();
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "speed")
    public void setSpeed(@NotNull LottieAnimationView view, double speed) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39458r = Float.valueOf((float) speed);
    }

    @Override // com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface
    @ReactProp(name = "textFiltersAndroid")
    public void setTextFiltersAndroid(@NotNull LottieAnimationView view, @Nullable ReadableArray textFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        g viewManager = getOrCreatePropertyManager(view);
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f39449i = textFilters;
    }
}
