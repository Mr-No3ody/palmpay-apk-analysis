package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcApplyResultData;", "", "applyId", "", "applyStatus", "", "availableBalance", "", "creditQuota", "overpaymentBalance", "errorContent", "applySource", "changeQuotaContent", "config", "Lcom/transsnet/palmpay/credit/bean/resp/OcApplyResultConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/OcApplyResultConfig;)V", "getApplyId", "()Ljava/lang/String;", "setApplyId", "(Ljava/lang/String;)V", "getApplyStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvailableBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreditQuota", "getOverpaymentBalance", "getErrorContent", "getApplySource", "getChangeQuotaContent", "getConfig", "()Lcom/transsnet/palmpay/credit/bean/resp/OcApplyResultConfig;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcApplyResultData {

    @Nullable
    private String applyId;

    @Nullable
    private final Integer applySource;

    @Nullable
    private final Integer applyStatus;

    @Nullable
    private final Long availableBalance;

    @Nullable
    private final String changeQuotaContent;

    @Nullable
    private final OcApplyResultConfig config;

    @Nullable
    private final Long creditQuota;

    @Nullable
    private final String errorContent;

    @Nullable
    private final Long overpaymentBalance;

    public OcApplyResultData(@Nullable String str, @Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable OcApplyResultConfig ocApplyResultConfig) {
        this.applyId = str;
        this.applyStatus = num;
        this.availableBalance = l5;
        this.creditQuota = l6;
        this.overpaymentBalance = l8;
        this.errorContent = str2;
        this.applySource = num2;
        this.changeQuotaContent = str3;
        this.config = ocApplyResultConfig;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final Integer getApplySource() {
        return this.applySource;
    }

    @Nullable
    public final Integer getApplyStatus() {
        return this.applyStatus;
    }

    @Nullable
    public final Long getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getChangeQuotaContent() {
        return this.changeQuotaContent;
    }

    @Nullable
    public final OcApplyResultConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final Long getCreditQuota() {
        return this.creditQuota;
    }

    @Nullable
    public final String getErrorContent() {
        return this.errorContent;
    }

    @Nullable
    public final Long getOverpaymentBalance() {
        return this.overpaymentBalance;
    }

    public final void setApplyId(@Nullable String str) {
        this.applyId = str;
    }
}
