package com.transsnet.palmpay.teller.bean.resp;

import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J°\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006J"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponRetentionBean;", "", "consumeAmt", "", "couponIcon", "", "couponId", "couponCode", "couponName", "couponSubhead", "couponType", "nominaValue", "status", "tips", "transType", "limitAmt", "institutionIdList", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getConsumeAmt", "()Ljava/lang/Long;", "setConsumeAmt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCouponIcon", "()Ljava/lang/String;", "setCouponIcon", "(Ljava/lang/String;)V", "getCouponId", "setCouponId", "getCouponCode", "setCouponCode", "getCouponName", "setCouponName", "getCouponSubhead", "setCouponSubhead", "getCouponType", "setCouponType", "getNominaValue", "setNominaValue", "getStatus", "setStatus", "getTips", "setTips", "getTransType", "setTransType", "getLimitAmt", "setLimitAmt", "getInstitutionIdList", "()Ljava/util/List;", "setInstitutionIdList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponRetentionBean;", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BillerCouponRetentionBean {

    @Nullable
    private Long consumeAmt;

    @Nullable
    private String couponCode;

    @Nullable
    private String couponIcon;

    @Nullable
    private Long couponId;

    @Nullable
    private String couponName;

    @Nullable
    private String couponSubhead;

    @Nullable
    private String couponType;

    @Nullable
    private List<String> institutionIdList;

    @Nullable
    private Long limitAmt;

    @Nullable
    private Long nominaValue;

    @Nullable
    private String status;

    @Nullable
    private String tips;

    @Nullable
    private String transType;

    public BillerCouponRetentionBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillerCouponRetentionBean copy$default(BillerCouponRetentionBean billerCouponRetentionBean, Long l5, String str, Long l6, String str2, String str3, String str4, String str5, Long l8, String str6, String str7, String str8, Long l10, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = billerCouponRetentionBean.consumeAmt;
        }
        return billerCouponRetentionBean.copy(l5, (i7 & 2) != 0 ? billerCouponRetentionBean.couponIcon : str, (i7 & 4) != 0 ? billerCouponRetentionBean.couponId : l6, (i7 & 8) != 0 ? billerCouponRetentionBean.couponCode : str2, (i7 & 16) != 0 ? billerCouponRetentionBean.couponName : str3, (i7 & 32) != 0 ? billerCouponRetentionBean.couponSubhead : str4, (i7 & 64) != 0 ? billerCouponRetentionBean.couponType : str5, (i7 & 128) != 0 ? billerCouponRetentionBean.nominaValue : l8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? billerCouponRetentionBean.status : str6, (i7 & 512) != 0 ? billerCouponRetentionBean.tips : str7, (i7 & 1024) != 0 ? billerCouponRetentionBean.transType : str8, (i7 & 2048) != 0 ? billerCouponRetentionBean.limitAmt : l10, (i7 & 4096) != 0 ? billerCouponRetentionBean.institutionIdList : list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getConsumeAmt() {
        return this.consumeAmt;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getLimitAmt() {
        return this.limitAmt;
    }

    @Nullable
    public final List<String> component13() {
        return this.institutionIdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCouponIcon() {
        return this.couponIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCouponSubhead() {
        return this.couponSubhead;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final BillerCouponRetentionBean copy(@Nullable Long consumeAmt, @Nullable String couponIcon, @Nullable Long couponId, @Nullable String couponCode, @Nullable String couponName, @Nullable String couponSubhead, @Nullable String couponType, @Nullable Long nominaValue, @Nullable String status, @Nullable String tips, @Nullable String transType, @Nullable Long limitAmt, @Nullable List<String> institutionIdList) {
        return new BillerCouponRetentionBean(consumeAmt, couponIcon, couponId, couponCode, couponName, couponSubhead, couponType, nominaValue, status, tips, transType, limitAmt, institutionIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillerCouponRetentionBean)) {
            return false;
        }
        BillerCouponRetentionBean billerCouponRetentionBean = (BillerCouponRetentionBean) other;
        return Intrinsics.c(this.consumeAmt, billerCouponRetentionBean.consumeAmt) && Intrinsics.c(this.couponIcon, billerCouponRetentionBean.couponIcon) && Intrinsics.c(this.couponId, billerCouponRetentionBean.couponId) && Intrinsics.c(this.couponCode, billerCouponRetentionBean.couponCode) && Intrinsics.c(this.couponName, billerCouponRetentionBean.couponName) && Intrinsics.c(this.couponSubhead, billerCouponRetentionBean.couponSubhead) && Intrinsics.c(this.couponType, billerCouponRetentionBean.couponType) && Intrinsics.c(this.nominaValue, billerCouponRetentionBean.nominaValue) && Intrinsics.c(this.status, billerCouponRetentionBean.status) && Intrinsics.c(this.tips, billerCouponRetentionBean.tips) && Intrinsics.c(this.transType, billerCouponRetentionBean.transType) && Intrinsics.c(this.limitAmt, billerCouponRetentionBean.limitAmt) && Intrinsics.c(this.institutionIdList, billerCouponRetentionBean.institutionIdList);
    }

    @Nullable
    public final Long getConsumeAmt() {
        return this.consumeAmt;
    }

    @Nullable
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    public final String getCouponIcon() {
        return this.couponIcon;
    }

    @Nullable
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    public final String getCouponSubhead() {
        return this.couponSubhead;
    }

    @Nullable
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    public final List<String> getInstitutionIdList() {
        return this.institutionIdList;
    }

    @Nullable
    public final Long getLimitAmt() {
        return this.limitAmt;
    }

    @Nullable
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public int hashCode() {
        Long l5 = this.consumeAmt;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        String str = this.couponIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l6 = this.couponId;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str2 = this.couponCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.couponName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.couponSubhead;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.couponType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l8 = this.nominaValue;
        int iHashCode8 = (iHashCode7 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tips;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transType;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l10 = this.limitAmt;
        int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<String> list = this.institutionIdList;
        return iHashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final void setConsumeAmt(@Nullable Long l5) {
        this.consumeAmt = l5;
    }

    public final void setCouponCode(@Nullable String str) {
        this.couponCode = str;
    }

    public final void setCouponIcon(@Nullable String str) {
        this.couponIcon = str;
    }

    public final void setCouponId(@Nullable Long l5) {
        this.couponId = l5;
    }

    public final void setCouponName(@Nullable String str) {
        this.couponName = str;
    }

    public final void setCouponSubhead(@Nullable String str) {
        this.couponSubhead = str;
    }

    public final void setCouponType(@Nullable String str) {
        this.couponType = str;
    }

    public final void setInstitutionIdList(@Nullable List<String> list) {
        this.institutionIdList = list;
    }

    public final void setLimitAmt(@Nullable Long l5) {
        this.limitAmt = l5;
    }

    public final void setNominaValue(@Nullable Long l5) {
        this.nominaValue = l5;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    @NotNull
    public String toString() {
        Long l5 = this.consumeAmt;
        String str = this.couponIcon;
        Long l6 = this.couponId;
        String str2 = this.couponCode;
        String str3 = this.couponName;
        String str4 = this.couponSubhead;
        String str5 = this.couponType;
        Long l8 = this.nominaValue;
        String str6 = this.status;
        String str7 = this.tips;
        String str8 = this.transType;
        Long l10 = this.limitAmt;
        List<String> list = this.institutionIdList;
        StringBuilder sb2 = new StringBuilder("BillerCouponRetentionBean(consumeAmt=");
        sb2.append(l5);
        sb2.append(", couponIcon=");
        sb2.append(str);
        sb2.append(", couponId=");
        sb2.append(l6);
        sb2.append(", couponCode=");
        sb2.append(str2);
        sb2.append(", couponName=");
        u.x(sb2, str3, ", couponSubhead=", str4, ", couponType=");
        sb2.append(str5);
        sb2.append(", nominaValue=");
        sb2.append(l8);
        sb2.append(", status=");
        u.x(sb2, str6, ", tips=", str7, ", transType=");
        sb2.append(str8);
        sb2.append(", limitAmt=");
        sb2.append(l10);
        sb2.append(", institutionIdList=");
        return q0.o(sb2, list, ")");
    }

    public BillerCouponRetentionBean(@Nullable Long l5, @Nullable String str, @Nullable Long l6, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l8, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l10, @Nullable List<String> list) {
        this.consumeAmt = l5;
        this.couponIcon = str;
        this.couponId = l6;
        this.couponCode = str2;
        this.couponName = str3;
        this.couponSubhead = str4;
        this.couponType = str5;
        this.nominaValue = l8;
        this.status = str6;
        this.tips = str7;
        this.transType = str8;
        this.limitAmt = l10;
        this.institutionIdList = list;
    }

    public /* synthetic */ BillerCouponRetentionBean(Long l5, String str, Long l6, String str2, String str3, String str4, String str5, Long l8, String str6, String str7, String str8, Long l10, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : l6, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : l8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str6, (i7 & 512) != 0 ? null : str7, (i7 & 1024) != 0 ? null : str8, (i7 & 2048) != 0 ? null : l10, (i7 & 4096) != 0 ? null : list);
    }
}
