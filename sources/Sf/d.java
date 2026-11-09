package Sf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f8880b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Sequence f8883e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8879a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8881c = -1;

    public d(g gVar) {
        this.f8883e = gVar;
        this.f8880b = gVar.f8888a.iterator();
    }

    public void a() {
        Object next;
        g gVar;
        do {
            Iterator it = this.f8880b;
            if (!it.hasNext()) {
                this.f8881c = 0;
                return;
            } else {
                next = it.next();
                gVar = (g) this.f8883e;
            }
        } while (((Boolean) gVar.f8890c.invoke(next)).booleanValue() != gVar.f8889b);
        this.f8882d = next;
        this.f8881c = 1;
    }

    public void b() {
        Iterator it = this.f8880b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((e) this.f8883e).f8886c.invoke(next)).booleanValue()) {
                this.f8881c = 1;
                this.f8882d = next;
                return;
            }
        }
        this.f8881c = 0;
    }

    public void c() {
        Object next;
        do {
            Iterator it = this.f8880b;
            if (!it.hasNext()) {
                this.f8881c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((e) this.f8883e).f8886c.invoke(next)).booleanValue());
        this.f8882d = next;
        this.f8881c = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8879a) {
            case 0:
                if (this.f8881c == -1) {
                    c();
                }
                return this.f8881c == 1 || this.f8880b.hasNext();
            case 1:
                if (this.f8881c == -1) {
                    a();
                }
                return this.f8881c == 1;
            default:
                if (this.f8881c == -1) {
                    b();
                }
                return this.f8881c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8879a) {
            case 0:
                if (this.f8881c == -1) {
                    c();
                }
                if (this.f8881c != 1) {
                    return this.f8880b.next();
                }
                Object obj = this.f8882d;
                this.f8882d = null;
                this.f8881c = 0;
                return obj;
            case 1:
                if (this.f8881c == -1) {
                    a();
                }
                if (this.f8881c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f8882d;
                this.f8882d = null;
                this.f8881c = -1;
                return obj2;
            default:
                if (this.f8881c == -1) {
                    b();
                }
                if (this.f8881c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f8882d;
                this.f8882d = null;
                this.f8881c = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8879a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(e eVar, byte b7) {
        this.f8883e = eVar;
        this.f8880b = ((Sequence) eVar.f8885b).iterator();
    }

    public d(e eVar) {
        this.f8883e = eVar;
        this.f8880b = ((Sequence) eVar.f8885b).iterator();
    }
}
