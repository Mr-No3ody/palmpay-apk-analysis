package com.transsnet.palmpay.credit.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryOneLoopInfoData;", "", "skip", "", "networkName", "", "networkLogo", "showPin", "networkList", "", "Lcom/transsnet/palmpay/credit/bean/resp/QueryOneLoopInfoNetworkItem;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getSkip", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNetworkName", "()Ljava/lang/String;", "getNetworkLogo", "getShowPin", "getNetworkList", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryOneLoopInfoData {

    @Nullable
    private final List<QueryOneLoopInfoNetworkItem> networkList;

    @Nullable
    private final String networkLogo;

    @Nullable
    private final String networkName;

    @Nullable
    private final Boolean showPin;

    @Nullable
    private final Boolean skip;

    public QueryOneLoopInfoData(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable List<QueryOneLoopInfoNetworkItem> list) {
        this.skip = bool;
        this.networkName = str;
        this.networkLogo = str2;
        this.showPin = bool2;
        this.networkList = list;
    }

    @Nullable
    public final List<QueryOneLoopInfoNetworkItem> getNetworkList() {
        return this.networkList;
    }

    @Nullable
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    @Nullable
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Boolean getShowPin() {
        return this.showPin;
    }

    @Nullable
    public final Boolean getSkip() {
        return this.skip;
    }
}
