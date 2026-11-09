package com.th3rdwave.safeareacontext;

import Z4.e;
import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.a;
import p140j8.d;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNCSafeAreaContext")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;", "Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getInitialWindowMetrics", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "getTypedExportedConstants", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {

    @NotNull
    public static final String NAME = "RNCSafeAreaContext";

    public SafeAreaContextModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        View viewFindViewById;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        ViewGroup viewGroup = (ViewGroup) ((currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView());
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.content)) != null) {
            a insets = e.q(viewGroup);
            d rect = e.n(viewGroup, viewFindViewById);
            if (insets != null && rect != null) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                Pair pair = new Pair("insets", G.g(new Pair(ViewProps.TOP, Float.valueOf(PixelUtil.toDIPFromPixel(insets.f38332a))), new Pair(ViewProps.RIGHT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.f38333b))), new Pair(ViewProps.BOTTOM, Float.valueOf(PixelUtil.toDIPFromPixel(insets.f38334c))), new Pair(ViewProps.LEFT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.f38335d)))));
                Intrinsics.checkNotNullParameter(rect, "rect");
                return G.g(pair, new Pair("frame", G.g(new Pair("x", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f38338a))), new Pair("y", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f38339b))), new Pair("width", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f38340c))), new Pair("height", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f38341d))))));
            }
        }
        return null;
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNCSafeAreaContext";
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return F.b(new Pair("initialWindowMetrics", getInitialWindowMetrics()));
    }
}
