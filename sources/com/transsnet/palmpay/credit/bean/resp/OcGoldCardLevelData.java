package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b!\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcGoldCardLevelData;", "", "cardNo", "", "accountStatus", "", "availableBalance", "", "existInstallment", "", "cardLevel", "alreadyAdjustedBillDay", "nextAdjustBillDayDateStamp", "outstandingAmount", "currentBillDayList", "", "Lcom/transsnet/palmpay/credit/bean/resp/OcRepaymentDate;", "billDayItemList", "currentBillDateStamp", "modifyBillDayPrompt", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;)V", "getCardNo", "()Ljava/lang/String;", "getAccountStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvailableBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExistInstallment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCardLevel", "getAlreadyAdjustedBillDay", "getNextAdjustBillDayDateStamp", "getOutstandingAmount", "getCurrentBillDayList", "()Ljava/util/List;", "getBillDayItemList", "getCurrentBillDateStamp", "getModifyBillDayPrompt", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcGoldCardLevelData {

    @Nullable
    private final Integer accountStatus;

    @Nullable
    private final Boolean alreadyAdjustedBillDay;

    @Nullable
    private final Long availableBalance;

    @NotNull
    private final List<OcRepaymentDate> billDayItemList;

    @Nullable
    private final Integer cardLevel;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long currentBillDateStamp;

    @NotNull
    private final List<OcRepaymentDate> currentBillDayList;

    @Nullable
    private final Boolean existInstallment;

    @Nullable
    private final String modifyBillDayPrompt;

    @Nullable
    private final Long nextAdjustBillDayDateStamp;

    @Nullable
    private final Long outstandingAmount;

    public OcGoldCardLevelData(@Nullable String str, @Nullable Integer num, @Nullable Long l5, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Long l6, @Nullable Long l8, @NotNull List<OcRepaymentDate> currentBillDayList, @NotNull List<OcRepaymentDate> billDayItemList, @Nullable Long l10, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(currentBillDayList, "currentBillDayList");
        Intrinsics.checkNotNullParameter(billDayItemList, "billDayItemList");
        this.cardNo = str;
        this.accountStatus = num;
        this.availableBalance = l5;
        this.existInstallment = bool;
        this.cardLevel = num2;
        this.alreadyAdjustedBillDay = bool2;
        this.nextAdjustBillDayDateStamp = l6;
        this.outstandingAmount = l8;
        this.currentBillDayList = currentBillDayList;
        this.billDayItemList = billDayItemList;
        this.currentBillDateStamp = l10;
        this.modifyBillDayPrompt = str2;
    }

    @Nullable
    public final Integer getAccountStatus() {
        return this.accountStatus;
    }

    @Nullable
    public final Boolean getAlreadyAdjustedBillDay() {
        return this.alreadyAdjustedBillDay;
    }

    @Nullable
    public final Long getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    public final List<OcRepaymentDate> getBillDayItemList() {
        return this.billDayItemList;
    }

    @Nullable
    public final Integer getCardLevel() {
        return this.cardLevel;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Long getCurrentBillDateStamp() {
        return this.currentBillDateStamp;
    }

    @NotNull
    public final List<OcRepaymentDate> getCurrentBillDayList() {
        return this.currentBillDayList;
    }

    @Nullable
    public final Boolean getExistInstallment() {
        return this.existInstallment;
    }

    @Nullable
    public final String getModifyBillDayPrompt() {
        return this.modifyBillDayPrompt;
    }

    @Nullable
    public final Long getNextAdjustBillDayDateStamp() {
        return this.nextAdjustBillDayDateStamp;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }
}
