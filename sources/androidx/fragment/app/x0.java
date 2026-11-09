package androidx.fragment.app;

import android.view.View;
import androidx.core.os.CancellationSignal$OnCancelListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0 f17246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f17247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f17248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f17250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f17253h;

    public x0(B0 finalState, z0 lifecycleImpact, f0 fragmentStateManager, androidx.core.os.d cancellationSignal) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Fragment fragment = fragmentStateManager.f17125c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        this.f17246a = finalState;
        this.f17247b = lifecycleImpact;
        this.f17248c = fragment;
        this.f17249d = new ArrayList();
        this.f17250e = new LinkedHashSet();
        cancellationSignal.b(new CancellationSignal$OnCancelListener() { // from class: androidx.fragment.app.y0
            @Override // androidx.core.os.CancellationSignal$OnCancelListener
            public final void onCancel() {
                x0 this$0 = this.f17254a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.a();
            }
        });
        this.f17253h = fragmentStateManager;
    }

    public final void a() {
        if (this.f17251f) {
            return;
        }
        this.f17251f = true;
        LinkedHashSet linkedHashSet = this.f17250e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = CollectionsKt.a0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((androidx.core.os.d) it.next()).a();
        }
    }

    public final void b() {
        if (!this.f17252g) {
            if (Z.L(2)) {
                toString();
            }
            this.f17252g = true;
            Iterator it = this.f17249d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f17253h.i();
    }

    public final void c(B0 finalState, z0 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int iOrdinal = lifecycleImpact.ordinal();
        Fragment fragment = this.f17248c;
        if (iOrdinal == 0) {
            if (this.f17246a != B0.f16950b) {
                if (Z.L(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f17246a);
                    Objects.toString(finalState);
                }
                this.f17246a = finalState;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.f17246a == B0.f16950b) {
                if (Z.L(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f17247b);
                }
                this.f17246a = B0.f16951c;
                this.f17247b = z0.f17256b;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        if (Z.L(2)) {
            Objects.toString(fragment);
            Objects.toString(this.f17246a);
            Objects.toString(this.f17247b);
        }
        this.f17246a = B0.f16950b;
        this.f17247b = z0.f17257c;
    }

    public final void d() {
        z0 z0Var = this.f17247b;
        z0 z0Var2 = z0.f17256b;
        f0 f0Var = this.f17253h;
        if (z0Var != z0Var2) {
            if (z0Var == z0.f17257c) {
                Fragment fragment = f0Var.f17125c;
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                View viewRequireView = fragment.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                if (Z.L(2)) {
                    Objects.toString(viewRequireView.findFocus());
                    viewRequireView.toString();
                    fragment.toString();
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = f0Var.f17125c;
        Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (Z.L(2)) {
                viewFindFocus.toString();
                fragment2.toString();
            }
        }
        View viewRequireView2 = this.f17248c.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView2, "this.fragment.requireView()");
        if (viewRequireView2.getParent() == null) {
            f0Var.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        StringBuilder sbQ = N8.q0.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbQ.append(this.f17246a);
        sbQ.append(" lifecycleImpact = ");
        sbQ.append(this.f17247b);
        sbQ.append(" fragment = ");
        sbQ.append(this.f17248c);
        sbQ.append('}');
        return sbQ.toString();
    }
}
