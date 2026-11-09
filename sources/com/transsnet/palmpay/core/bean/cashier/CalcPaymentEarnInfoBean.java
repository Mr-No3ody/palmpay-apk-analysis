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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0017HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnInfoBean;", "Landroid/os/Parcelable;", "earnTips", "", "earnItemList", "", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getEarnTips", "()Ljava/lang/String;", "setEarnTips", "(Ljava/lang/String;)V", "getEarnItemList", "()Ljava/util/List;", "setEarnItemList", "(Ljava/util/List;)V", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcPaymentEarnInfoBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<CalcPaymentEarnItem> earnItemList;

    @Nullable
    private String earnTips;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CalcPaymentEarnInfoBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnInfoBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnInfoBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnInfoBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalcPaymentEarnInfoBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentEarnInfoBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcPaymentEarnInfoBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentEarnInfoBean[] newArray(int size) {
            return new CalcPaymentEarnInfoBean[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalcPaymentEarnInfoBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalcPaymentEarnInfoBean copy$default(CalcPaymentEarnInfoBean calcPaymentEarnInfoBean, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = calcPaymentEarnInfoBean.earnTips;
        }
        if ((i7 & 2) != 0) {
            list = calcPaymentEarnInfoBean.earnItemList;
        }
        return calcPaymentEarnInfoBean.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEarnTips() {
        return this.earnTips;
    }

    @Nullable
    public final List<CalcPaymentEarnItem> component2() {
        return this.earnItemList;
    }

    @NotNull
    public final CalcPaymentEarnInfoBean copy(@Nullable String earnTips, @Nullable List<CalcPaymentEarnItem> earnItemList) {
        return new CalcPaymentEarnInfoBean(earnTips, earnItemList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcPaymentEarnInfoBean)) {
            return false;
        }
        CalcPaymentEarnInfoBean calcPaymentEarnInfoBean = (CalcPaymentEarnInfoBean) other;
        return Intrinsics.c(this.earnTips, calcPaymentEarnInfoBean.earnTips) && Intrinsics.c(this.earnItemList, calcPaymentEarnInfoBean.earnItemList);
    }

    @Nullable
    public final List<CalcPaymentEarnItem> getEarnItemList() {
        return this.earnItemList;
    }

    @Nullable
    public final String getEarnTips() {
        return this.earnTips;
    }

    public int hashCode() {
        String str = this.earnTips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CalcPaymentEarnItem> list = this.earnItemList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setEarnItemList(@Nullable List<CalcPaymentEarnItem> list) {
        this.earnItemList = list;
    }

    public final void setEarnTips(@Nullable String str) {
        this.earnTips = str;
    }

    @NotNull
    public String toString() {
        return "CalcPaymentEarnInfoBean(earnTips=" + this.earnTips + ", earnItemList=" + this.earnItemList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.earnTips);
        parcel.writeTypedList(this.earnItemList);
    }

    public CalcPaymentEarnInfoBean(@Nullable String str, @Nullable List<CalcPaymentEarnItem> list) {
        this.earnTips = str;
        this.earnItemList = list;
    }

    public /* synthetic */ CalcPaymentEarnInfoBean(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalcPaymentEarnInfoBean(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(CalcPaymentEarnItem.INSTANCE));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
