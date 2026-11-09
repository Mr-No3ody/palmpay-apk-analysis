package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;", "Landroid/os/Parcelable;", "type", "", "selected", "", "payerAmount", "", "totalAmount", "platformAmount", "payeeAmount", "title", "tips", "imageUrl", "<init>", "(Ljava/lang/String;IJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "writeToParcel", "", "flags", "describeContents", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EarlyRefundBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public String imageUrl;

    @JvmField
    public long payeeAmount;

    @JvmField
    public long payerAmount;

    @JvmField
    public long platformAmount;

    @JvmField
    public int selected;

    @JvmField
    @Nullable
    public String tips;

    @JvmField
    @Nullable
    public String title;

    @JvmField
    public long totalAmount;

    @JvmField
    @Nullable
    public String type;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.EarlyRefundBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/EarlyRefundBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<EarlyRefundBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EarlyRefundBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EarlyRefundBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EarlyRefundBean[] newArray(int size) {
            return new EarlyRefundBean[size];
        }
    }

    public EarlyRefundBean() {
        this(null, 0, 0L, 0L, 0L, 0L, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.type);
        parcel.writeInt(this.selected);
        parcel.writeLong(this.payerAmount);
        parcel.writeLong(this.totalAmount);
        parcel.writeLong(this.platformAmount);
        parcel.writeLong(this.payeeAmount);
        parcel.writeString(this.title);
        parcel.writeString(this.tips);
        parcel.writeString(this.imageUrl);
    }

    public EarlyRefundBean(@Nullable String str, int i7, long j6, long j10, long j11, long j12, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.type = str;
        this.selected = i7;
        this.payerAmount = j6;
        this.totalAmount = j10;
        this.platformAmount = j11;
        this.payeeAmount = j12;
        this.title = str2;
        this.tips = str3;
        this.imageUrl = str4;
    }

    public /* synthetic */ EarlyRefundBean(String str, int i7, long j6, long j10, long j11, long j12, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0 : i7, (i10 & 4) != 0 ? 0L : j6, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? 0L : j11, (i10 & 32) == 0 ? j12 : 0L, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : str3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EarlyRefundBean(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
