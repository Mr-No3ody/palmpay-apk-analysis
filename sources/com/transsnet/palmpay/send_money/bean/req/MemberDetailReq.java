package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J>\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/MemberDetailReq;", "", "accountNo", "", "businessType", "", "extendField", "existRecipient", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAccountNo", "()Ljava/lang/String;", "setAccountNo", "(Ljava/lang/String;)V", "getBusinessType", "()Ljava/lang/Integer;", "setBusinessType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getExtendField", "setExtendField", "getExistRecipient", "()Ljava/lang/Boolean;", "setExistRecipient", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/send_money/bean/req/MemberDetailReq;", "equals", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MemberDetailReq {

    @Nullable
    private String accountNo;

    @Nullable
    private Integer businessType;

    @Nullable
    private Boolean existRecipient;

    @Nullable
    private String extendField;

    public MemberDetailReq() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MemberDetailReq copy$default(MemberDetailReq memberDetailReq, String str, Integer num, String str2, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = memberDetailReq.accountNo;
        }
        if ((i7 & 2) != 0) {
            num = memberDetailReq.businessType;
        }
        if ((i7 & 4) != 0) {
            str2 = memberDetailReq.extendField;
        }
        if ((i7 & 8) != 0) {
            bool = memberDetailReq.existRecipient;
        }
        return memberDetailReq.copy(str, num, str2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExtendField() {
        return this.extendField;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getExistRecipient() {
        return this.existRecipient;
    }

    @NotNull
    public final MemberDetailReq copy(@Nullable String accountNo, @Nullable Integer businessType, @Nullable String extendField, @Nullable Boolean existRecipient) {
        return new MemberDetailReq(accountNo, businessType, extendField, existRecipient);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberDetailReq)) {
            return false;
        }
        MemberDetailReq memberDetailReq = (MemberDetailReq) other;
        return Intrinsics.c(this.accountNo, memberDetailReq.accountNo) && Intrinsics.c(this.businessType, memberDetailReq.businessType) && Intrinsics.c(this.extendField, memberDetailReq.extendField) && Intrinsics.c(this.existRecipient, memberDetailReq.existRecipient);
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final Boolean getExistRecipient() {
        return this.existRecipient;
    }

    @Nullable
    public final String getExtendField() {
        return this.extendField;
    }

    public int hashCode() {
        String str = this.accountNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.businessType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.extendField;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.existRecipient;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setBusinessType(@Nullable Integer num) {
        this.businessType = num;
    }

    public final void setExistRecipient(@Nullable Boolean bool) {
        this.existRecipient = bool;
    }

    public final void setExtendField(@Nullable String str) {
        this.extendField = str;
    }

    @NotNull
    public String toString() {
        return "MemberDetailReq(accountNo=" + this.accountNo + ", businessType=" + this.businessType + ", extendField=" + this.extendField + ", existRecipient=" + this.existRecipient + ")";
    }

    public MemberDetailReq(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool) {
        this.accountNo = str;
        this.businessType = num;
        this.extendField = str2;
        this.existRecipient = bool;
    }

    public /* synthetic */ MemberDetailReq(String str, Integer num, String str2, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : bool);
    }
}
