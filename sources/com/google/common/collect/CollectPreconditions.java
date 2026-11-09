package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            throw new NullPointerException(com.airbnb.lottie.model.layer.d.h(strValueOf.length() + 24, "null key in entry: null=", strValueOf));
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        throw new NullPointerException(com.airbnb.lottie.model.layer.d.i(strValueOf2.length() + 26, "null value in entry: ", strValueOf2, "=null"));
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb2 = new StringBuilder(com.airbnb.lottie.model.layer.d.c(40, str));
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i7);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void checkPositive(int i7, String str) {
        if (i7 > 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(com.airbnb.lottie.model.layer.d.c(38, str));
        sb2.append(str);
        sb2.append(" must be positive but was: ");
        sb2.append(i7);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void checkRemove(boolean z3) {
        Preconditions.checkState(z3, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j6, String str) {
        if (j6 >= 0) {
            return j6;
        }
        StringBuilder sb2 = new StringBuilder(com.airbnb.lottie.model.layer.d.c(49, str));
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString());
    }
}
