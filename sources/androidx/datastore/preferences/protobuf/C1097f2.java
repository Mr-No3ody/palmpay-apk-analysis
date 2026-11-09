package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1097f2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f16614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1093e2 f16615c;

    public C1097f2(C1093e2 c1093e2) {
        this.f16615c = c1093e2;
        this.f16613a = c1093e2.f16607a.size();
    }

    public final Iterator a() {
        if (this.f16614b == null) {
            this.f16614b = this.f16615c.f16611e.entrySet().iterator();
        }
        return this.f16614b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f16613a;
        return (i7 > 0 && i7 <= this.f16615c.f16607a.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f16615c.f16607a;
        int i7 = this.f16613a - 1;
        this.f16613a = i7;
        return (Map.Entry) list.get(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
