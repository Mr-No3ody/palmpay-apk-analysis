package p054dd;

import Fe.M;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import V3.b;
import V3.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.api.Service;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.req.GroupPurchaseReq;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseItem;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseRsp;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeGoupPurchaseSaleView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.core.bean.rsp.PaymentMethodComb;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.bean.update.AppUpdate;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.resp.UnfreezePopupDataResp;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcRepayExitMarketingDialog;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyFlashSaleActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.device.ui.activity.DeviceListActivity;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountV2Resp;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantListRsp;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashResultActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashResultViewModel;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.bean.TransferDetailCompensation;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.teller.bean.DataBundleParams;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.ui.activity.MerchantPaymentListActivity;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import com.transsnet.palmpay.ui.activity.UpdateActivity;
import com.transsnet.palmpay.ui.activity.autodecuct.AutoDeductOrderDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import j4.t;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p002a.a;
import p025ba.k;
import p055de.h;
import p085fd.d;
import p140j8.f;
import p141j9.D;
import p173ld.B;
import p173ld.x;
import p284sb.T;
import p355xf.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35895c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.f35893a = i7;
        this.f35894b = obj;
        this.f35895c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataBundleHomeViewModel dataBundleHomeViewModel;
        TradeRecordDetailActivity tradeRecordDetailActivity;
        Intent intentA;
        UnfreezePopupDataResp.Data data;
        Object obj = this.f35895c;
        Object obj2 = this.f35894b;
        switch (this.f35893a) {
            case 0:
                ArrayList arrayList = Recharge2CashResultActivity.f33131i;
                String str = ((R2COrderDetailResp) obj2).channelErrorCode;
                Recharge2CashResultActivity recharge2CashResultActivity = (Recharge2CashResultActivity) obj;
                if (Intrinsics.c(str, "34000061")) {
                    Recharge2CashResultViewModel recharge2CashResultViewModel = (Recharge2CashResultViewModel) recharge2CashResultActivity.l();
                    recharge2CashResultViewModel.getClass();
                    f.s(recharge2CashResultViewModel, new d(1, null), recharge2CashResultViewModel.f33140g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    n0 n0VarG = n0.g();
                    R2COrderDetailResp r2COrderDetailResp = recharge2CashResultActivity.f33134f;
                    Pair pair = new Pair("orderStatus", r2COrderDetailResp != null ? Integer.valueOf(r2COrderDetailResp.orderStatus) : null);
                    R2COrderDetailResp r2COrderDetailResp2 = recharge2CashResultActivity.f33134f;
                    n0VarG.n("RechargeToCashResultPage_SetSharePinButton", G.g(pair, new Pair("orderNo", r2COrderDetailResp2 != null ? r2COrderDetailResp2.orderNo : null)));
                } else if (Intrinsics.c(str, "34000062")) {
                    R2COrderDetailResp r2COrderDetailResp3 = recharge2CashResultActivity.f33134f;
                    if (r2COrderDetailResp3 != null) {
                        com.palmpay.lib.apm.launchcounter.util.d.x(a.e(new Pair("phone", r2COrderDetailResp3.senderPhoneNo), new Pair("code", r2COrderDetailResp3.biller)), "TariffPlan");
                    }
                    n0 n0VarG2 = n0.g();
                    R2COrderDetailResp r2COrderDetailResp4 = recharge2CashResultActivity.f33134f;
                    Pair pair2 = new Pair("orderStatus", r2COrderDetailResp4 != null ? Integer.valueOf(r2COrderDetailResp4.orderStatus) : null);
                    R2COrderDetailResp r2COrderDetailResp5 = recharge2CashResultActivity.f33134f;
                    n0VarG2.n("RechargeToCashResultPage_MigratePlanButton", G.g(pair2, new Pair("orderNo", r2COrderDetailResp5 != null ? r2COrderDetailResp5.orderNo : null)));
                }
                break;
            case 1:
                HashMap map = new HashMap();
                h hVar = (h) obj2;
                map.put("no_search_result", hVar.f35919c);
                map.put("business_name", hVar.f35918b);
                n0.g().n("search biller no result", map);
                Context context = ((View) obj).getContext();
                y yVar = new y(context);
                yVar.f31325c = r.cv_common_toast_succ;
                yVar.f31323a = context.getString(Pd.f.qt_reported);
                yVar.h();
                break;
            case 2:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                DataBundleParams dataBundleParams = (DataBundleParams) obj2;
                if (dataBundleParams != null) {
                    ((BuyBundleHomePageActivity) obj).p(dataBundleParams.getPaymentItem(), dataBundleParams.getMobileNumber(), Long.valueOf(dataBundleParams.getAmount()), false, dataBundleParams.getSourceCategoryId());
                }
                break;
            case 3:
                int i7 = BuyFlashSaleActivity.f31762f;
                DataBundleParams dataBundleParams2 = (DataBundleParams) obj2;
                if (dataBundleParams2 != null) {
                    DataBundleWalletItemBean paymentItem = dataBundleParams2.getPaymentItem();
                    String mobileNumber = dataBundleParams2.getMobileNumber();
                    long amount = dataBundleParams2.getAmount();
                    BuyFlashSaleActivity buyFlashSaleActivity = (BuyFlashSaleActivity) obj;
                    if (paymentItem != null && mobileNumber != null && (dataBundleHomeViewModel = (DataBundleHomeViewModel) buyFlashSaleActivity.l()) != null) {
                        int i10 = DataBundleHomeViewModel.f31793M;
                        dataBundleHomeViewModel.d(paymentItem, mobileNumber, amount, false, null, TransType.TRANS_TYPE_EX_GRATIA_OTHER);
                        break;
                    }
                }
                break;
            case 4:
                Context context2 = ((p082f9.d) obj2).f36432a;
                if (context2 != null) {
                    io.fastkv.n.O(context2, 0, null, null, null, null, null, ((RealNameAuthInfoRsp) obj).limitUpCopywriter, Integer.valueOf(k.core_ok), null, null, null, null, null, null, false, 0, 8388223);
                }
                break;
            case 5:
                int i11 = MerchantPaymentListActivity.f34496d;
                ((M) ((MerchantPaymentListActivity) obj2).f27350a).unbind(((MerchantListRsp) obj).merchantNo);
                break;
            case 6:
                int i12 = MyAssetsActivity.f34499i;
                n0.g().l("TotalAssetsYesterdayEarnClick");
                GetUserAssetsAmountV2Resp getUserAssetsAmountV2Resp = (GetUserAssetsAmountV2Resp) obj;
                ActivityUtils.startActivity(F.a((MyAssetsActivity) obj2, getUserAssetsAmountV2Resp != null ? getUserAssetsAmountV2Resp.yesterdayEarningsJumpUrl : null));
                break;
            case 7:
                int i13 = UpdateActivity.f34600j;
                UpdateActivity updateActivity = (UpdateActivity) obj2;
                updateActivity.getClass();
                n0.g().k((ClickEvent) C0.G.f("UpgredePageElementClick", "elementName", "PalmPay_Upgrade_Local_Click"));
                i0.c0(((AppUpdate.VersionBean) obj).apkLink);
                updateActivity.finish();
                break;
            case 8:
                int i14 = AutoDeductOrderDetailActivity.f34611A;
                AutoDeductOrderDetailActivity autoDeductOrderDetailActivity = (AutoDeductOrderDetailActivity) obj2;
                autoDeductOrderDetailActivity.getClass();
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    ARouter.getInstance().build("/main/auto_deduct_order_detail").withString("orderId", str2).navigation(autoDeductOrderDetailActivity);
                    autoDeductOrderDetailActivity.finish();
                    break;
                }
                break;
            case 9:
                c cVar = (c) obj2;
                if (cVar == null) {
                    ((t) obj).a();
                } else {
                    b callback = new b(0);
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    cVar.d(null, callback);
                }
                break;
            case 10:
                int i15 = TopupAirtimeActivity.f26495x0;
                GroupPurchaseReq groupPurchaseReq = (GroupPurchaseReq) obj2;
                if (groupPurchaseReq != null) {
                    ((TopupAirtimeActivity) obj).q(groupPurchaseReq, false);
                }
                break;
            case 11:
                int i16 = TopupAirtimeActivity.f26495x0;
                DataBundleParams dataBundleParams3 = (DataBundleParams) obj2;
                if (dataBundleParams3 != null) {
                    ((TopupAirtimeActivity) obj).p(dataBundleParams3.getPaymentItem(), dataBundleParams3.getMobileNumber(), Long.valueOf(dataBundleParams3.getAmount()), false);
                }
                break;
            case 12:
                ((TopupResultActivityV2) obj2).f26531Z.onClick((TextView) ((Bc.k) obj).f749c);
                break;
            case 13:
                DeviceListActivity deviceListActivity = (DeviceListActivity) obj2;
                deviceListActivity.f31826f = (QueryDeviceRsp) obj;
                ARouter.getInstance().build("/account/authentication").navigation(deviceListActivity, DeviceListActivity.f31818i);
                break;
            case 14:
                if (!r0.U0()) {
                    String recipientAccountNumber = ((RecipientListResp.RecipientBean) obj).getRecipientAccountNumber();
                    Context context3 = ((x) obj2).getContext();
                    Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
                    if (activity != null) {
                        ShareDialog shareDialog = new ShareDialog(activity);
                        shareDialog.setSharePhoneNumber(recipientAccountNumber);
                        shareDialog.setShareBusinessTypeWithEntrySource(17, 1);
                        shareDialog.show();
                        break;
                    }
                }
                break;
            case 15:
                int bindingAdapterPosition = ((BaseViewHolder) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    x xVar = (x) obj;
                    int headerLayoutCount = bindingAdapterPosition - xVar.getHeaderLayoutCount();
                    Intrinsics.e(view);
                    xVar.setOnItemChildClick(view, headerLayoutCount);
                    break;
                }
                break;
            case 16:
                if (!r0.U0()) {
                    RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) obj;
                    String phone = recipientBeanV2.getPhone();
                    if (phone == null) {
                        phone = recipientBeanV2.getAccountNo();
                    }
                    Context context4 = ((B) obj2).getContext();
                    Activity activity2 = context4 instanceof Activity ? (Activity) context4 : null;
                    if (activity2 != null) {
                        ShareDialog shareDialog2 = new ShareDialog(activity2);
                        shareDialog2.setSharePhoneNumber(phone);
                        shareDialog2.setShareBusinessTypeWithEntrySource(17, 1);
                        shareDialog2.show();
                        break;
                    }
                }
                break;
            case 17:
                int bindingAdapterPosition2 = ((BaseViewHolder) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition2 != -1) {
                    B b7 = (B) obj;
                    int headerLayoutCount2 = bindingAdapterPosition2 - b7.getHeaderLayoutCount();
                    Intrinsics.e(view);
                    b7.setOnItemChildClick(view, headerLayoutCount2);
                    break;
                }
                break;
            case 18:
                KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                if (((AddScheduleTopUpTaskReq) obj2) != null) {
                    Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                    ARouter aRouter = ARouter.getInstance();
                    Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                    Intrinsics.e(postcardBuild);
                    ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = (ScheduleTopUpAddTaskFragment) obj;
                    r0.x(aRouter, scheduleTopUpAddTaskFragment, postcardBuild, scheduleTopUpAddTaskFragment.f26561o);
                }
                break;
            case 19:
                int i17 = ModelAirtimeGoupPurchaseSaleView.f26602d;
                if (!r0.U0()) {
                    F.g(((ModelAirtimeGoupPurchaseSaleView) obj2).getContext(), ((GroupPurchaseRsp) obj).getLink());
                    n0.g().q(new ClickEvent("AirtimeGoupPurchaseSaleMoreClick"));
                    break;
                }
                break;
            case 20:
                int i18 = ModelAirtimeGoupPurchaseSaleView.f26602d;
                if (!r0.U0()) {
                    ((D) obj2).invoke((GroupPurchaseItem) obj);
                    break;
                }
                break;
            case 21:
                TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
                TransferDetailCompensation transferDetailCompensation = (TransferDetailCompensation) obj2;
                if (!TextUtils.isEmpty(transferDetailCompensation.getIntroduceJumpUrl()) && (intentA = F.a((tradeRecordDetailActivity = (TradeRecordDetailActivity) obj), transferDetailCompensation.getIntroduceJumpUrl())) != null) {
                    tradeRecordDetailActivity.startActivity(intentA);
                    break;
                }
                break;
            case 22:
                TradeRecordDetailActivity.a aVar2 = TradeRecordDetailActivity.f33213B;
                ActivityUtils.startActivity(F.a((TradeRecordDetailActivity) obj2, ((PaymentMethodComb) obj).getJumpUrl()));
                break;
            case 23:
                PayByOrderResp.DataBean dataBean = ((TransferResultActivity) obj2).f33248d;
                if (Intrinsics.c(dataBean != null ? Integer.valueOf(dataBean.payStatus) : null, 1)) {
                    n0.g().l("Transfer_SuccessfulResult_ViewDetails_Click");
                }
                ARouter.getInstance().build("/smorder/detail").withString("orderId", ((TransferData) obj).getOrderNo()).navigation();
                break;
            case 24:
                ArrayList arrayList2 = TransferResultActivity.f33237Z;
                ActivityUtils.startActivity(F.a((TransferResultActivity) obj2, ((TransferDetailCompensation) obj).getIntroduceJumpUrl()));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ArrayList arrayList3 = TransferResultActivity.f33237Z;
                ActivityUtils.startActivity(F.a((TransferResultActivity) obj2, ((TransferData.GuideInfoBean) obj).jumpPath));
                break;
            case 26:
                int i19 = HowToUnfreezeActivity.f28656H;
                u uVar = (u) obj2;
                if (uVar != null && (data = (UnfreezePopupDataResp.Data) uVar.f43987c) != null) {
                    org.chromium.support_lib_boundary.util.b.Q(data.getJumpType(), data.getJumpPath(), data.getJumpParams(), null);
                    ((HowToUnfreezeActivity) obj).finish();
                    break;
                }
                break;
            case 27:
                PayShopPaymentResultActivity.o((PayShopPaymentResultActivity) obj2, "TransferPaymentResultsClick", "ViewDetail");
                QueryOrderDetailRsp queryOrderDetailRsp = (QueryOrderDetailRsp) obj;
                com.palmpay.lib.apm.launchcounter.util.d.x(a.e(new Pair("orderNo", queryOrderDetailRsp.orderNo), new Pair("transType", queryOrderDetailRsp.transType)), "CommonDetail");
                break;
            case 28:
                KProperty[] kPropertyArr3 = SearchMIDActivity.f28782Q;
                T tO = ((SearchMIDActivity) obj2).o();
                String snNo = ((GetRecentMerchantsResp.ListDataBean) obj).snNo;
                Intrinsics.checkNotNullExpressionValue(snNo, "snNo");
                tO.b(snNo);
                break;
            default:
                int i20 = CLRepaymentActivity.f29036w0;
                ((CLRepaymentActivity) obj2).finish();
                ((OcRepayExitMarketingDialog) obj).dismiss();
                break;
        }
    }
}
