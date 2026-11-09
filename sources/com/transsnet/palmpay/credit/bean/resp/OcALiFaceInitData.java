package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcALiFaceInitData;", "", "blockMsg", "", "clientCfg", "enable", "", "existsHistory", "lastS3Url", "lastTime", "", "needBlock", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBlockMsg", "()Ljava/lang/String;", "getClientCfg", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExistsHistory", "getLastS3Url", "getLastTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNeedBlock", "getTransactionId", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcALiFaceInitData {

    @Nullable
    private final String blockMsg;

    @Nullable
    private final String clientCfg;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final Boolean existsHistory;

    @Nullable
    private final String lastS3Url;

    @Nullable
    private final Long lastTime;

    @Nullable
    private final Boolean needBlock;

    @Nullable
    private final String transactionId;

    public OcALiFaceInitData(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str3, @Nullable Long l5, @Nullable Boolean bool3, @Nullable String str4) {
        this.blockMsg = str;
        this.clientCfg = str2;
        this.enable = bool;
        this.existsHistory = bool2;
        this.lastS3Url = str3;
        this.lastTime = l5;
        this.needBlock = bool3;
        this.transactionId = str4;
    }

    @Nullable
    public final String getBlockMsg() {
        return this.blockMsg;
    }

    @Nullable
    public final String getClientCfg() {
        return this.clientCfg;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Boolean getExistsHistory() {
        return this.existsHistory;
    }

    @Nullable
    public final String getLastS3Url() {
        return this.lastS3Url;
    }

    @Nullable
    public final Long getLastTime() {
        return this.lastTime;
    }

    @Nullable
    public final Boolean getNeedBlock() {
        return this.needBlock;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }
}
