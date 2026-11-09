package E0;

import C0.C0119k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f2165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0119k f2166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, Fragment fragment, C0119k c0119k) {
        super(1);
        this.f2164a = fVar;
        this.f2165b = fragment;
        this.f2166c = c0119k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        f fVar = this.f2164a;
        ArrayList arrayList = fVar.f2156g;
        Fragment fragment = this.f2165b;
        boolean z3 = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((Pair) it.next()).f38891a, fragment.getTag())) {
                    z3 = true;
                    break;
                }
            }
        }
        if (lifecycleOwner != null && !z3) {
            AbstractC1205o lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (((C1212w) lifecycle).f17478d.a(EnumC1204n.f17462c)) {
                lifecycle.a((LifecycleObserver) fVar.f2158i.invoke(this.f2166c));
            }
        }
        return Unit.f38893a;
    }
}
