package Sf;

import java.util.Iterator;
import kotlin.collections.y;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Sequence, DropTakeSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f8887a = new f();

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int i7) {
        return f8887a;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return y.f38934a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence take(int i7) {
        return f8887a;
    }
}
