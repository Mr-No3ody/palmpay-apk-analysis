package Af;

import android.os.Build;
import android.view.View;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f348d;

    public h() {
        if (com.growingio.android.debugger.a.f23153c == null) {
            com.growingio.android.debugger.a.f23153c = new com.growingio.android.debugger.a(4);
        }
    }

    public int a(int i7) {
        if (i7 < this.f347c) {
            return ((ByteBuffer) this.f348d).getShort(this.f346b + i7);
        }
        return 0;
    }

    public void b() {
        if (((e) this.f348d).f336i != this.f347c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i7 = this.f345a;
            e eVar = (e) this.f348d;
            if (i7 >= eVar.f334f || eVar.f331c[i7] >= 0) {
                return;
            } else {
                this.f345a = i7 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f346b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f346b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f345a);
            if (!((Class) this.f348d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            C1050b c1050bD = N.d(view);
            if (c1050bD == null) {
                c1050bD = new C1050b();
            }
            N.q(view, c1050bD);
            view.setTag(this.f345a, obj);
            N.k(this.f347c, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f345a < ((e) this.f348d).f334f;
    }

    public void remove() {
        b();
        if (this.f346b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        e eVar = (e) this.f348d;
        eVar.c();
        eVar.l(this.f346b);
        this.f346b = -1;
        this.f347c = eVar.f336i;
    }
}
