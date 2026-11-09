package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcRouterData;", "", "customerTag", "", "hadLock", "", "routeInfoList", "", "Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;", "routeList", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "getCustomerTag", "()Ljava/lang/String;", "getHadLock", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRouteInfoList", "()Ljava/util/List;", "getRouteList", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRouterData {

    @Nullable
    private final String customerTag;

    @Nullable
    private final Boolean hadLock;

    @Nullable
    private final List<OcRouterDetail> routeInfoList;

    @Nullable
    private final List<String> routeList;

    public OcRouterData(@Nullable String str, @Nullable Boolean bool, @Nullable List<OcRouterDetail> list, @Nullable List<String> list2) {
        this.customerTag = str;
        this.hadLock = bool;
        this.routeInfoList = list;
        this.routeList = list2;
    }

    @Nullable
    public final String getCustomerTag() {
        return this.customerTag;
    }

    @Nullable
    public final Boolean getHadLock() {
        return this.hadLock;
    }

    @Nullable
    public final List<OcRouterDetail> getRouteInfoList() {
        return this.routeInfoList;
    }

    @Nullable
    public final List<String> getRouteList() {
        return this.routeList;
    }
}
