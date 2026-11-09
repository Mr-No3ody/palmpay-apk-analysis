package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLTaskReq;", "", "home", "", "noSort", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getHome", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNoSort", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTaskReq {

    @Nullable
    private final Integer home;

    @Nullable
    private final Boolean noSort;

    /* JADX WARN: Multi-variable type inference failed */
    public CLTaskReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Integer getHome() {
        return this.home;
    }

    @Nullable
    public final Boolean getNoSort() {
        return this.noSort;
    }

    public CLTaskReq(@Nullable Integer num, @Nullable Boolean bool) {
        this.home = num;
        this.noSort = bool;
    }

    public /* synthetic */ CLTaskReq(Integer num, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num, (i7 & 2) != 0 ? Boolean.TRUE : bool);
    }
}
