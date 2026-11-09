package p052da;

import Ac.e;
import Ac.h;
import Bc.s;
import Ce.p0;
import N8.q0;
import O6.c;
import O6.d;
import Pa.C0525w;
import Pa.F;
import Pa.n0;
import Pa.r0;
import Pe.C0543o;
import Pe.H;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckWithFaceRecognitionFragment;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelApplyOkCard;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelItemFee;
import com.flexibank.sdk.customview.FlexiBankPinEntryView;
import com.flexibank.sdk.o;
import com.flexibank.sdk.q;
import com.google.api.Service;
import com.google.gson.Gson;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.ui.DownTimeTransactionResultActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskManagerActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.MemberAddressBean;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.device.ui.activity.DeviceDetail2Activity;
import com.transsnet.palmpay.device.ui.activity.DeviceListActivity;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemTipsBean;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;
import com.transsnet.palmpay.ui.activity.GetCoinRewardsActivity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.ui.activity.PalmPayStatementActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterTypeActivity;
import com.transsnet.palmpay.ui.activity.autodecuct.AutoDeductOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.bankcard.AddCardCompleteActivity;
import com.transsnet.palmpay.ui.activity.bankcard.BankAccountDetailActivity;
import com.transsnet.palmpay.ui.activity.bankcard.BankCardDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.BuyEarlyRefundDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.CommissionDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.DisbursementOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.InterBankCashInOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.RefundStatementDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.viewmodule.BuyEarlyRefundDetailViewModel;
import com.transsnet.palmpay.viewmodule.InterBankCashInOrderDetailViewModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p059e1.a;
import p102ge.y;
import p130ic.C;
import p130ic.r;
import p140j8.f;
import p355xf.t;

