package com.flexibank.sdk.cashier.bean;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcCommissionEarnBean;", "Landroid/os/Parcelable;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "", "amount", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "show", "getShow", "setShow", "tips", "getTips", "setTips", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcCommissionEarnBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcCommissionEarnBean> CREATOR = new a();

    @Nullable
    private Long amount;

    @Nullable
    private String show;

    @Nullable
    private String tips;

    @Nullable
    private String type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcCommissionEarnBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcCommissionEarnBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankCalcCommissionEarnBean(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcCommissionEarnBean[] newArray(int i7) {
            return new FlexiBankCalcCommissionEarnBean[i7];
        }
    }

    public FlexiBankCalcCommissionEarnBean(String str, Long l5, String str2, String str3) {
        this.type = str;
        this.amount = l5;
        this.show = str2;
        this.tips = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcCommissionEarnBean)) {
            return false;
        }
        FlexiBankCalcCommissionEarnBean flexiBankCalcCommissionEarnBean = (FlexiBankCalcCommissionEarnBean) obj;
        return Intrinsics.c(this.type, flexiBankCalcCommissionEarnBean.type) && Intrinsics.c(this.amount, flexiBankCalcCommissionEarnBean.amount) && Intrinsics.c(this.show, flexiBankCalcCommissionEarnBean.show) && Intrinsics.c(this.tips, flexiBankCalcCommissionEarnBean.tips);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.amount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.show;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        Long l5 = this.amount;
        String str2 = this.show;
        String str3 = this.tips;
        StringBuilder sb2 = new StringBuilder("FlexiBankCalcCommissionEarnBean(type=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(l5);
        sb2.append(", show=");
        return G.s(sb2, str2, ", tips=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        Long l5 = this.amount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        dest.writeString(this.show);
        dest.writeString(this.tips);
    }

    public FlexiBankCalcCommissionEarnBean() {
        this(null, 0L, null, null);
    }
}
