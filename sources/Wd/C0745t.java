package Wd;

import Pa.i0;
import Pa.n0;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.common.export.bean.resp.DialogConfigSettingsResp;
import com.transsnet.palmpay.common.export.dialog.EnableLoginPasswordDialog;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0745t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerTransactionResultActivity f10785b;

    public /* synthetic */ C0745t(BillerTransactionResultActivity billerTransactionResultActivity, BillerTransactionResultActivity billerTransactionResultActivity2, int i7) {
        this.f10784a = i7;
        this.f10785b = billerTransactionResultActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T t;
        HashMap<String, String> payResultExtParam;
        BillerTransactionResultActivity billerTransactionResultActivity = this.f10785b;
        int i7 = 0;
        switch (this.f10784a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        int i10 = BillerTransactionResultActivity.f34181Y;
                        if (i0.W(billerTransactionResultActivity)) {
                            if (!commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                                billerTransactionResultActivity.s();
                            } else if (((NotificationSettings) t).isNotificationAllEnabled()) {
                                billerTransactionResultActivity.r();
                                ToastUtils.showLong(billerTransactionResultActivity.getString(Pd.f.qt_low_balance_setup_complete), new Object[0]);
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        int i11 = BillerTransactionResultActivity.f34181Y;
                        billerTransactionResultActivity.s();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = (BillPaymentOrderDetailRsp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).data;
                        if (billPaymentOrderDetailRsp != null) {
                            billerTransactionResultActivity.t = billPaymentOrderDetailRsp;
                            billerTransactionResultActivity.q();
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        DialogConfigSettingsResp dialogConfigSettingsResp = (DialogConfigSettingsResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a).data;
                        if (dialogConfigSettingsResp != null) {
                            int style = dialogConfigSettingsResp.getStyle();
                            if (style == 1) {
                                EnableTouchIdDialog enableTouchIdDialog = new EnableTouchIdDialog(billerTransactionResultActivity);
                                enableTouchIdDialog.setOnEnableTouchIdListener(new C0747v(billerTransactionResultActivity, enableTouchIdDialog));
                                enableTouchIdDialog.show();
                                billerTransactionResultActivity.f34186L = enableTouchIdDialog;
                            } else if (style != 4) {
                                String str = null;
                                str = null;
                                if (style != 6) {
                                    com.transsnet.palmpay.custom_view.dialog.b bVar = billerTransactionResultActivity.f34186L;
                                    if (bVar == null || !bVar.isShowing()) {
                                        if (!TextUtils.isEmpty(dialogConfigSettingsResp.getAddition())) {
                                            boolean z3 = 11 == dialogConfigSettingsResp.getStyle();
                                            if (z3) {
                                                n0.g().u(new ViewEvent("t3_upgrade_electricity_popup_exposure").add("Level", BaseApplication.get().getUser().getMobileMoneyAccountTier()));
                                            }
                                            billerTransactionResultActivity.showDialog(p220oa.h.v(billerTransactionResultActivity, dialogConfigSettingsResp.getAddition(), new C0748w(z3, billerTransactionResultActivity, i7), null, 4), 96);
                                        }
                                        InterstitialAdView interstitialAdView = billerTransactionResultActivity.f34183B;
                                        if (interstitialAdView != null) {
                                            interstitialAdView.show(billerTransactionResultActivity, new C0749x(billerTransactionResultActivity, i7));
                                        }
                                    }
                                } else if (Intrinsics.c(billerTransactionResultActivity.f34191e, TransType.TRANS_TYPE_BUNDLE)) {
                                    Postcard postcardWithString = ARouter.getInstance().build("/databundle/auto_renew_overlay").withString("orderNo", billerTransactionResultActivity.f34197p);
                                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = billerTransactionResultActivity.t;
                                    postcardWithString.withParcelable("order_detail_type", billPaymentOrderDetailRsp2 != null ? billPaymentOrderDetailRsp2.getAutoRenewalOrderFields() : null).navigation();
                                } else if (Intrinsics.c(billerTransactionResultActivity.f34191e, TransType.TRANS_TYPE_BILLER_BETTING)) {
                                    Postcard postcardWithString2 = ARouter.getInstance().build("/betting/auto_renew_overlay").withString("orderNo", billerTransactionResultActivity.f34197p);
                                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = billerTransactionResultActivity.t;
                                    if (billPaymentOrderDetailRsp3 != null && (payResultExtParam = billPaymentOrderDetailRsp3.getPayResultExtParam()) != null) {
                                        str = payResultExtParam.get("autoRenewal");
                                    }
                                    postcardWithString2.withString("extra_data", str).navigation();
                                }
                            } else {
                                EnableLoginPasswordDialog enableLoginPasswordDialog = new EnableLoginPasswordDialog(billerTransactionResultActivity);
                                enableLoginPasswordDialog.setOnEnableTouchIdListener(C0746u.f10786a);
                                enableLoginPasswordDialog.show();
                                billerTransactionResultActivity.f34186L = enableLoginPasswordDialog;
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
