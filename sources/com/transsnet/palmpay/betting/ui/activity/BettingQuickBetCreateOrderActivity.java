package com.transsnet.palmpay.betting.ui.activity;

import L6.b;
import Pd.d;
import Rd.C0592h;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.CreateQucikBettingOrderReq;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import p141j9.C1798f;
import p141j9.C1807o;
import x9.C2116b;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/quick_teller/betting_quickbet_create")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingQuickBetCreateOrderActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/betting/viewmodel/BettingDepositViewModel;", "LRd/h;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingQuickBetCreateOrderActivity extends BaseMvvmVBActivity<BettingDepositViewModel, C0592h> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26686g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26687d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26688e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f26689f = 0L;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_betting_quick_bet_create, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        C0592h c0592h = new C0592h((ConstraintLayout) viewInflate, 0);
        Intrinsics.checkNotNullExpressionValue(c0592h, "inflate(...)");
        return c0592h;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) l();
        if (bettingDepositViewModel != null) {
            CreateQucikBettingOrderReq req = new CreateQucikBettingOrderReq(this.f26687d, this.f26689f, this.f26688e);
            Intrinsics.checkNotNullParameter(req, "req");
            C2116b c2116b = new C2116b(req, null);
            l lVar = bettingDepositViewModel.f26769A;
            lVar.f27356m = req;
            Unit unit = Unit.f38893a;
            f.v(bettingDepositViewModel, c2116b, lVar, 0L);
        }
        n.B(this, ((BettingDepositViewModel) l()).f26769A, this, new C1807o(this, 7), new C1798f(this, 13), true, null, 224);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }
}
