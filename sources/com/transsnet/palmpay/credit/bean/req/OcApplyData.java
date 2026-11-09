package com.transsnet.palmpay.credit.bean.req;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0015R\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001b\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcApplyData;", "", "applyEnterPoint", "", "applySource", "", "applyId", "deviceTag", "sceneType", "plIsActive", "", "plIsInstall", "routerTag", "product", "routeInfoList", "", "Lcom/transsnet/palmpay/credit/bean/req/OcRouterDetail;", "routeList", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getApplyEnterPoint", "()Ljava/lang/String;", "setApplyEnterPoint", "(Ljava/lang/String;)V", "getApplySource", "()Ljava/lang/Integer;", "setApplySource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getApplyId", "setApplyId", "getDeviceTag", "setDeviceTag", "getSceneType", "setSceneType", "getPlIsActive", "()Z", "getPlIsInstall", "getRouterTag", "getProduct", "getRouteInfoList", "()Ljava/util/List;", "getRouteList", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcApplyData {

    @Nullable
    private String applyEnterPoint;

    @Nullable
    private String applyId;

    @Nullable
    private Integer applySource;

    @Nullable
    private String deviceTag;
    private final boolean plIsActive;
    private final boolean plIsInstall;

    @Nullable
    private final String product;

    @Nullable
    private final List<OcRouterDetail> routeInfoList;

    @Nullable
    private final List<String> routeList;

    @Nullable
    private final String routerTag;

    @Nullable
    private Integer sceneType;

    public OcApplyData(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, boolean z3, boolean z8, @Nullable String str4, @Nullable String str5, @Nullable List<OcRouterDetail> list, @Nullable List<String> list2) {
        this.applyEnterPoint = str;
        this.applySource = num;
        this.applyId = str2;
        this.deviceTag = str3;
        this.sceneType = num2;
        this.plIsActive = z3;
        this.plIsInstall = z8;
        this.routerTag = str4;
        this.product = str5;
        this.routeInfoList = list;
        this.routeList = list2;
    }

    @Nullable
    public final String getApplyEnterPoint() {
        return this.applyEnterPoint;
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
    public final String getDeviceTag() {
        return this.deviceTag;
    }

    public final boolean getPlIsActive() {
        return this.plIsActive;
    }

    public final boolean getPlIsInstall() {
        return this.plIsInstall;
    }

    @Nullable
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final List<OcRouterDetail> getRouteInfoList() {
        return this.routeInfoList;
    }

    @Nullable
    public final List<String> getRouteList() {
        return this.routeList;
    }

    @Nullable
    public final String getRouterTag() {
        return this.routerTag;
    }

    @Nullable
    public final Integer getSceneType() {
        return this.sceneType;
    }

    public final void setApplyEnterPoint(@Nullable String str) {
        this.applyEnterPoint = str;
    }

    public final void setApplyId(@Nullable String str) {
        this.applyId = str;
    }

    public final void setApplySource(@Nullable Integer num) {
        this.applySource = num;
    }

    public final void setDeviceTag(@Nullable String str) {
        this.deviceTag = str;
    }

    public final void setSceneType(@Nullable Integer num) {
        this.sceneType = num;
    }

    public /* synthetic */ OcApplyData(String str, Integer num, String str2, String str3, Integer num2, boolean z3, boolean z8, String str4, String str5, List list, List list2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 2 : num, str2, (i7 & 8) != 0 ? "" : str3, num2, (i7 & 32) != 0 ? false : z3, (i7 & 64) != 0 ? false : z8, str4, str5, list, (i7 & 1024) != 0 ? null : list2);
    }
}
