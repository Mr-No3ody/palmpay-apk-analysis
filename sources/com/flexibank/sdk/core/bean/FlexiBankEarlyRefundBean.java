package com.flexibank.sdk.core.bean;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\b¨\u0006)"}, d2 = {"Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "Landroid/os/Parcelable;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "", "selected", "I", "getSelected", "()I", "setSelected", "(I)V", "", "payerAmount", "J", "getPayerAmount", "()J", "setPayerAmount", "(J)V", "totalAmount", "getTotalAmount", "setTotalAmount", "platformAmount", "getPlatformAmount", "setPlatformAmount", "payeeAmount", "getPayeeAmount", "setPayeeAmount", "title", "getTitle", "setTitle", "tips", "getTips", "setTips", "imageUrl", "getImageUrl", "setImageUrl", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankEarlyRefundBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankEarlyRefundBean> CREATOR = new a();

    @Nullable
    private String imageUrl;
    private long payeeAmount;
    private long payerAmount;
    private long platformAmount;
    private int selected;

    @Nullable
    private String tips;

    @Nullable
    private String title;
    private long totalAmount;

    @Nullable
    private String type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankEarlyRefundBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankEarlyRefundBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankEarlyRefundBean(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankEarlyRefundBean[] newArray(int i7) {
            return new FlexiBankEarlyRefundBean[i7];
        }
    }

    public FlexiBankEarlyRefundBean() {
        this(null, 0, 0L, 0L, 0L, 0L, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankEarlyRefundBean)) {
            return false;
        }
        FlexiBankEarlyRefundBean flexiBankEarlyRefundBean = (FlexiBankEarlyRefundBean) obj;
        return Intrinsics.c(this.type, flexiBankEarlyRefundBean.type) && this.selected == flexiBankEarlyRefundBean.selected && this.payerAmount == flexiBankEarlyRefundBean.payerAmount && this.totalAmount == flexiBankEarlyRefundBean.totalAmount && this.platformAmount == flexiBankEarlyRefundBean.platformAmount && this.payeeAmount == flexiBankEarlyRefundBean.payeeAmount && Intrinsics.c(this.title, flexiBankEarlyRefundBean.title) && Intrinsics.c(this.tips, flexiBankEarlyRefundBean.tips) && Intrinsics.c(this.imageUrl, flexiBankEarlyRefundBean.imageUrl);
    }

    public final int hashCode() {
        String str = this.type;
        int iB = q0.b(q0.b(q0.b(q0.b(u.b(this.selected, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.payerAmount), 31, this.totalAmount), 31, this.platformAmount), 31, this.payeeAmount);
        String str2 = this.title;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        int i7 = this.selected;
        long j6 = this.payerAmount;
        long j10 = this.totalAmount;
        long j11 = this.platformAmount;
        long j12 = this.payeeAmount;
        String str2 = this.title;
        String str3 = this.tips;
        String str4 = this.imageUrl;
        StringBuilder sb2 = new StringBuilder("FlexiBankEarlyRefundBean(type=");
        sb2.append(str);
        sb2.append(", selected=");
        sb2.append(i7);
        sb2.append(", payerAmount=");
        sb2.append(j6);
        u.v(sb2, ", totalAmount=", j10, ", platformAmount=");
        sb2.append(j11);
        u.v(sb2, ", payeeAmount=", j12, ", title=");
        u.x(sb2, str2, ", tips=", str3, ", imageUrl=");
        return G.r(sb2, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeInt(this.selected);
        dest.writeLong(this.payerAmount);
        dest.writeLong(this.totalAmount);
        dest.writeLong(this.platformAmount);
        dest.writeLong(this.payeeAmount);
        dest.writeString(this.title);
        dest.writeString(this.tips);
        dest.writeString(this.imageUrl);
    }

    public FlexiBankEarlyRefundBean(String str, int i7, long j6, long j10, long j11, long j12, String str2, String str3, String str4) {
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
}
