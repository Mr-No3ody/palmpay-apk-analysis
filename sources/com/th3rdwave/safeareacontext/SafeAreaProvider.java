package com.th3rdwave.safeareacontext;

import Z4.e;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p140j8.a;
import p140j8.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jb\u0010\u0012\u001a\u00020\u000f2S\u0010\u0011\u001aO\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007j\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "view", "Lj8/a;", "insets", "Lj8/d;", "frame", "", "Lcom/th3rdwave/safeareacontext/OnInsetsChangeHandler;", "handler", "setOnInsetsChangeHandler", "(Lkotlin/jvm/functions/Function3;)V", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function3 f25530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f25531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f25532c;

    public SafeAreaProvider(@Nullable Context context) {
        super(context);
    }

    public final void b() {
        a aVarQ;
        Function3 function3 = this.f25530a;
        if (function3 == null || (aVarQ = e.q(this)) == null) {
            return;
        }
        View rootView = getRootView();
        Intrinsics.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        d dVarN = e.n((ViewGroup) rootView, this);
        if (dVarN == null) {
            return;
        }
        if (Intrinsics.c(this.f25531b, aVarQ) && Intrinsics.c(this.f25532c, dVarN)) {
            return;
        }
        function3.invoke(this, aVarQ, dVarN);
        this.f25531b = aVarQ;
        this.f25532c = dVarN;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        return true;
    }

    public final void setOnInsetsChangeHandler(@Nullable Function3<? super SafeAreaProvider, ? super a, ? super d, Unit> handler) {
        this.f25530a = handler;
        b();
    }
}
