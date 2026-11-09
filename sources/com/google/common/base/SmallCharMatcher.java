package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    private static final int f22784C1 = -862048943;

    /* JADX INFO: renamed from: C2, reason: collision with root package name */
    private static final int f22785C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArr, long j6, boolean z3, String str) {
        super(str);
        this.table = cArr;
        this.filter = j6;
        this.containsZero = z3;
    }

    private boolean checkFilter(int i7) {
        return 1 == ((this.filter >> i7) & 1);
    }

    @VisibleForTesting
    public static int chooseTableSize(int i7) {
        if (i7 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i7 - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < i7) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static CharMatcher from(BitSet bitSet, String str) {
        int i7;
        int iCardinality = bitSet.cardinality();
        boolean z3 = bitSet.get(0);
        int iChooseTableSize = chooseTableSize(iCardinality);
        char[] cArr = new char[iChooseTableSize];
        int i10 = iChooseTableSize - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j6 = 0;
        while (iNextSetBit != -1) {
            long j10 = (1 << iNextSetBit) | j6;
            int iSmear = smear(iNextSetBit);
            while (true) {
                i7 = iSmear & i10;
                if (cArr[i7] == 0) {
                    break;
                }
                iSmear = i7 + 1;
            }
            cArr[i7] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j6 = j10;
        }
        return new SmallCharMatcher(cArr, j6, z3, str);
    }

    public static int smear(int i7) {
        return Integer.rotateLeft(i7 * f22784C1, 15) * f22785C2;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c6) {
        if (c6 == 0) {
            return this.containsZero;
        }
        if (!checkFilter(c6)) {
            return false;
        }
        int length = this.table.length - 1;
        int iSmear = smear(c6) & length;
        int i7 = iSmear;
        do {
            char c10 = this.table[i7];
            if (c10 == 0) {
                return false;
            }
            if (c10 == c6) {
                return true;
            }
            i7 = (i7 + 1) & length;
        } while (i7 != iSmear);
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    public void setBits(BitSet bitSet) {
        if (this.containsZero) {
            bitSet.set(0);
        }
        for (char c6 : this.table) {
            if (c6 != 0) {
                bitSet.set(c6);
            }
        }
    }
}
