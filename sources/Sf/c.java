package Sf;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Sequence, DropTakeSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8876a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sequence f8878c;

    public c(c sequence, int i7) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f8878c = sequence;
        this.f8877b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int i7) {
        switch (this.f8876a) {
            case 0:
                int i10 = this.f8877b + i7;
                return i10 < 0 ? new c((Sequence) this, i7) : new c(this.f8878c, i10);
            default:
                int i11 = this.f8877b;
                return i7 >= i11 ? f.f8887a : new q((c) this.f8878c, i7, i11);
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f8876a) {
            case 0:
                return new b(this);
            default:
                return new b(this, (byte) 0);
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence take(int i7) {
        switch (this.f8876a) {
            case 0:
                int i10 = this.f8877b;
                int i11 = i10 + i7;
                return i11 < 0 ? new c(this, i7) : new q(this.f8878c, i10, i11);
            default:
                return i7 >= this.f8877b ? this : new c((c) this.f8878c, i7);
        }
    }

    public c(Sequence sequence, int i7) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f8878c = sequence;
        this.f8877b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }
}
