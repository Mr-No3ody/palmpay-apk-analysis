package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.horcrux.svg.d0;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FlagCreator", doNotParcelTypeDefaultValues = true)
@SafeParcelable.Reserved({1})
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    final long zzb;

    @SafeParcelable.Field(id = 4)
    final boolean zzc;

    @SafeParcelable.Field(id = 5)
    final double zzd;

    @Nullable
    @SafeParcelable.Field(id = 6)
    final String zze;

    @Nullable
    @SafeParcelable.Field(id = 7)
    final byte[] zzf;

    @SafeParcelable.Field(id = 8)
    public final int zzg;

    @SafeParcelable.Field(id = 9)
    public final int zzh;

    @SafeParcelable.Field(getter = "getFlagOverrideSource", id = 10)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzjo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j6, @SafeParcelable.Param(id = 4) boolean z3, @SafeParcelable.Param(id = 5) double d2, @SafeParcelable.Param(id = 6) @Nullable String str2, @SafeParcelable.Param(id = 7) @Nullable byte[] bArr, @SafeParcelable.Param(id = 8) int i7, @SafeParcelable.Param(id = 9) int i10, @SafeParcelable.Param(id = 10) int i11) {
        this.zza = str;
        this.zzb = j6;
        this.zzc = z3;
        this.zzd = d2;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = i7;
        this.zzh = i10;
        this.zzi = i11;
    }

    private static int zzg(int i7, int i10) {
        if (i7 < i10) {
            return -1;
        }
        return i7 != i10 ? 1 : 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzjo zzjoVar) {
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.zza.compareTo(zzjoVar2.zza);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i7 = this.zzg;
        int iZzg = zzg(i7, zzjoVar2.zzg);
        if (iZzg != 0) {
            return iZzg;
        }
        int i10 = 0;
        if (i7 == 1) {
            long j6 = this.zzb;
            long j10 = zzjoVar2.zzb;
            if (j6 < j10) {
                return -1;
            }
            return j6 == j10 ? 0 : 1;
        }
        if (i7 == 2) {
            boolean z3 = this.zzc;
            if (z3 == zzjoVar2.zzc) {
                return 0;
            }
            return z3 ? 1 : -1;
        }
        if (i7 == 3) {
            return Double.compare(this.zzd, zzjoVar2.zzd);
        }
        if (i7 == 4) {
            String str = this.zze;
            String str2 = zzjoVar2.zze;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i7 != 5) {
            throw new AssertionError(d0.n(i7, "Invalid enum value: ", new StringBuilder(String.valueOf(i7).length() + 20)));
        }
        byte[] bArr = this.zzf;
        byte[] bArr2 = zzjoVar2.zzf;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i10 >= Math.min(length2, length)) {
                return zzg(length2, length);
            }
            int i11 = bArr[i10] - bArr2[i10];
            if (i11 != 0) {
                return i11;
            }
            i10++;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        int i7;
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.zza(this.zza, zzjoVar.zza) && (i7 = this.zzg) == zzjoVar.zzg && this.zzh == zzjoVar.zzh && this.zzi == zzjoVar.zzi) {
                if (i7 == 1) {
                    return this.zzb == zzjoVar.zzb;
                }
                if (i7 == 2) {
                    return this.zzc == zzjoVar.zzc;
                }
                if (i7 == 3) {
                    return this.zzd == zzjoVar.zzd;
                }
                if (i7 == 4) {
                    return zzkl.zza(this.zze, zzjoVar.zze);
                }
                if (i7 == 5) {
                    return Arrays.equals(this.zzf, zzjoVar.zzf);
                }
                throw new AssertionError(d0.n(i7, "Invalid enum value: ", new StringBuilder(String.valueOf(i7).length() + 20)));
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        zzf(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        boolean zZzb = zzjp.zzb(str);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        if (!zZzb) {
            SafeParcelWriter.writeString(parcel, 2, str, false);
        }
        long j6 = this.zzb;
        if (j6 != 0) {
            SafeParcelWriter.writeLong(parcel, 3, j6);
        }
        if (this.zzc) {
            SafeParcelWriter.writeBoolean(parcel, 4, true);
        }
        double d2 = this.zzd;
        if (d2 != 0.0d) {
            SafeParcelWriter.writeDouble(parcel, 5, d2);
        }
        String str2 = this.zze;
        if (!zzjp.zzb(str2)) {
            SafeParcelWriter.writeString(parcel, 6, str2, false);
        }
        byte[] bArr = this.zzf;
        if (!zzjp.zzb(bArr)) {
            SafeParcelWriter.writeByteArray(parcel, 7, bArr, false);
        }
        int i10 = this.zzg;
        if (!zzjp.zza(i10)) {
            SafeParcelWriter.writeInt(parcel, 8, i10);
        }
        int i11 = this.zzh;
        if (!zzjp.zza(i11)) {
            SafeParcelWriter.writeInt(parcel, 9, i11);
        }
        int i12 = this.zzi;
        if (!zzjp.zza(i12)) {
            SafeParcelWriter.writeInt(parcel, 10, i12);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zza() {
        if (this.zzg == 1) {
            return this.zzb;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final boolean zzb() {
        if (this.zzg == 2) {
            return this.zzc;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final double zzc() {
        if (this.zzg == 3) {
            return this.zzd;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final String zzd() {
        if (this.zzg == 4) {
            return (String) Preconditions.checkNotNull(this.zze);
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public final byte[] zze() {
        if (this.zzg == 5) {
            return (byte[]) Preconditions.checkNotNull(this.zzf);
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final void zzf(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.zza;
        sb2.append(str);
        sb2.append(", ");
        int i7 = this.zzg;
        if (i7 == 1) {
            sb2.append(this.zzb);
        } else if (i7 == 2) {
            sb2.append(this.zzc);
        } else if (i7 == 3) {
            sb2.append(this.zzd);
        } else if (i7 == 4) {
            sb2.append("'");
            sb2.append((String) Preconditions.checkNotNull(this.zze));
            sb2.append("'");
        } else {
            if (i7 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i7).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i7);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            sb2.append(Base64.encodeToString((byte[]) Preconditions.checkNotNull(this.zzf), 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(this.zzh);
        sb2.append(", ");
        sb2.append(this.zzi);
        sb2.append(")");
    }
}
