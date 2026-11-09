package Sf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sequence f8894d;

    public h(q qVar) {
        this.f8891a = 1;
        this.f8894d = qVar;
        this.f8893c = qVar.f8901a.iterator();
    }

    public void a() {
        Object objInvoke;
        int i7 = this.f8892b;
        e eVar = (e) this.f8894d;
        if (i7 == -2) {
            objInvoke = ((Function0) eVar.f8885b).invoke();
        } else {
            Function1 function1 = eVar.f8886c;
            Object obj = this.f8893c;
            Intrinsics.e(obj);
            objInvoke = function1.invoke(obj);
        }
        this.f8893c = objInvoke;
        this.f8892b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        q qVar;
        Iterator it;
        switch (this.f8891a) {
            case 0:
                if (this.f8892b < 0) {
                    a();
                }
                return this.f8892b == 1;
        }
        while (true) {
            int i7 = this.f8892b;
            qVar = (q) this.f8894d;
            it = (Iterator) this.f8893c;
            if (i7 < qVar.f8902b && it.hasNext()) {
                it.next();
                this.f8892b++;
            }
        }
        return this.f8892b < qVar.f8903c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        q qVar;
        Iterator it;
        switch (this.f8891a) {
            case 0:
                if (this.f8892b < 0) {
                    a();
                }
                if (this.f8892b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f8893c;
                Intrinsics.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f8892b = -1;
                return obj;
        }
        while (true) {
            int i7 = this.f8892b;
            qVar = (q) this.f8894d;
            it = (Iterator) this.f8893c;
            if (i7 < qVar.f8902b && it.hasNext()) {
                it.next();
                this.f8892b++;
            }
        }
        int i10 = this.f8892b;
        if (i10 >= qVar.f8903c) {
            throw new NoSuchElementException();
        }
        this.f8892b = i10 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8891a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(e eVar) {
        this.f8891a = 0;
        this.f8894d = eVar;
        this.f8892b = -2;
    }
}
