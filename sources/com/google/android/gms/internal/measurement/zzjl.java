package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.camera.camera2.internal.F;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.common.collect.Sets;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();
    public static final byte[][] zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final byte[] zzc;

    @SafeParcelable.Field(id = 4)
    public final byte[][] zzd;

    @SafeParcelable.Field(id = 5)
    public final byte[][] zze;

    @SafeParcelable.Field(id = 6)
    public final byte[][] zzf;

    @SafeParcelable.Field(id = 7)
    public final byte[][] zzg;

    @SafeParcelable.Field(id = 8)
    public final int[] zzh;

    @SafeParcelable.Field(id = 9)
    public final byte[][] zzi;

    @SafeParcelable.Field(id = 10)
    public final int[] zzj;

    @SafeParcelable.Field(getter = "getExternalExperimentTokens", id = 11)
    final byte[][] zzk;

    static {
        byte[][] bArr = new byte[0][];
        zza = bArr;
        new zzjl("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    @SafeParcelable.Constructor
    public zzjl(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) byte[][] bArr2, @SafeParcelable.Param(id = 5) byte[][] bArr3, @SafeParcelable.Param(id = 6) byte[][] bArr4, @SafeParcelable.Param(id = 7) byte[][] bArr5, @SafeParcelable.Param(id = 8) int[] iArr, @SafeParcelable.Param(id = 9) byte[][] bArr6, @SafeParcelable.Param(id = 10) int[] iArr2, @SafeParcelable.Param(id = 11) byte[][] bArr7) {
        this.zzb = str;
        this.zzc = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzf = bArr4;
        this.zzg = bArr5;
        this.zzh = iArr;
        this.zzi = bArr6;
        this.zzj = iArr2;
        this.zzk = bArr7;
    }

    private static void zza(StringBuilder sb2, String str, byte[][] bArr) {
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            sb2.append(BuildConfig.TRAVIS);
            return;
        }
        sb2.append("(");
        boolean z3 = true;
        int i7 = 0;
        while (i7 < bArr.length) {
            byte[] bArr2 = bArr[i7];
            if (!z3) {
                sb2.append(", ");
            }
            sb2.append("'");
            Preconditions.checkNotNull(bArr2);
            sb2.append(Base64.encodeToString(bArr2, 3));
            sb2.append("'");
            i7++;
            z3 = false;
        }
        sb2.append(")");
    }

    private final Set zzb() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.zzi;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.zzc;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return zzc((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set zzc(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(length);
        for (byte[] bArr2 : bArr) {
            Preconditions.checkNotNull(bArr2);
            hashSetNewHashSetWithExpectedSize.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetNewHashSetWithExpectedSize;
    }

    private static Set zzd(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(length);
        for (int i7 : iArr) {
            hashSetNewHashSetWithExpectedSize.add(Integer.valueOf(i7));
        }
        return hashSetNewHashSetWithExpectedSize;
    }

    private static List zze(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i7 = 0; i7 < iArr.length; i7 += 2) {
            arrayList.add(new zzju(iArr[i7], iArr[i7 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (zzkl.zza(this.zzb, zzjlVar.zzb) && zzkl.zza(zzb(), zzjlVar.zzb()) && zzkl.zza(zzc(this.zzd), zzc(zzjlVar.zzd)) && zzkl.zza(zzc(this.zze), zzc(zzjlVar.zze)) && zzkl.zza(zzc(this.zzf), zzc(zzjlVar.zzf)) && zzkl.zza(zzc(this.zzg), zzc(zzjlVar.zzg)) && zzkl.zza(zzd(this.zzh), zzd(zzjlVar.zzh)) && zzkl.zza(zze(this.zzj), zze(zzjlVar.zzj)) && zzkl.zza(zzc(this.zzk), zzc(zzjlVar.zzk))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.zzb;
        sb2.append(str == null ? BuildConfig.TRAVIS : F.d(new StringBuilder(str.length() + 2), "'", str, "'"));
        byte[] bArr = this.zzc;
        sb2.append(", direct==");
        if (bArr == null) {
            sb2.append(BuildConfig.TRAVIS);
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        zza(sb2, "GAIA=", this.zzd);
        sb2.append(", ");
        zza(sb2, "PSEUDO=", this.zze);
        sb2.append(", ");
        zza(sb2, "ALWAYS=", this.zzf);
        sb2.append(", ");
        zza(sb2, "OTHER=", this.zzg);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.zzh));
        sb2.append(", ");
        zza(sb2, "directs=", this.zzi);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(zze(this.zzj).toArray()));
        sb2.append(", ");
        zza(sb2, "external=", this.zzk);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeIntArray(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 11, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
