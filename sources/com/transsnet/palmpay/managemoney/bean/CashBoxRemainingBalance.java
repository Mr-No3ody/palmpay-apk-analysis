package com.transsnet.palmpay.managemoney.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/CashBoxRemainingBalance;", "", "memberGrade", "", "gradeMaxBalance", "", "remainingBalance", "isShow", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getMemberGrade", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGradeMaxBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemainingBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/managemoney/bean/CashBoxRemainingBalance;", "equals", "other", "hashCode", "toString", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashBoxRemainingBalance {

    @Nullable
    private final Long gradeMaxBalance;

    @Nullable
    private final Boolean isShow;

    @Nullable
    private final Integer memberGrade;

    @Nullable
    private final Long remainingBalance;

    public CashBoxRemainingBalance(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Boolean bool) {
        this.memberGrade = num;
        this.gradeMaxBalance = l5;
        this.remainingBalance = l6;
        this.isShow = bool;
    }

    public static /* synthetic */ CashBoxRemainingBalance copy$default(CashBoxRemainingBalance cashBoxRemainingBalance, Integer num, Long l5, Long l6, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = cashBoxRemainingBalance.memberGrade;
        }
        if ((i7 & 2) != 0) {
            l5 = cashBoxRemainingBalance.gradeMaxBalance;
        }
        if ((i7 & 4) != 0) {
            l6 = cashBoxRemainingBalance.remainingBalance;
        }
        if ((i7 & 8) != 0) {
            bool = cashBoxRemainingBalance.isShow;
        }
        return cashBoxRemainingBalance.copy(num, l5, l6, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMemberGrade() {
        return this.memberGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getGradeMaxBalance() {
        return this.gradeMaxBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getRemainingBalance() {
        return this.remainingBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsShow() {
        return this.isShow;
    }

    @NotNull
    public final CashBoxRemainingBalance copy(@Nullable Integer memberGrade, @Nullable Long gradeMaxBalance, @Nullable Long remainingBalance, @Nullable Boolean isShow) {
        return new CashBoxRemainingBalance(memberGrade, gradeMaxBalance, remainingBalance, isShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashBoxRemainingBalance)) {
            return false;
        }
        CashBoxRemainingBalance cashBoxRemainingBalance = (CashBoxRemainingBalance) other;
        return Intrinsics.c(this.memberGrade, cashBoxRemainingBalance.memberGrade) && Intrinsics.c(this.gradeMaxBalance, cashBoxRemainingBalance.gradeMaxBalance) && Intrinsics.c(this.remainingBalance, cashBoxRemainingBalance.remainingBalance) && Intrinsics.c(this.isShow, cashBoxRemainingBalance.isShow);
    }

    @Nullable
    public final Long getGradeMaxBalance() {
        return this.gradeMaxBalance;
    }

    @Nullable
    public final Integer getMemberGrade() {
        return this.memberGrade;
    }

    @Nullable
    public final Long getRemainingBalance() {
        return this.remainingBalance;
    }

    public int hashCode() {
        Integer num = this.memberGrade;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l5 = this.gradeMaxBalance;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.remainingBalance;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool = this.isShow;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isShow() {
        return this.isShow;
    }

    @NotNull
    public String toString() {
        return "CashBoxRemainingBalance(memberGrade=" + this.memberGrade + ", gradeMaxBalance=" + this.gradeMaxBalance + ", remainingBalance=" + this.remainingBalance + ", isShow=" + this.isShow + ")";
    }

    public /* synthetic */ CashBoxRemainingBalance(Integer num, Long l5, Long l6, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l5, l6, (i7 & 8) != 0 ? Boolean.FALSE : bool);
    }
}
