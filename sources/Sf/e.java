package Sf;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f8886c;

    public e(Sequence sequence, Function1 predicate, int i7) {
        this.f8884a = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                this.f8885b = sequence;
                this.f8886c = predicate;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(predicate, "transformer");
                this.f8885b = sequence;
                this.f8886c = predicate;
                break;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                this.f8885b = sequence;
                this.f8886c = predicate;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f8884a) {
            case 0:
                return new d(this);
            case 1:
                return new d(this, (byte) 0);
            case 2:
                return new r(this);
            default:
                return new h(this);
        }
    }

    public e(Function0 getInitialValue, Function1 getNextValue) {
        this.f8884a = 3;
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f8885b = getInitialValue;
        this.f8886c = getNextValue;
    }
}
