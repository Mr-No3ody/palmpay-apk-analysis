package com.transsnet.palmpay.send_money.bean.resp;

import androidx.camera.camera2.internal.F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferHomeResp;", "", "<init>", "()V", "payTypeList", "", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferHomeResp$Payment;", "getPayTypeList", "()Ljava/util/List;", "setPayTypeList", "(Ljava/util/List;)V", "Payment", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferHomeResp {

    @Nullable
    private List<Payment> payTypeList;

    @Nullable
    public final List<Payment> getPayTypeList() {
        return this.payTypeList;
    }

    public final void setPayTypeList(@Nullable List<Payment> list) {
        this.payTypeList = list;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017JJ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferHomeResp$Payment;", "", "paymentIcon", "", "paymentTypeDesc", "paymentType", "", "balance", "", "defaultOption", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getPaymentIcon", "()Ljava/lang/String;", "getPaymentTypeDesc", "getPaymentType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDefaultOption", "()Ljava/lang/Boolean;", "setDefaultOption", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferHomeResp$Payment;", "equals", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payment {

        @Nullable
        private final Long balance;

        @Nullable
        private Boolean defaultOption;

        @Nullable
        private final String paymentIcon;

        @Nullable
        private final Integer paymentType;

        @Nullable
        private final String paymentTypeDesc;

        public Payment(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Long l5, @Nullable Boolean bool) {
            this.paymentIcon = str;
            this.paymentTypeDesc = str2;
            this.paymentType = num;
            this.balance = l5;
            this.defaultOption = bool;
        }

        public static /* synthetic */ Payment copy$default(Payment payment, String str, String str2, Integer num, Long l5, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = payment.paymentIcon;
            }
            if ((i7 & 2) != 0) {
                str2 = payment.paymentTypeDesc;
            }
            if ((i7 & 4) != 0) {
                num = payment.paymentType;
            }
            if ((i7 & 8) != 0) {
                l5 = payment.balance;
            }
            if ((i7 & 16) != 0) {
                bool = payment.defaultOption;
            }
            Boolean bool2 = bool;
            Integer num2 = num;
            return payment.copy(str, str2, num2, l5, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentIcon() {
            return this.paymentIcon;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPaymentTypeDesc() {
            return this.paymentTypeDesc;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getBalance() {
            return this.balance;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getDefaultOption() {
            return this.defaultOption;
        }

        @NotNull
        public final Payment copy(@Nullable String paymentIcon, @Nullable String paymentTypeDesc, @Nullable Integer paymentType, @Nullable Long balance, @Nullable Boolean defaultOption) {
            return new Payment(paymentIcon, paymentTypeDesc, paymentType, balance, defaultOption);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.c(this.paymentIcon, payment.paymentIcon) && Intrinsics.c(this.paymentTypeDesc, payment.paymentTypeDesc) && Intrinsics.c(this.paymentType, payment.paymentType) && Intrinsics.c(this.balance, payment.balance) && Intrinsics.c(this.defaultOption, payment.defaultOption);
        }

        @Nullable
        public final Long getBalance() {
            return this.balance;
        }

        @Nullable
        public final Boolean getDefaultOption() {
            return this.defaultOption;
        }

        @Nullable
        public final String getPaymentIcon() {
            return this.paymentIcon;
        }

        @Nullable
        public final Integer getPaymentType() {
            return this.paymentType;
        }

        @Nullable
        public final String getPaymentTypeDesc() {
            return this.paymentTypeDesc;
        }

        public int hashCode() {
            String str = this.paymentIcon;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.paymentTypeDesc;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.paymentType;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Long l5 = this.balance;
            int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Boolean bool = this.defaultOption;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final void setDefaultOption(@Nullable Boolean bool) {
            this.defaultOption = bool;
        }

        @NotNull
        public String toString() {
            String str = this.paymentIcon;
            String str2 = this.paymentTypeDesc;
            Integer num = this.paymentType;
            Long l5 = this.balance;
            Boolean bool = this.defaultOption;
            StringBuilder sbF = F.f("Payment(paymentIcon=", str, ", paymentTypeDesc=", str2, ", paymentType=");
            sbF.append(num);
            sbF.append(", balance=");
            sbF.append(l5);
            sbF.append(", defaultOption=");
            sbF.append(bool);
            sbF.append(")");
            return sbF.toString();
        }

        public /* synthetic */ Payment(String str, String str2, Integer num, Long l5, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, num, l5, (i7 & 16) != 0 ? Boolean.FALSE : bool);
        }
    }
}
