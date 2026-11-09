package com.th3rdwave.safeareacontext;

import Z4.e;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.a;
import p140j8.g;
import p140j8.h;
import p140j8.i;
import p140j8.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "Lj8/j;", "mode", "setMode", "(Lj8/j;)V", "Lj8/h;", "edges", "setEdges", "(Lj8/h;)V", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaView extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25533f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f25534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f25535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f25536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StateWrapper f25538e;

    public SafeAreaView(@Nullable Context context) {
        super(context);
        this.f25534a = j.f38355a;
    }

    public final void b() {
        a aVar = this.f25535b;
        if (aVar != null) {
            h hVar = this.f25536c;
            if (hVar == null) {
                g gVar = g.f38345b;
                hVar = new h(gVar, gVar, gVar, gVar);
            }
            StateWrapper f25538e = getF25538e();
            if (f25538e != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putMap("insets", p002a.a.j(aVar));
                f25538e.updateState(writableMapCreateMap);
                return;
            }
            i iVar = new i(aVar, this.f25534a, hVar);
            Intrinsics.checkNotNullParameter(this, "view");
            ReactContext reactContext = UIManagerHelper.getReactContext(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), iVar);
                reactContext.runOnNativeModulesQueueThread(new b(uIManagerModule, 13));
                B b7 = new B();
                ReentrantLock reentrantLock = new ReentrantLock();
                Condition conditionNewCondition = reentrantLock.newCondition();
                long jNanoTime = System.nanoTime();
                Intrinsics.checkNotNullParameter(this, "view");
                UIManagerHelper.getReactContext(this).runOnNativeModulesQueueThread(new androidx.emoji2.text.j(reentrantLock, 24, b7, conditionNewCondition));
                reentrantLock.lock();
                for (long jNanoTime2 = 0; !b7.f38947a && jNanoTime2 < 500000000; jNanoTime2 += System.nanoTime() - jNanoTime) {
                    try {
                        try {
                            conditionNewCondition.awaitNanos(500000000L);
                        } catch (InterruptedException unused) {
                            b7.f38947a = true;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                Unit unit = Unit.f38893a;
                reentrantLock.unlock();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getStateWrapper, reason: from getter */
    public final StateWrapper getF25538e() {
        return this.f25538e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        a aVarQ;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == 0) {
                view = this;
                break;
            } else {
                if (parent instanceof SafeAreaProvider) {
                    view = (View) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.f25537d = view;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        View view2 = this.f25537d;
        if (view2 == null || (aVarQ = e.q(view2)) == null || Intrinsics.c(this.f25535b, aVarQ)) {
            return;
        }
        this.f25535b = aVarQ;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f25537d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f25537d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVarQ;
        View view = this.f25537d;
        boolean z3 = false;
        if (view != null && (aVarQ = e.q(view)) != null && !Intrinsics.c(this.f25535b, aVarQ)) {
            this.f25535b = aVarQ;
            b();
            z3 = true;
        }
        if (z3) {
            requestLayout();
        }
        return !z3;
    }

    public final void setEdges(@NotNull h edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f25536c = edges;
        b();
    }

    public final void setMode(@NotNull j mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f25534a = mode;
        b();
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f25538e = stateWrapper;
    }
}
