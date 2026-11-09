package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Hashing {

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    private static final long f22805C1 = -862048943;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    private static final long f22806C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
    }

    public static int closedTableSize(int i7, double d2) {
        int iMax = Math.max(i7, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d2 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i10 = iHighestOneBit << 1;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    public static boolean needsResizing(int i7, int i10, double d2) {
        return ((double) i7) > d2 * ((double) i10) && i10 < 1073741824;
    }

    public static int smear(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * f22805C1), 15)) * f22806C2);
    }

    public static int smearedHash(@CheckForNull Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