/* JADX INFO: renamed from: da.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1649v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35818b;

    public /* synthetic */ ViewOnClickListenerC1649v(Object obj, int i7) {
        this.f35817a = i7;
        this.f35818b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataBundleWalletFragment dataBundleWalletFragment;
        Context context;
        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean;
        Integer bundleCategoryId;
        ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem;
        DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean;
        int i7 = 8;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.f35818b;
        switch (this.f35817a) {
            case 0:
                CashierSelectPayMethodDialog.CallBack callBack = ((C1650w) obj).f35821c;
                if (callBack != null) {
                    callBack.onAddNewBankCardOrBankAccountClick();
                }
                break;
            case 1:
                ((D) obj).f35676b.chooseImg();
                break;
            case 2:
                if (!r0.U0() && (context = (dataBundleWalletFragment = (DataBundleWalletFragment) obj).getContext()) != null && (dataBundleWalletCategoryBean = dataBundleWalletFragment.f31773C) != null && (bundleCategoryId = dataBundleWalletCategoryBean.getBundleCategoryId()) != null) {
                    int iIntValue = bundleCategoryId.intValue();
                    t tVar = dataBundleWalletFragment.f31779w;
                    String billerName = (String) tVar.getValue();
                    if (StringsKt.F(billerName)) {
                        billerName = null;
                    }
                    if (billerName != null) {
                        ArrayList arrayListZ = CollectionsKt.Z(dataBundleWalletFragment.u().f11179f);
                        DataBundleExtraItemInfo dataBundleExtraItemInfoD = ((C) dataBundleWalletFragment.f31777p.getValue()).d((String) tVar.getValue());
                        ArrayList<DataBundleWalletItemTipsBean> bundleTips = dataBundleExtraItemInfoD != null ? dataBundleExtraItemInfoD.getBundleTips() : null;
                        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean2 = dataBundleWalletFragment.f31773C;
                        String bundleCategoryName = dataBundleWalletCategoryBean2 != null ? dataBundleWalletCategoryBean2.getBundleCategoryName() : null;
                        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean3 = dataBundleWalletFragment.f31773C;
                        DataBundleWalletDialog dataBundleWalletDialog = new DataBundleWalletDialog(context, arrayListZ, bundleTips, bundleCategoryName, dataBundleWalletCategoryBean3 != null ? dataBundleWalletCategoryBean3.getBillerName() : null, (String) dataBundleWalletFragment.f31771A.getValue(), dataBundleWalletFragment.u().f11176c, dataBundleWalletFragment.u().f11178e);
                        dataBundleWalletDialog.setOnDismissListener(new p0(i7, dataBundleWalletFragment, dataBundleWalletDialog));
                        dataBundleWalletFragment.f31775L = dataBundleWalletDialog;
                        dataBundleWalletDialog.show();
                        DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) dataBundleWalletFragment.f31778v.getValue();
                        dataBundleHomeViewModel.getClass();
                        Intrinsics.checkNotNullParameter(billerName, "billerName");
                        if (BaseApplication.hasLogin() && !StringsKt.F(billerName)) {
                            f.s(dataBundleHomeViewModel, new r(iIntValue, billerName, null), dataBundleHomeViewModel.f31801g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            break;
                        }
                    }
                }
                break;
            case 3:
                GetCoinRewardsActivity getCoinRewardsActivity = (GetCoinRewardsActivity) obj;
                if (!TextUtils.isEmpty(getCoinRewardsActivity.f34461c)) {
                    ActivityUtils.startActivity(F.a(getCoinRewardsActivity, getCoinRewardsActivity.f34461c));
                    getCoinRewardsActivity.finish();
                } else {
                    getCoinRewardsActivity.finish();
                }
                break;
            case 4:
                int i12 = LifeBillsHomeActivity.f34485A;
                int id2 = view.getId();
                if (id2 == e.ma_biller_search_item) {
                    q0.u("/quick_teller/biller_search_page");
                } else if (id2 == e.tv_edit_favourites) {
                    LifeBillsHomeActivity lifeBillsHomeActivity = (LifeBillsHomeActivity) obj;
                    Intent intent = new Intent(lifeBillsHomeActivity, (Class<?>) BillPaymentEditActivity.class);
                    intent.putExtra("key_json_menu_item_list", ((Gson) C0525w.f().f7166b).toJson(lifeBillsHomeActivity.f34486d));
                    lifeBillsHomeActivity.getF28604i().f(intent, new y(lifeBillsHomeActivity, i10));
                }
                break;
            case 5:
                PalmPayStatementActivity palmPayStatementActivity = (PalmPayStatementActivity) obj;
                if (palmPayStatementActivity.f34514d.getVisibility() != 0) {
                    palmPayStatementActivity.f34512b.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.transsnet.palmpay.custom_view.r.cv_arrow_drop_down, 0);
                    palmPayStatementActivity.f34514d.setVisibility(0);
                    palmPayStatementActivity.f34516f.setVisibility(0);
                    palmPayStatementActivity.f34518i.setVisibility(0);
                } else {
                    palmPayStatementActivity.f34512b.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up, 0);
                    palmPayStatementActivity.f34514d.setVisibility(8);
                    palmPayStatementActivity.f34516f.setVisibility(8);
                    palmPayStatementActivity.f34518i.setVisibility(8);
                }
                break;
            case 6:
                int i13 = TransactionHistoryDownloadFilterActivity.f34581B;
                n0.g().l("DLStatement_AddressImport_Click");
                TransactionHistoryDownloadFilterActivity transactionHistoryDownloadFilterActivity = (TransactionHistoryDownloadFilterActivity) obj;
                if (transactionHistoryDownloadFilterActivity.f34582A != null) {
                    Intrinsics.checkNotNullParameter("key_show_transaction_address", "key");
                    if (SPUtils.getInstance(a.G("key_show_transaction_address")).getBoolean(p367ya.a.d().e("key_show_transaction_address"), true)) {
                        a.Z("key_show_transaction_address", false);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(transactionHistoryDownloadFilterActivity.getResources().getString(h.main_address_info_top));
                        sb2.append(" [");
                        MemberAddressBean memberAddressBean = transactionHistoryDownloadFilterActivity.f34582A;
                        sb2.append(memberAddressBean != null ? memberAddressBean.street : null);
                        sb2.append(", ");
                        MemberAddressBean memberAddressBean2 = transactionHistoryDownloadFilterActivity.f34582A;
                        sb2.append(memberAddressBean2 != null ? memberAddressBean2.areaName : null);
                        sb2.append(", ");
                        MemberAddressBean memberAddressBean3 = transactionHistoryDownloadFilterActivity.f34582A;
                        sb2.append(memberAddressBean3 != null ? memberAddressBean3.lgaName : null);
                        sb2.append(", ");
                        MemberAddressBean memberAddressBean4 = transactionHistoryDownloadFilterActivity.f34582A;
                        sb2.append(memberAddressBean4 != null ? memberAddressBean4.stateName : null);
                        sb2.append("]. ");
                        sb2.append(transactionHistoryDownloadFilterActivity.getResources().getString(h.main_you_can_modify_add));
                        c cVar = new c(transactionHistoryDownloadFilterActivity);
                        cVar.f6596b = d.f("Confirm Address");
                        cVar.f6605k = true;
                        cVar.f6600f = transactionHistoryDownloadFilterActivity.getResources().getString(k.core_confirm);
                        cVar.f6602h = null;
                        cVar.f6598d = sb2.toString();
                        cVar.a().show();
                    }
                } else {
                    s sVar = transactionHistoryDownloadFilterActivity.f34583c;
                    if (sVar != null) {
                        ((IconicsCheckBox) sVar.f829B).setChecked(false);
                    }
                    n0.g().v("DLStatement_NoAddress_View");
                    c cVar2 = new c(transactionHistoryDownloadFilterActivity);
                    cVar2.f6596b = d.f("No Address");
                    p054dd.d dVar = new p054dd.d(12);
                    cVar2.f6600f = "Add Address";
                    cVar2.f6602h = dVar;
                    cVar2.f6598d = transactionHistoryDownloadFilterActivity.getResources().getString(h.main_please_complete);
                    cVar2.a().show();
                }
                break;
            case 7:
                TransactionHistoryDownloadFilterTypeActivity transactionHistoryDownloadFilterTypeActivity = (TransactionHistoryDownloadFilterTypeActivity) obj;
                if (!Intrinsics.c(transactionHistoryDownloadFilterTypeActivity.f34598d, FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE)) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("key", transactionHistoryDownloadFilterTypeActivity.f34599e);
                    intent2.putExtra("value", transactionHistoryDownloadFilterTypeActivity.f34598d);
                    transactionHistoryDownloadFilterTypeActivity.setResult(-1, intent2);
                    transactionHistoryDownloadFilterTypeActivity.finish();
                }
                break;
            case 8:
                int i14 = ModelDataBundleHighlyRecommendItem.f31780B;
                if (!r0.U0() && (dataBundleHighlyRecommendItemBean = (modelDataBundleHighlyRecommendItem = (ModelDataBundleHighlyRecommendItem) obj).t) != null) {
                    n0.g().n("data_home_topoffer_click", modelDataBundleHighlyRecommendItem.c(dataBundleHighlyRecommendItemBean));
                    Function1 function1 = modelDataBundleHighlyRecommendItem.f31790p;
                    if (function1 != null) {
                        function1.invoke(dataBundleHighlyRecommendItemBean);
                    }
                }
                break;
            case 9:
                AutoDeductOrderDetailActivity autoDeductOrderDetailActivity = (AutoDeductOrderDetailActivity) obj;
                autoDeductOrderDetailActivity.n(autoDeductOrderDetailActivity.f34612a);
                break;
            case 10:
                int i15 = AddCardCompleteActivity.f34625f;
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ADD_NEW_BANK_CARD));
                ((AddCardCompleteActivity) obj).finish();
                break;
            case 11:
                BankAccountDetailActivity.a aVar = BankAccountDetailActivity.f34631f;
                ARouter.getInstance().build("/account/authentication").navigation((BankAccountDetailActivity) obj, 100);
                break;
            case 12:
                int i16 = BankCardDetailActivity.f34641p;
                BankCardDetailActivity bankCardDetailActivity = (BankCardDetailActivity) obj;
                bankCardDetailActivity.getClass();
                ARouter.getInstance().build("/account/authentication").navigation(bankCardDetailActivity, 100);
                break;
            case 13:
                FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment = ((j4.t) obj).f38315b;
                if (flexiBankCheckWithFaceRecognitionFragment != null) {
                    flexiBankCheckWithFaceRecognitionFragment.onFailed(null, "User denied camera permission.");
                }
                break;
            case 14:
                Context context2 = (Context) obj;
                if (context2 instanceof Activity) {
                    ((Activity) context2).finish();
                }
                break;
            case 15:
                int i17 = AirtimeBillDetailActivity.f26454i;
                String str = p070ee.c.f36289a;
                AirtimeDetailData airtimeDetailData = (AirtimeDetailData) obj;
                p070ee.c.k(airtimeDetailData.getIcon(), airtimeDetailData);
                break;
            case 16:
                int i18 = AirtimeBillDetailActivity.f26454i;
                AirtimeBillDetailActivity airtimeBillDetailActivity = (AirtimeBillDetailActivity) obj;
                d.f(airtimeBillDetailActivity.getString(Pd.f.qt_apply_refund));
                airtimeBillDetailActivity.getString(k.core_cancel);
                airtimeBillDetailActivity.getString(k.core_confirm);
                break;
            case 17:
                int i19 = DownTimeTransactionResultActivity.f26469e;
                ActivityUtils.finishToActivity((Class<?>) TopupAirtimeActivity.class, false);
                n0.g().l("PPay_Airtime_Btn_Top up Airtime");
                ((DownTimeTransactionResultActivity) obj).finish();
                break;
            case 18:
                int i20 = ScheduleTopUpTaskManagerActivity.f26476o;
                ((ScheduleTopUpTaskManagerActivity) obj).getOnBackPressedDispatcher().d();
                break;
            case 19:
                int i21 = DeviceDetail2Activity.f31808j;
                n0.g().l("PalmPay_DeviceRemoveSubmitClick");
                int request_delete_authentication = DeviceListActivity.f31817g.getREQUEST_DELETE_AUTHENTICATION();
                DeviceDetail2Activity deviceDetail2Activity = (DeviceDetail2Activity) obj;
                deviceDetail2Activity.getClass();
                ARouter.getInstance().build("/account/authentication").navigation(deviceDetail2Activity, request_delete_authentication);
                break;
            case 20:
                int i22 = FlexiBankModelApplyOkCard.f22094f;
                FlexiBankModelApplyOkCard flexiBankModelApplyOkCard = (FlexiBankModelApplyOkCard) obj;
                flexiBankModelApplyOkCard.getClass();
                p062e4.a.d(flexiBankModelApplyOkCard, false);
                break;
            case 21:
                int i23 = FlexiBankModelItemFee.f22121A;
                FlexiBankModelItemFee flexiBankModelItemFee = (FlexiBankModelItemFee) obj;
                if (!TextUtils.isEmpty(flexiBankModelItemFee.f22130j)) {
                    Context context3 = flexiBankModelItemFee.f22122a;
                    Intrinsics.checkNotNullParameter(context3, "mContext");
                    String strValueOf = String.valueOf(flexiBankModelItemFee.f22130j);
                    int i24 = flexiBankModelItemFee.f22134w;
                    int i25 = q.fb_tips_dialog;
                    Intrinsics.checkNotNullParameter(context3, "context");
                    p215o4.c cVar3 = new p215o4.c(context3, i25, 4, i11);
                    cVar3.f40026e = strValueOf;
                    cVar3.f40027f = i24;
                    cVar3.show();
                    break;
                }
                break;
            case 22:
                int i26 = BuyEarlyRefundDetailActivity.f34671f;
                BuyEarlyRefundDetailActivity buyEarlyRefundDetailActivity = (BuyEarlyRefundDetailActivity) obj;
                BuyEarlyRefundDetailViewModel buyEarlyRefundDetailViewModel = (BuyEarlyRefundDetailViewModel) buyEarlyRefundDetailActivity.l();
                String str2 = buyEarlyRefundDetailActivity.f34672c;
                buyEarlyRefundDetailViewModel.getClass();
                f.s(buyEarlyRefundDetailViewModel, new C0543o(str2, null), buyEarlyRefundDetailViewModel.f35361e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            case 23:
                CommissionDetailActivity commissionDetailActivity = (CommissionDetailActivity) obj;
                if (TransType.TRANS_TYPE_MERCHANT_PAYMENT.equals(commissionDetailActivity.t)) {
                    ARouter.getInstance().build("/main/merchant_order_detail").withString("orderId", commissionDetailActivity.f34687v).navigation();
                }
                break;
            case 24:
                DisbursementOrderDetailActivity disbursementOrderDetailActivity = (DisbursementOrderDetailActivity) obj;
                disbursementOrderDetailActivity.n(disbursementOrderDetailActivity.f34689a);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i27 = InterBankCashInOrderDetailActivity.f34699f;
                InterBankCashInOrderDetailActivity interBankCashInOrderDetailActivity = (InterBankCashInOrderDetailActivity) obj;
                InterBankCashInOrderDetailViewModel interBankCashInOrderDetailViewModel = (InterBankCashInOrderDetailViewModel) interBankCashInOrderDetailActivity.l();
                String str3 = interBankCashInOrderDetailActivity.f34700c;
                String str4 = interBankCashInOrderDetailActivity.f34701d;
                interBankCashInOrderDetailViewModel.getClass();
                f.s(interBankCashInOrderDetailViewModel, new H(str3, str4, null), interBankCashInOrderDetailViewModel.f35374e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            case 26:
                int i28 = RefundStatementDetailActivity.f34733f;
                ((RefundStatementDetailActivity) obj).n();
                break;
            case 27:
                FlexiBankPinEntryView flexiBankPinEntryView = (FlexiBankPinEntryView) obj;
                boolean z3 = flexiBankPinEntryView.f22169r0;
                flexiBankPinEntryView.f22169r0 = !z3;
                ImageView imageView = flexiBankPinEntryView.ivHide;
                if (imageView != null) {
                    imageView.setImageResource(!z3 ? o.fb_hide_psw : o.fb_show_psw);
                }
                EditText editText = flexiBankPinEntryView.editText;
                if (editText != null) {
                    flexiBankPinEntryView.b(editText.getEditableText());
                }
                break;
            case 28:
                ((p173ld.d) obj).f39330e.B();
                break;
            default:
                QueryMemberDetailResp.Data data = (QueryMemberDetailResp.Data) obj;
                r0.O0(data.transType, Integer.valueOf(data.businessType), data.accountNo, p002a.a.e(new Pair("core_order_source_type", (TextUtils.equals(TransType.TRANS_TYPE_PAY_SHOP, data.transType) && TextUtils.equals(TransType.TRANS_TYPE_WITHDRAW_TO_AGENT, data.transType)) ? "TOPALMPAY" : "COMMON"), new Pair("MEMBER_ID", data.memberId), !TextUtils.isEmpty(data.ppAccountNo) ? new Pair("extra_data", data.ppAccountNo) : new Pair("extra_data", null)));
                break;
        }
    }
}
