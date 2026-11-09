package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionBean;", "Landroid/os/Parcelable;", "promotionTips", "", "promotionItemList", "", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionItemBean;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getPromotionTips", "()Ljava/lang/String;", "getPromotionItemList", "()Ljava/util/List;", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcPaymentPromotionBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<CalcPaymentPromotionItemBean> promotionItemList;

    @Nullable
    private final String promotionTips;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalcPaymentPromotionBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentPromotionBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcPaymentPromotionBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentPromotionBean[] newArray(int size) {
            return new CalcPaymentPromotionBean[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalcPaymentPromotionBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalcPaymentPromotionBean copy$default(CalcPaymentPromotionBean calcPaymentPromotionBean, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = calcPaymentPromotionBean.promotionTips;
        }
        if ((i7 & 2) != 0) {
            list = calcPaymentPromotionBean.promotionItemList;
        }
        return calcPaymentPromotionBean.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPromotionTips() {
        return this.promotionTips;
    }

    @Nullable
    public final List<CalcPaymentPromotionItemBean> component2() {
        return this.promotionItemList;
    }

    @NotNull
    public final CalcPaymentPromotionBean copy(@Nullable String promotionTips, @Nullable List<CalcPaymentPromotionItemBean> promotionItemList) {
        return new CalcPaymentPromotionBean(promotionTips, promotionItemList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcPaymentPromotionBean)) {
            return false;
        }
        CalcPaymentPromotionBean calcPaymentPromotionBean = (CalcPaymentPromotionBean) other;
        return Intrinsics.c(this.promotionTips, calcPaymentPromotionBean.promotionTips) && Intrinsics.c(this.promotionItemList, calcPaymentPromotionBean.promotionItemList);
    }

    @Nullable
    public final List<CalcPaymentPromotionItemBean> getPromotionItemList() {
        return this.promotionItemList;
    }

    @Nullable
    public final String getPromotionTips() {
        return this.promotionTips;
    }

    public int hashCode() {
        String str = this.promotionTips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CalcPaymentPromotionItemBean> list = this.promotionItemList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CalcPaymentPromotionBean(promotionTips=" + this.promotionTips + ", promotionItemList=" + this.promotionItemList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.promotionTips);
        parcel.writeTypedList(this.promotionItemList);
    }

    public CalcPaymentPromotionBean(@Nullable String str, @Nullable List<CalcPaymentPromotionItemBean> list) {
        this.promotionTips = str;
        this.promotionItemList = list;
    }

    public /* synthetic */ CalcPaymentPromotionBean(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalcPaymentPromotionBean(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(CalcPaymentPromotionItemBean.CREATOR));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
