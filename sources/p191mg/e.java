package p191mg;

import C4.a;
import C9.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a writer, boolean z3) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f39725d = z3;
    }

    @Override // C9.N
    public final void k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f39725d) {
            super.k(value);
        } else {
            i(value);
        }
    }
}
