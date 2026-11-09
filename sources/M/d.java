package M;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5672b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f5674d;

    public d(f fVar) {
        this.f5674d = fVar;
        this.f5671a = fVar.f5695c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5673c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f5672b;
        f fVar = this.f5674d;
        return Intrinsics.c(key, fVar.f(i7)) && Intrinsics.c(entry.getValue(), fVar.j(this.f5672b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f5673c) {
            return this.f5674d.f(this.f5672b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f5673c) {
            return this.f5674d.j(this.f5672b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5672b < this.f5671a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5673c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f5672b;
        f fVar = this.f5674d;
        Object objF = fVar.f(i7);
        Object objJ = fVar.j(this.f5672b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5672b++;
        this.f5673c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5673c) {
            throw new IllegalStateException();
        }
        this.f5674d.h(this.f5672b);
        this.f5672b--;
        this.f5671a--;
        this.f5673c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5673c) {
            return this.f5674d.i(this.f5672b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
