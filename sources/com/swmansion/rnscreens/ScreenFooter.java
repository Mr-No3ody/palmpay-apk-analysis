package com.swmansion.rnscreens;

import M7.t;
import M7.u;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.N;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.math.MathUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFooter;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/bridge/ReactContext;", "a", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lcom/swmansion/rnscreens/Screen;", "getScreenParent", "()Lcom/swmansion/rnscreens/Screen;", "screenParent", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "", "getHasReceivedInitialLayoutFromParent", "()Z", "hasReceivedInitialLayoutFromParent", "", "getReactHeight", "()I", "reactHeight", "getReactWidth", "reactWidth", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nScreenFooter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenFooter.kt\ncom/swmansion/rnscreens/ScreenFooter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
public final class ScreenFooter extends ReactViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25313i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f25314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f25320g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenFooter(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f25314a = reactContext;
        u uVar = new u(this);
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        N.t(decorView, uVar);
        this.f25320g = new t(this);
    }

    public static final int c(ScreenFooter screenFooter, float f10) {
        Screen screenParent = screenFooter.getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) MathUtils.lerp(screenFooter.g(4), screenFooter.g(3), f10);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f25315b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final Screen getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        Screen screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent.getSheetBehavior();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void d(int i7, int i10, int i11, int i12) {
        int iMax = ((i7 - i10) - i11) - Math.max(i12, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void e(int i7) {
        this.f25315b = i7;
        int reactHeight = getReactHeight();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d(i7, reactHeight, g(sheetBehavior.getState()), 0);
    }

    public final void f(BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.f25319f) {
            return;
        }
        behavior.addBottomSheetCallback(this.f25320g);
        this.f25319f = true;
    }

    public final int g(int i7) {
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i7 == 3) {
            return sheetBehavior.getExpandedOffset();
        }
        if (i7 == 4) {
            return this.f25315b - sheetBehavior.getPeekHeight();
        }
        if (i7 == 5) {
            return this.f25315b;
        }
        if (i7 != 6) {
            throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
        }
        return (int) ((1 - sheetBehavior.getHalfExpandedRatio()) * this.f25315b);
    }

    @NotNull
    public final ReactContext getReactContext() {
        return this.f25314a;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            f(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<Screen> behavior = getSheetBehavior();
        if (behavior != null) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            if (this.f25319f) {
                behavior.removeBottomSheetCallback(this.f25320g);
                this.f25319f = false;
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (getHasReceivedInitialLayoutFromParent()) {
            int i13 = this.f25315b;
            int i14 = i12 - i10;
            BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
            if (sheetBehavior == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d(i13, i14, g(sheetBehavior.getState()), this.f25318e);
        }
    }
}
