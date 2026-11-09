package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: kotlin.text.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1864c implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f39008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f39010c;

    public C1864c(CharSequence input, int i7, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f39008a = input;
        this.f39009b = i7;
        this.f39010c = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new C1863b(this);
    }
}
