package com.transsnet.palmpay.contacts.bean.resp;

import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJV\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/contacts/bean/resp/QueryPhonesData;", "", "check", "", "fullName", "", "headPortrait", "memberId", "phone", "incentiveAmount", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getCheck", "()Ljava/lang/Integer;", "setCheck", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "getHeadPortrait", "setHeadPortrait", "getMemberId", "setMemberId", "getPhone", "setPhone", "getIncentiveAmount", "()Ljava/lang/Long;", "setIncentiveAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/contacts/bean/resp/QueryPhonesData;", "equals", "", "other", "hashCode", "toString", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QueryPhonesData {

    @Nullable
    private Integer check;

    @Nullable
    private String fullName;

    @Nullable
    private String headPortrait;

    @Nullable
    private Long incentiveAmount;

    @Nullable
    private String memberId;

    @Nullable
    private String phone;

    public QueryPhonesData(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l5) {
        this.check = num;
        this.fullName = str;
        this.headPortrait = str2;
        this.memberId = str3;
        this.phone = str4;
        this.incentiveAmount = l5;
    }

    public static /* synthetic */ QueryPhonesData copy$default(QueryPhonesData queryPhonesData, Integer num, String str, String str2, String str3, String str4, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = queryPhonesData.check;
        }
        if ((i7 & 2) != 0) {
            str = queryPhonesData.fullName;
        }
        if ((i7 & 4) != 0) {
            str2 = queryPhonesData.headPortrait;
        }
        if ((i7 & 8) != 0) {
            str3 = queryPhonesData.memberId;
        }
        if ((i7 & 16) != 0) {
            str4 = queryPhonesData.phone;
        }
        if ((i7 & 32) != 0) {
            l5 = queryPhonesData.incentiveAmount;
        }
        String str5 = str4;
        Long l6 = l5;
        return queryPhonesData.copy(num, str, str2, str3, str5, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCheck() {
        return this.check;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeadPortrait() {
        return this.headPortrait;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getIncentiveAmount() {
        return this.incentiveAmount;
    }

    @NotNull
    public final QueryPhonesData copy(@Nullable Integer check, @Nullable String fullName, @Nullable String headPortrait, @Nullable String memberId, @Nullable String phone, @Nullable Long incentiveAmount) {
        return new QueryPhonesData(check, fullName, headPortrait, memberId, phone, incentiveAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPhonesData)) {
            return false;
        }
        QueryPhonesData queryPhonesData = (QueryPhonesData) other;
        return Intrinsics.c(this.check, queryPhonesData.check) && Intrinsics.c(this.fullName, queryPhonesData.fullName) && Intrinsics.c(this.headPortrait, queryPhonesData.headPortrait) && Intrinsics.c(this.memberId, queryPhonesData.memberId) && Intrinsics.c(this.phone, queryPhonesData.phone) && Intrinsics.c(this.incentiveAmount, queryPhonesData.incentiveAmount);
    }

    @Nullable
    public final Integer getCheck() {
        return this.check;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getHeadPortrait() {
        return this.headPortrait;
    }

    @Nullable
    public final Long getIncentiveAmount() {
        return this.incentiveAmount;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        Integer num = this.check;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headPortrait;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.memberId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.incentiveAmount;
        return iHashCode5 + (l5 != null ? l5.hashCode() : 0);
    }

    public final void setCheck(@Nullable Integer num) {
        this.check = num;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setHeadPortrait(@Nullable String str) {
        this.headPortrait = str;
    }

    public final void setIncentiveAmount(@Nullable Long l5) {
        this.incentiveAmount = l5;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.check;
        String str = this.fullName;
        String str2 = this.headPortrait;
        String str3 = this.memberId;
        String str4 = this.phone;
        Long l5 = this.incentiveAmount;
        StringBuilder sb2 = new StringBuilder("QueryPhonesData(check=");
        sb2.append(num);
        sb2.append(", fullName=");
        sb2.append(str);
        sb2.append(", headPortrait=");
        u.x(sb2, str2, ", memberId=", str3, ", phone=");
        sb2.append(str4);
        sb2.append(", incentiveAmount=");
        sb2.append(l5);
        sb2.append(")");
        return sb2.toString();
    }
}
