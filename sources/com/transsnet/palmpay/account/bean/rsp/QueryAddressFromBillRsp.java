package com.transsnet.palmpay.account.bean.rsp;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/account/bean/rsp/QueryAddressFromBillRsp;", "", "stateCode", "", "stateName", "areaCode", "areaName", "lgaCode", "lgaName", "billType", "billDate", "addressDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStateCode", "()Ljava/lang/String;", "getStateName", "getAreaCode", "getAreaName", "getLgaCode", "getLgaName", "getBillType", "getBillDate", "getAddressDetails", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "module_account_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryAddressFromBillRsp {

    @Nullable
    private final String addressDetails;

    @Nullable
    private final String areaCode;

    @Nullable
    private final String areaName;

    @Nullable
    private final String billDate;

    @Nullable
    private final String billType;

    @Nullable
    private final String lgaCode;

    @Nullable
    private final String lgaName;

    @Nullable
    private final String stateCode;

    @Nullable
    private final String stateName;

    public QueryAddressFromBillRsp(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.stateCode = str;
        this.stateName = str2;
        this.areaCode = str3;
        this.areaName = str4;
        this.lgaCode = str5;
        this.lgaName = str6;
        this.billType = str7;
        this.billDate = str8;
        this.addressDetails = str9;
    }

    public static /* synthetic */ QueryAddressFromBillRsp copy$default(QueryAddressFromBillRsp queryAddressFromBillRsp, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = queryAddressFromBillRsp.stateCode;
        }
        if ((i7 & 2) != 0) {
            str2 = queryAddressFromBillRsp.stateName;
        }
        if ((i7 & 4) != 0) {
            str3 = queryAddressFromBillRsp.areaCode;
        }
        if ((i7 & 8) != 0) {
            str4 = queryAddressFromBillRsp.areaName;
        }
        if ((i7 & 16) != 0) {
            str5 = queryAddressFromBillRsp.lgaCode;
        }
        if ((i7 & 32) != 0) {
            str6 = queryAddressFromBillRsp.lgaName;
        }
        if ((i7 & 64) != 0) {
            str7 = queryAddressFromBillRsp.billType;
        }
        if ((i7 & 128) != 0) {
            str8 = queryAddressFromBillRsp.billDate;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str9 = queryAddressFromBillRsp.addressDetails;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return queryAddressFromBillRsp.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateName() {
        return this.stateName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAreaCode() {
        return this.areaCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAreaName() {
        return this.areaName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLgaCode() {
        return this.lgaCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLgaName() {
        return this.lgaName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBillType() {
        return this.billType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBillDate() {
        return this.billDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAddressDetails() {
        return this.addressDetails;
    }

    @NotNull
    public final QueryAddressFromBillRsp copy(@Nullable String stateCode, @Nullable String stateName, @Nullable String areaCode, @Nullable String areaName, @Nullable String lgaCode, @Nullable String lgaName, @Nullable String billType, @Nullable String billDate, @Nullable String addressDetails) {
        return new QueryAddressFromBillRsp(stateCode, stateName, areaCode, areaName, lgaCode, lgaName, billType, billDate, addressDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAddressFromBillRsp)) {
            return false;
        }
        QueryAddressFromBillRsp queryAddressFromBillRsp = (QueryAddressFromBillRsp) other;
        return Intrinsics.c(this.stateCode, queryAddressFromBillRsp.stateCode) && Intrinsics.c(this.stateName, queryAddressFromBillRsp.stateName) && Intrinsics.c(this.areaCode, queryAddressFromBillRsp.areaCode) && Intrinsics.c(this.areaName, queryAddressFromBillRsp.areaName) && Intrinsics.c(this.lgaCode, queryAddressFromBillRsp.lgaCode) && Intrinsics.c(this.lgaName, queryAddressFromBillRsp.lgaName) && Intrinsics.c(this.billType, queryAddressFromBillRsp.billType) && Intrinsics.c(this.billDate, queryAddressFromBillRsp.billDate) && Intrinsics.c(this.addressDetails, queryAddressFromBillRsp.addressDetails);
    }

    @Nullable
    public final String getAddressDetails() {
        return this.addressDetails;
    }

    @Nullable
    public final String getAreaCode() {
        return this.areaCode;
    }

    @Nullable
    public final String getAreaName() {
        return this.areaName;
    }

    @Nullable
    public final String getBillDate() {
        return this.billDate;
    }

    @Nullable
    public final String getBillType() {
        return this.billType;
    }

    @Nullable
    public final String getLgaCode() {
        return this.lgaCode;
    }

    @Nullable
    public final String getLgaName() {
        return this.lgaName;
    }

    @Nullable
    public final String getStateCode() {
        return this.stateCode;
    }

    @Nullable
    public final String getStateName() {
        return this.stateName;
    }

    public int hashCode() {
        String str = this.stateCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.areaCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.areaName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lgaCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lgaName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billDate;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressDetails;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.stateCode;
        String str2 = this.stateName;
        String str3 = this.areaCode;
        String str4 = this.areaName;
        String str5 = this.lgaCode;
        String str6 = this.lgaName;
        String str7 = this.billType;
        String str8 = this.billDate;
        String str9 = this.addressDetails;
        StringBuilder sbF = F.f("QueryAddressFromBillRsp(stateCode=", str, ", stateName=", str2, ", areaCode=");
        u.x(sbF, str3, ", areaName=", str4, ", lgaCode=");
        u.x(sbF, str5, ", lgaName=", str6, ", billType=");
        u.x(sbF, str7, ", billDate=", str8, ", addressDetails=");
        return G.r(sbF, str9, ")");
    }
}
