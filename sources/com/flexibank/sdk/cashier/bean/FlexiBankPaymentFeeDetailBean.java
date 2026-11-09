package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankPaymentFeeDetailBean;", "Landroid/os/Parcelable;", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFeeDetailBean;", "detail", "Ljava/util/List;", "c", "()Ljava/util/List;", "setDetail", "(Ljava/util/List;)V", "", "totalAmount", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "setTotalAmount", "(Ljava/lang/Long;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankPaymentFeeDetailBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankPaymentFeeDetailBean> CREATOR = new a();

    @Nullable
    private List<FlexiBankCashierFeeDetailBean> detail;

    @Nullable
    private Long totalAmount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankPaymentFeeDetailBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankPaymentFeeDetailBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                for (int i10 = 0; i10 != i7; i10++) {
                    arrayList.add(FlexiBankCashierFeeDetailBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new FlexiBankPaymentFeeDetailBean(arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankPaymentFeeDetailBean[] newArray(int i7) {
            return new FlexiBankPaymentFeeDetailBean[i7];
        }
    }

    public FlexiBankPaymentFeeDetailBean(ArrayList arrayList, Long l5) {
        this.detail = arrayList;
        this.totalAmount = l5;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankPaymentFeeDetailBean)) {
            return false;
        }
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean = (FlexiBankPaymentFeeDetailBean) obj;
        return Intrinsics.c(this.detail, flexiBankPaymentFeeDetailBean.detail) && Intrinsics.c(this.totalAmount, flexiBankPaymentFeeDetailBean.totalAmount);
    }

    public final int hashCode() {
        List<FlexiBankCashierFeeDetailBean> list = this.detail;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l5 = this.totalAmount;
        return iHashCode + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "FlexiBankPaymentFeeDetailBean(detail=" + this.detail + ", totalAmount=" + this.totalAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<FlexiBankCashierFeeDetailBean> list = this.detail;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<FlexiBankCashierFeeDetailBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, i7);
            }
        }
        Long l5 = this.totalAmount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
    }

    public FlexiBankPaymentFeeDetailBean() {
        this(null, 0L);
    }
}
