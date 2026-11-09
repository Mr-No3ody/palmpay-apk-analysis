package com.transsnet.palmpay.managemoney.ui.fragment;

import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderNoRsp;
import com.transsnet.palmpay.managemoney.bean.req.QueryOrderNoReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1596s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f32660b;

    public /* synthetic */ C1596s(com.transsnet.palmpay.core.base.l lVar, int i7) {
        this.f32659a = i7;
        this.f32660b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32659a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj2 = this.f32660b.f27356m;
                        QueryOrderNoRsp queryOrderNoRsp = (QueryOrderNoRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        QueryOrderNoReq queryOrderNoReq = (QueryOrderNoReq) obj2;
                        if (queryOrderNoRsp.isSuccess()) {
                            String orderType = queryOrderNoRsp.getData().getOrderType();
                            Intrinsics.checkNotNullExpressionValue(orderType, "getOrderType(...)");
                            if (TextUtils.isEmpty(orderType)) {
                                orderType = Pa.i0.F(queryOrderNoReq != null ? queryOrderNoReq.getPayId() : null);
                                Intrinsics.checkNotNullExpressionValue(orderType, "getTransTypeByPayId(...)");
                            }
                            if (TextUtils.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL, orderType)) {
                                ARouter.getInstance().build("/airtime/recharge_2_cash_detail").withString("orderNo", queryOrderNoRsp.getData().getOrderNo()).navigation();
                            } else {
                                Ea.a.e(orderType, queryOrderNoRsp.getData().getOrderNo(), "");
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj3 = this.f32660b.f27356m;
                        QueryOrderNoRsp queryOrderNoRsp2 = (QueryOrderNoRsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        QueryOrderNoReq queryOrderNoReq2 = (QueryOrderNoReq) obj3;
                        if (queryOrderNoRsp2.isSuccess()) {
                            String orderType2 = queryOrderNoRsp2.getData().getOrderType();
                            Intrinsics.checkNotNullExpressionValue(orderType2, "getOrderType(...)");
                            if (TextUtils.isEmpty(orderType2)) {
                                orderType2 = Pa.i0.F(queryOrderNoReq2 != null ? queryOrderNoReq2.getPayId() : null);
                                Intrinsics.checkNotNullExpressionValue(orderType2, "getTransTypeByPayId(...)");
                            }
                            if (TextUtils.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL, orderType2)) {
                                ARouter.getInstance().build("/airtime/recharge_2_cash_detail").withString("orderNo", queryOrderNoRsp2.getData().getOrderNo()).navigation();
                            } else {
                                Ea.a.e(orderType2, queryOrderNoRsp2.getData().getOrderNo(), "");
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj4 = this.f32660b.f27356m;
                        QueryOrderNoRsp queryOrderNoRsp3 = (QueryOrderNoRsp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        QueryOrderNoReq queryOrderNoReq3 = (QueryOrderNoReq) obj4;
                        if (queryOrderNoRsp3.isSuccess()) {
                            String orderType3 = queryOrderNoRsp3.getData().getOrderType();
                            Intrinsics.checkNotNullExpressionValue(orderType3, "getOrderType(...)");
                            if (TextUtils.isEmpty(orderType3)) {
                                orderType3 = Pa.i0.F(queryOrderNoReq3 != null ? queryOrderNoReq3.getPayId() : null);
                                Intrinsics.checkNotNullExpressionValue(orderType3, "getTransTypeByPayId(...)");
                            }
                            if (TextUtils.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL, orderType3)) {
                                ARouter.getInstance().build("/airtime/recharge_2_cash_detail").withString("orderNo", queryOrderNoRsp3.getData().getOrderNo()).navigation();
                            } else {
                                Ea.a.e(orderType3, queryOrderNoRsp3.getData().getOrderNo(), "");
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj5 = this.f32660b.f27356m;
                        QueryOrderNoRsp queryOrderNoRsp4 = (QueryOrderNoRsp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        QueryOrderNoReq queryOrderNoReq4 = (QueryOrderNoReq) obj5;
                        if (queryOrderNoRsp4.isSuccess()) {
                            String orderType4 = queryOrderNoRsp4.getData().getOrderType();
                            Intrinsics.checkNotNullExpressionValue(orderType4, "getOrderType(...)");
                            if (TextUtils.isEmpty(orderType4)) {
                                orderType4 = Pa.i0.F(queryOrderNoReq4 != null ? queryOrderNoReq4.getPayId() : null);
                                Intrinsics.checkNotNullExpressionValue(orderType4, "getTransTypeByPayId(...)");
                            }
                            if (TextUtils.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL, orderType4)) {
                                ARouter.getInstance().build("/airtime/recharge_2_cash_detail").withString("orderNo", queryOrderNoRsp4.getData().getOrderNo()).navigation();
                            } else {
                                Ea.a.e(orderType4, queryOrderNoRsp4.getData().getOrderNo(), "");
                            }
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
