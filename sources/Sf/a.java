package Sf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f8872a;

    public a(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f8872a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.f8872a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
