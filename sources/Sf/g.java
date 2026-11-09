package Sf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f8888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f8890c;

    public g(Sequence sequence, boolean z3, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f8888a = sequence;
        this.f8889b = z3;
        this.f8890c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new d(this);
    }
}
