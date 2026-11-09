package Sf;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.C1863b;
import kotlin.text.C1864c;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8899a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8900b;

    public o(C1864c c1864c) {
        this.f8900b = c1864c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8899a) {
            case 0:
                return new C1863b((C1864c) this.f8900b);
            default:
                return new b(AbstractC1859i.a((Object[]) ((p068ec.d) this.f8900b).f36252b));
        }
    }

    public o(p068ec.d iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f8900b = iteratorFactory;
    }
}
