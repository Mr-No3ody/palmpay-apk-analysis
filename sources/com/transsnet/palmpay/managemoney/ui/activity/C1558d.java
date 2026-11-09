package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.n0;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CreateCashBoxCouponOrderResp;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.CouponRecord;
import com.transsnet.palmpay.managemoney.bean.resp.GetThresholdResp;
import com.transsnet.palmpay.managemoney.bean.resp.OpenCashBoxAccountResp;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxLoseLotteryDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxUseCouponResultDialogFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1558d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxCampaignMainActivity f32230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxCampaignMainActivity f32231c;

    public /* synthetic */ C1558d(CashBoxCampaignMainActivity cashBoxCampaignMainActivity, CashBoxCampaignMainActivity cashBoxCampaignMainActivity2, int i7) {
        this.f32229a = i7;
        this.f32230b = cashBoxCampaignMainActivity;
        this.f32231c = cashBoxCampaignMainActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView rightTextView;
        GetThresholdResp.Data data;
        switch (this.f32229a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32230b;
                if (z3) {
                    cashBoxCampaignMainActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxCampaignMainActivity.showLoadingDialog(false, true);
                    GetThresholdResp getThresholdResp = (GetThresholdResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    CashBoxCampaignMainActivity cashBoxCampaignMainActivity2 = this.f32231c;
                    Object value = cashBoxCampaignMainActivity2.f32024L.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    AppCompatImageView appCompatImageView = (AppCompatImageView) value;
                    GetThresholdResp.Data data2 = getThresholdResp.getData();
                    int i7 = 8;
                    appCompatImageView.setVisibility((data2 == null || !data2.getHasAccount() || (data = getThresholdResp.getData()) == null || data.getOpened()) ? 8 : 0);
                    PpTitleBar ppTitleBarO = cashBoxCampaignMainActivity2.o();
                    if (ppTitleBarO != null && (rightTextView = ppTitleBarO.getRightTextView()) != null) {
                        GetThresholdResp.Data data3 = getThresholdResp.getData();
                        if (data3 != null && data3.getHasAccount()) {
                            i7 = 0;
                        }
                        rightTextView.setVisibility(i7);
                    }
                    GetThresholdResp.Data data4 = getThresholdResp.getData();
                    if (data4 == null || data4.getHasAccount()) {
                        GetThresholdResp.Data data5 = getThresholdResp.getData();
                        if (data5 == null || !data5.getOpened()) {
                            n0.g().l("CashBoxActivity_View");
                            CashBoxCampaignMainActivity.m(cashBoxCampaignMainActivity2, true);
                        } else {
                            n0.g().l("CashBoxActivity_Reward_View");
                            CouponRecord couponRecord = new CouponRecord(getThresholdResp.getData().getCouponId(), null, null, 0, getThresholdResp.getData().getNominalValue(), 0, 0, null, null, null, null, 2030, null);
                            cashBoxCampaignMainActivity2.f32025M = couponRecord;
                            CashBoxCampaignMainActivity.n(cashBoxCampaignMainActivity2, couponRecord);
                        }
                    } else {
                        n0.g().l("CashBoxActivity_OldeUser_View");
                        Object value2 = cashBoxCampaignMainActivity2.f32033j.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((Group) value2).setVisibility(0);
                        Object value3 = cashBoxCampaignMainActivity2.f32034o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        cashBoxCampaignMainActivity2.q((ConstraintLayout) value3);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxCampaignMainActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxCampaignMainActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity3 = this.f32230b;
                if (z8) {
                    cashBoxCampaignMainActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxCampaignMainActivity3.showLoadingDialog(false, true);
                    OpenCashBoxAccountResp.Data data6 = ((OpenCashBoxAccountResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a).getData();
                    CouponRecord couponRecord2 = null;
                    List<CouponRecord> records = data6 != null ? data6.getRecords() : null;
                    CashBoxCampaignMainActivity cashBoxCampaignMainActivity4 = this.f32231c;
                    List<CouponRecord> list = records;
                    if (list != null && !list.isEmpty()) {
                        for (CouponRecord couponRecord3 : records) {
                            if (couponRecord3.getItemType() == 2) {
                                couponRecord2 = couponRecord3;
                            }
                        }
                    }
                    cashBoxCampaignMainActivity4.f32025M = couponRecord2;
                    if (couponRecord2 == null) {
                        n0.g().l("CashBoxActivity_SorryPopup_View");
                        CashBoxLoseLotteryDialogFragment cashBoxLoseLotteryDialogFragmentNewInstance = CashBoxLoseLotteryDialogFragment.f32281C.newInstance();
                        Z supportFragmentManager = cashBoxCampaignMainActivity4.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        cashBoxLoseLotteryDialogFragmentNewInstance.show(supportFragmentManager, "showCashBoxLoseLotteryDialog");
                    } else {
                        Object value4 = cashBoxCampaignMainActivity4.f32024L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((AppCompatImageView) value4).setVisibility(8);
                        CashBoxCampaignMainActivity.n(cashBoxCampaignMainActivity4, cashBoxCampaignMainActivity4.f32025M);
                        CashBoxCampaignMainActivity.m(cashBoxCampaignMainActivity4, false);
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxCampaignMainActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxCampaignMainActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z10 = it3 instanceof com.transsnet.palmpay.core.base.o;
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity5 = this.f32230b;
                if (z10) {
                    cashBoxCampaignMainActivity5.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    cashBoxCampaignMainActivity5.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    boolean zIsSuccess = commonBeanResult.isSuccess();
                    CashBoxCampaignMainActivity cashBoxCampaignMainActivity6 = this.f32231c;
                    if (zIsSuccess) {
                        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/cash_box_main_activity");
                        CouponRecord couponRecord4 = cashBoxCampaignMainActivity6.f32025M;
                        Postcard postcardWithLong = postcardBuild.withLong("orderAmount", couponRecord4 != null ? couponRecord4.getNominalValue() : 0L);
                        CreateCashBoxCouponOrderResp createCashBoxCouponOrderResp = (CreateCashBoxCouponOrderResp) commonBeanResult.data;
                        postcardWithLong.withString("orderNo", createCashBoxCouponOrderResp != null ? createCashBoxCouponOrderResp.orderId : null).navigation();
                        cashBoxCampaignMainActivity6.finish();
                    } else if (TextUtils.equals("14003056", commonBeanResult.getRespCode()) || TextUtils.equals("14003055", commonBeanResult.getRespCode()) || TextUtils.equals("14003054", commonBeanResult.getRespCode())) {
                        CashBoxUseCouponResultDialogFragment.a aVar = CashBoxUseCouponResultDialogFragment.f32289C;
                        CouponRecord couponRecord5 = cashBoxCampaignMainActivity6.f32025M;
                        CashBoxUseCouponResultDialogFragment cashBoxUseCouponResultDialogFragmentNewInstance = aVar.newInstance(false, couponRecord5 != null ? couponRecord5.getNominalValue() : 0L, commonBeanResult.getRespMsg());
                        Z supportFragmentManager2 = cashBoxCampaignMainActivity6.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                        cashBoxUseCouponResultDialogFragmentNewInstance.show(supportFragmentManager2, "showCashBoxUseCouponResultDialog");
                    } else if (TextUtils.equals("14003057", commonBeanResult.getRespCode())) {
                        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxCampaignMainActivity6.getString(Jc.f.mm_no_slots_available), commonBeanResult.getRespMsg(), cashBoxCampaignMainActivity6.getString(Jc.f.mm_action_okay), null, 8, null);
                        Z supportFragmentManager3 = cashBoxCampaignMainActivity6.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                        commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager3, "showNoSlotsAvailableDialog");
                    } else if (TextUtils.equals("fb_open_error_code", commonBeanResult.getRespCode())) {
                        String respMsg = commonBeanResult.getRespMsg();
                        if (respMsg != null) {
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxCampaignMainActivity6.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg, cashBoxCampaignMainActivity6.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                            Z supportFragmentManager4 = cashBoxCampaignMainActivity6.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager4, "showErrorDialog");
                        }
                    } else {
                        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxCampaignMainActivity6.getString(p025ba.k.core_opps), commonBeanResult.getRespMsg(), cashBoxCampaignMainActivity6.getString(Jc.f.mm_action_okay), null, 8, null);
                        Z supportFragmentManager5 = cashBoxCampaignMainActivity6.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "getSupportFragmentManager(...)");
                        commonTipsDialogFragmentCreateDialog$default3.show(supportFragmentManager5, "showNoSlotsAvailableDialog");
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    cashBoxCampaignMainActivity5.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    cashBoxCampaignMainActivity5.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                }
                return Unit.f38893a;
        }
    }
}
