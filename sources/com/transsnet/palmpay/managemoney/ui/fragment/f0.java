package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.managemoney.bean.resp.GetPayoutOptionsResp;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                ((GetPayoutOptionsResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }
}
