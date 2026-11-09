package C0;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0123o f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1037b;

    public abstract K a();

    public final C0123o b() {
        C0123o c0123o = this.f1036a;
        if (c0123o != null) {
            return c0123o;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public K c(K destination, Bundle bundle, U u6) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, U u6) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Sf.e eVarF = Sf.p.f(CollectionsKt.y(entries), new C0126s(1, this, u6));
        Intrinsics.checkNotNullParameter(eVarF, "<this>");
        Fe.h0 predicate = new Fe.h0(25);
        Intrinsics.checkNotNullParameter(eVarF, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Sf.d dVar = new Sf.d(new Sf.g(eVarF, false, predicate));
        while (dVar.hasNext()) {
            b().g((C0119k) dVar.next());
        }
    }

    public void e(C0123o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f1036a = state;
        this.f1037b = true;
    }

    public void f(C0119k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        K k2 = backStackEntry.f1051b;
        if (k2 == null) {
            k2 = null;
        }
        if (k2 == null) {
            return;
        }
        c(k2, null, p002a.a.u(C0111c.f1015v));
        b().c(backStackEntry);
    }

    public void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle h() {
        return null;
    }

    public void i(C0119k popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().f1070e.f39102a.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0119k c0119k = null;
        while (j()) {
            c0119k = (C0119k) listIterator.previous();
            if (Intrinsics.c(c0119k, popUpTo)) {
                break;
            }
        }
        if (c0119k != null) {
            b().d(c0119k, z3);
        }
    }

    public boolean j() {
        return true;
    }
}
