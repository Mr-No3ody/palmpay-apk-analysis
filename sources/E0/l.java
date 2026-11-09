package E0;

import C0.C0119k;
import C0.C0123o;
import androidx.camera.video.u;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$OnBackStackChangedListener;
import androidx.fragment.app.Z;
import androidx.lifecycle.EnumC1204n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.P;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements FragmentManager$OnBackStackChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0123o f2170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2171b;

    public l(C0123o c0123o, f fVar) {
        this.f2170a = c0123o;
        this.f2171b = fVar;
    }

    @Override // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
    public final void onBackStackChangeCommitted(Fragment fragment, boolean z3) {
        Object obj;
        Object objPrevious;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C0123o c0123o = this.f2170a;
        ArrayList arrayListP = CollectionsKt.P((Collection) c0123o.f1070e.f39102a.getValue(), (Iterable) c0123o.f1071f.f39102a.getValue());
        ListIterator listIterator = arrayListP.listIterator(arrayListP.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!Intrinsics.c(((C0119k) objPrevious).f1055f, fragment.getTag()));
        C0119k c0119k = (C0119k) objPrevious;
        f fVar = this.f2171b;
        boolean z8 = z3 && fVar.f2156g.isEmpty() && fragment.isRemoving();
        for (Object obj2 : fVar.f2156g) {
            if (Intrinsics.c(((Pair) obj2).f38891a, fragment.getTag())) {
                obj = obj2;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            fVar.f2156g.remove(pair);
        }
        if (!z8 && Z.L(2)) {
            Objects.toString(fragment);
            Objects.toString(c0119k);
        }
        boolean z10 = pair != null && ((Boolean) pair.f38892b).booleanValue();
        if (!z3 && !z10 && c0119k == null) {
            throw new IllegalArgumentException(u.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (c0119k != null) {
            f.l(c0119k, c0123o, fragment);
            if (z8) {
                if (Z.L(2)) {
                    fragment.toString();
                    c0119k.toString();
                }
                c0123o.f(c0119k, false);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
    public final void onBackStackChangeStarted(Fragment fragment, boolean z3) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (z3) {
            C0123o c0123o = this.f2170a;
            List list = (List) c0123o.f1070e.f39102a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!Intrinsics.c(((C0119k) objPrevious).f1055f, fragment.getTag()));
            C0119k entry = (C0119k) objPrevious;
            if (Z.L(2)) {
                Objects.toString(fragment);
                Objects.toString(entry);
            }
            if (entry != null) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(entry, "entry");
                g0 g0Var = c0123o.f1068c;
                g0Var.e(null, P.c((Set) g0Var.getValue(), entry));
                if (!c0123o.f1073h.f1107g.contains(entry)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                entry.b(EnumC1204n.f17463d);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
    public final void onBackStackChanged() {
    }
}
