package com.transsnet.palmpay.core.bean.cashier;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ,\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;", "Landroid/os/Parcelable;", "detail", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierFeeDetailBean;", "totalAmount", "", "<init>", "(Ljava/util/List;Ljava/lang/Long;)V", "getDetail", "()Ljava/util/List;", "setDetail", "(Ljava/util/List;)V", "getTotalAmount", "()Ljava/lang/Long;", "setTotalAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentFeeDetailBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentFeeDetailBean> CREATOR = new Creator();

    @Nullable
    private List<CashierFeeDetailBean> detail;

    @Nullable
    private Long totalAmount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentFeeDetailBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentFeeDetailBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                for (int i10 = 0; i10 != i7; i10++) {
                    arrayList.add(CashierFeeDetailBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new PaymentFeeDetailBean(arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentFeeDetailBean[] newArray(int i7) {
            return new PaymentFeeDetailBean[i7];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentFeeDetailBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentFeeDetailBean copy$default(PaymentFeeDetailBean paymentFeeDetailBean, List list, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = paymentFeeDetailBean.detail;
        }
        if ((i7 & 2) != 0) {
            l5 = paymentFeeDetailBean.totalAmount;
        }
        return paymentFeeDetailBean.copy(list, l5);
    }

    @Nullable
    public final List<CashierFeeDetailBean> component1() {
        return this.detail;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    @NotNull
    public final PaymentFeeDetailBean copy(@Nullable List<CashierFeeDetailBean> detail, @Nullable Long totalAmount) {
        return new PaymentFeeDetailBean(detail, totalAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentFeeDetailBean)) {
            return false;
        }
        PaymentFeeDetailBean paymentFeeDetailBean = (PaymentFeeDetailBean) other;
        return Intrinsics.c(this.detail, paymentFeeDetailBean.detail) && Intrinsics.c(this.totalAmount, paymentFeeDetailBean.totalAmount);
    }

    @Nullable
    public final List<CashierFeeDetailBean> getDetail() {
        return this.detail;
    }

    @Nullable
    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        List<CashierFeeDetailBean> list = this.detail;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l5 = this.totalAmount;
        return iHashCode + (l5 != null ? l5.hashCode() : 0);
    }

    public final void setDetail(@Nullable List<CashierFeeDetailBean> list) {
        this.detail = list;
    }

    public final void setTotalAmount(@Nullable Long l5) {
        this.totalAmount = l5;
    }

    @NotNull
    public String toString() {
        return "PaymentFeeDetailBean(detail=" + this.detail + ", totalAmount=" + this.totalAmount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CashierFeeDetailBean> list = this.detail;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CashierFeeDetailBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Long l5 = this.totalAmount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
    }

    public PaymentFeeDetailBean(@Nullable List<CashierFeeDetailBean> list, @Nullable Long l5) {
        this.detail = list;
        this.totalAmount = l5;
    }

    public /* synthetic */ PaymentFeeDetailBean(List list, Long l5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? 0L : l5);
    }
}
