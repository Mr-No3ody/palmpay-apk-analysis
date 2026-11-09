package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.account.bean.rsp.TrialCalculation;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxWithdrawFragment f32454b;

    public /* synthetic */ E(CashBoxWithdrawFragment cashBoxWithdrawFragment, int i7) {
        this.f32453a = i7;
        this.f32454b = cashBoxWithdrawFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<T> list;
        TrialCalculation trialCalculation;
        Long l5;
        CashBoxWithdrawFragment cashBoxWithdrawFragment = this.f32454b;
        switch (this.f32453a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        CashBoxWithdrawFragment.a aVar = CashBoxWithdrawFragment.f32442H;
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewU = cashBoxWithdrawFragment.u();
                        if (cashBoxEstimatedInterestViewU != null) {
                            cashBoxEstimatedInterestViewU.d(commonListResultV2.data);
                        }
                        if (commonListResultV2 != null && (list = commonListResultV2.data) != 0 && (trialCalculation = (TrialCalculation) CollectionsKt.firstOrNull(list)) != null && (l5 = trialCalculation.interest) != null) {
                            cashBoxWithdrawFragment.f32445C = l5.longValue();
                        }
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
                        GetUserAssetsAmountResp getUserAssetsAmountResp = (GetUserAssetsAmountResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        cashBoxWithdrawFragment.f32443A = 1L;
                        GetUserAssetsAmountResp.Balance data = getUserAssetsAmountResp.getData();
                        cashBoxWithdrawFragment.f32444B = data != null ? data.cashBoxBalance : 0L;
                        AmountEditText amountEditTextT = cashBoxWithdrawFragment.t();
                        if (amountEditTextT != null) {
                            amountEditTextT.setHint("Min " + Pa.r0.B(cashBoxWithdrawFragment.f32443A, true) + "-Max " + Pa.r0.B(cashBoxWithdrawFragment.f32444B, true));
                        }
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewU2 = cashBoxWithdrawFragment.u();
                        if (cashBoxEstimatedInterestViewU2 != null) {
                            cashBoxEstimatedInterestViewU2.c(getUserAssetsAmountResp.getData());
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
