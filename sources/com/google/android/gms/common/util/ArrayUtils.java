package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @NonNull
    @KeepForSdk
    public static <T> T[] concat(@NonNull T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i7 = 1; i7 < tArr.length; i7++) {
            T[] tArr4 = tArr[i7];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    @NonNull
    @KeepForSdk
    public static byte[] concatByteArrays(@NonNull byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int i7 = 1; i7 < bArr.length; i7++) {
            byte[] bArr3 = bArr[i7];
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
            length2 += length3;
        }
        return bArrCopyOf;
    }

    @KeepForSdk
    public static boolean contains(@Nullable int[] iArr, int i7) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @Nullable
    @KeepForSdk
    public static <T> T[] removeAll(@NonNull T[] tArr, @NonNull T... tArr2) {
        int length;
        int i7;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i7 = 0;
            for (T t : tArr) {
                if (!Objects.equal(tArr2[0], t)) {
                    tArr3[i7] = t;
                    i7++;
                }
            }
        } else {
            int i10 = 0;
            for (T t3 : tArr) {
                if (!contains(tArr2, t3)) {
                    tArr3[i10] = t3;
                    i10++;
                }
            }
            i7 = i10;
        }
        if (tArr3 == null) {
            return null;
        }
        return i7 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i7);
    }

    @NonNull
    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(@NonNull T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    @NonNull
    @KeepForSdk
    public static int[] toPrimitiveArray(@Nullable Collection<Integer> collection) {
        int i7 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i7] = it.next().intValue();
            i7++;
        }
        return iArr;
    }

    @Nullable
    @KeepForSdk
    public static Integer[] toWrapperArray(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i7 = 0; i7 < length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull double[] dArr) {
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(dArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeStringArray(@NonNull StringBuilder sb2, @NonNull String[] strArr) {
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i7]);
            sb2.append("\"");
        }
    }

    @KeepForSdk
    public static <T> boolean contains(@NonNull T[] tArr, @Nullable T t) {
        int length = tArr != null ? tArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (Objects.equal(tArr[i7], t)) {
                if (i7 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull float[] fArr) {
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(fArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull int[] iArr) {
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(iArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull long[] jArr) {
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(jArr[i7]);
        }
    }

    @KeepForSdk
    public static <T> void writeArray(@NonNull StringBuilder sb2, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(tArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(zArr[i7]);
        }
    }
}
