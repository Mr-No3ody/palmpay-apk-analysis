package com.swmansion.rnscreens.safearea;

import Y7.b;
import Y7.c;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.graphics.e;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.o0;
import androidx.core.view.q0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0013J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/swmansion/rnscreens/safearea/SafeAreaView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "LZ7/b;", "edges", "setEdges", "(LZ7/b;)V", "LY7/c;", "insetType", "setInsetType", "(LY7/c;)V", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class SafeAreaView extends ReactViewGroup implements OnApplyWindowInsetsListener, ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f25469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f25470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f25471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StateWrapper f25473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z7.b f25474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f25475g;

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

    public final e b(e eVar) {
        Z7.b bVar = this.f25474f;
        e eVarB = e.b(bVar != null ? bVar.f11566a : false ? 0 : eVar.f16058a, bVar != null ? bVar.f11567b : false ? 0 : eVar.f16059b, bVar != null ? bVar.f11568c : false ? 0 : eVar.f16060c, bVar != null ? bVar.f11569d : false ? 0 : eVar.f16061d);
        Intrinsics.checkNotNullExpressionValue(eVarB, "of(...)");
        return eVarB;
    }

    public final void c() {
        Y7.a aVar = b.f11305e;
        c cVar = this.f25475g;
        cVar.getClass();
        c cVar2 = c.f11311a;
        b zero = (cVar == cVar2 || cVar == c.f11313c) ? this.f25470b : aVar.getZERO();
        c cVar3 = this.f25475g;
        cVar3.getClass();
        b bVarMax = aVar.max(zero, (cVar3 == cVar2 || cVar3 == c.f11312b) ? this.f25471c : aVar.getZERO());
        StateWrapper f25473e = getF25473e();
        if (f25473e != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(bVarMax.f11307a));
            writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(bVarMax.f11308b));
            writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(bVarMax.f11309c));
            writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(bVarMax.f11310d));
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
            writableMapCreateMap2.putMap("insets", writableMapCreateMap);
            f25473e.updateState(writableMapCreateMap2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getStateWrapper, reason: from getter */
    public final StateWrapper getF25473e() {
        return this.f25473e;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View view, q0 insets) {
        i0 g0Var;
        boolean z3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        e eVarG = insets.f16277a.g(135);
        Intrinsics.checkNotNullExpressionValue(eVarG, "getInsets(...)");
        if (!Intrinsics.c(eVarG, this.f25471c)) {
            this.f25471c = b.f11305e.fromInsets(eVarG);
            c cVar = this.f25475g;
            cVar.getClass();
            if (cVar == c.f11311a || cVar == c.f11312b) {
                this.f25472d = true;
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            g0Var = new h0(insets);
        } else {
            g0Var = i7 >= 29 ? new g0(insets) : new f0(insets);
        }
        c cVar2 = this.f25475g;
        cVar2.getClass();
        if (cVar2 == c.f11311a || cVar2 == c.f11312b) {
            o0 o0Var = insets.f16277a;
            e eVarG2 = o0Var.g(7);
            Intrinsics.checkNotNullExpressionValue(eVarG2, "getInsets(...)");
            e eVarB = b(eVarG2);
            e eVarG3 = o0Var.g(128);
            Intrinsics.checkNotNullExpressionValue(eVarG3, "getInsets(...)");
            e eVarB2 = b(eVarG3);
            boolean zEquals = eVarB2.equals(e.f16057e);
            g0Var.c(7, eVarB);
            g0Var.c(128, eVarB2);
            z3 = zEquals;
        } else {
            z3 = false;
        }
        q0 q0VarB = g0Var.b();
        Intrinsics.checkNotNullExpressionValue(q0VarB, "build(...)");
        if (i7 >= 30 || !z3) {
            return q0VarB;
        }
        q0 q0VarA = q0VarB.f16277a.a();
        Intrinsics.checkNotNullExpressionValue(q0VarA, "consumeDisplayCutout(...)");
        return q0VarA;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof SafeAreaProvider)) {
            parent = parent.getParent();
        }
        SafeAreaProvider safeAreaProvider = parent instanceof SafeAreaProvider ? (SafeAreaProvider) parent : null;
        if (safeAreaProvider == null) {
            super.onAttachedToWindow();
            return;
        }
        safeAreaProvider.setOnInterfaceInsetsChangeListener(this);
        this.f25469a = new WeakReference(safeAreaProvider);
        this.f25470b = safeAreaProvider.getInterfaceInsets();
        c();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        SafeAreaProvider safeAreaProvider = (SafeAreaProvider) this.f25469a.get();
        if (safeAreaProvider != null) {
            safeAreaProvider.removeOnInterfaceInsetsChangeListener(this);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z3 = false;
        if (this.f25472d) {
            this.f25472d = false;
            c();
            z3 = true;
        }
        if (z3) {
            requestLayout();
        }
        return !z3;
    }

    public final void setEdges(@NotNull Z7.b edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f25474f = edges;
        requestApplyInsets();
        this.f25472d = true;
    }

    public final void setInsetType(@NotNull c insetType) {
        Intrinsics.checkNotNullParameter(insetType, "insetType");
        this.f25475g = insetType;
        requestApplyInsets();
        this.f25472d = true;
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f25473e = stateWrapper;
    }
}
