package androidx.lifecycle;

import N8.q0;
import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f17327k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A.f f17329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f17332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f17333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.customview.widget.e f17337j;

    public B(Object obj) {
        this.f17328a = new Object();
        this.f17329b = new A.f();
        this.f17330c = 0;
        this.f17333f = f17327k;
        this.f17337j = new androidx.customview.widget.e(this, 2);
        this.f17332e = obj;
        this.f17334g = 0;
    }

    public static void a(String str) {
        p357y.a.Z().f44019f.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(q0.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(A a3) {
        if (a3.f17324b) {
            if (!a3.d()) {
                a3.a(false);
                return;
            }
            int i7 = a3.f17325c;
            int i10 = this.f17334g;
            if (i7 >= i10) {
                return;
            }
            a3.f17325c = i10;
            a3.f17323a.onChanged(this.f17332e);
        }
    }

    public final void c(A a3) {
        if (this.f17335h) {
            this.f17336i = true;
            return;
        }
        this.f17335h = true;
        do {
            this.f17336i = false;
            if (a3 != null) {
                b(a3);
                a3 = null;
            } else {
                A.f fVar = this.f17329b;
                fVar.getClass();
                A.d dVar = new A.d(fVar);
                fVar.f16c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((A) ((Map.Entry) dVar.next()).getValue());
                    if (this.f17336i) {
                        break;
                    }
                }
            }
        } while (this.f17336i);
        this.f17335h = false;
    }

    public Object d() {
        Object obj = this.f17332e;
        if (obj != f17327k) {
            return obj;
        }
        return null;
    }

    public void e(LifecycleOwner lifecycleOwner, Observer observer) {
        a("observe");
        if (((C1212w) lifecycleOwner.getLifecycle()).f17478d == EnumC1204n.f17460a) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, lifecycleOwner, observer);
        A a3 = (A) this.f17329b.b(observer, liveData$LifecycleBoundObserver);
        if (a3 != null && !a3.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a3 != null) {
            return;
        }
        lifecycleOwner.getLifecycle().a(liveData$LifecycleBoundObserver);
    }

    public final void f(Observer observer) {
        a("observeForever");
        C1215z c1215z = new C1215z(this, observer);
        A a3 = (A) this.f17329b.b(observer, c1215z);
        if (a3 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a3 != null) {
            return;
        }
        c1215z.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z3;
        synchronized (this.f17328a) {
            z3 = this.f17333f == f17327k;
            this.f17333f = obj;
        }
        if (z3) {
            p357y.a.Z().a0(this.f17337j);
        }
    }

    public final void j(Observer observer) {
        a("removeObserver");
        A a3 = (A) this.f17329b.c(observer);
        if (a3 == null) {
            return;
        }
        a3.b();
        a3.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.f17334g++;
        this.f17332e = obj;
        c(null);
    }

    public B() {
        this.f17328a = new Object();
        this.f17329b = new A.f();
        this.f17330c = 0;
        Object obj = f17327k;
        this.f17333f = obj;
        this.f17337j = new androidx.customview.widget.e(this, 2);
        this.f17332e = obj;
        this.f17334g = -1;
    }
}
