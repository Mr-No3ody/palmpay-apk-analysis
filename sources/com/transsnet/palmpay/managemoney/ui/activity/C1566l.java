package com.transsnet.palmpay.managemoney.ui.activity;

import androidx.fragment.app.Z;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.managemoney.bean.resp.GetFixedSavingsProductListResp;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1566l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxOrderResultActivity f32246b;

    public /* synthetic */ C1566l(CashBoxOrderResultActivity cashBoxOrderResultActivity, int i7) {
        this.f32245a = i7;
        this.f32246b = cashBoxOrderResultActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CashBoxOrderResultActivity cashBoxOrderResultActivity = this.f32246b;
        switch (this.f32245a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        GetFixedSavingsProductListResp getFixedSavingsProductListResp = (GetFixedSavingsProductListResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        Nc.c cVar = cashBoxOrderResultActivity.f32065v;
                        cVar.f6310a = getFixedSavingsProductListResp.getData();
                        cVar.notifyDataSetChanged();
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        if (((Boolean) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).data).booleanValue()) {
                            int i7 = CashBoxOrderResultActivity.f32054B;
                            CashBoxAutoSaveDialogFragment cashBoxAutoSaveDialogFragmentNewInstance = CashBoxAutoSaveDialogFragment.f32279M.newInstance("cash_box_result_page");
                            Z supportFragmentManager = cashBoxOrderResultActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            cashBoxAutoSaveDialogFragmentNewInstance.show(supportFragmentManager, "showCashBoxAutoSaveDialog");
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
