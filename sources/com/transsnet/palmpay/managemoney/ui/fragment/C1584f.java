package com.transsnet.palmpay.managemoney.ui.fragment;

import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.managemoney.bean.CashBoxRemainingBalance;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1584f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxDepositFragment f32609b;

    public /* synthetic */ C1584f(CashBoxDepositFragment cashBoxDepositFragment, int i7) {
        this.f32608a = i7;
        this.f32609b = cashBoxDepositFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ImageView rightImageView1;
        CashBoxRemainingBalance cashBoxRemainingBalance;
        CashBoxDepositFragment cashBoxDepositFragment = this.f32609b;
        switch (this.f32608a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        GetCashBoxNewcomerResp getCashBoxNewcomerResp = (GetCashBoxNewcomerResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a).data;
                        boolean z3 = (getCashBoxNewcomerResp == null || getCashBoxNewcomerResp.cashBoxMemberStatus) ? false : true;
                        Group group = (Group) cashBoxDepositFragment.f32368j.getValue();
                        if (group != null) {
                            group.setVisibility(z3 ? 8 : 0);
                        }
                        PpTitleBar ppTitleBar = (PpTitleBar) cashBoxDepositFragment.f32364Q.getValue();
                        if (ppTitleBar != null && (rightImageView1 = ppTitleBar.getRightImageView1()) != null) {
                            rightImageView1.setVisibility(z3 ? 0 : 8);
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
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        CashBoxDepositFragment.a aVar = CashBoxDepositFragment.f32357p0;
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV = cashBoxDepositFragment.v();
                        if (cashBoxEstimatedInterestViewV != null) {
                            cashBoxEstimatedInterestViewV.d(commonListResultV2.data);
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
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        GetUserAssetsAmountResp getUserAssetsAmountResp = (GetUserAssetsAmountResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        CashBoxDepositFragment.a aVar2 = CashBoxDepositFragment.f32357p0;
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV2 = cashBoxDepositFragment.v();
                        if (cashBoxEstimatedInterestViewV2 != null) {
                            cashBoxEstimatedInterestViewV2.c(getUserAssetsAmountResp.getData());
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        cashBoxDepositFragment.f32366Y = (GetAutoTransferConfigResp) commonBeanResult.data;
                        SwitchCompat switchCompat = (SwitchCompat) cashBoxDepositFragment.f32373w.getValue();
                        if (switchCompat != null) {
                            GetAutoTransferConfigResp getAutoTransferConfigResp = (GetAutoTransferConfigResp) commonBeanResult.data;
                            switchCompat.setChecked(getAutoTransferConfigResp != null && getAutoTransferConfigResp.isAutoTransfer == 1);
                        }
                        ConstraintLayout constraintLayout = (ConstraintLayout) cashBoxDepositFragment.f32359B.getValue();
                        if (constraintLayout != null) {
                            GetAutoTransferConfigResp getAutoTransferConfigResp2 = (GetAutoTransferConfigResp) commonBeanResult.data;
                            constraintLayout.setVisibility((getAutoTransferConfigResp2 == null || getAutoTransferConfigResp2.isAutoTransfer != 1) ? 0 : 8);
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        CashBoxDepositFragment.a aVar3 = CashBoxDepositFragment.f32357p0;
                        CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV3 = cashBoxDepositFragment.v();
                        if (cashBoxEstimatedInterestViewV3 != null && (cashBoxRemainingBalance = (CashBoxRemainingBalance) commonBeanResult2.data) != null) {
                            cashBoxEstimatedInterestViewV3.f32688B = cashBoxRemainingBalance;
                            cashBoxEstimatedInterestViewV3.b();
                        }
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it5).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
