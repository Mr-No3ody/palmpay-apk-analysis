package androidx.viewpager2.adapter;

import M.j;
import N8.q0;
import android.view.ViewParent;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p045d3.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f18270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f18271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LifecycleEventObserver f18272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2 f18273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18274e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f18275f;

    public e(f fVar) {
        this.f18275f = fVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z3) {
        int currentItem;
        Fragment fragment;
        f fVar = this.f18275f;
        Z z8 = fVar.f18277b;
        if (!z8.P() && this.f18273d.getScrollState() == 0) {
            j jVar = fVar.f18278c;
            if (jVar.g() == 0 || fVar.getItemCount() == 0 || (currentItem = this.f18273d.getCurrentItem()) >= fVar.getItemCount()) {
                return;
            }
            long itemId = fVar.getItemId(currentItem);
            if ((itemId != this.f18274e || z3) && (fragment = (Fragment) jVar.b(itemId)) != null && fragment.isAdded()) {
                this.f18274e = itemId;
                C1161a c1161aE = q0.e(z8, z8);
                ArrayList<List> arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i7 = 0; i7 < jVar.g(); i7++) {
                    long jD = jVar.d(i7);
                    Fragment fragment3 = (Fragment) jVar.h(i7);
                    if (fragment3.isAdded()) {
                        if (jD != this.f18274e) {
                            c1161aE.n(fragment3, EnumC1204n.f17463d);
                            k kVar = fVar.f18282g;
                            kVar.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = ((CopyOnWriteArrayList) kVar.f35518b).iterator();
                            if (it.hasNext()) {
                                it.next().getClass();
                                throw new ClassCastException();
                            }
                            arrayList.add(arrayList2);
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(jD == this.f18274e);
                    }
                }
                if (fragment2 != null) {
                    c1161aE.n(fragment2, EnumC1204n.f17464e);
                    k kVar2 = fVar.f18282g;
                    kVar2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((CopyOnWriteArrayList) kVar2.f35518b).iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.add(arrayList3);
                }
                if (c1161aE.f17161a.isEmpty()) {
                    return;
                }
                c1161aE.i();
                Collections.reverse(arrayList);
                for (List list : arrayList) {
                    fVar.f18282g.getClass();
                    k.b(list);
                }
            }
        }
    }
}
