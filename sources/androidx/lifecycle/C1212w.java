package androidx.lifecycle;

import N8.q0;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1212w extends AbstractC1205o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1210u f17475j = new C1210u(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A.a f17477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC1204n f17478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f17479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f17483i;

    public C1212w(LifecycleOwner lifecycleOwner, boolean z3) {
        this.f17466a = new AtomicReference();
        this.f17476b = z3;
        this.f17477c = new A.a();
        this.f17478d = EnumC1204n.f17461b;
        this.f17483i = new ArrayList();
        this.f17479e = new WeakReference(lifecycleOwner);
    }

    @Override // androidx.lifecycle.AbstractC1205o
    public final void a(LifecycleObserver object) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        LifecycleOwner lifecycleOwner;
        ArrayList arrayList = this.f17483i;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        EnumC1204n enumC1204n = this.f17478d;
        EnumC1204n initialState = EnumC1204n.f17460a;
        if (enumC1204n != initialState) {
            initialState = EnumC1204n.f17461b;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        C1211v c1211v = new C1211v();
        Intrinsics.e(object);
        HashMap map = AbstractC1214y.f17485a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z3 = object instanceof LifecycleEventObserver;
        boolean z8 = object instanceof DefaultLifecycleObserver;
        if (z3 && z8) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        } else if (z8) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = (LifecycleEventObserver) object;
        } else {
            Class<?> cls = object.getClass();
            if (AbstractC1214y.c(cls) == 2) {
                Object obj = AbstractC1214y.f17486b.get(cls);
                Intrinsics.e(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(AbstractC1214y.a((Constructor) list.get(0), object));
                } else {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        generatedAdapterArr[i7] = AbstractC1214y.a((Constructor) list.get(i7), object);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(object);
            }
        }
        c1211v.f17474b = reflectiveGenericLifecycleObserver;
        c1211v.f17473a = initialState;
        if (((C1211v) this.f17477c.b(object, c1211v)) == null && (lifecycleOwner = (LifecycleOwner) this.f17479e.get()) != null) {
            boolean z10 = this.f17480f != 0 || this.f17481g;
            EnumC1204n enumC1204nC = c(object);
            this.f17480f++;
            while (c1211v.f17473a.compareTo(enumC1204nC) < 0 && this.f17477c.f3e.containsKey(object)) {
                arrayList.add(c1211v.f17473a);
                EnumC1203m enumC1203mUpFrom = EnumC1203m.Companion.upFrom(c1211v.f17473a);
                if (enumC1203mUpFrom == null) {
                    throw new IllegalStateException("no event up from " + c1211v.f17473a);
                }
                c1211v.a(lifecycleOwner, enumC1203mUpFrom);
                arrayList.remove(arrayList.size() - 1);
                enumC1204nC = c(object);
            }
            if (!z10) {
                h();
            }
            this.f17480f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1205o
    public final void b(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f17477c.c(observer);
    }

    public final EnumC1204n c(LifecycleObserver lifecycleObserver) {
        C1211v c1211v;
        HashMap map = this.f17477c.f3e;
        A.c cVar = map.containsKey(lifecycleObserver) ? ((A.c) map.get(lifecycleObserver)).f10d : null;
        EnumC1204n enumC1204n = (cVar == null || (c1211v = (C1211v) cVar.f8b) == null) ? null : c1211v.f17473a;
        ArrayList arrayList = this.f17483i;
        EnumC1204n enumC1204n2 = arrayList.isEmpty() ? null : (EnumC1204n) q0.i(1, arrayList);
        EnumC1204n enumC1204n3 = this.f17478d;
        C1210u c1210u = f17475j;
        return c1210u.min$lifecycle_runtime_release(c1210u.min$lifecycle_runtime_release(enumC1204n3, enumC1204n), enumC1204n2);
    }

    public final void d(String str) {
        if (this.f17476b) {
            p357y.a.Z().f44019f.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(q0.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC1203m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC1204n enumC1204n) {
        EnumC1204n enumC1204n2 = this.f17478d;
        if (enumC1204n2 == enumC1204n) {
            return;
        }
        EnumC1204n enumC1204n3 = EnumC1204n.f17461b;
        EnumC1204n enumC1204n4 = EnumC1204n.f17460a;
        if (enumC1204n2 == enumC1204n3 && enumC1204n == enumC1204n4) {
            throw new IllegalStateException(("no event down from " + this.f17478d + " in component " + this.f17479e.get()).toString());
        }
        this.f17478d = enumC1204n;
        if (this.f17481g || this.f17480f != 0) {
            this.f17482h = true;
            return;
        }
        this.f17481g = true;
        h();
        this.f17481g = false;
        if (this.f17478d == enumC1204n4) {
            this.f17477c = new A.a();
        }
    }

    public final void g(EnumC1204n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    public final void h() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f17479e.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            A.a aVar = this.f17477c;
            if (aVar.f17d != 0) {
                A.c cVar = aVar.f14a;
                Intrinsics.e(cVar);
                EnumC1204n enumC1204n = ((C1211v) cVar.f8b).f17473a;
                A.c cVar2 = this.f17477c.f15b;
                Intrinsics.e(cVar2);
                EnumC1204n enumC1204n2 = ((C1211v) cVar2.f8b).f17473a;
                if (enumC1204n == enumC1204n2 && this.f17478d == enumC1204n2) {
                    break;
                }
                this.f17482h = false;
                EnumC1204n enumC1204n3 = this.f17478d;
                A.c cVar3 = this.f17477c.f14a;
                Intrinsics.e(cVar3);
                if (enumC1204n3.compareTo(((C1211v) cVar3.f8b).f17473a) < 0) {
                    A.a aVar2 = this.f17477c;
                    A.b bVar = new A.b(aVar2.f15b, aVar2.f14a, 1);
                    aVar2.f16c.put(bVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVar, "observerMap.descendingIterator()");
                    while (bVar.hasNext() && !this.f17482h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        Intrinsics.checkNotNullExpressionValue(entry, "next()");
                        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
                        C1211v c1211v = (C1211v) entry.getValue();
                        while (c1211v.f17473a.compareTo(this.f17478d) > 0 && !this.f17482h && this.f17477c.f3e.containsKey(lifecycleObserver)) {
                            EnumC1203m enumC1203mDownFrom = EnumC1203m.Companion.downFrom(c1211v.f17473a);
                            if (enumC1203mDownFrom == null) {
                                throw new IllegalStateException("no event down from " + c1211v.f17473a);
                            }
                            this.f17483i.add(enumC1203mDownFrom.a());
                            c1211v.a(lifecycleOwner, enumC1203mDownFrom);
                            ArrayList arrayList = this.f17483i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                A.c cVar4 = this.f17477c.f15b;
                if (!this.f17482h && cVar4 != null && this.f17478d.compareTo(((C1211v) cVar4.f8b).f17473a) > 0) {
                    A.a aVar3 = this.f17477c;
                    aVar3.getClass();
                    A.d dVar = new A.d(aVar3);
                    aVar3.f16c.put(dVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(dVar, "observerMap.iteratorWithAdditions()");
                    while (dVar.hasNext() && !this.f17482h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        LifecycleObserver lifecycleObserver2 = (LifecycleObserver) entry2.getKey();
                        C1211v c1211v2 = (C1211v) entry2.getValue();
                        while (c1211v2.f17473a.compareTo(this.f17478d) < 0 && !this.f17482h && this.f17477c.f3e.containsKey(lifecycleObserver2)) {
                            this.f17483i.add(c1211v2.f17473a);
                            EnumC1203m enumC1203mUpFrom = EnumC1203m.Companion.upFrom(c1211v2.f17473a);
                            if (enumC1203mUpFrom == null) {
                                throw new IllegalStateException("no event up from " + c1211v2.f17473a);
                            }
                            c1211v2.a(lifecycleOwner, enumC1203mUpFrom);
                            ArrayList arrayList2 = this.f17483i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f17482h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1212w(LifecycleOwner provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
