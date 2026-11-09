package Sf;

import androidx.core.view.S;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j implements Iterator, Continuation, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f8897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Continuation f8898d;

    @Override // Sf.j
    public final void a(Object obj, Ff.g frame) {
        this.f8896b = obj;
        this.f8895a = 3;
        this.f8898d = frame;
        Ef.a aVar = Ef.a.f2423a;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // Sf.j
    public final Object b(Iterator it, S frame) {
        if (!it.hasNext()) {
            return Unit.f38893a;
        }
        this.f8897c = it;
        this.f8895a = 2;
        this.f8898d = frame;
        Ef.a aVar = Ef.a.f2423a;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException c() {
        int i7 = this.f8895a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8895a);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.f.f38943a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i7 = this.f8895a;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f8897c;
                Intrinsics.e(it);
                if (it.hasNext()) {
                    this.f8895a = 2;
                    return true;
                }
                this.f8897c = null;
            }
            this.f8895a = 5;
            Continuation continuation = this.f8898d;
            Intrinsics.e(continuation);
            this.f8898d = null;
            p355xf.o oVar = p355xf.q.f43977a;
            continuation.resumeWith(Unit.f38893a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f8895a;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f8895a = 1;
            Iterator it = this.f8897c;
            Intrinsics.e(it);
            return it.next();
        }
        if (i7 != 3) {
            throw c();
        }
        this.f8895a = 0;
        Object obj = this.f8896b;
        this.f8896b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f8895a = 4;
    }
}
