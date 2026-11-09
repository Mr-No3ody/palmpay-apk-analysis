package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "Lcom/transsnet/palmpay/core/bean/cashier/CashierPaymentMethodBean;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "mainMethodFlag", "", "getMainMethodFlag", "()Ljava/lang/Boolean;", "setMainMethodFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "combinationAmount", "", "getCombinationAmount", "()Ljava/lang/Long;", "setCombinationAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "subPaymentMethodBean", "getSubPaymentMethodBean", "()Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "setSubPaymentMethodBean", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;)V", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierCombinationPaymentMethodBean extends CashierPaymentMethodBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long combinationAmount;

    @Nullable
    private Boolean mainMethodFlag;

    @Nullable
    private CashierCombinationPaymentMethodBean subPaymentMethodBean;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CashierCombinationPaymentMethodBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CashierCombinationPaymentMethodBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierCombinationPaymentMethodBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashierCombinationPaymentMethodBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierCombinationPaymentMethodBean[] newArray(int size) {
            return new CashierCombinationPaymentMethodBean[size];
        }
    }

    public CashierCombinationPaymentMethodBean() {
        this.mainMethodFlag = Boolean.FALSE;
        this.combinationAmount = 0L;
        this.itemViewType = 35;
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Long getCombinationAmount() {
        return this.combinationAmount;
    }

    @Nullable
    public final Boolean getMainMethodFlag() {
        return this.mainMethodFlag;
    }

    @Nullable
    public final CashierCombinationPaymentMethodBean getSubPaymentMethodBean() {
        return this.subPaymentMethodBean;
    }

    public final void setCombinationAmount(@Nullable Long l5) {
        this.combinationAmount = l5;
    }

    public final void setMainMethodFlag(@Nullable Boolean bool) {
        this.mainMethodFlag = bool;
    }

    public final void setSubPaymentMethodBean(@Nullable CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean) {
        this.subPaymentMethodBean = cashierCombinationPaymentMethodBean;
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, flags);
        parcel.writeValue(this.mainMethodFlag);
        parcel.writeValue(this.combinationAmount);
        parcel.writeParcelable(this.subPaymentMethodBean, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashierCombinationPaymentMethodBean(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.readFromParcel(parcel);
        Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
        this.mainMethodFlag = value instanceof Boolean ? (Boolean) value : null;
        Object value2 = parcel.readValue(Long.TYPE.getClassLoader());
        this.combinationAmount = value2 instanceof Long ? (Long) value2 : null;
        this.subPaymentMethodBean = (CashierCombinationPaymentMethodBean) parcel.readParcelable(CashierCombinationPaymentMethodBean.class.getClassLoader());
    }
}
