package com.transsnet.palmpay.core.bean;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010*J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J°\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\t\u0010>\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u0006?"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedPayload;", "", "loanAmount", "", "accountType", "", "cardNo", "", "productSubId", FirebaseAnalytics.Param.TERM, "loanTerm", "loanDays", "termSpan", "termSpanUnit", "repaymentDate", "repaymentPlanList", "", "Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedRepaymentPlanItem;", "totalRepaymentAmount", "cashierContextId", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;)V", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNo", "()Ljava/lang/String;", "getProductSubId", "getTerm", "getLoanTerm", "getLoanDays", "getTermSpan", "getTermSpanUnit", "getRepaymentDate", "getRepaymentPlanList", "()Ljava/util/List;", "getTotalRepaymentAmount", "getCashierContextId", "toPayloadMap", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedPayload;", "equals", "", "other", "hashCode", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferByLoanConfirmedPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferByLoanConfirmedPayload.kt\ncom/transsnet/palmpay/core/bean/TransferByLoanConfirmedPayload\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,60:1\n506#2,7:61\n*S KotlinDebug\n*F\n+ 1 TransferByLoanConfirmedPayload.kt\ncom/transsnet/palmpay/core/bean/TransferByLoanConfirmedPayload\n*L\n57#1:61,7\n*E\n"})
public final /* data */ class TransferByLoanConfirmedPayload {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String cashierContextId;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final Integer loanDays;

    @Nullable
    private final Integer loanTerm;

    @Nullable
    private final Integer productSubId;

    @Nullable
    private final Long repaymentDate;

    @Nullable
    private final List<TransferByLoanConfirmedRepaymentPlanItem> repaymentPlanList;

    @Nullable
    private final String term;

    @Nullable
    private final Integer termSpan;

    @Nullable
    private final String termSpanUnit;

    @Nullable
    private final Long totalRepaymentAmount;

    public TransferByLoanConfirmedPayload(@Nullable Long l5, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str3, @Nullable Long l6, @Nullable List<TransferByLoanConfirmedRepaymentPlanItem> list, @Nullable Long l8, @Nullable String str4) {
        this.loanAmount = l5;
        this.accountType = num;
        this.cardNo = str;
        this.productSubId = num2;
        this.term = str2;
        this.loanTerm = num3;
        this.loanDays = num4;
        this.termSpan = num5;
        this.termSpanUnit = str3;
        this.repaymentDate = l6;
        this.repaymentPlanList = list;
        this.totalRepaymentAmount = l8;
        this.cashierContextId = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferByLoanConfirmedPayload copy$default(TransferByLoanConfirmedPayload transferByLoanConfirmedPayload, Long l5, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3, Long l6, List list, Long l8, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = transferByLoanConfirmedPayload.loanAmount;
        }
        return transferByLoanConfirmedPayload.copy(l5, (i7 & 2) != 0 ? transferByLoanConfirmedPayload.accountType : num, (i7 & 4) != 0 ? transferByLoanConfirmedPayload.cardNo : str, (i7 & 8) != 0 ? transferByLoanConfirmedPayload.productSubId : num2, (i7 & 16) != 0 ? transferByLoanConfirmedPayload.term : str2, (i7 & 32) != 0 ? transferByLoanConfirmedPayload.loanTerm : num3, (i7 & 64) != 0 ? transferByLoanConfirmedPayload.loanDays : num4, (i7 & 128) != 0 ? transferByLoanConfirmedPayload.termSpan : num5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? transferByLoanConfirmedPayload.termSpanUnit : str3, (i7 & 512) != 0 ? transferByLoanConfirmedPayload.repaymentDate : l6, (i7 & 1024) != 0 ? transferByLoanConfirmedPayload.repaymentPlanList : list, (i7 & 2048) != 0 ? transferByLoanConfirmedPayload.totalRepaymentAmount : l8, (i7 & 4096) != 0 ? transferByLoanConfirmedPayload.cashierContextId : str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final List<TransferByLoanConfirmedRepaymentPlanItem> component11() {
        return this.repaymentPlanList;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getTotalRepaymentAmount() {
        return this.totalRepaymentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCashierContextId() {
        return this.cashierContextId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTerm() {
        return this.term;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getLoanTerm() {
        return this.loanTerm;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getLoanDays() {
        return this.loanDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTermSpan() {
        return this.termSpan;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTermSpanUnit() {
        return this.termSpanUnit;
    }

    @NotNull
    public final TransferByLoanConfirmedPayload copy(@Nullable Long loanAmount, @Nullable Integer accountType, @Nullable String cardNo, @Nullable Integer productSubId, @Nullable String term, @Nullable Integer loanTerm, @Nullable Integer loanDays, @Nullable Integer termSpan, @Nullable String termSpanUnit, @Nullable Long repaymentDate, @Nullable List<TransferByLoanConfirmedRepaymentPlanItem> repaymentPlanList, @Nullable Long totalRepaymentAmount, @Nullable String cashierContextId) {
        return new TransferByLoanConfirmedPayload(loanAmount, accountType, cardNo, productSubId, term, loanTerm, loanDays, termSpan, termSpanUnit, repaymentDate, repaymentPlanList, totalRepaymentAmount, cashierContextId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferByLoanConfirmedPayload)) {
            return false;
        }
        TransferByLoanConfirmedPayload transferByLoanConfirmedPayload = (TransferByLoanConfirmedPayload) other;
        return Intrinsics.c(this.loanAmount, transferByLoanConfirmedPayload.loanAmount) && Intrinsics.c(this.accountType, transferByLoanConfirmedPayload.accountType) && Intrinsics.c(this.cardNo, transferByLoanConfirmedPayload.cardNo) && Intrinsics.c(this.productSubId, transferByLoanConfirmedPayload.productSubId) && Intrinsics.c(this.term, transferByLoanConfirmedPayload.term) && Intrinsics.c(this.loanTerm, transferByLoanConfirmedPayload.loanTerm) && Intrinsics.c(this.loanDays, transferByLoanConfirmedPayload.loanDays) && Intrinsics.c(this.termSpan, transferByLoanConfirmedPayload.termSpan) && Intrinsics.c(this.termSpanUnit, transferByLoanConfirmedPayload.termSpanUnit) && Intrinsics.c(this.repaymentDate, transferByLoanConfirmedPayload.repaymentDate) && Intrinsics.c(this.repaymentPlanList, transferByLoanConfirmedPayload.repaymentPlanList) && Intrinsics.c(this.totalRepaymentAmount, transferByLoanConfirmedPayload.totalRepaymentAmount) && Intrinsics.c(this.cashierContextId, transferByLoanConfirmedPayload.cashierContextId);
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getCashierContextId() {
        return this.cashierContextId;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final Integer getLoanDays() {
        return this.loanDays;
    }

    @Nullable
    public final Integer getLoanTerm() {
        return this.loanTerm;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final List<TransferByLoanConfirmedRepaymentPlanItem> getRepaymentPlanList() {
        return this.repaymentPlanList;
    }

    @Nullable
    public final String getTerm() {
        return this.term;
    }

    @Nullable
    public final Integer getTermSpan() {
        return this.termSpan;
    }

    @Nullable
    public final String getTermSpanUnit() {
        return this.termSpanUnit;
    }

    @Nullable
    public final Long getTotalRepaymentAmount() {
        return this.totalRepaymentAmount;
    }

    public int hashCode() {
        Long l5 = this.loanAmount;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Integer num = this.accountType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cardNo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.productSubId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.term;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.loanTerm;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.loanDays;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.termSpan;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.termSpanUnit;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l6 = this.repaymentDate;
        int iHashCode10 = (iHashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        List<TransferByLoanConfirmedRepaymentPlanItem> list = this.repaymentPlanList;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Long l8 = this.totalRepaymentAmount;
        int iHashCode12 = (iHashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str4 = this.cashierContextId;
        return iHashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final Map<String, Object> toPayloadMap() {
        LinkedHashMap linkedHashMapF = G.f(new Pair("loanAmount", this.loanAmount), new Pair("accountType", this.accountType), new Pair("cardNo", this.cardNo), new Pair("productSubId", this.productSubId), new Pair(FirebaseAnalytics.Param.TERM, this.term), new Pair("loanTerm", this.loanTerm), new Pair("loanDays", this.loanDays), new Pair("termSpan", this.termSpan), new Pair("termSpanUnit", this.termSpanUnit), new Pair("repaymentDate", this.repaymentDate), new Pair("repaymentPlanList", this.repaymentPlanList), new Pair("totalRepaymentAmount", this.totalRepaymentAmount), new Pair("cashierContextId", this.cashierContextId));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapF.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        Long l5 = this.loanAmount;
        Integer num = this.accountType;
        String str = this.cardNo;
        Integer num2 = this.productSubId;
        String str2 = this.term;
        Integer num3 = this.loanTerm;
        Integer num4 = this.loanDays;
        Integer num5 = this.termSpan;
        String str3 = this.termSpanUnit;
        Long l6 = this.repaymentDate;
        List<TransferByLoanConfirmedRepaymentPlanItem> list = this.repaymentPlanList;
        Long l8 = this.totalRepaymentAmount;
        String str4 = this.cashierContextId;
        StringBuilder sb2 = new StringBuilder("TransferByLoanConfirmedPayload(loanAmount=");
        sb2.append(l5);
        sb2.append(", accountType=");
        sb2.append(num);
        sb2.append(", cardNo=");
        sb2.append(str);
        sb2.append(", productSubId=");
        sb2.append(num2);
        sb2.append(", term=");
        sb2.append(str2);
        sb2.append(", loanTerm=");
        sb2.append(num3);
        sb2.append(", loanDays=");
        sb2.append(num4);
        sb2.append(", termSpan=");
        sb2.append(num5);
        sb2.append(", termSpanUnit=");
        sb2.append(str3);
        sb2.append(", repaymentDate=");
        sb2.append(l6);
        sb2.append(", repaymentPlanList=");
        sb2.append(list);
        sb2.append(", totalRepaymentAmount=");
        sb2.append(l8);
        sb2.append(", cashierContextId=");
        return C0.G.r(sb2, str4, ")");
    }
}
