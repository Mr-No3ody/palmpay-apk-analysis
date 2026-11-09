package com.transsnet.palmpay.main.export.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance;", "<init>", "(Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance;)V", "getData", "()Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance;", "Balance", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetUserAssetsAmountResp extends CommonResult {

    @Nullable
    private final Balance data;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance;", "Landroid/os/Parcelable;", "totalBalance", "", "availableBalance", "cashBoxBalance", "savingBalance", "targetSavingBalance", "spendSaveBalance", "isWhitelistUser", "", "<init>", "(JJJJJJZ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Balance implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        public final long availableBalance;

        @JvmField
        public final long cashBoxBalance;

        @JvmField
        public final boolean isWhitelistUser;

        @JvmField
        public final long savingBalance;

        @JvmField
        public final long spendSaveBalance;

        @JvmField
        public final long targetSavingBalance;

        @JvmField
        public final long totalBalance;

        /* JADX INFO: renamed from: com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp$Balance$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/main/export/bean/rsp/GetUserAssetsAmountResp$Balance;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<Balance> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public Balance createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Balance(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public Balance[] newArray(int size) {
                return new Balance[size];
            }
        }

        public Balance() {
            this(0L, 0L, 0L, 0L, 0L, 0L, false, 127, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeLong(this.totalBalance);
            parcel.writeLong(this.availableBalance);
            parcel.writeLong(this.cashBoxBalance);
            parcel.writeLong(this.targetSavingBalance);
            parcel.writeLong(this.savingBalance);
            parcel.writeLong(this.spendSaveBalance);
            parcel.writeByte(this.isWhitelistUser ? (byte) 1 : (byte) 0);
        }

        public Balance(long j6, long j10, long j11, long j12, long j13, long j14, boolean z3) {
            this.totalBalance = j6;
            this.availableBalance = j10;
            this.cashBoxBalance = j11;
            this.savingBalance = j12;
            this.targetSavingBalance = j13;
            this.spendSaveBalance = j14;
            this.isWhitelistUser = z3;
        }

        public /* synthetic */ Balance(long j6, long j10, long j11, long j12, long j13, long j14, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 0L : j6, (i7 & 2) != 0 ? 0L : j10, (i7 & 4) != 0 ? 0L : j11, (i7 & 8) != 0 ? 0L : j12, (i7 & 16) != 0 ? 0L : j13, (i7 & 32) == 0 ? j14 : 0L, (i7 & 64) != 0 ? false : z3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Balance(@NotNull Parcel parcel) {
            this(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readByte() != 0);
            Intrinsics.checkNotNullParameter(parcel, "parcel");
        }
    }

    public GetUserAssetsAmountResp(@Nullable Balance balance) {
        this.data = balance;
    }

    @Nullable
    public final Balance getData() {
        return this.data;
    }
}
