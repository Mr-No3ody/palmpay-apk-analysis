package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z3) {
        this.inclusive = z3;
    }

    public static BoundType forBoolean(boolean z3) {
        return z3 ? CLOSED : OPEN;
    }
}
