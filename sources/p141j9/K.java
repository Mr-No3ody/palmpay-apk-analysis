package p141j9;

import Pa.i0;
import Pd.f;
import Wd.C0749x;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeScheduleTopUpBean;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.common.export.bean.resp.DialogConfigSettingsResp;
import com.transsnet.palmpay.common.export.dialog.EnableLoginPasswordDialog;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupResultActivityV2 f38380b;

    public /* synthetic */ K(TopupResultActivityV2 topupResultActivityV2, TopupResultActivityV2 topupResultActivityV3, int i7) {
        this.f38379a = i7;
        this.f38380b = topupResultActivityV3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T t;
        AirtimeScheduleTopUpBean autoRenewalOrderFields;
        AirtimeScheduleTopUpBean autoRenewalOrderFields2;
        AirtimeScheduleTopUpBean autoRenewalOrderFields3;
        InterstitialAdView interstitialAdView;
        TopupResultActivityV2 topupResultActivityV2 = this.f38380b;
        int i7 = 1;
        switch (this.f38379a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        int i10 = TopupResultActivityV2.f26521k0;
                        if (i0.W(topupResultActivityV2)) {
                            if (!commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                                topupResultActivityV2.q();
                            } else if (((NotificationSettings) t).isNotificationAllEnabled()) {
                                topupResultActivityV2.p();
                                ToastUtils.showLong(topupResultActivityV2.getString(f.qt_low_balance_setup_complete), new Object[0]);
                            }
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ((n) it).getClass();
                        int i11 = TopupResultActivityV2.f26521k0;
                        topupResultActivityV2.q();
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        AirtimeDetailData airtimeDetailData = (AirtimeDetailData) ((CommonBeanResult) ((p) it2).f27360a).data;
                        if (airtimeDetailData != null) {
                            topupResultActivityV2.f26522A = airtimeDetailData;
                            topupResultActivityV2.f26526L = true;
                            topupResultActivityV2.o();
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        DialogConfigSettingsResp dialogConfigSettingsResp = (DialogConfigSettingsResp) ((CommonBeanResult) ((p) it3).f27360a).data;
                        if (dialogConfigSettingsResp != null) {
                            int style = dialogConfigSettingsResp.getStyle();
                            if (style == 1) {
                                EnableTouchIdDialog enableTouchIdDialog = new EnableTouchIdDialog(topupResultActivityV2);
                                enableTouchIdDialog.setOnEnableTouchIdListener(new M(topupResultActivityV2, enableTouchIdDialog));
                                enableTouchIdDialog.show();
                                topupResultActivityV2.f26528Q = enableTouchIdDialog;
                            } else if (style == 4) {
                                EnableLoginPasswordDialog enableLoginPasswordDialog = new EnableLoginPasswordDialog(topupResultActivityV2);
                                enableLoginPasswordDialog.setOnEnableTouchIdListener(L.f38381a);
                                enableLoginPasswordDialog.show();
                                topupResultActivityV2.f26528Q = enableLoginPasswordDialog;
                            } else if (style != 7) {
                                b bVar = topupResultActivityV2.f26528Q;
                                if ((bVar == null || !bVar.isShowing()) && (interstitialAdView = topupResultActivityV2.f26525H) != null) {
                                    interstitialAdView.show(topupResultActivityV2, new C0749x(topupResultActivityV2, i7));
                                }
                            } else {
                                AirtimeDetailData airtimeDetailData2 = topupResultActivityV2.f26522A;
                                if (airtimeDetailData2 != null && (autoRenewalOrderFields3 = airtimeDetailData2.getAutoRenewalOrderFields()) != null) {
                                    AirtimeDetailData airtimeDetailData3 = topupResultActivityV2.f26522A;
                                    autoRenewalOrderFields3.setBillerId(airtimeDetailData3 != null ? airtimeDetailData3.getNetwork() : null);
                                }
                                AirtimeDetailData airtimeDetailData4 = topupResultActivityV2.f26522A;
                                if (airtimeDetailData4 != null && (autoRenewalOrderFields2 = airtimeDetailData4.getAutoRenewalOrderFields()) != null) {
                                    AirtimeDetailData airtimeDetailData5 = topupResultActivityV2.f26522A;
                                    autoRenewalOrderFields2.setBillerLogo(airtimeDetailData5 != null ? airtimeDetailData5.getIcon() : null);
                                }
                                AirtimeDetailData airtimeDetailData6 = topupResultActivityV2.f26522A;
                                if (airtimeDetailData6 != null && (autoRenewalOrderFields = airtimeDetailData6.getAutoRenewalOrderFields()) != null) {
                                    AirtimeDetailData airtimeDetailData7 = topupResultActivityV2.f26522A;
                                    autoRenewalOrderFields.setPhone(airtimeDetailData7 != null ? airtimeDetailData7.getPhone() : null);
                                }
                                Postcard postcardWithString = ARouter.getInstance().build("/airtime/auto_topup_overlay").withString("orderNo", topupResultActivityV2.f26541w);
                                AirtimeDetailData airtimeDetailData8 = topupResultActivityV2.f26522A;
                                postcardWithString.withParcelable("KEY_DATA", airtimeDetailData8 != null ? airtimeDetailData8.getAutoRenewalOrderFields() : null).navigation();
                            }
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
