package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcInsRepaymentPlanData;", "", "billId", "", "cardNo", "", "spreadInfoDtoList", "", "Lcom/transsnet/palmpay/credit/bean/resp/SpreadInfoDto;", "unpaidPenalty", "unpaidPrincipal", "billBeginDateStamp", "billEndDateStamp", "overDueStatus", "", "stampDutyPromptInfo", "Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;)V", "getBillId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "()Ljava/lang/String;", "getSpreadInfoDtoList", "()Ljava/util/List;", "getUnpaidPenalty", "getUnpaidPrincipal", "getBillBeginDateStamp", "getBillEndDateStamp", "getOverDueStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStampDutyPromptInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/StampDutyPromptInfo;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcInsRepaymentPlanData {

    @Nullable
    private final Long billBeginDateStamp;

    @Nullable
    private final Long billEndDateStamp;

    @Nullable
    private final Long billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final Boolean overDueStatus;

    @Nullable
    private final List<SpreadInfoDto> spreadInfoDtoList;

    @Nullable
    private final StampDutyPromptInfo stampDutyPromptInfo;

    @Nullable
    private final Long unpaidPenalty;

    @Nullable
    private final Long unpaidPrincipal;

    public OcInsRepaymentPlanData(@Nullable Long l5, @Nullable String str, @Nullable List<SpreadInfoDto> list, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Boolean bool, @Nullable StampDutyPromptInfo stampDutyPromptInfo) {
        this.billId = l5;
        this.cardNo = str;
        this.spreadInfoDtoList = list;
        this.unpaidPenalty = l6;
        this.unpaidPrincipal = l8;
        this.billBeginDateStamp = l10;
        this.billEndDateStamp = l11;
        this.overDueStatus = bool;
        this.stampDutyPromptInfo = stampDutyPromptInfo;
    }

    @Nullable
    public final Long getBillBeginDateStamp() {
        return this.billBeginDateStamp;
    }

    @Nullable
    public final Long getBillEndDateStamp() {
        return this.billEndDateStamp;
    }

    @Nullable
    public final Long getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Boolean getOverDueStatus() {
        return this.overDueStatus;
    }

    @Nullable
    public final List<SpreadInfoDto> getSpreadInfoDtoList() {
        return this.spreadInfoDtoList;
    }

    @Nullable
    public final StampDutyPromptInfo getStampDutyPromptInfo() {
        return this.stampDutyPromptInfo;
    }

    @Nullable
    public final Long getUnpaidPenalty() {
        return this.unpaidPenalty;
    }

    @Nullable
    public final Long getUnpaidPrincipal() {
        return this.unpaidPrincipal;
    }
}
