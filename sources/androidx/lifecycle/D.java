package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends F {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A.f f17342l = new A.f();

    @Override // androidx.lifecycle.B
    public final void g() {
        Iterator it = this.f17342l.iterator();
        while (true) {
            A.b bVar = (A.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            C c6 = (C) ((Map.Entry) bVar.next()).getValue();
            c6.f17338a.f(c6);
        }
    }

    @Override // androidx.lifecycle.B
    public final void h() {
        Iterator it = this.f17342l.iterator();
        while (true) {
            A.b bVar = (A.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            C c6 = (C) ((Map.Entry) bVar.next()).getValue();
            c6.f17338a.j(c6);
        }
    }

    public final void l(B b7, Observer observer) {
        if (b7 == null) {
            throw new NullPointerException("source cannot be null");
        }
        C c6 = new C(b7, observer);
        C c10 = (C) this.f17342l.b(b7, c6);
        if (c10 != null && c10.f17339b != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c10 == null && this.f17330c > 0) {
            b7.f(c6);
        }
    }
}
