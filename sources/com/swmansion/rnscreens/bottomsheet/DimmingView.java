package com.swmansion.rnscreens.bottomsheet;

import M7.C0448h;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fR\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ReactCompoundViewGroup;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "", "getBlockGestures$react_native_screens_release", "()Z", "blockGestures", "Lcom/facebook/react/uimanager/PointerEvents;", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", ViewProps.POINTER_EVENTS, "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class DimmingView extends ViewGroup implements ReactCompoundViewGroup, ReactPointerEventsView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0448h f25392a;

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

    public DimmingView(ThemedReactContext context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0448h pointerEventsProxy = new C0448h(2);
        pointerEventsProxy.f5820b = null;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsProxy, "pointerEventsProxy");
        super(context);
        this.f25392a = pointerEventsProxy;
        pointerEventsProxy.f5820b = new C0448h(this);
        setBackgroundColor(-16777216);
        setAlpha(f10);
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !(Math.abs(getAlpha() - 0.0f) <= 1.0E-4f);
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.f25392a.getPointerEvents();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundViewGroup
    public final boolean interceptsTouchEvent(float f10, float f11) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25392a.f5820b = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public final int reactTagForTouch(float f10, float f11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }
}
