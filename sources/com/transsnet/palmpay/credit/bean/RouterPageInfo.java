package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/RouterPageInfo;", "", "name", "", "type", "", "params", "Lcom/transsnet/palmpay/credit/bean/RouterPageInfoParams;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/RouterPageInfoParams;)V", "getName", "()Ljava/lang/String;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParams", "()Lcom/transsnet/palmpay/credit/bean/RouterPageInfoParams;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/RouterPageInfoParams;)Lcom/transsnet/palmpay/credit/bean/RouterPageInfo;", "equals", "", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RouterPageInfo {

    @Nullable
    private final String name;

    @Nullable
    private final RouterPageInfoParams params;

    @Nullable
    private final Integer type;

    public RouterPageInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RouterPageInfo copy$default(RouterPageInfo routerPageInfo, String str, Integer num, RouterPageInfoParams routerPageInfoParams, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = routerPageInfo.name;
        }
        if ((i7 & 2) != 0) {
            num = routerPageInfo.type;
        }
        if ((i7 & 4) != 0) {
            routerPageInfoParams = routerPageInfo.params;
        }
        return routerPageInfo.copy(str, num, routerPageInfoParams);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RouterPageInfoParams getParams() {
        return this.params;
    }

    @NotNull
    public final RouterPageInfo copy(@Nullable String name, @Nullable Integer type, @Nullable RouterPageInfoParams params) {
        return new RouterPageInfo(name, type, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouterPageInfo)) {
            return false;
        }
        RouterPageInfo routerPageInfo = (RouterPageInfo) other;
        return Intrinsics.c(this.name, routerPageInfo.name) && Intrinsics.c(this.type, routerPageInfo.type) && Intrinsics.c(this.params, routerPageInfo.params);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final RouterPageInfoParams getParams() {
        return this.params;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        RouterPageInfoParams routerPageInfoParams = this.params;
        return iHashCode2 + (routerPageInfoParams != null ? routerPageInfoParams.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RouterPageInfo(name=" + this.name + ", type=" + this.type + ", params=" + this.params + ")";
    }

    public RouterPageInfo(@Nullable String str, @Nullable Integer num, @Nullable RouterPageInfoParams routerPageInfoParams) {
        this.name = str;
        this.type = num;
        this.params = routerPageInfoParams;
    }

    public /* synthetic */ RouterPageInfo(String str, Integer num, RouterPageInfoParams routerPageInfoParams, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : routerPageInfoParams);
    }
}
