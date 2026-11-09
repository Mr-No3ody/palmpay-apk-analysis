package p355xf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Error {
    public m() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(String message, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        message = (i7 & 1) != 0 ? "An operation is not implemented." : message;
        Intrinsics.checkNotNullParameter(message, "message");
        super(message);
    }
}
