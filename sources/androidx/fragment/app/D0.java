package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0 f16973f = new w0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f16974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16978e;

    public D0(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f16974a = container;
        this.f16975b = new ArrayList();
        this.f16976c = new ArrayList();
    }

    public final void a(B0 b0, z0 z0Var, f0 f0Var) {
        synchronized (this.f16975b) {
            androidx.core.os.d dVar = new androidx.core.os.d();
            Fragment fragment = f0Var.f17125c;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            x0 x0VarD = d(fragment);
            if (x0VarD != null) {
                x0VarD.c(b0, z0Var);
                return;
            }
            x0 x0Var = new x0(b0, z0Var, f0Var, dVar);
            this.f16975b.add(x0Var);
            v0 listener = new v0(this, x0Var, 0);
            Intrinsics.checkNotNullParameter(listener, "listener");
            x0Var.f17249d.add(listener);
            v0 listener2 = new v0(this, x0Var, 1);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            x0Var.f17249d.add(listener2);
            Unit unit = Unit.f38893a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z3);

    public final void c() {
        if (this.f16978e) {
            return;
        }
        ViewGroup viewGroup = this.f16974a;
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f16977d = false;
            return;
        }
        synchronized (this.f16975b) {
            try {
                if (!this.f16975b.isEmpty()) {
                    ArrayList<x0> arrayListZ = CollectionsKt.Z(this.f16976c);
                    this.f16976c.clear();
                    for (x0 x0Var : arrayListZ) {
                        if (Z.L(2)) {
                            Objects.toString(x0Var);
                        }
                        x0Var.a();
                        if (!x0Var.f17252g) {
                            this.f16976c.add(x0Var);
                        }
                    }
                    g();
                    ArrayList arrayListZ2 = CollectionsKt.Z(this.f16975b);
                    this.f16975b.clear();
                    this.f16976c.addAll(arrayListZ2);
                    Iterator it = arrayListZ2.iterator();
                    while (it.hasNext()) {
                        ((x0) it.next()).d();
                    }
                    b(arrayListZ2, this.f16977d);
                    this.f16977d = false;
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final x0 d(Fragment fragment) {
        Object next;
        Iterator it = this.f16975b.iterator();
        while (it.hasNext()) {
            next = it.next();
            x0 x0Var = (x0) next;
            if (Intrinsics.c(x0Var.f17248c, fragment) && !x0Var.f17251f) {
                return (x0) next;
            }
        }
        next = null;
        return (x0) next;
    }

    public final void e() {
        ViewGroup viewGroup = this.f16974a;
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f16975b) {
            try {
                g();
                Iterator it = this.f16975b.iterator();
                while (it.hasNext()) {
                    ((x0) it.next()).d();
                }
                for (x0 x0Var : CollectionsKt.Z(this.f16976c)) {
                    if (Z.L(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f16974a);
                        }
                        Objects.toString(x0Var);
                    }
                    x0Var.a();
                }
                for (x0 x0Var2 : CollectionsKt.Z(this.f16975b)) {
                    if (Z.L(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f16974a);
                        }
                        Objects.toString(x0Var2);
                    }
                    x0Var2.a();
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        Object objPrevious;
        synchronized (this.f16975b) {
            try {
                g();
                ArrayList arrayList = this.f16975b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    x0 x0Var = (x0) objPrevious;
                    A0 a3 = B0.f16949a;
                    View view = x0Var.f17248c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    B0 b0AsOperationState = a3.asOperationState(view);
                    B0 b0 = x0Var.f17246a;
                    B0 b7 = B0.f16951c;
                    if (b0 == b7 && b0AsOperationState != b7) {
                        break;
                    }
                }
                x0 x0Var2 = (x0) objPrevious;
                Fragment fragment = x0Var2 != null ? x0Var2.f17248c : null;
                this.f16978e = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        for (x0 x0Var : this.f16975b) {
            if (x0Var.f17247b == z0.f17256b) {
                View viewRequireView = x0Var.f17248c.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                x0Var.c(B0.f16949a.from(viewRequireView.getVisibility()), z0.f17255a);
            }
        }
    }
}
