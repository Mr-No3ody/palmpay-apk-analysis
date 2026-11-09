package androidx.viewpager2.adapter;

import M.j;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.camera.video.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p045d3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends RecyclerView.Adapter implements StatefulAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1205o f18276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f18277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f18278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f18279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f18280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f18281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f18282g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18284j;

    public f(E e10) {
        this(e10.getSupportFragmentManager(), e10.getLifecycle());
    }

    public static void a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean b(long j6) {
        return j6 >= 0 && j6 < ((long) getItemCount());
    }

    public abstract Fragment c(int i7);

    public final void d() {
        j jVar;
        j jVar2;
        Fragment fragment;
        View view;
        if (!this.f18284j || this.f18277b.P()) {
            return;
        }
        M.g gVar = new M.g(0);
        int i7 = 0;
        while (true) {
            jVar = this.f18278c;
            int iG = jVar.g();
            jVar2 = this.f18280e;
            if (i7 >= iG) {
                break;
            }
            long jD = jVar.d(i7);
            if (!b(jD)) {
                gVar.add(Long.valueOf(jD));
                jVar2.f(jD);
            }
            i7++;
        }
        if (!this.f18283i) {
            this.f18284j = false;
            for (int i10 = 0; i10 < jVar.g(); i10++) {
                long jD2 = jVar.d(i10);
                if (jVar2.c(jD2) < 0 && ((fragment = (Fragment) jVar.b(jD2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    gVar.add(Long.valueOf(jD2));
                }
            }
        }
        M.b bVar = new M.b(gVar);
        while (bVar.hasNext()) {
            g(((Long) bVar.next()).longValue());
        }
    }

    public final Long e(int i7) {
        Long lValueOf = null;
        int i10 = 0;
        while (true) {
            j jVar = this.f18280e;
            if (i10 >= jVar.g()) {
                return lValueOf;
            }
            if (((Integer) jVar.h(i10)).intValue() == i7) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(jVar.d(i10));
            }
            i10++;
        }
    }

    public final void f(final g gVar) {
        Fragment fragment = (Fragment) this.f18278c.b(gVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) gVar.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zIsAdded = fragment.isAdded();
        Z z3 = this.f18277b;
        if (zIsAdded && view == null) {
            z3.Y(new a(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                a(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            a(view, frameLayout);
            return;
        }
        if (z3.P()) {
            if (z3.f17060J) {
                return;
            }
            this.f18276a.a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
                    f fVar = this.f18261b;
                    if (fVar.f18277b.P()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().b(this);
                    g gVar2 = gVar;
                    if (((FrameLayout) gVar2.itemView).isAttachedToWindow()) {
                        fVar.f(gVar2);
                    }
                }
            });
            return;
        }
        z3.Y(new a(this, fragment, frameLayout), false);
        k kVar = this.f18282g;
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) kVar.f35518b).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        try {
            fragment.setMenuVisibility(false);
            C1161a c1161a = new C1161a(z3);
            c1161a.d(0, fragment, "f" + gVar.getItemId(), 1);
            c1161a.n(fragment, EnumC1204n.f17463d);
            c1161a.i();
            this.f18281f.b(false);
        } finally {
            k.b(arrayList);
        }
    }

    public final void g(long j6) {
        ViewParent parent;
        j jVar = this.f18278c;
        Fragment fragment = (Fragment) jVar.b(j6);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zB = b(j6);
        j jVar2 = this.f18279d;
        if (!zB) {
            jVar2.f(j6);
        }
        if (!fragment.isAdded()) {
            jVar.f(j6);
            return;
        }
        Z z3 = this.f18277b;
        if (z3.P()) {
            this.f18284j = true;
            return;
        }
        boolean zIsAdded = fragment.isAdded();
        k kVar = this.f18282g;
        if (zIsAdded && b(j6)) {
            kVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) kVar.f35518b).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Fragment.SavedState savedStateD0 = z3.d0(fragment);
            k.b(arrayList);
            jVar2.e(j6, savedStateD0);
        }
        kVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) kVar.f35518b).iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        try {
            C1161a c1161a = new C1161a(z3);
            c1161a.m(fragment);
            c1161a.i();
            jVar.f(j6);
        } finally {
            k.b(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        p118hf.a.f(this.f18281f == null);
        final e eVar = new e(this);
        this.f18281f = eVar;
        eVar.f18273d = e.a(recyclerView);
        c cVar = new c(eVar);
        eVar.f18270a = cVar;
        eVar.f18273d.registerOnPageChangeCallback(cVar);
        d dVar = new d(eVar);
        eVar.f18271b = dVar;
        registerAdapterDataObserver(dVar);
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
                eVar.b(false);
            }
        };
        eVar.f18272c = lifecycleEventObserver;
        this.f18276a.a(lifecycleEventObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        g gVar = (g) viewHolder;
        long itemId = gVar.getItemId();
        int id2 = ((FrameLayout) gVar.itemView).getId();
        Long lE = e(id2);
        j jVar = this.f18280e;
        if (lE != null && lE.longValue() != itemId) {
            g(lE.longValue());
            jVar.f(lE.longValue());
        }
        jVar.e(itemId, Integer.valueOf(id2));
        long itemId2 = getItemId(i7);
        j jVar2 = this.f18278c;
        if (jVar2.c(itemId2) < 0) {
            Fragment fragmentC = c(i7);
            fragmentC.setInitialSavedState((Fragment.SavedState) this.f18279d.b(itemId2));
            jVar2.e(itemId2, fragmentC);
        }
        if (((FrameLayout) gVar.itemView).isAttachedToWindow()) {
            f(gVar);
        }
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        int i10 = g.f18285a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new g(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        e eVar = this.f18281f;
        eVar.getClass();
        e.a(recyclerView).unregisterOnPageChangeCallback(eVar.f18270a);
        d dVar = eVar.f18271b;
        f fVar = eVar.f18275f;
        fVar.unregisterAdapterDataObserver(dVar);
        fVar.f18276a.b(eVar.f18272c);
        eVar.f18273d = null;
        this.f18281f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        f((g) viewHolder);
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Long lE = e(((FrameLayout) ((g) viewHolder).itemView).getId());
        if (lE != null) {
            g(lE.longValue());
            this.f18280e.f(lE.longValue());
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable parcelable) {
        j jVar = this.f18279d;
        if (jVar.g() == 0) {
            j jVar2 = this.f18278c;
            if (jVar2.g() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (jVar2.g() == 0) {
                            return;
                        }
                        this.f18284j = true;
                        this.f18283i = true;
                        d();
                        final Handler handler = new Handler(Looper.getMainLooper());
                        final androidx.customview.widget.e eVar = new androidx.customview.widget.e(this, 6);
                        this.f18276a.a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$4
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
                                if (enumC1203m == EnumC1203m.ON_DESTROY) {
                                    handler.removeCallbacks(eVar);
                                    lifecycleOwner.getLifecycle().b(this);
                                }
                            }
                        });
                        handler.postDelayed(eVar, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                        return;
                    }
                    String next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        jVar2.e(Long.parseLong(next.substring(2)), this.f18277b.H(bundle, next));
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
                        }
                        long j6 = Long.parseLong(next.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                        if (b(j6)) {
                            jVar.e(j6, savedState);
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        j jVar = this.f18278c;
        int iG = jVar.g();
        j jVar2 = this.f18279d;
        Bundle bundle = new Bundle(jVar2.g() + iG);
        for (int i7 = 0; i7 < jVar.g(); i7++) {
            long jD = jVar.d(i7);
            Fragment fragment = (Fragment) jVar.b(jD);
            if (fragment != null && fragment.isAdded()) {
                this.f18277b.X(bundle, u.i(jD, "f#"), fragment);
            }
        }
        for (int i10 = 0; i10 < jVar2.g(); i10++) {
            long jD2 = jVar2.d(i10);
            if (b(jD2)) {
                bundle.putParcelable(u.i(jD2, "s#"), (Parcelable) jVar2.b(jD2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z3) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public f(Z z3, AbstractC1205o abstractC1205o) {
        this.f18278c = new j();
        this.f18279d = new j();
        this.f18280e = new j();
        k kVar = new k(15, (char) 0);
        kVar.f35518b = new CopyOnWriteArrayList();
        this.f18282g = kVar;
        this.f18283i = false;
        this.f18284j = false;
        this.f18277b = z3;
        this.f18276a = abstractC1205o;
        super.setHasStableIds(true);
    }
}
