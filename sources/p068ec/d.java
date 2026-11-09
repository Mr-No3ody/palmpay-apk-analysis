package p068ec;

import L6.b;
import L6.g;
import P6.a;
import Pa.C0525w;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.utils.n;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.Service;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.betting.ui.activity.BettingHistoryActivity;
import com.transsnet.palmpay.betting.ui.fragment.BettingHistoryFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.credit.ui.activity.AliFaceActivity;
import com.transsnet.palmpay.credit.ui.activity.MonoConnectActivity;
import com.transsnet.palmpay.credit.ui.activity.PastShopListActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentUpGradeResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentListActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAuthActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillHistoryActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcIncreaseRecordActivity;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import com.transsnet.palmpay.send_money.ui.activity.AddBeneficiaryActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.GetCoinRewardsActivity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeTransactionResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p102ge.z;
import p130ic.i;
import p133ig.e;
import p133ig.h;
import p140j8.f;
import p141j9.C1798f;
import p155k9.q;
import p162kg.K;
import p162kg.L;
import p223od.v;
import p294tb.A0;
import t9.c;
import t9.l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36252b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f36251a = i7;
        this.f36252b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewStub viewStub;
        int i7 = 1;
        int i10 = 0;
        Object obj = this.f36252b;
        switch (this.f36251a) {
            case 0:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) obj;
                buyBundleHomePageActivity.getClass();
                if (BaseApplication.hasLogin()) {
                    ((DataBundleRecordHistoryViewModel) buyBundleHomePageActivity.f31760v.getValue()).e();
                }
                ((DataBundleHomeViewModel) buyBundleHomePageActivity.l()).j();
                ((DataBundleHomeViewModel) buyBundleHomePageActivity.l()).i(buyBundleHomePageActivity.s());
                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                dataBundleHomeViewModel.getClass();
                f.s(dataBundleHomeViewModel, new i(1, null), dataBundleHomeViewModel.f31806v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return Unit.f38893a;
            case 1:
                GetCoinRewardsActivity.a aVar = GetCoinRewardsActivity.f34458e;
                a aVar2 = new a((GetCoinRewardsActivity) obj, g.lib_ui_toast_loading);
                aVar2.f6999e = 0;
                aVar2.f6998d = "loading";
                return aVar2;
            case 2:
                int i11 = LifeBillsHomeActivity.f34485A;
                LifeBillsHomeActivity lifeBillsHomeActivity = (LifeBillsHomeActivity) obj;
                String str = lifeBillsHomeActivity.f34493p;
                String str2 = lifeBillsHomeActivity.t;
                if (str2 != null) {
                    Long.parseLong(str2);
                }
                CustomFloatingView customFloatingView = new CustomFloatingView(lifeBillsHomeActivity, str);
                customFloatingView.setCallBack(new z(lifeBillsHomeActivity));
                B5.d.a().customView(customFloatingView);
                return customFloatingView;
            case 3:
                e eVar = (e) obj;
                return Integer.valueOf(L.d(eVar, eVar.f37618k));
            case 4:
                TopUpRecordActivity.a aVar3 = TopUpRecordActivity.f26486p;
                return new q((TopUpRecordActivity) obj);
            case 5:
                CouponPackageResultActivity couponPackageResultActivity = (CouponPackageResultActivity) obj;
                if (couponPackageResultActivity.f34668g == null) {
                    Bc.f fVar = couponPackageResultActivity.f34670j;
                    couponPackageResultActivity.f34668g = (fVar == null || (viewStub = (ViewStub) fVar.f696b) == null) ? null : viewStub.inflate();
                }
                View view = couponPackageResultActivity.f34668g;
                if (view != null) {
                    return (TransactionResultHeaderModel) view.findViewById(Ac.e.v_header);
                }
                return null;
            case 6:
                return n.c("kotlin.Unit", h.f37625d, new SerialDescriptor[0], new C1798f((K) obj, 6));
            case 7:
                return AbstractC1859i.a((Object[]) obj);
            case 8:
                return WeekAndDaySelectDialog.wheelView_delegate$lambda$1((WeekAndDaySelectDialog) obj);
            case 9:
                KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = (ScheduleTopUpAddTaskFragment) obj;
                Context contextRequireContext = scheduleTopUpAddTaskFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                WeekAndDaySelectDialog weekAndDaySelectDialog = new WeekAndDaySelectDialog(contextRequireContext);
                weekAndDaySelectDialog.setCallBack(new m9.f(scheduleTopUpAddTaskFragment));
                return weekAndDaySelectDialog;
            case 10:
                int i12 = PayCodeTransactionResultActivity.f34792A;
                C0525w c0525wF = C0525w.f();
                String str3 = ((PayCodeTransactionResultActivity) obj).f34793c;
                c0525wF.getClass();
                return (PayByOrderResp.DataBean) C0525w.d(str3, PayByOrderResp.DataBean.class);
            case 11:
                int i13 = AddBeneficiaryActivity.f33147b;
                return (PpTitleBar) ((AddBeneficiaryActivity) obj).findViewById(p159kd.e.title_bar);
            case 12:
                ArrayList arrayList = TransferResultActivity.f33237Z;
                ToastUtils.showLong("Successfully added to Favorites", new Object[0]);
                TransferResultActivity transferResultActivity = (TransferResultActivity) obj;
                p223od.g gVar = (p223od.g) transferResultActivity.f27334c;
                if (gVar != null) {
                    LinearLayout linearLayout = gVar.f40345b;
                    IconicsImageView iconicsImageView = gVar.f40347d;
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(transferResultActivity, S6.a.pay_Like);
                    iconicsDrawable.a(new p270rd.K(transferResultActivity, 2));
                    iconicsImageView.setImageDrawable(iconicsDrawable);
                    p223od.g gVar2 = (p223od.g) transferResultActivity.f27334c;
                    if (gVar2 != null) {
                        gVar2.t.setText("Favorite Added");
                    }
                    linearLayout.setEnabled(false);
                }
                return Unit.f38893a;
            case 13:
                int i14 = BettingHistoryActivity.f26658e;
                BettingHistoryActivity activity = (BettingHistoryActivity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                t9.e eVar2 = new t9.e(activity);
                eVar2.f42360o = 1;
                return eVar2;
            case 14:
                int i15 = AliFaceActivity.f28651i;
                return (PpTitleBar) ((AliFaceActivity) obj).findViewById(Ya.e.title_bar);
            case 15:
                int i16 = MonoConnectActivity.f28694q0;
                return (PpTitleBar) ((MonoConnectActivity) obj).findViewById(Ya.e.titleBar);
            case 16:
                int i17 = PastShopListActivity.f28701j;
                return (RecyclerView) ((PastShopListActivity) obj).findViewById(Ya.e.rv_past_shop);
            case 17:
                int i18 = ReferEarnCommentListActivity.f31856i;
                return (SwipeRecyclerView) ((ReferEarnCommentListActivity) obj).findViewById(p236pc.d.commentList);
            case 18:
                return G8.a.x(((l) obj).getContext(), S6.a.pay_Image, null, Integer.valueOf(b.ppColorTextDisable), 80.0f, 50);
            case 19:
                int i19 = CLInstallmentUpGradeResultActivity.f28931j;
                return new com.transsnet.adsdk.widgets.banner.bannerview.b((CLInstallmentUpGradeResultActivity) obj, 29);
            case 20:
                int i20 = CLRepaymentListActivity.f29103p;
                return (RecyclerView) ((CLRepaymentListActivity) obj).findViewById(Ya.e.repayment_rv);
            case 21:
                int i21 = UpgradeInstallmentTransParentActivity.f29187u0;
                return new A0((UpgradeInstallmentTransParentActivity) obj, i7);
            case 22:
                return ExtendFeature.facingDetectThresholdObj_delegate$lambda$1((ExtendFeature) obj);
            case 23:
                int i22 = OcAuthActivity.f29323g;
                return (Button) ((OcAuthActivity) obj).findViewById(Ya.e.auth_bt);
            case 24:
                int i23 = OcBillActivity.f29339f;
                return (PpTitleBar) ((OcBillActivity) obj).findViewById(Ya.e.oc_bill_mtb);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i24 = OcBillHistoryActivity.f29357j;
                return (RecyclerView) ((OcBillHistoryActivity) obj).findViewById(Ya.e.oc_bill_history_rv);
            case 26:
                int i25 = OcFeedbackListActivity.f29454g;
                return (RecyclerView) ((OcFeedbackListActivity) obj).findViewById(Ya.e.feedback_rv);
            case 27:
                int i26 = OcIncreaseRecordActivity.f29503g;
                return (RecyclerView) ((OcIncreaseRecordActivity) obj).findViewById(Ya.e.oc_bill_history_rv);
            case 28:
                int i27 = ScheduleTransferOrderDetailActivity.f33409p;
                View viewInflate = ((ScheduleTransferOrderDetailActivity) obj).getLayoutInflater().inflate(p159kd.f.sm_layout_schedule_transfer_order_detail_header, (ViewGroup) null);
                int i28 = p159kd.e.llInfo;
                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i28, viewInflate);
                if (linearLayout2 != null) {
                    i28 = p159kd.e.llNextOrder;
                    LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i28, viewInflate);
                    if (linearLayout3 != null) {
                        i28 = p159kd.e.tvHistoryTitle;
                        TextView textView = (TextView) p059e1.a.m(i28, viewInflate);
                        if (textView != null) {
                            return new v((LinearLayout) viewInflate, linearLayout2, linearLayout3, textView);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i28)));
            default:
                int i29 = BettingHistoryFragment.f26727A;
                return Intrinsics.c(((BettingHistoryFragment) obj).v(), TransType.TRANS_TYPE_MERCHANT_PAYMENT) ? new c(i7) : new c(i10);
        }
    }
}
