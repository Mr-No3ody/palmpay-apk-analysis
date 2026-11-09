package com.facebook.react.views.image;

import F2.f;
import android.content.Context;
import android.graphics.PorterDuff;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.F;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReactImageManager.REACT_CLASS)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB=\b\u0007\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b8\u0010'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b:\u0010'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\bM\u0010NR&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010QR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006T"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/ReactImageView;", "LF2/f;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "globalImageLoadListener", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "callerContextFactory", "<init>", "(LF2/f;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "", "callerContext", "(LF2/f;Ljava/lang/Object;)V", "(LF2/f;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/image/ReactImageView;", "", "getName", "()Ljava/lang/String;", "view", "", "accessible", "", "setAccessible", "(Lcom/facebook/react/views/image/ReactImageView;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSrc", "(Lcom/facebook/react/views/image/ReactImageView;Lcom/facebook/react/bridge/ReadableArray;)V", "setSource", "", "blurRadius", "setBlurRadius", "(Lcom/facebook/react/views/image/ReactImageView;F)V", "analyticTag", "setInternal_AnalyticsTag", "(Lcom/facebook/react/views/image/ReactImageView;Ljava/lang/String;)V", "source", "setDefaultSource", "setLoadingIndicatorSource", "", ViewProps.BORDER_COLOR, "setBorderColor", "(Lcom/facebook/react/views/image/ReactImageView;Ljava/lang/Integer;)V", "overlayColor", "setOverlayColor", ViewProps.BORDER_WIDTH, "setBorderWidth", FirebaseAnalytics.Param.INDEX, ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/image/ReactImageView;IF)V", ViewProps.RESIZE_MODE, "setResizeMode", ViewProps.RESIZE_METHOD, "setResizeMethod", "resizeMultiplier", "setResizeMultiplier", "tintColor", "setTintColor", ViewProps.ENABLED, "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "(Lcom/facebook/react/views/image/ReactImageView;I)V", "shouldNotifyLoadEvents", "setLoadHandlersRegistered", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/views/image/ReactImageView;Lcom/facebook/react/bridge/ReadableMap;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/image/ReactImageView;)V", "LF2/f;", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "Ljava/lang/Object;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactImageManager extends SimpleViewManager<ReactImageView> {

    @NotNull
    private static final String ON_ERROR = "onError";

    @NotNull
    private static final String ON_LOAD = "onLoad";

    @NotNull
    private static final String ON_LOAD_END = "onLoadEnd";

    @NotNull
    private static final String ON_LOAD_START = "onLoadStart";

    @NotNull
    private static final String ON_PROGRESS = "onProgress";

    @NotNull
    public static final String REACT_CLASS = "RCTImageView";

    @NotNull
    private static final String REGISTRATION_NAME = "registrationName";

    @Nullable
    private Object callerContext;

    @Nullable
    private final ReactCallerContextFactory callerContextFactory;

    @Nullable
    private final f draweeControllerBuilder;

    @Nullable
    private final GlobalImageLoadListener globalImageLoadListener;

    @JvmOverloads
    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(4), F.b(new Pair(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(5), F.b(new Pair(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(2), F.b(new Pair(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(1), F.b(new Pair(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(3), F.b(new Pair(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "accessible")
    public final void setAccessible(@NotNull ReactImageView view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = "blurRadius")
    public final void setBlurRadius(@NotNull ReactImageView view, float blurRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlurRadius(blurRadius);
    }

    @ReactProp(customType = "Color", name = ViewProps.BORDER_COLOR)
    public final void setBorderColor(@NotNull ReactImageView view, @Nullable Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, borderColor);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(@NotNull ReactImageView view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public final void setBorderWidth(@NotNull ReactImageView view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @ReactProp(name = "defaultSource")
    public final void setDefaultSource(@NotNull ReactImageView view, @Nullable String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultSource(source);
    }

    @ReactProp(name = "fadeDuration")
    public final void setFadeDuration(@NotNull ReactImageView view, int durationMs) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFadeDuration(durationMs);
    }

    @ReactProp(name = "headers")
    public final void setHeaders(@NotNull ReactImageView view, @Nullable ReadableMap headers) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @ReactProp(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(@NotNull ReactImageView view, @Nullable String analyticTag) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        if (reactCallerContextFactory != null) {
            Context context = view.getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            view.updateCallerContext(reactCallerContextFactory.getOrCreateCallerContext(((ThemedReactContext) context).getModuleName(), analyticTag));
        }
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(@NotNull ReactImageView view, boolean shouldNotifyLoadEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(@NotNull ReactImageView view, @Nullable String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLoadingIndicatorSource(source);
    }

    @ReactProp(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(@NotNull ReactImageView view, @Nullable Integer overlayColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(@NotNull ReactImageView view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressiveRenderingEnabled(enabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r3.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.facebook.react.uimanager.ViewProps.RESIZE_METHOD)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setResizeMethod(@org.jetbrains.annotations.NotNull com.facebook.react.views.image.ReactImageView r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L64
            int r0 = r3.hashCode()
            switch(r0) {
                case -934437708: goto L38;
                case 3005871: goto L2f;
                case 3387192: goto L20;
                case 109250890: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L40
        L10:
            java.lang.String r0 = "scale"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1a
            goto L40
        L1a:
            com.facebook.react.views.image.ImageResizeMethod r3 = com.facebook.react.views.image.ImageResizeMethod.SCALE
            r2.setResizeMethod(r3)
            return
        L20:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L40
        L29:
            com.facebook.react.views.image.ImageResizeMethod r3 = com.facebook.react.views.image.ImageResizeMethod.NONE
            r2.setResizeMethod(r3)
            return
        L2f:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L64
            goto L40
        L38:
            java.lang.String r0 = "resize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
        L40:
            com.facebook.react.views.image.ImageResizeMethod r0 = com.facebook.react.views.image.ImageResizeMethod.AUTO
            r2.setResizeMethod(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid resize method: '"
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ReactNative"
            p229p2.a.v(r3, r2)
            return
        L5e:
            com.facebook.react.views.image.ImageResizeMethod r3 = com.facebook.react.views.image.ImageResizeMethod.RESIZE
            r2.setResizeMethod(r3)
            return
        L64:
            com.facebook.react.views.image.ImageResizeMethod r3 = com.facebook.react.views.image.ImageResizeMethod.AUTO
            r2.setResizeMethod(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageManager.setResizeMethod(com.facebook.react.views.image.ReactImageView, java.lang.String):void");
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(@NotNull ReactImageView view, @Nullable String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
        view.setTileMode(ImageResizeMode.toTileMode(resizeMode));
    }

    @ReactProp(name = "resizeMultiplier")
    public final void setResizeMultiplier(@NotNull ReactImageView view, float resizeMultiplier) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resizeMultiplier < 0.01f) {
            a.v("ReactNative", "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @ReactProp(name = "source")
    public final void setSource(@NotNull ReactImageView view, @Nullable ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSource(sources);
    }

    @ReactProp(name = "src")
    public final void setSrc(@NotNull ReactImageView view, @Nullable ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        setSource(view, sources);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public final void setTintColor(@NotNull ReactImageView view, @Nullable Integer tintColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @JvmOverloads
    public ReactImageManager(@Nullable f fVar) {
        this(fVar, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactImageView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object orCreateCallerContext = this.callerContext;
        if (orCreateCallerContext == null) {
            ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
            orCreateCallerContext = reactCallerContextFactory != null ? reactCallerContextFactory.getOrCreateCallerContext(context.getModuleName(), null) : null;
        }
        f fVar = this.draweeControllerBuilder;
        if (fVar == null) {
            fVar = p118hf.a.f37380c.get();
        }
        return new ReactImageView(context, fVar, this.globalImageLoadListener, orCreateCallerContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.maybeUpdateView();
    }

    @JvmOverloads
    public ReactImageManager(@Nullable f fVar, @Nullable GlobalImageLoadListener globalImageLoadListener) {
        this(fVar, globalImageLoadListener, null, 4, null);
    }

    public /* synthetic */ ReactImageManager(f fVar, GlobalImageLoadListener globalImageLoadListener, ReactCallerContextFactory reactCallerContextFactory, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fVar, (i7 & 2) != 0 ? null : globalImageLoadListener, (i7 & 4) != 0 ? null : reactCallerContextFactory);
    }

    @JvmOverloads
    public ReactImageManager(@Nullable f fVar, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable ReactCallerContextFactory reactCallerContextFactory) {
        this.draweeControllerBuilder = fVar;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContextFactory = reactCallerContextFactory;
    }

    @Deprecated(message = "Use the constructor with ReactCallerContextFactory instead", replaceWith = @ReplaceWith(expression = "ReactImageManager(draweeControllerBuilder, globalImageLoadListener, callerContextFactory)", imports = {}))
    public ReactImageManager(@Nullable f fVar, @Nullable Object obj) {
        this(fVar, (GlobalImageLoadListener) null, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }

    @Deprecated(message = "Use the constructor with ReactCallerContextFactory instead", replaceWith = @ReplaceWith(expression = "ReactImageManager(draweeControllerBuilder, globalImageLoadListener, callerContextFactory)", imports = {}))
    public ReactImageManager(@Nullable f fVar, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable Object obj) {
        this(fVar, globalImageLoadListener, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }
}
