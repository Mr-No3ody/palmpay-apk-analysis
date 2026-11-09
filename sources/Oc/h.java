package Oc;

import android.text.TextUtils;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.CreateCashBoxCouponOrderResp;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserUseCouponDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxUseCouponResultDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxNewUserUseCouponDialogFragment f6765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6766b;

    public h(CashBoxNewUserUseCouponDialogFragment cashBoxNewUserUseCouponDialogFragment, long j6) {
        this.f6765a = cashBoxNewUserUseCouponDialogFragment;
        this.f6766b = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            CashBoxNewUserUseCouponDialogFragment cashBoxNewUserUseCouponDialogFragment = this.f6765a;
            if (z3) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (cashBoxNewUserUseCouponDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity = cashBoxNewUserUseCouponDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity).showLoadingDialog(false);
                }
                boolean zIsSuccess = commonBeanResult.isSuccess();
                long j6 = this.f6766b;
                if (zIsSuccess) {
                    org.greenrobot.eventbus.c.b().f(new MessageEvent(512));
                    Postcard postcardWithLong = ARouter.getInstance().build("/manage_money/cash_box_main_activity").withLong("orderAmount", j6);
                    CreateCashBoxCouponOrderResp createCashBoxCouponOrderResp = (CreateCashBoxCouponOrderResp) commonBeanResult.data;
                    postcardWithLong.withString("orderNo", createCashBoxCouponOrderResp != null ? createCashBoxCouponOrderResp.orderId : null).navigation();
                    cashBoxNewUserUseCouponDialogFragment.dismiss();
                } else {
                    if (TextUtils.equals("14003056", commonBeanResult.getRespCode()) || TextUtils.equals("14003055", commonBeanResult.getRespCode()) || TextUtils.equals("14003054", commonBeanResult.getRespCode())) {
                        CashBoxUseCouponResultDialogFragment cashBoxUseCouponResultDialogFragmentNewInstance = CashBoxUseCouponResultDialogFragment.f32289C.newInstance(false, j6, commonBeanResult.getRespMsg());
                        Z supportFragmentManager = cashBoxNewUserUseCouponDialogFragment.requireActivity().getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        cashBoxUseCouponResultDialogFragmentNewInstance.show(supportFragmentManager, "showCashBoxUseCouponResultDialog");
                    } else if (TextUtils.equals("14003057", commonBeanResult.getRespCode())) {
                        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxNewUserUseCouponDialogFragment.getString(Jc.f.mm_no_slots_available), commonBeanResult.getRespMsg(), cashBoxNewUserUseCouponDialogFragment.getString(Jc.f.mm_action_okay), null, 8, null);
                        Z supportFragmentManager2 = cashBoxNewUserUseCouponDialogFragment.requireActivity().getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                        commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager2, "showNoSlotsAvailableDialog");
                    } else {
                        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxNewUserUseCouponDialogFragment.getString(p025ba.k.core_opps), commonBeanResult.getRespMsg(), cashBoxNewUserUseCouponDialogFragment.getString(Jc.f.mm_action_okay), null, 8, null);
                        Z supportFragmentManager3 = cashBoxNewUserUseCouponDialogFragment.requireActivity().getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                        commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager3, "showNoSlotsAvailableDialog");
                    }
                    cashBoxNewUserUseCouponDialogFragment.dismiss();
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                String str = ((com.transsnet.palmpay.core.base.n) it).f27358a;
                if (cashBoxNewUserUseCouponDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity2 = cashBoxNewUserUseCouponDialogFragment.getActivity();
                    Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity2).showLoadingDialog(false);
                }
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, str, cashBoxNewUserUseCouponDialogFragment.getString(Jc.f.mm_action_okay), null, 8, null);
                Z supportFragmentManager4 = cashBoxNewUserUseCouponDialogFragment.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default3.show(supportFragmentManager4, "showNoSlotsAvailableDialog");
                cashBoxNewUserUseCouponDialogFragment.dismiss();
            }
        }
        return Unit.f38893a;
    }
}
