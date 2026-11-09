package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1109i2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16651a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f16653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1093e2 f16654d;

    public C1109i2(C1093e2 c1093e2) {
        this.f16654d = c1093e2;
    }

    public final Iterator a() {
        if (this.f16653c == null) {
            this.f16653c = this.f16654d.f16608b.entrySet().iterator();
        }
        return this.f16653c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f16651a + 1;
        C1093e2 c1093e2 = this.f16654d;
        return i7 < c1093e2.f16607a.size() || (!c1093e2.f16608b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f16652b = true;
        int i7 = this.f16651a + 1;
        this.f16651a = i7;
        C1093e2 c1093e2 = this.f16654d;
        return i7 < c1093e2.f16607a.size() ? (Map.Entry) c1093e2.f16607a.get(this.f16651a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16652b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f16652b = false;
        int i7 = C1093e2.f16606g;
        C1093e2 c1093e2 = this.f16654d;
        c1093e2.b();
        if (this.f16651a >= c1093e2.f16607a.size()) {
            a().remove();
            return;
        }
        int i10 = this.f16651a;
        this.f16651a = i10 - 1;
        c1093e2.h(i10);
    }
}
