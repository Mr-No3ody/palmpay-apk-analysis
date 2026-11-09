package com.flexibank.sdk.cashier.bean;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnInfoBean;", "Landroid/os/Parcelable;", "", "earnTips", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setEarnTips", "(Ljava/lang/String;)V", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnItem;", "earnItemList", "Ljava/util/List;", "c", "()Ljava/util/List;", "setEarnItemList", "(Ljava/util/List;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcPaymentEarnInfoBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcPaymentEarnInfoBean> CREATOR = new a();

    @Nullable
    private List<FlexiBankCalcPaymentEarnItem> earnItemList;

    @Nullable
    private String earnTips;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcPaymentEarnInfoBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentEarnInfoBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i10 = 0; i10 != i7; i10++) {
                    arrayList2.add(FlexiBankCalcPaymentEarnItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FlexiBankCalcPaymentEarnInfoBean(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentEarnInfoBean[] newArray(int i7) {
            return new FlexiBankCalcPaymentEarnInfoBean[i7];
        }
    }

    public FlexiBankCalcPaymentEarnInfoBean() {
        this(null, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getEarnItemList() {
        return this.earnItemList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEarnTips() {
        return this.earnTips;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcPaymentEarnInfoBean)) {
            return false;
        }
        FlexiBankCalcPaymentEarnInfoBean flexiBankCalcPaymentEarnInfoBean = (FlexiBankCalcPaymentEarnInfoBean) obj;
        return Intrinsics.c(this.earnTips, flexiBankCalcPaymentEarnInfoBean.earnTips) && Intrinsics.c(this.earnItemList, flexiBankCalcPaymentEarnInfoBean.earnItemList);
    }

    public final int hashCode() {
        String str = this.earnTips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FlexiBankCalcPaymentEarnItem> list = this.earnItemList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FlexiBankCalcPaymentEarnInfoBean(earnTips=" + this.earnTips + ", earnItemList=" + this.earnItemList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.earnTips);
        List<FlexiBankCalcPaymentEarnItem> list = this.earnItemList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FlexiBankCalcPaymentEarnItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i7);
        }
    }

    public FlexiBankCalcPaymentEarnInfoBean(String str, ArrayList arrayList) {
        this.earnTips = str;
        this.earnItemList = arrayList;
    }
}
