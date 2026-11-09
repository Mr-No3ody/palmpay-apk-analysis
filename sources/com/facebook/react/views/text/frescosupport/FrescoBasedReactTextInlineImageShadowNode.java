package com.facebook.react.views.text.frescosupport;

import F2.f;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B+\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b-\u0010.R&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u00101\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageShadowNode;", "Lcom/facebook/react/views/text/internal/ReactTextInlineImageShadowNode;", "LF2/f;", "Lcom/facebook/imagepipeline/request/d;", "draweeControllerBuilder", "", "callerContext", "<init>", "(LF2/f;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/bridge/ReadableMap;", "newHeaders", "setHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)V", "", "newTintColor", "setTintColor", "(I)V", "Lcom/facebook/react/bridge/Dynamic;", "newWidth", "setWidth", "(Lcom/facebook/react/bridge/Dynamic;)V", "newHeight", "setHeight", "", "newResizeMode", "setResizeMode", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getHeaders", "()Lcom/facebook/react/bridge/ReadableMap;", "", "isVirtual", "()Z", "Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;", "buildInlineImageSpan", "()Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;", "getDraweeControllerBuilder", "()LF2/f;", "getCallerContext", "()Ljava/lang/Object;", "LF2/f;", "Ljava/lang/Object;", "uri", "Landroid/net/Uri;", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "", "width", "F", ViewProps.RESIZE_MODE, "Ljava/lang/String;", "height", "tintColor", "I", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Object callerContext;

    @NotNull
    private final f draweeControllerBuilder;

    @Nullable
    private ReadableMap headers;
    private float height;

    @Nullable
    private String resizeMode;
    private int tintColor;

    @Nullable
    private Uri uri;
    private float width;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageShadowNode$Companion;", "", "<init>", "()V", "getResourceDrawableUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "name", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Uri getResourceDrawableUri(@NotNull Context context, @Nullable String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (name == null || name.length() == 0) {
                return null;
            }
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(y.k(lowerCase, "-", "_"), "drawable", context.getPackageName()))).build();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("FrescoBasedReactTextInlineImageShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    public FrescoBasedReactTextInlineImageShadowNode(@NotNull f draweeControllerBuilder, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.callerContext = obj;
        this.width = Float.NaN;
        this.height = Float.NaN;
    }

    @Override // com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode
    @NotNull
    public TextInlineImageSpan buildInlineImageSpan() {
        Resources resources = getThemedContext().getResources();
        int iCeil = (int) Math.ceil(this.width);
        int iCeil2 = (int) Math.ceil(this.height);
        Intrinsics.e(resources);
        return new FrescoBasedReactTextInlineImageSpan(resources, iCeil2, iCeil, this.tintColor, getUri(), getHeaders(), getDraweeControllerBuilder(), getCallerContext(), this.resizeMode);
    }

    @Nullable
    public final Object getCallerContext() {
        return this.callerContext;
    }

    @NotNull
    public final f getDraweeControllerBuilder() {
        return this.draweeControllerBuilder;
    }

    @Nullable
    public final ReadableMap getHeaders() {
        return this.headers;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = "headers")
    public final void setHeaders(@Nullable ReadableMap newHeaders) {
        this.headers = newHeaders;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setHeight(@NotNull Dynamic newHeight) {
        Intrinsics.checkNotNullParameter(newHeight, "newHeight");
        if (newHeight.getType() == ReadableType.Number) {
            this.height = (float) newHeight.asDouble();
        } else {
            a.v("ReactNative", "Inline images must not have percentage based height");
            this.height = Float.NaN;
        }
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(@Nullable String newResizeMode) {
        this.resizeMode = newResizeMode;
    }

    @ReactProp(name = "src")
    public final void setSource(@Nullable ReadableArray sources) {
        String string;
        Uri resourceDrawableUri = null;
        if (sources == null || sources.size() == 0 || sources.getType(0) != ReadableType.Map) {
            string = null;
        } else {
            ReadableMap map = sources.getMap(0);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            string = map.getString("uri");
        }
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                try {
                    if (uri.getScheme() != null) {
                        resourceDrawableUri = uri;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (resourceDrawableUri == null) {
                Companion companion = INSTANCE;
                ThemedReactContext themedContext = getThemedContext();
                Intrinsics.checkNotNullExpressionValue(themedContext, "getThemedContext(...)");
                resourceDrawableUri = companion.getResourceDrawableUri(themedContext, string);
            }
        }
        if (!Intrinsics.c(resourceDrawableUri, this.uri)) {
            markUpdated();
        }
        this.uri = resourceDrawableUri;
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public final void setTintColor(int newTintColor) {
        this.tintColor = newTintColor;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setWidth(@NotNull Dynamic newWidth) {
        Intrinsics.checkNotNullParameter(newWidth, "newWidth");
        if (newWidth.getType() == ReadableType.Number) {
            this.width = (float) newWidth.asDouble();
        } else {
            a.v("ReactNative", "Inline images must not have percentage based width");
            this.width = Float.NaN;
        }
    }
}
