package Pg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class E {
    public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final long minTimeout(long j6, long j10) {
        return (j6 != 0 && (j10 == 0 || j6 < j10)) ? j6 : j10;
    }

    private E() {
    }
}
