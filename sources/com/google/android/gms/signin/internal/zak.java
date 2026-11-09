package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final ConnectionResult zab;

    @Nullable
    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    private final zay zac;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @Nullable @SafeParcelable.Param(id = 3) zay zayVar) {
        this.zaa = i7;
        this.zab = connectionResult;
        this.zac = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i7, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }

    @Nullable
    public final zay zab() {
        return this.zac;
    }
}
