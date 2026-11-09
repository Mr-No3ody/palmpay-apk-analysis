package androidx.core.view;

import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1201k;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1063o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f16268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f16269b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16270c = new HashMap();

    public C1063o(Runnable runnable) {
        this.f16268a = runnable;
    }

    public final void a(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f16269b.add(menuProvider);
        this.f16268a.run();
        AbstractC1205o lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f16270c;
        C1062n c1062n = (C1062n) map.remove(menuProvider);
        if (c1062n != null) {
            c1062n.f16265a.b(c1062n.f16266b);
            c1062n.f16266b = null;
        }
        map.put(menuProvider, new C1062n(lifecycle, new E0.k(2, this, menuProvider)));
    }

    public final void b(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final EnumC1204n enumC1204n) {
        AbstractC1205o lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f16270c;
        C1062n c1062n = (C1062n) map.remove(menuProvider);
        if (c1062n != null) {
            c1062n.f16265a.b(c1062n.f16266b);
            c1062n.f16266b = null;
        }
        map.put(menuProvider, new C1062n(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.m
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, EnumC1203m enumC1203m) {
                C1063o c1063o = this.f16259a;
                c1063o.getClass();
                C1201k c1201k = EnumC1203m.Companion;
                EnumC1204n enumC1204n2 = enumC1204n;
                EnumC1203m enumC1203mUpTo = c1201k.upTo(enumC1204n2);
                Runnable runnable = c1063o.f16268a;
                CopyOnWriteArrayList copyOnWriteArrayList = c1063o.f16269b;
                MenuProvider menuProvider2 = menuProvider;
                if (enumC1203m == enumC1203mUpTo) {
                    copyOnWriteArrayList.add(menuProvider2);
                    runnable.run();
                } else if (enumC1203m == EnumC1203m.ON_DESTROY) {
                    c1063o.c(menuProvider2);
                } else if (enumC1203m == c1201k.downFrom(enumC1204n2)) {
                    copyOnWriteArrayList.remove(menuProvider2);
                    runnable.run();
                }
            }
        }));
    }

    public final void c(MenuProvider menuProvider) {
        this.f16269b.remove(menuProvider);
        C1062n c1062n = (C1062n) this.f16270c.remove(menuProvider);
        if (c1062n != null) {
            c1062n.f16265a.b(c1062n.f16266b);
            c1062n.f16266b = null;
        }
        this.f16268a.run();
    }
}
