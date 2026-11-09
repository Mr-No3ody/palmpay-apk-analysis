package com.transsnet.palmpay.teller.bean.resp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b#\b\u0016\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillerBaseCouponItemBean;", "", "claimId", "", "actNo", "", "couponCode", "couponName", "couponNumber", "nominaValue", "couponSubhead", "couponIcon", "status", "showCoupon", "", "institutionIdList", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getClaimId", "()Ljava/lang/Long;", "setClaimId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getActNo", "()Ljava/lang/String;", "setActNo", "(Ljava/lang/String;)V", "getCouponCode", "setCouponCode", "getCouponName", "setCouponName", "getCouponNumber", "setCouponNumber", "getNominaValue", "setNominaValue", "getCouponSubhead", "setCouponSubhead", "getCouponIcon", "setCouponIcon", "getStatus", "setStatus", "getShowCoupon", "()Ljava/lang/Boolean;", "setShowCoupon", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getInstitutionIdList", "()Ljava/util/List;", "setInstitutionIdList", "(Ljava/util/List;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BillerBaseCouponItemBean {

    @Nullable
    private String actNo;

    @Nullable
    private Long claimId;

    @Nullable
    private String couponCode;

    @Nullable
    private String couponIcon;

    @Nullable
    private String couponName;

    @Nullable
    private String couponNumber;

    @Nullable
    private String couponSubhead;

    @Nullable
    private List<String> institutionIdList;

    @Nullable
    private Long nominaValue;

    @Nullable
    private Boolean showCoupon;

    @Nullable
    private String status;

    public BillerBaseCouponItemBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    public final String getActNo() {
        return this.actNo;
    }

    @Nullable
    public final Long getClaimId() {
        return this.claimId;
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
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    public final String getCouponNumber() {
        return this.couponNumber;
    }

    @Nullable
    public final String getCouponSubhead() {
        return this.couponSubhead;
    }

    @Nullable
    public final List<String> getInstitutionIdList() {
        return this.institutionIdList;
    }

    @Nullable
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    @Nullable
    public final Boolean getShowCoupon() {
        return this.showCoupon;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final void setActNo(@Nullable String str) {
        this.actNo = str;
    }

    public final void setClaimId(@Nullable Long l5) {
        this.claimId = l5;
    }

    public final void setCouponCode(@Nullable String str) {
        this.couponCode = str;
    }

    public final void setCouponIcon(@Nullable String str) {
        this.couponIcon = str;
    }

    public final void setCouponName(@Nullable String str) {
        this.couponName = str;
    }

    public final void setCouponNumber(@Nullable String str) {
        this.couponNumber = str;
    }

    public final void setCouponSubhead(@Nullable String str) {
        this.couponSubhead = str;
    }

    public final void setInstitutionIdList(@Nullable List<String> list) {
        this.institutionIdList = list;
    }

    public final void setNominaValue(@Nullable Long l5) {
        this.nominaValue = l5;
    }

    public final void setShowCoupon(@Nullable Boolean bool) {
        this.showCoupon = bool;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public BillerBaseCouponItemBean(@Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable List<String> list) {
        this.claimId = l5;
        this.actNo = str;
        this.couponCode = str2;
        this.couponName = str3;
        this.couponNumber = str4;
        this.nominaValue = l6;
        this.couponSubhead = str5;
        this.couponIcon = str6;
        this.status = str7;
        this.showCoupon = bool;
        this.institutionIdList = list;
    }

    public /* synthetic */ BillerBaseCouponItemBean(Long l5, String str, String str2, String str3, String str4, Long l6, String str5, String str6, String str7, Boolean bool, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : l5, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? 0L : l6, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i7 & 512) != 0 ? Boolean.FALSE : bool, (i7 & 1024) != 0 ? null : list);
    }
}
