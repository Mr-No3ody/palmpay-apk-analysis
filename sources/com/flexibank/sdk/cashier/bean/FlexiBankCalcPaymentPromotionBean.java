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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionBean;", "Landroid/os/Parcelable;", "", "promotionTips", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionItemBean;", "promotionItemList", "Ljava/util/List;", "c", "()Ljava/util/List;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcPaymentPromotionBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcPaymentPromotionBean> CREATOR = new a();

    @Nullable
    private final List<FlexiBankCalcPaymentPromotionItemBean> promotionItemList;

    @Nullable
    private final String promotionTips;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcPaymentPromotionBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentPromotionBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i10 = 0; i10 != i7; i10++) {
                    arrayList2.add(FlexiBankCalcPaymentPromotionItemBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FlexiBankCalcPaymentPromotionBean(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentPromotionBean[] newArray(int i7) {
            return new FlexiBankCalcPaymentPromotionBean[i7];
        }
    }

    public FlexiBankCalcPaymentPromotionBean() {
        this(null, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPromotionItemList() {
        return this.promotionItemList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPromotionTips() {
        return this.promotionTips;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcPaymentPromotionBean)) {
            return false;
        }
        FlexiBankCalcPaymentPromotionBean flexiBankCalcPaymentPromotionBean = (FlexiBankCalcPaymentPromotionBean) obj;
        return Intrinsics.c(this.promotionTips, flexiBankCalcPaymentPromotionBean.promotionTips) && Intrinsics.c(this.promotionItemList, flexiBankCalcPaymentPromotionBean.promotionItemList);
    }

    public final int hashCode() {
        String str = this.promotionTips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FlexiBankCalcPaymentPromotionItemBean> list = this.promotionItemList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FlexiBankCalcPaymentPromotionBean(promotionTips=" + this.promotionTips + ", promotionItemList=" + this.promotionItemList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.promotionTips);
        List<FlexiBankCalcPaymentPromotionItemBean> list = this.promotionItemList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FlexiBankCalcPaymentPromotionItemBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i7);
        }
    }

    public FlexiBankCalcPaymentPromotionBean(String str, ArrayList arrayList) {
        this.promotionTips = str;
        this.promotionItemList = arrayList;
    }
}
