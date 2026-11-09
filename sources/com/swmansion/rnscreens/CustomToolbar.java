package com.swmansion.rnscreens;

import M7.ChoreographerFrameCallbackC0441a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.e;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/CustomToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "a", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "getConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "config", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class CustomToolbar extends Toolbar {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ScreenStackHeaderConfig config;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f25255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25257g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ChoreographerFrameCallbackC0441a f25258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(Context context, ScreenStackHeaderConfig config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.f25252b = true;
        this.f25253c = true;
        e NONE = e.f16057e;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f25255e = NONE;
        getMenu();
        this.f25258i = new ChoreographerFrameCallbackC0441a(this, 0);
    }

    @NotNull
    public final ScreenStackHeaderConfig getConfig() {
        return this.config;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        e eVarB0 = b.b0(this, 128, windowInsetsOnApplyWindowInsets);
        e eVarB1 = b.b0(this, 7, windowInsetsOnApplyWindowInsets);
        e eVarB = e.b(eVarB0.f16058a + eVarB1.f16058a, 0, eVarB0.f16060c + eVarB1.f16060c, 0);
        Intrinsics.checkNotNullExpressionValue(eVarB, "of(...)");
        e eVarB2 = e.b(0, Math.max(eVarB0.f16059b, this.f25253c ? eVarB1.f16059b : 0), 0, Math.max(eVarB0.f16061d, 0));
        Intrinsics.checkNotNullExpressionValue(eVarB2, "of(...)");
        e eVarB3 = e.b(eVarB.f16058a + eVarB2.f16058a, eVarB.f16059b + eVarB2.f16059b, eVarB.f16060c + eVarB2.f16060c, eVarB.f16061d + eVarB2.f16061d);
        Intrinsics.checkNotNullExpressionValue(eVarB3, "add(...)");
        if (!Intrinsics.c(this.f25255e, eVarB3)) {
            this.f25255e = eVarB3;
            this.f25254d = true;
            this.f25256f = this.f25252b;
            setPadding(eVarB3.f16058a, eVarB3.f16059b, eVarB3.f16060c, eVarB3.f16061d);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        this.config.c(this, z3 || this.f25256f);
        this.f25256f = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ChoreographerFrameCallbackC0441a choreographerFrameCallbackC0441a;
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        ViewParent parent = getParent();
        Integer numValueOf = null;
        CustomAppBarLayout customAppBarLayout = parent instanceof CustomAppBarLayout ? (CustomAppBarLayout) parent : null;
        if (customAppBarLayout != null && this.f25254d && !customAppBarLayout.isInLayout()) {
            int paddingTop = getPaddingTop();
            customAppBarLayout.measure(View.MeasureSpec.makeMeasureSpec(customAppBarLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(customAppBarLayout.getHeight() + paddingTop, 1073741824));
            customAppBarLayout.layout(customAppBarLayout.getLeft(), customAppBarLayout.getTop(), customAppBarLayout.getRight(), customAppBarLayout.getBottom() + paddingTop);
            this.f25254d = false;
        }
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((ThemedReactContext) context).getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            numValueOf = Integer.valueOf(attributes.softInputMode);
        }
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.f25257g || (choreographerFrameCallbackC0441a = this.f25258i) == null) {
            return;
        }
        this.f25257g = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, choreographerFrameCallbackC0441a);
    }
}
