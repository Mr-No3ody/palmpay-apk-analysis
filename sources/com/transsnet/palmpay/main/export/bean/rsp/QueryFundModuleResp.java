package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/QueryFundModuleResp;", "", "fundId", "", "fundName", "fundManager", "riskLevel", "", "returnRate", "", "returnType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "Ljava/lang/Integer;", "Ljava/lang/Double;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryFundModuleResp {

    @JvmField
    @Nullable
    public String fundId;

    @JvmField
    @Nullable
    public String fundManager;

    @JvmField
    @Nullable
    public String fundName;

    @JvmField
    @Nullable
    public Double returnRate;

    @JvmField
    @Nullable
    public String returnType;

    @JvmField
    @Nullable
    public Integer riskLevel;

    public QueryFundModuleResp(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Double d2, @Nullable String str4) {
        this.fundId = str;
        this.fundName = str2;
        this.fundManager = str3;
        this.riskLevel = num;
        this.returnRate = d2;
        this.returnType = str4;
    }
}
