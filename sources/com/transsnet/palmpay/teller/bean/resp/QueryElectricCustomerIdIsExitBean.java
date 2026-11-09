package com.transsnet.palmpay.teller.bean.resp;

import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010)J\u0086\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006>"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/QueryElectricCustomerIdIsExitBean;", "", "familyAccountExist", "", "errorInfo", "", "customerId", "customerName", "paymentItemType", "valid", "debtValidation", "actualPaymentItemType", "tips", "debtAmount", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFamilyAccountExist", "()Ljava/lang/Boolean;", "setFamilyAccountExist", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getErrorInfo", "()Ljava/lang/String;", "setErrorInfo", "(Ljava/lang/String;)V", "getCustomerId", "setCustomerId", "getCustomerName", "setCustomerName", "getPaymentItemType", "setPaymentItemType", "getValid", "setValid", "getDebtValidation", "setDebtValidation", "getActualPaymentItemType", "setActualPaymentItemType", "getTips", "setTips", "getDebtAmount", "()Ljava/lang/Long;", "setDebtAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/teller/bean/resp/QueryElectricCustomerIdIsExitBean;", "equals", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryElectricCustomerIdIsExitBean {

    @Nullable
    private String actualPaymentItemType;

    @Nullable
    private String customerId;

    @Nullable
    private String customerName;

    @Nullable
    private Long debtAmount;

    @Nullable
    private Boolean debtValidation;

    @Nullable
    private String errorInfo;

    @Nullable
    private Boolean familyAccountExist;

    @Nullable
    private String paymentItemType;

    @Nullable
    private String tips;

    @Nullable
    private Boolean valid;

    public QueryElectricCustomerIdIsExitBean(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable Long l5) {
        this.familyAccountExist = bool;
        this.errorInfo = str;
        this.customerId = str2;
        this.customerName = str3;
        this.paymentItemType = str4;
        this.valid = bool2;
        this.debtValidation = bool3;
        this.actualPaymentItemType = str5;
        this.tips = str6;
        this.debtAmount = l5;
    }

    public static /* synthetic */ QueryElectricCustomerIdIsExitBean copy$default(QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean, Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, String str5, String str6, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = queryElectricCustomerIdIsExitBean.familyAccountExist;
        }
        if ((i7 & 2) != 0) {
            str = queryElectricCustomerIdIsExitBean.errorInfo;
        }
        if ((i7 & 4) != 0) {
            str2 = queryElectricCustomerIdIsExitBean.customerId;
        }
        if ((i7 & 8) != 0) {
            str3 = queryElectricCustomerIdIsExitBean.customerName;
        }
        if ((i7 & 16) != 0) {
            str4 = queryElectricCustomerIdIsExitBean.paymentItemType;
        }
        if ((i7 & 32) != 0) {
            bool2 = queryElectricCustomerIdIsExitBean.valid;
        }
        if ((i7 & 64) != 0) {
            bool3 = queryElectricCustomerIdIsExitBean.debtValidation;
        }
        if ((i7 & 128) != 0) {
            str5 = queryElectricCustomerIdIsExitBean.actualPaymentItemType;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str6 = queryElectricCustomerIdIsExitBean.tips;
        }
        if ((i7 & 512) != 0) {
            l5 = queryElectricCustomerIdIsExitBean.debtAmount;
        }
        String str7 = str6;
        Long l6 = l5;
        Boolean bool4 = bool3;
        String str8 = str5;
        String str9 = str4;
        Boolean bool5 = bool2;
        return queryElectricCustomerIdIsExitBean.copy(bool, str, str2, str3, str9, bool5, bool4, str8, str7, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getFamilyAccountExist() {
        return this.familyAccountExist;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getDebtAmount() {
        return this.debtAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorInfo() {
        return this.errorInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPaymentItemType() {
        return this.paymentItemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getValid() {
        return this.valid;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getDebtValidation() {
        return this.debtValidation;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getActualPaymentItemType() {
        return this.actualPaymentItemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final QueryElectricCustomerIdIsExitBean copy(@Nullable Boolean familyAccountExist, @Nullable String errorInfo, @Nullable String customerId, @Nullable String customerName, @Nullable String paymentItemType, @Nullable Boolean valid, @Nullable Boolean debtValidation, @Nullable String actualPaymentItemType, @Nullable String tips, @Nullable Long debtAmount) {
        return new QueryElectricCustomerIdIsExitBean(familyAccountExist, errorInfo, customerId, customerName, paymentItemType, valid, debtValidation, actualPaymentItemType, tips, debtAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryElectricCustomerIdIsExitBean)) {
            return false;
        }
        QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean = (QueryElectricCustomerIdIsExitBean) other;
        return Intrinsics.c(this.familyAccountExist, queryElectricCustomerIdIsExitBean.familyAccountExist) && Intrinsics.c(this.errorInfo, queryElectricCustomerIdIsExitBean.errorInfo) && Intrinsics.c(this.customerId, queryElectricCustomerIdIsExitBean.customerId) && Intrinsics.c(this.customerName, queryElectricCustomerIdIsExitBean.customerName) && Intrinsics.c(this.paymentItemType, queryElectricCustomerIdIsExitBean.paymentItemType) && Intrinsics.c(this.valid, queryElectricCustomerIdIsExitBean.valid) && Intrinsics.c(this.debtValidation, queryElectricCustomerIdIsExitBean.debtValidation) && Intrinsics.c(this.actualPaymentItemType, queryElectricCustomerIdIsExitBean.actualPaymentItemType) && Intrinsics.c(this.tips, queryElectricCustomerIdIsExitBean.tips) && Intrinsics.c(this.debtAmount, queryElectricCustomerIdIsExitBean.debtAmount);
    }

    @Nullable
    public final String getActualPaymentItemType() {
        return this.actualPaymentItemType;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getCustomerName() {
        return this.customerName;
    }

    @Nullable
    public final Long getDebtAmount() {
        return this.debtAmount;
    }

    @Nullable
    public final Boolean getDebtValidation() {
        return this.debtValidation;
    }

    @Nullable
    public final String getErrorInfo() {
        return this.errorInfo;
    }

    @Nullable
    public final Boolean getFamilyAccountExist() {
        return this.familyAccountExist;
    }

    @Nullable
    public final String getPaymentItemType() {
        return this.paymentItemType;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final Boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        Boolean bool = this.familyAccountExist;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.errorInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentItemType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.valid;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.debtValidation;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.actualPaymentItemType;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tips;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l5 = this.debtAmount;
        return iHashCode9 + (l5 != null ? l5.hashCode() : 0);
    }

    public final void setActualPaymentItemType(@Nullable String str) {
        this.actualPaymentItemType = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setCustomerName(@Nullable String str) {
        this.customerName = str;
    }

    public final void setDebtAmount(@Nullable Long l5) {
        this.debtAmount = l5;
    }

    public final void setDebtValidation(@Nullable Boolean bool) {
        this.debtValidation = bool;
    }

    public final void setErrorInfo(@Nullable String str) {
        this.errorInfo = str;
    }

    public final void setFamilyAccountExist(@Nullable Boolean bool) {
        this.familyAccountExist = bool;
    }

    public final void setPaymentItemType(@Nullable String str) {
        this.paymentItemType = str;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    public final void setValid(@Nullable Boolean bool) {
        this.valid = bool;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.familyAccountExist;
        String str = this.errorInfo;
        String str2 = this.customerId;
        String str3 = this.customerName;
        String str4 = this.paymentItemType;
        Boolean bool2 = this.valid;
        Boolean bool3 = this.debtValidation;
        String str5 = this.actualPaymentItemType;
        String str6 = this.tips;
        Long l5 = this.debtAmount;
        StringBuilder sb2 = new StringBuilder("QueryElectricCustomerIdIsExitBean(familyAccountExist=");
        sb2.append(bool);
        sb2.append(", errorInfo=");
        sb2.append(str);
        sb2.append(", customerId=");
        u.x(sb2, str2, ", customerName=", str3, ", paymentItemType=");
        sb2.append(str4);
        sb2.append(", valid=");
        sb2.append(bool2);
        sb2.append(", debtValidation=");
        sb2.append(bool3);
        sb2.append(", actualPaymentItemType=");
        sb2.append(str5);
        sb2.append(", tips=");
        sb2.append(str6);
        sb2.append(", debtAmount=");
        sb2.append(l5);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ QueryElectricCustomerIdIsExitBean(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, String str5, String str6, Long l5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, str, str2, str3, str4, bool2, bool3, str5, str6, (i7 & 512) != 0 ? 0L : l5);
    }
}
