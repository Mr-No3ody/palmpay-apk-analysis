package com.transsnet.palmpay.teller.bean.resp;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u00015BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData;", "", "orderNo", "", "transType", "billerName", "calculationExtInfo", "orderStatus", "", "orderStatusDesc", "orderType", "validateCustomerResp", "Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData$ValidateCustomer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData$ValidateCustomer;)V", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "getTransType", "setTransType", "getBillerName", "setBillerName", "getCalculationExtInfo", "setCalculationExtInfo", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderStatusDesc", "setOrderStatusDesc", "getOrderType", "setOrderType", "getValidateCustomerResp", "()Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData$ValidateCustomer;", "setValidateCustomerResp", "(Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData$ValidateCustomer;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData$ValidateCustomer;)Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData;", "equals", "", "other", "hashCode", "toString", "ValidateCustomer", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateBettingOrderData {

    @Nullable
    private String billerName;

    @Nullable
    private String calculationExtInfo;

    @Nullable
    private String orderNo;

    @Nullable
    private Integer orderStatus;

    @Nullable
    private String orderStatusDesc;

    @Nullable
    private String orderType;

    @Nullable
    private String transType;

    @Nullable
    private ValidateCustomer validateCustomerResp;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/CreateBettingOrderData$ValidateCustomer;", "", "exists", "", "name", "", "<init>", "(ZLjava/lang/String;)V", "getExists", "()Z", "setExists", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidateCustomer {
        private boolean exists;

        @NotNull
        private String name;

        public ValidateCustomer(boolean z3, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.exists = z3;
            this.name = name;
        }

        public static /* synthetic */ ValidateCustomer copy$default(ValidateCustomer validateCustomer, boolean z3, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z3 = validateCustomer.exists;
            }
            if ((i7 & 2) != 0) {
                str = validateCustomer.name;
            }
            return validateCustomer.copy(z3, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getExists() {
            return this.exists;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final ValidateCustomer copy(boolean exists, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ValidateCustomer(exists, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidateCustomer)) {
                return false;
            }
            ValidateCustomer validateCustomer = (ValidateCustomer) other;
            return this.exists == validateCustomer.exists && Intrinsics.c(this.name, validateCustomer.name);
        }

        public final boolean getExists() {
            return this.exists;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (Boolean.hashCode(this.exists) * 31);
        }

        public final void setExists(boolean z3) {
            this.exists = z3;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        @NotNull
        public String toString() {
            return "ValidateCustomer(exists=" + this.exists + ", name=" + this.name + ")";
        }
    }

    public CreateBettingOrderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable ValidateCustomer validateCustomer) {
        this.orderNo = str;
        this.transType = str2;
        this.billerName = str3;
        this.calculationExtInfo = str4;
        this.orderStatus = num;
        this.orderStatusDesc = str5;
        this.orderType = str6;
        this.validateCustomerResp = validateCustomer;
    }

    public static /* synthetic */ CreateBettingOrderData copy$default(CreateBettingOrderData createBettingOrderData, String str, String str2, String str3, String str4, Integer num, String str5, String str6, ValidateCustomer validateCustomer, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = createBettingOrderData.orderNo;
        }
        if ((i7 & 2) != 0) {
            str2 = createBettingOrderData.transType;
        }
        if ((i7 & 4) != 0) {
            str3 = createBettingOrderData.billerName;
        }
        if ((i7 & 8) != 0) {
            str4 = createBettingOrderData.calculationExtInfo;
        }
        if ((i7 & 16) != 0) {
            num = createBettingOrderData.orderStatus;
        }
        if ((i7 & 32) != 0) {
            str5 = createBettingOrderData.orderStatusDesc;
        }
        if ((i7 & 64) != 0) {
            str6 = createBettingOrderData.orderType;
        }
        if ((i7 & 128) != 0) {
            validateCustomer = createBettingOrderData.validateCustomerResp;
        }
        String str7 = str6;
        ValidateCustomer validateCustomer2 = validateCustomer;
        Integer num2 = num;
        String str8 = str5;
        return createBettingOrderData.copy(str, str2, str3, str4, num2, str8, str7, validateCustomer2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCalculationExtInfo() {
        return this.calculationExtInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ValidateCustomer getValidateCustomerResp() {
        return this.validateCustomerResp;
    }

    @NotNull
    public final CreateBettingOrderData copy(@Nullable String orderNo, @Nullable String transType, @Nullable String billerName, @Nullable String calculationExtInfo, @Nullable Integer orderStatus, @Nullable String orderStatusDesc, @Nullable String orderType, @Nullable ValidateCustomer validateCustomerResp) {
        return new CreateBettingOrderData(orderNo, transType, billerName, calculationExtInfo, orderStatus, orderStatusDesc, orderType, validateCustomerResp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBettingOrderData)) {
            return false;
        }
        CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) other;
        return Intrinsics.c(this.orderNo, createBettingOrderData.orderNo) && Intrinsics.c(this.transType, createBettingOrderData.transType) && Intrinsics.c(this.billerName, createBettingOrderData.billerName) && Intrinsics.c(this.calculationExtInfo, createBettingOrderData.calculationExtInfo) && Intrinsics.c(this.orderStatus, createBettingOrderData.orderStatus) && Intrinsics.c(this.orderStatusDesc, createBettingOrderData.orderStatusDesc) && Intrinsics.c(this.orderType, createBettingOrderData.orderType) && Intrinsics.c(this.validateCustomerResp, createBettingOrderData.validateCustomerResp);
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getCalculationExtInfo() {
        return this.calculationExtInfo;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    public final ValidateCustomer getValidateCustomerResp() {
        return this.validateCustomerResp;
    }

    public int hashCode() {
        String str = this.orderNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billerName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.calculationExtInfo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.orderStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.orderStatusDesc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ValidateCustomer validateCustomer = this.validateCustomerResp;
        return iHashCode7 + (validateCustomer != null ? validateCustomer.hashCode() : 0);
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setCalculationExtInfo(@Nullable String str) {
        this.calculationExtInfo = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setOrderStatus(@Nullable Integer num) {
        this.orderStatus = num;
    }

    public final void setOrderStatusDesc(@Nullable String str) {
        this.orderStatusDesc = str;
    }

    public final void setOrderType(@Nullable String str) {
        this.orderType = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setValidateCustomerResp(@Nullable ValidateCustomer validateCustomer) {
        this.validateCustomerResp = validateCustomer;
    }

    @NotNull
    public String toString() {
        String str = this.orderNo;
        String str2 = this.transType;
        String str3 = this.billerName;
        String str4 = this.calculationExtInfo;
        Integer num = this.orderStatus;
        String str5 = this.orderStatusDesc;
        String str6 = this.orderType;
        ValidateCustomer validateCustomer = this.validateCustomerResp;
        StringBuilder sbF = F.f("CreateBettingOrderData(orderNo=", str, ", transType=", str2, ", billerName=");
        u.x(sbF, str3, ", calculationExtInfo=", str4, ", orderStatus=");
        sbF.append(num);
        sbF.append(", orderStatusDesc=");
        sbF.append(str5);
        sbF.append(", orderType=");
        sbF.append(str6);
        sbF.append(", validateCustomerResp=");
        sbF.append(validateCustomer);
        sbF.append(")");
        return sbF.toString();
    }
}
