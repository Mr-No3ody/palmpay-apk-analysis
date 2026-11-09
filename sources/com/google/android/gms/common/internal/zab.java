package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ClientNotificationEventCreator")
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new zac();

    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getCallingPackage", id = 2)
    private final String zab;

    @SafeParcelable.Field(getter = "getTimestampMillis", id = 3)
    private final long zac;

    @SafeParcelable.Field(getter = "getConnectionResultCode", id = 4)
    private final int zad;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIsDialog", id = 5)
    private final boolean zae;

    @SafeParcelable.Constructor
    public zab(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j6, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) boolean z3) {
        this.zaa = i7;
        this.zab = str;
        this.zac = j6;
        this.zad = i10;
        this.zae = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zac);
        SafeParcelWriter.writeInt(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
