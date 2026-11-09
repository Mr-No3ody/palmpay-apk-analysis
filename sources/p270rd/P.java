package p270rd;

import Ab.k;
import G8.a;
import Kd.J0;
import Pa.n0;
import Wd.C0748w;
import Wd.C0749x;
import Wf.AbstractC0780y;
import Wf.I;
import android.text.TextUtils;
import androidx.core.app.M;
import androidx.lifecycle.V;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.common.export.bean.resp.DialogConfigSettingsResp;
import com.transsnet.palmpay.common.export.dialog.EnableLoginPasswordDialog;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.QueryAddEmailGuideConfigRsp;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.bean.resp.NotificationEmailResp;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.dialog.NotificationEmailDialog;
import com.transsnet.palmpay.send_money.viewmodel.TransferResultViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;
import p042cg.e;
import p042cg.f;
import p141j9.t;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41700b;

    public /* synthetic */ P(TransferResultActivity transferResultActivity, int i7) {
        this.f41699a = i7;
        this.f41700b = transferResultActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        NotificationEmailDialog notificationEmailDialog;
        QueryAddEmailGuideConfigRsp queryAddEmailGuideConfigRsp;
        NotificationEmailDialog notificationEmailDialog2;
        TransferData transferData;
        int i7 = 2;
        TransferResultActivity transferResultActivity = this.f41700b;
        int i10 = 1;
        switch (this.f41699a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CheckPayResp checkPayResp = (CheckPayResp) ((p) it).f27360a;
                        if (checkPayResp.isSuccess()) {
                            PayByOrderResp.DataBean data = checkPayResp.getData();
                            if (data != null) {
                                transferResultActivity.f33248d = data;
                                transferResultActivity.initData();
                            }
                        } else {
                            h.x(transferResultActivity, checkPayResp.getRespMsg());
                            ArrayList arrayList = TransferResultActivity.f33237Z;
                            CoroutineScope coroutineScopeH = V.h(transferResultActivity.l());
                            f fVar = I.f10809a;
                            AbstractC0780y.m(coroutineScopeH, e.f19009c, null, new O(transferResultActivity, null), 2);
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult.isSuccess() && (list = (List) commonBeanResult.data) != null && !list.isEmpty()) {
                            NotificationEmailResp notificationEmailResp = (NotificationEmailResp) list.get(0);
                            Boolean noticeFlag = notificationEmailResp.getNoticeFlag();
                            if (noticeFlag == null) {
                                noticeFlag = Boolean.FALSE;
                            }
                            transferResultActivity.f33256v = noticeFlag;
                            if (Intrinsics.c(notificationEmailResp.getNoticeFlag(), Boolean.TRUE) && !TextUtils.isEmpty(notificationEmailResp.getEmail()) && ((notificationEmailDialog = transferResultActivity.f33250f) == null || !notificationEmailDialog.isShowing())) {
                                NotificationEmailDialog notificationEmailDialog3 = new NotificationEmailDialog(transferResultActivity);
                                transferResultActivity.f33250f = notificationEmailDialog3;
                                notificationEmailDialog3.setData(notificationEmailResp);
                                notificationEmailDialog3.setListner(new V(transferResultActivity));
                                transferResultActivity.showDialog(notificationEmailDialog3, 97);
                            }
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it3).f27360a;
                        if (commonBeanResult2.isSuccess() && (queryAddEmailGuideConfigRsp = (QueryAddEmailGuideConfigRsp) commonBeanResult2.data) != null && !TextUtils.isEmpty(queryAddEmailGuideConfigRsp.addition) && ((notificationEmailDialog2 = transferResultActivity.f33250f) == null || !notificationEmailDialog2.isShowing())) {
                            transferResultActivity.showDialog(h.v(transferResultActivity, queryAddEmailGuideConfigRsp.addition, null, null, 6), 90);
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                        ((n) it3).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof o)) {
                    if (it4 instanceof p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it4).f27360a;
                        DialogConfigSettingsResp dialogConfigSettingsResp = (DialogConfigSettingsResp) commonBeanResult3.data;
                        if (dialogConfigSettingsResp != null) {
                            int style = dialogConfigSettingsResp.getStyle();
                            TransferResultActivity transferResultActivity2 = this.f41700b;
                            if (style == 1) {
                                EnableTouchIdDialog enableTouchIdDialog = new EnableTouchIdDialog(transferResultActivity2);
                                enableTouchIdDialog.setOnEnableTouchIdListener(new U(transferResultActivity2, enableTouchIdDialog));
                                ArrayList arrayList2 = TransferResultActivity.f33237Z;
                                transferResultActivity2.showDialog(enableTouchIdDialog, 96);
                                transferResultActivity2.f33251g = enableTouchIdDialog;
                            } else if (style == 4) {
                                EnableLoginPasswordDialog enableLoginPasswordDialog = new EnableLoginPasswordDialog(transferResultActivity2);
                                enableLoginPasswordDialog.setOnEnableTouchIdListener(S.f41704a);
                                ArrayList arrayList3 = TransferResultActivity.f33237Z;
                                transferResultActivity2.showDialog(enableLoginPasswordDialog, 96);
                                transferResultActivity2.f33251g = enableLoginPasswordDialog;
                            } else if (style != 8) {
                                O6.f fVar2 = transferResultActivity2.f33251g;
                                if (fVar2 == null || !fVar2.isShowing()) {
                                    if (!TextUtils.isEmpty(dialogConfigSettingsResp.getAddition())) {
                                        if (11 == dialogConfigSettingsResp.getStyle()) {
                                            n0.g().u(new ViewEvent("t3_upgrade_electricity_popup_exposure").add("Level", BaseApplication.get().getUser().getMobileMoneyAccountTier()));
                                        }
                                        transferResultActivity2.showDialog(h.v(transferResultActivity2, dialogConfigSettingsResp.getAddition(), new t(commonBeanResult3, transferResultActivity2, 13), null, 4), 96);
                                    }
                                    TransferData transferData2 = transferResultActivity2.f33249e;
                                    if ((transferData2 == null || transferData2.getBusinessType() != 3) && ((transferData = transferResultActivity2.f33249e) == null || transferData.getBusinessType() != 9)) {
                                        transferResultActivity2.s();
                                    } else {
                                        TransferResultViewModel transferResultViewModel = (TransferResultViewModel) transferResultActivity2.l();
                                        transferResultViewModel.getClass();
                                        p140j8.f.s(transferResultViewModel, new J0(1, null), transferResultViewModel.f34037i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                    String strY = b.y("03");
                                    Intrinsics.checkNotNullExpressionValue(strY, "getPopAdSlotIdByTransType(...)");
                                    new InterstitialAdView(strY, new k(27)).show(transferResultActivity2, new C0749x(transferResultActivity2, i7));
                                }
                            } else {
                                boolean zAreNotificationsEnabled = new M(transferResultActivity2).f15943b.areNotificationsEnabled();
                                if (TextUtils.isEmpty(dialogConfigSettingsResp.getAddition())) {
                                    transferResultActivity2.f33251g = io.fastkv.n.O(transferResultActivity2, 0, null, zAreNotificationsEnabled ? "Enable Push Notification" : "Enable System Notifications", null, null, a.x(transferResultActivity2, S6.a.pay_News, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, transferResultActivity2)), null, 48.0f, 116), zAreNotificationsEnabled ? "Enable push notifications to get real-time notifications for transfers, payments & promotions." : "Enable system notifications to get real-time notifications for transfers, payments & promotions.", Integer.valueOf(p025ba.k.core_turn_on), null, new T(zAreNotificationsEnabled, transferResultActivity2), null, null, null, null, false, 0, 8387131);
                                } else {
                                    transferResultActivity2.f33251g = h.v(transferResultActivity2, dialogConfigSettingsResp.getAddition(), new C0748w(zAreNotificationsEnabled, transferResultActivity2, i10), null, 4);
                                }
                                transferResultActivity2.showDialog(transferResultActivity2.f33251g, 96);
                            }
                        }
                    } else if (!(it4 instanceof m)) {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }

    public P(TransferResultActivity transferResultActivity, TransferResultActivity transferResultActivity2) {
        this.f41699a = 3;
        this.f41700b = transferResultActivity2;
    }
}
