package Sf;

import C0.G;
import androidx.camera.video.u;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Sequence, DropTakeSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f8901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8903c;

    public q(Sequence sequence, int i7, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f8901a = sequence;
        this.f8902b = i7;
        this.f8903c = i10;
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "startIndex should be non-negative, but is ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(G.m(i10, "endIndex should be non-negative, but is ").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(u.h(i10, "endIndex should be not less than startIndex, but was ", i7, " < ").toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int i7) {
        int i10 = this.f8903c;
        int i11 = this.f8902b;
        if (i7 >= i10 - i11) {
            return f.f8887a;
        }
        return new q(this.f8901a, i11 + i7, i10);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new h(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence take(int i7) {
        int i10 = this.f8903c;
        int i11 = this.f8902b;
        if (i7 >= i10 - i11) {
            return this;
        }
        return new q(this.f8901a, i11, i7 + i11);
    }
}
