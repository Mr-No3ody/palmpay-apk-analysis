package com.transsnet.palmpay.core.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/GetAutoTransferConfigResp;", "Landroid/os/Parcelable;", "isAutoTransfer", "", "agreementUrl", "", "isWhitelistUser", "isOpen", "", "autoTransferIntroduceUrl", "darkAutoTransferIntroduceUrl", "reserveSet", "reserveAmount", "", "<init>", "(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;IJ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "writeToParcel", "", "flags", "describeContents", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetAutoTransferConfigResp implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public final String agreementUrl;

    @JvmField
    @Nullable
    public final String autoTransferIntroduceUrl;

    @JvmField
    @Nullable
    public final String darkAutoTransferIntroduceUrl;

    @JvmField
    public int isAutoTransfer;

    @JvmField
    public final boolean isOpen;

    @JvmField
    public final int isWhitelistUser;

    @JvmField
    public final long reserveAmount;

    @JvmField
    public final int reserveSet;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/GetAutoTransferConfigResp$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/rsp/GetAutoTransferConfigResp;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/rsp/GetAutoTransferConfigResp;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<GetAutoTransferConfigResp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetAutoTransferConfigResp createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetAutoTransferConfigResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetAutoTransferConfigResp[] newArray(int size) {
            return new GetAutoTransferConfigResp[size];
        }
    }

    public GetAutoTransferConfigResp(int i7, @Nullable String str, int i10, boolean z3, @Nullable String str2, @Nullable String str3, int i11, long j6) {
        this.isAutoTransfer = i7;
        this.agreementUrl = str;
        this.isWhitelistUser = i10;
        this.isOpen = z3;
        this.autoTransferIntroduceUrl = str2;
        this.darkAutoTransferIntroduceUrl = str3;
        this.reserveSet = i11;
        this.reserveAmount = j6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.isAutoTransfer);
        parcel.writeString(this.agreementUrl);
        parcel.writeInt(this.isWhitelistUser);
        parcel.writeByte(this.isOpen ? (byte) 1 : (byte) 0);
        parcel.writeString(this.autoTransferIntroduceUrl);
        parcel.writeString(this.darkAutoTransferIntroduceUrl);
        parcel.writeInt(this.reserveSet);
        parcel.writeLong(this.reserveAmount);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAutoTransferConfigResp(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readByte() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
