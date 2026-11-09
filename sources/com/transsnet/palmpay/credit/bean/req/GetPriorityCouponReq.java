package com.transsnet.palmpay.credit.bean.req;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/GetPriorityCouponReq;", "", "transTypes", "", "", "deductionExpenseList", "", "", "<init>", "([Ljava/lang/String;Ljava/util/List;)V", "getTransTypes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getDeductionExpenseList", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetPriorityCouponReq {

    @Nullable
    private final List<Integer> deductionExpenseList;

    @Nullable
    private final String[] transTypes;

    public GetPriorityCouponReq(@Nullable String[] strArr, @Nullable List<Integer> list) {
        this.transTypes = strArr;
        this.deductionExpenseList = list;
    }

    @Nullable
    public final List<Integer> getDeductionExpenseList() {
        return this.deductionExpenseList;
    }

    @Nullable
    public final String[] getTransTypes() {
        return this.transTypes;
    }

    public /* synthetic */ GetPriorityCouponReq(String[] strArr, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, (i7 & 2) != 0 ? C1850q.h(0, 1, 3, 4) : list);
    }
}
