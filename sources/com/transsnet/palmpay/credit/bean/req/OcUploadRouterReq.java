package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcUploadRouterReq;", "", "applyId", "", "customerTag", "routePath", "event", "routeId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getApplyId", "()Ljava/lang/String;", "getCustomerTag", "getRoutePath", "getEvent", "getRouteId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcUploadRouterReq {

    @Nullable
    private final String applyId;

    @Nullable
    private final String customerTag;

    @Nullable
    private final String event;

    @Nullable
    private final Integer routeId;

    @Nullable
    private final String routePath;

    public OcUploadRouterReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.applyId = str;
        this.customerTag = str2;
        this.routePath = str3;
        this.event = str4;
        this.routeId = num;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final String getCustomerTag() {
        return this.customerTag;
    }

    @Nullable
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final Integer getRouteId() {
        return this.routeId;
    }

    @Nullable
    public final String getRoutePath() {
        return this.routePath;
    }

    public /* synthetic */ OcUploadRouterReq(String str, String str2, String str3, String str4, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i7 & 16) != 0 ? -1 : num);
    }
}
