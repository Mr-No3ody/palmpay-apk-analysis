package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements Iterable, KMappedMarker {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Intrinsics.checkNotNullParameter("0123456789", "<this>");
        return new B();
    }
}
