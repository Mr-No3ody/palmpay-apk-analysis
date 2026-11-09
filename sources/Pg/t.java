package Pg;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class t {
    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void buildTrieRecursive(long j6, k kVar, int i7, List<? extends m> list, int i10, int i11, List<Integer> list2) throws IOException {
        int i12;
        int i13;
        int i14;
        long j10;
        int i15 = i7;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (list.get(i16).d() < i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        m mVar = list.get(i10);
        m mVar2 = list.get(i11 - 1);
        if (i15 == mVar.d()) {
            int iIntValue = list2.get(i10).intValue();
            int i17 = i10 + 1;
            m mVar3 = list.get(i17);
            i12 = i17;
            i13 = iIntValue;
            mVar = mVar3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (mVar.g(i15) == mVar2.g(i15)) {
            int iMin = Math.min(mVar.d(), mVar2.d());
            int i18 = 0;
            for (int i19 = i15; i19 < iMin && mVar.g(i19) == mVar2.g(i19); i19++) {
                i18++;
            }
            long intCount = j6 + getIntCount(kVar) + ((long) 2) + ((long) i18) + 1;
            kVar.p(-i18);
            kVar.p(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                kVar.p(mVar.g(i15) & UnsignedBytes.MAX_VALUE);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != list.get(i12).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                kVar.p(list2.get(i12).intValue());
                return;
            } else {
                k kVar2 = new k();
                kVar.p(((int) (getIntCount(kVar2) + intCount)) * (-1));
                buildTrieRecursive(intCount, kVar2, i20, list, i12, i11, list2);
                kVar.writeAll(kVar2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (list.get(i22 - 1).g(i15) != list.get(i22).g(i15)) {
                i21++;
            }
        }
        long intCount2 = j6 + getIntCount(kVar) + ((long) 2) + ((long) (i21 * 2));
        kVar.p(i21);
        kVar.p(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            byte bG = list.get(i23).g(i15);
            if (i23 == i12 || bG != list.get(i23 - 1).g(i15)) {
                kVar.p(bG & UnsignedBytes.MAX_VALUE);
            }
        }
        k kVar3 = new k();
        while (i12 < i11) {
            byte bG2 = list.get(i12).g(i15);
            int i24 = i12 + 1;
            int i25 = i24;
            while (true) {
                if (i25 >= i11) {
                    i14 = i11;
                    break;
                } else {
                    if (bG2 != list.get(i25).g(i15)) {
                        i14 = i25;
                        break;
                    }
                    i25++;
                }
            }
            if (i24 == i14 && i15 + 1 == list.get(i12).d()) {
                kVar.p(list2.get(i12).intValue());
                j10 = intCount2;
            } else {
                kVar.p(((int) (getIntCount(kVar3) + intCount2)) * (-1));
                j10 = intCount2;
                buildTrieRecursive(j10, kVar3, i15 + 1, list, i12, i14, list2);
            }
            intCount2 = j10;
            i12 = i14;
        }
        kVar.writeAll(kVar3);
    }

    public static /* synthetic */ void buildTrieRecursive$default(t tVar, long j6, k kVar, int i7, List list, int i10, int i11, List list2, int i12, Object obj) throws IOException {
        if ((i12 & 1) != 0) {
            j6 = 0;
        }
        tVar.buildTrieRecursive(j6, kVar, (i12 & 4) != 0 ? 0 : i7, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
    }

    private final long getIntCount(k kVar) {
        return kVar.f7358b / ((long) 4);
    }

    @JvmStatic
    @NotNull
    public final u of(@NotNull m... byteStrings) {
        int i7;
        Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
        int i10 = 0;
        if (byteStrings.length == 0) {
            return new u(new m[0], new int[]{0, -1});
        }
        ArrayList arrayListZ = C1847n.z(byteStrings);
        kotlin.collections.u.m(arrayListZ);
        ArrayList arrayList = new ArrayList(byteStrings.length);
        for (m mVar : byteStrings) {
            arrayList.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        ArrayList arrayListI = C1850q.i(Arrays.copyOf(numArr, numArr.length));
        int length = byteStrings.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            m mVar2 = byteStrings[i11];
            int i13 = i12 + 1;
            int size = arrayListZ.size();
            Intrinsics.checkNotNullParameter(arrayListZ, "<this>");
            int size2 = arrayListZ.size();
            if (size < 0) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i14 = size - 1;
            int i15 = 0;
            while (true) {
                if (i15 > i14) {
                    i7 = -(i15 + 1);
                    break;
                }
                i7 = (i15 + i14) >>> 1;
                int iA = Bf.a.a((Comparable) arrayListZ.get(i7), mVar2);
                if (iA >= 0) {
                    if (iA <= 0) {
                        break;
                    }
                    i14 = i7 - 1;
                } else {
                    i15 = i7 + 1;
                }
            }
            arrayListI.set(i7, Integer.valueOf(i12));
            i11++;
            i12 = i13;
        }
        if (((m) arrayListZ.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i16 = 0;
        while (i16 < arrayListZ.size()) {
            m prefix = (m) arrayListZ.get(i16);
            int i17 = i16 + 1;
            int i18 = i17;
            while (i18 < arrayListZ.size()) {
                m mVar3 = (m) arrayListZ.get(i18);
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!mVar3.i(prefix, prefix.d())) {
                    break;
                }
                if (mVar3.d() == prefix.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + mVar3).toString());
                }
                if (((Number) arrayListI.get(i18)).intValue() > ((Number) arrayListI.get(i16)).intValue()) {
                    arrayListZ.remove(i18);
                    arrayListI.remove(i18);
                } else {
                    i18++;
                }
            }
            i16 = i17;
        }
        k kVar = new k();
        buildTrieRecursive$default(this, 0L, kVar, 0, arrayListZ, 0, 0, arrayListI, 53, null);
        int[] iArr = new int[(int) getIntCount(kVar)];
        while (!kVar.exhausted()) {
            iArr[i10] = kVar.readInt();
            i10++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        return new u((m[]) objArrCopyOf, iArr);
    }

    private t() {
    }
}
