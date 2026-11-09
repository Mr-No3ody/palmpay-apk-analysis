package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CouponItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryCouponClaimBodyData;", "", "tidyBillClaimCoupons", "", "Lcom/transsnet/palmpay/core/bean/rsp/QueryCouponClaimData;", "tidyCouponDetailInfos", "Lcom/transsnet/palmpay/core/bean/CouponItem;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTidyBillClaimCoupons", "()Ljava/util/List;", "setTidyBillClaimCoupons", "(Ljava/util/List;)V", "getTidyCouponDetailInfos", "setTidyCouponDetailInfos", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryCouponClaimBodyData {

    @Nullable
    private List<QueryCouponClaimData> tidyBillClaimCoupons;

    @Nullable
    private List<? extends CouponItem> tidyCouponDetailInfos;

    public QueryCouponClaimBodyData(@Nullable List<QueryCouponClaimData> list, @Nullable List<? extends CouponItem> list2) {
        this.tidyBillClaimCoupons = list;
        this.tidyCouponDetailInfos = list2;
    }

    @Nullable
    public final List<QueryCouponClaimData> getTidyBillClaimCoupons() {
        return this.tidyBillClaimCoupons;
    }

    @Nullable
    public final List<CouponItem> getTidyCouponDetailInfos() {
        return this.tidyCouponDetailInfos;
    }

    public final void setTidyBillClaimCoupons(@Nullable List<QueryCouponClaimData> list) {
        this.tidyBillClaimCoupons = list;
    }

    public final void setTidyCouponDetailInfos(@Nullable List<? extends CouponItem> list) {
        this.tidyCouponDetailInfos = list;
    }
}
