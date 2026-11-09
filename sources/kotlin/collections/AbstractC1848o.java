package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: renamed from: kotlin.collections.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1848o implements Iterator, KMappedMarker {
    public abstract char a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
