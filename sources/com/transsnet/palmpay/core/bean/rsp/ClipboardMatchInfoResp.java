package com.transsnet.palmpay.core.bean.rsp;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\tHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015¨\u0006:"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/ClipboardMatchInfoResp;", "", "accountNo", "", "accountName", "accountPic", "bankName", "transType", "businessType", "", "tip", "matchType", "authen", "", "payeeMemberId", "ppAccountNo", "bankPic", "bankCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNo", "()Ljava/lang/String;", "getAccountName", "getAccountPic", "getBankName", "getTransType", "getBusinessType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTip", "getMatchType", "getAuthen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPayeeMemberId", "getPpAccountNo", "getBankPic", "getBankCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/core/bean/rsp/ClipboardMatchInfoResp;", "equals", "other", "hashCode", "toString", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClipboardMatchInfoResp {
    public static final int MATCH_TYPE_MEMBER = 3;
    public static final int MATCH_TYPE_MULTIPLE_BANKS = 2;
    public static final int MATCH_TYPE_MULTIPLE_WITH_PALMPAY = 5;
    public static final int MATCH_TYPE_NONE = 0;
    public static final int MATCH_TYPE_SINGLE_BANK = 1;
    public static final int MATCH_TYPE_VIRTUAL_ACCOUNT = 4;

    @Nullable
    private final String accountName;

    @Nullable
    private final String accountNo;

    @Nullable
    private final String accountPic;

    @Nullable
    private final Boolean authen;

    @Nullable
    private final String bankCode;

    @Nullable
    private final String bankName;

    @Nullable
    private final String bankPic;

    @Nullable
    private final Integer businessType;

    @Nullable
    private final Integer matchType;

    @Nullable
    private final String payeeMemberId;

    @Nullable
    private final String ppAccountNo;

    @Nullable
    private final String tip;

    @Nullable
    private final String transType;

    public ClipboardMatchInfoResp(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable String str6, @Nullable Integer num2, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.accountNo = str;
        this.accountName = str2;
        this.accountPic = str3;
        this.bankName = str4;
        this.transType = str5;
        this.businessType = num;
        this.tip = str6;
        this.matchType = num2;
        this.authen = bool;
        this.payeeMemberId = str7;
        this.ppAccountNo = str8;
        this.bankPic = str9;
        this.bankCode = str10;
    }

    public static /* synthetic */ ClipboardMatchInfoResp copy$default(ClipboardMatchInfoResp clipboardMatchInfoResp, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Boolean bool, String str7, String str8, String str9, String str10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = clipboardMatchInfoResp.accountNo;
        }
        return clipboardMatchInfoResp.copy(str, (i7 & 2) != 0 ? clipboardMatchInfoResp.accountName : str2, (i7 & 4) != 0 ? clipboardMatchInfoResp.accountPic : str3, (i7 & 8) != 0 ? clipboardMatchInfoResp.bankName : str4, (i7 & 16) != 0 ? clipboardMatchInfoResp.transType : str5, (i7 & 32) != 0 ? clipboardMatchInfoResp.businessType : num, (i7 & 64) != 0 ? clipboardMatchInfoResp.tip : str6, (i7 & 128) != 0 ? clipboardMatchInfoResp.matchType : num2, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? clipboardMatchInfoResp.authen : bool, (i7 & 512) != 0 ? clipboardMatchInfoResp.payeeMemberId : str7, (i7 & 1024) != 0 ? clipboardMatchInfoResp.ppAccountNo : str8, (i7 & 2048) != 0 ? clipboardMatchInfoResp.bankPic : str9, (i7 & 4096) != 0 ? clipboardMatchInfoResp.bankCode : str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPayeeMemberId() {
        return this.payeeMemberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPpAccountNo() {
        return this.ppAccountNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBankPic() {
        return this.bankPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountPic() {
        return this.accountPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMatchType() {
        return this.matchType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getAuthen() {
        return this.authen;
    }

    @NotNull
    public final ClipboardMatchInfoResp copy(@Nullable String accountNo, @Nullable String accountName, @Nullable String accountPic, @Nullable String bankName, @Nullable String transType, @Nullable Integer businessType, @Nullable String tip, @Nullable Integer matchType, @Nullable Boolean authen, @Nullable String payeeMemberId, @Nullable String ppAccountNo, @Nullable String bankPic, @Nullable String bankCode) {
        return new ClipboardMatchInfoResp(accountNo, accountName, accountPic, bankName, transType, businessType, tip, matchType, authen, payeeMemberId, ppAccountNo, bankPic, bankCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClipboardMatchInfoResp)) {
            return false;
        }
        ClipboardMatchInfoResp clipboardMatchInfoResp = (ClipboardMatchInfoResp) other;
        return Intrinsics.c(this.accountNo, clipboardMatchInfoResp.accountNo) && Intrinsics.c(this.accountName, clipboardMatchInfoResp.accountName) && Intrinsics.c(this.accountPic, clipboardMatchInfoResp.accountPic) && Intrinsics.c(this.bankName, clipboardMatchInfoResp.bankName) && Intrinsics.c(this.transType, clipboardMatchInfoResp.transType) && Intrinsics.c(this.businessType, clipboardMatchInfoResp.businessType) && Intrinsics.c(this.tip, clipboardMatchInfoResp.tip) && Intrinsics.c(this.matchType, clipboardMatchInfoResp.matchType) && Intrinsics.c(this.authen, clipboardMatchInfoResp.authen) && Intrinsics.c(this.payeeMemberId, clipboardMatchInfoResp.payeeMemberId) && Intrinsics.c(this.ppAccountNo, clipboardMatchInfoResp.ppAccountNo) && Intrinsics.c(this.bankPic, clipboardMatchInfoResp.bankPic) && Intrinsics.c(this.bankCode, clipboardMatchInfoResp.bankCode);
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final String getAccountPic() {
        return this.accountPic;
    }

    @Nullable
    public final Boolean getAuthen() {
        return this.authen;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getBankPic() {
        return this.bankPic;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final Integer getMatchType() {
        return this.matchType;
    }

    @Nullable
    public final String getPayeeMemberId() {
        return this.payeeMemberId;
    }

    @Nullable
    public final String getPpAccountNo() {
        return this.ppAccountNo;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public int hashCode() {
        String str = this.accountNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountPic;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.businessType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.tip;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.matchType;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.authen;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.payeeMemberId;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ppAccountNo;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bankPic;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.bankCode;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accountNo;
        String str2 = this.accountName;
        String str3 = this.accountPic;
        String str4 = this.bankName;
        String str5 = this.transType;
        Integer num = this.businessType;
        String str6 = this.tip;
        Integer num2 = this.matchType;
        Boolean bool = this.authen;
        String str7 = this.payeeMemberId;
        String str8 = this.ppAccountNo;
        String str9 = this.bankPic;
        String str10 = this.bankCode;
        StringBuilder sbF = F.f("ClipboardMatchInfoResp(accountNo=", str, ", accountName=", str2, ", accountPic=");
        u.x(sbF, str3, ", bankName=", str4, ", transType=");
        sbF.append(str5);
        sbF.append(", businessType=");
        sbF.append(num);
        sbF.append(", tip=");
        sbF.append(str6);
        sbF.append(", matchType=");
        sbF.append(num2);
        sbF.append(", authen=");
        sbF.append(bool);
        sbF.append(", payeeMemberId=");
        sbF.append(str7);
        sbF.append(", ppAccountNo=");
        u.x(sbF, str8, ", bankPic=", str9, ", bankCode=");
        return G.r(sbF, str10, ")");
    }
}
