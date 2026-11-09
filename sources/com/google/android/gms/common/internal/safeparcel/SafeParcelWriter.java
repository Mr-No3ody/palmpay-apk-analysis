package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@NonNull Parcel parcel) {
        return zzb(parcel, 20293);
    }

    public static void finishObjectHeader(@NonNull Parcel parcel, int i7) {
        zzc(parcel, i7);
    }

    public static void writeBigDecimal(@NonNull Parcel parcel, int i7, @NonNull BigDecimal bigDecimal, boolean z3) {
        if (bigDecimal == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzc(parcel, iZzb);
        }
    }

    public static void writeBigDecimalArray(@NonNull Parcel parcel, int i7, @NonNull BigDecimal[] bigDecimalArr, boolean z3) {
        if (bigDecimalArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i10 = 0; i10 < length; i10++) {
            parcel.writeByteArray(bigDecimalArr[i10].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i10].scale());
        }
        zzc(parcel, iZzb);
    }

    public static void writeBigInteger(@NonNull Parcel parcel, int i7, @NonNull BigInteger bigInteger, boolean z3) {
        if (bigInteger == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzc(parcel, iZzb);
        }
    }

    public static void writeBigIntegerArray(@NonNull Parcel parcel, int i7, @NonNull BigInteger[] bigIntegerArr, boolean z3) {
        if (bigIntegerArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzc(parcel, iZzb);
    }

    public static void writeBoolean(@NonNull Parcel parcel, int i7, boolean z3) {
        zza(parcel, i7, 4);
        parcel.writeInt(z3 ? 1 : 0);
    }

    public static void writeBooleanArray(@NonNull Parcel parcel, int i7, @NonNull boolean[] zArr, boolean z3) {
        if (zArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeBooleanArray(zArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeBooleanList(@NonNull Parcel parcel, int i7, @NonNull List<Boolean> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(list.get(i10).booleanValue() ? 1 : 0);
        }
        zzc(parcel, iZzb);
    }

    public static void writeBooleanObject(@NonNull Parcel parcel, int i7, @NonNull Boolean bool, boolean z3) {
        if (bool != null) {
            zza(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z3) {
            zza(parcel, i7, 0);
        }
    }

    public static void writeBundle(@NonNull Parcel parcel, int i7, @NonNull Bundle bundle, boolean z3) {
        if (bundle == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeBundle(bundle);
            zzc(parcel, iZzb);
        }
    }

    public static void writeByte(@NonNull Parcel parcel, int i7, byte b7) {
        zza(parcel, i7, 4);
        parcel.writeInt(b7);
    }

    public static void writeByteArray(@NonNull Parcel parcel, int i7, @NonNull byte[] bArr, boolean z3) {
        if (bArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeByteArray(bArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeByteArrayArray(@NonNull Parcel parcel, int i7, @NonNull byte[][] bArr, boolean z3) {
        if (bArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzc(parcel, iZzb);
    }

    public static void writeByteArraySparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<byte[]> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeByteArray(sparseArray.valueAt(i10));
        }
        zzc(parcel, iZzb);
    }

    public static void writeChar(@NonNull Parcel parcel, int i7, char c6) {
        zza(parcel, i7, 4);
        parcel.writeInt(c6);
    }

    public static void writeCharArray(@NonNull Parcel parcel, int i7, @NonNull char[] cArr, boolean z3) {
        if (cArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeCharArray(cArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeDouble(@NonNull Parcel parcel, int i7, double d2) {
        zza(parcel, i7, 8);
        parcel.writeDouble(d2);
    }

    public static void writeDoubleArray(@NonNull Parcel parcel, int i7, @NonNull double[] dArr, boolean z3) {
        if (dArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeDoubleArray(dArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeDoubleList(@NonNull Parcel parcel, int i7, @NonNull List<Double> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeDouble(list.get(i10).doubleValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeDoubleObject(@NonNull Parcel parcel, int i7, @NonNull Double d2, boolean z3) {
        if (d2 != null) {
            zza(parcel, i7, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z3) {
            zza(parcel, i7, 0);
        }
    }

    public static void writeDoubleSparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<Double> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeDouble(sparseArray.valueAt(i10).doubleValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeFloat(@NonNull Parcel parcel, int i7, float f10) {
        zza(parcel, i7, 4);
        parcel.writeFloat(f10);
    }

    public static void writeFloatArray(@NonNull Parcel parcel, int i7, @NonNull float[] fArr, boolean z3) {
        if (fArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeFloatArray(fArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeFloatList(@NonNull Parcel parcel, int i7, @NonNull List<Float> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeFloat(list.get(i10).floatValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeFloatObject(@NonNull Parcel parcel, int i7, @NonNull Float f10, boolean z3) {
        if (f10 != null) {
            zza(parcel, i7, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z3) {
            zza(parcel, i7, 0);
        }
    }

    public static void writeFloatSparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<Float> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeFloat(sparseArray.valueAt(i10).floatValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeIBinder(@NonNull Parcel parcel, int i7, @NonNull IBinder iBinder, boolean z3) {
        if (iBinder == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderArray(@NonNull Parcel parcel, int i7, @NonNull IBinder[] iBinderArr, boolean z3) {
        if (iBinderArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeBinderArray(iBinderArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderList(@NonNull Parcel parcel, int i7, @NonNull List<IBinder> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeBinderList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderSparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<IBinder> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeStrongBinder(sparseArray.valueAt(i10));
        }
        zzc(parcel, iZzb);
    }

    public static void writeInt(@NonNull Parcel parcel, int i7, int i10) {
        zza(parcel, i7, 4);
        parcel.writeInt(i10);
    }

    public static void writeIntArray(@NonNull Parcel parcel, int i7, @NonNull int[] iArr, boolean z3) {
        if (iArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeIntArray(iArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIntegerList(@NonNull Parcel parcel, int i7, @NonNull List<Integer> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(list.get(i10).intValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeIntegerObject(@NonNull Parcel parcel, int i7, @NonNull Integer num, boolean z3) {
        if (num != null) {
            zza(parcel, i7, 4);
            parcel.writeInt(num.intValue());
        } else if (z3) {
            zza(parcel, i7, 0);
        }
    }

    public static void writeList(@NonNull Parcel parcel, int i7, @NonNull List list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeLong(@NonNull Parcel parcel, int i7, long j6) {
        zza(parcel, i7, 8);
        parcel.writeLong(j6);
    }

    public static void writeLongArray(@NonNull Parcel parcel, int i7, @NonNull long[] jArr, boolean z3) {
        if (jArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeLongArray(jArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeLongList(@NonNull Parcel parcel, int i7, @NonNull List<Long> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeLong(list.get(i10).longValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeLongObject(@NonNull Parcel parcel, int i7, @NonNull Long l5, boolean z3) {
        if (l5 != null) {
            zza(parcel, i7, 8);
            parcel.writeLong(l5.longValue());
        } else if (z3) {
            zza(parcel, i7, 0);
        }
    }

    public static void writeParcel(@NonNull Parcel parcel, int i7, @NonNull Parcel parcel2, boolean z3) {
        if (parcel2 == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzc(parcel, iZzb);
        }
    }

    public static void writeParcelArray(@NonNull Parcel parcel, int i7, @NonNull Parcel[] parcelArr, boolean z3) {
        if (parcelArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelList(@NonNull Parcel parcel, int i7, @NonNull List<Parcel> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcel parcel2 = list.get(i10);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelSparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<Parcel> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            Parcel parcelValueAt = sparseArray.valueAt(i10);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelable(@NonNull Parcel parcel, int i7, @NonNull Parcelable parcelable, int i10, boolean z3) {
        if (parcelable == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcelable.writeToParcel(parcel, i10);
            zzc(parcel, iZzb);
        }
    }

    public static void writePendingIntent(@NonNull Parcel parcel, int i7, @NonNull PendingIntent pendingIntent, boolean z3) {
        if (pendingIntent == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzc(parcel, iZzb);
        }
    }

    public static void writeShort(@NonNull Parcel parcel, int i7, short s3) {
        zza(parcel, i7, 4);
        parcel.writeInt(s3);
    }

    public static void writeSparseBooleanArray(@NonNull Parcel parcel, int i7, @NonNull SparseBooleanArray sparseBooleanArray, boolean z3) {
        if (sparseBooleanArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzc(parcel, iZzb);
        }
    }

    public static void writeSparseIntArray(@NonNull Parcel parcel, int i7, @NonNull SparseIntArray sparseIntArray, boolean z3) {
        if (sparseIntArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseIntArray.keyAt(i10));
            parcel.writeInt(sparseIntArray.valueAt(i10));
        }
        zzc(parcel, iZzb);
    }

    public static void writeSparseLongArray(@NonNull Parcel parcel, int i7, @NonNull SparseLongArray sparseLongArray, boolean z3) {
        if (sparseLongArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseLongArray.keyAt(i10));
            parcel.writeLong(sparseLongArray.valueAt(i10));
        }
        zzc(parcel, iZzb);
    }

    public static void writeString(@NonNull Parcel parcel, int i7, @NonNull String str, boolean z3) {
        if (str == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeString(str);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringArray(@NonNull Parcel parcel, int i7, @NonNull String[] strArr, boolean z3) {
        if (strArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeStringArray(strArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringList(@NonNull Parcel parcel, int i7, @NonNull List<String> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
            }
        } else {
            int iZzb = zzb(parcel, i7);
            parcel.writeStringList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringSparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<String> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            parcel.writeString(sparseArray.valueAt(i10));
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedArray(@NonNull Parcel parcel, int i7, @NonNull T[] tArr, int i10, boolean z3) {
        if (tArr == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, i10);
            }
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedList(@NonNull Parcel parcel, int i7, @NonNull List<T> list, boolean z3) {
        if (list == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            T t = list.get(i10);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, 0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@NonNull Parcel parcel, int i7, @NonNull SparseArray<T> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                zza(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            T tValueAt = sparseArray.valueAt(i10);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzc(parcel, iZzb);
    }

    private static void zza(Parcel parcel, int i7, int i10) {
        parcel.writeInt(i7 | (i10 << 16));
    }

    private static int zzb(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzc(Parcel parcel, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(iDataPosition - i7);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
