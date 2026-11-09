package p054dd;

import C0.G;
import N8.q0;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.ui.ConfirmAirtimeDownTimeActivity;
import com.transsnet.palmpay.airtime.ui.DownTimeTransactionResultActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskStatusActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeGoupPurchaseSaleView;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.activity.OcHomeMobileInstalmentStandaloneActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoRenewTaskStatusActivity;
import com.transsnet.palmpay.device.ui.activity.DeviceDetail2Activity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.ui.activity.BuyEarlyRefundResultActivity;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterActivity;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.ui.activity.me.MeBalanceAccountActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountListActivity;
import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35875a;

    public /* synthetic */ d(int i7) {
        this.f35875a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35875a) {
            case 0:
                ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                i0.b0("/h5/faq/faqList?showTitle=true");
                n0.g().l("RechargeToCashNewHomePage_FAQsIcon");
                break;
            case 1:
                ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                i0.b0("/h5/conditions/ng/airtimeShare?showTitle=true");
                n0.g().l("RechargeToCashNewHomePage_TermsAndConditions");
                break;
            case 2:
                if (view.getTag() instanceof HomePageMenuData) {
                    F.d((HomePageMenuData) view.getTag());
                }
                break;
            case 3:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                ARouter.getInstance().build("/airtime/ussd_top_up_route_page").withString("transType", TransType.TRANS_TYPE_BUNDLE).navigation();
                n0.g().l("Data_Homepage_USSD_Dail_Button");
                break;
            case 4:
                int i7 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                i0.b0("/single-page/auto-renew-data/home");
                n0.g().l("DataAutoRenewResultPage_ManageAutoRenewButton");
                break;
            case 5:
                int i10 = DataBundleAutoRenewTaskStatusActivity.f31766e;
                i0.b0("/single-page/auto-renew-data/home");
                n0.g().l("DataAutoRenewResultPage_ChangeFreqButton");
                break;
            case 6:
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/tier3_quota");
                break;
            case 7:
                int i11 = BuyEarlyRefundResultActivity.f34446d;
                q0.u("/main/home");
                break;
            case 8:
                HomeActivity.a aVar = HomeActivity.f34463H;
                q0.u("/main/dark_mode_setting");
                break;
            case 9:
                int i12 = MyAssetsActivity.f34499i;
                n0.g().l("TotalAssetsSecurityClick");
                com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/security-guarantee"));
                break;
            case 10:
                int i13 = MyAssetsActivity.f34499i;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "FinanceReport");
                break;
            case 11:
                int i14 = TransactionHistoryDownloadFilterActivity.f34581B;
                i0.c0(com.transsnet.palmpay.core.config.d.a(null));
                break;
            case 12:
                int i15 = TransactionHistoryDownloadFilterActivity.f34581B;
                n0.g().l("DLStatement_AddAddress_Click");
                i0.b0("/settings/upgrape-kyc/complete-address");
                break;
            case 13:
                int i16 = AirtimeBillDetailActivity.f26454i;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                break;
            case 14:
                int i17 = AirtimeBillDetailActivity.f26454i;
                break;
            case 15:
                int i18 = ConfirmAirtimeDownTimeActivity.f26466f;
                i0.b0("/h5/conditions/ng/airtime?showTitle=true");
                break;
            case 16:
                int i19 = DownTimeTransactionResultActivity.f26469e;
                n0.g().l("PPay_Airtime_Btn_Complete");
                ARouter.getInstance().build("/main/home").navigation();
                break;
            case 17:
                int i20 = ScheduleTopUpTaskStatusActivity.f26483f;
                i0.b0("/single-page/auto-renew-airtime/home");
                n0.g().l("AirtimeAutoRenewResultPage_ManageAutoRenewButton");
                break;
            case 18:
                int i21 = TopupAirtimeActivity.f26495x0;
                break;
            case 19:
                int i22 = TopupAirtimeActivity.f26495x0;
                n0.g().k((ClickEvent) G.f("airtime_recharge_info_page_element_click", "module_name", "Change Biller"));
                break;
            case 20:
                int i23 = TopupAirtimeActivity.f26495x0;
                ARouter.getInstance().build("/airtime/ussd_top_up_route_page").withString("transType", "04").navigation();
                n0.g().l("Airtime_Homepage_USSD_Dail_Button");
                break;
            case 21:
                int i24 = DeviceDetail2Activity.f31808j;
                break;
            case 22:
                int i25 = CouponPackageResultActivity.f34663o;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                break;
            case 23:
                int i26 = MeBalanceAccountActivity.f34737j;
                i0.c0(com.transsnet.palmpay.core.config.d.c("balanceacct"));
                break;
            case 24:
                if (!r0.U0()) {
                    ARouter.getInstance().build("/airtime/airtime_schedule_topup_task_manager").navigation();
                    n0.g().l("Schedule_Top_Up_Airtime_Homepage_Add_Number");
                    break;
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i27 = ModelAirtimeGoupPurchaseSaleView.f26602d;
                if (!r0.U0()) {
                    i0.b0("/single-page/airtime-group-purchase/home");
                    n0.g().l("AirtimeGoupPurchaseSaleHomeClick");
                    break;
                }
                break;
            case 26:
                int i28 = MinorAccountListActivity.f34767f;
                com.palmpay.lib.apm.launchcounter.util.d.F("/main/minor_account_history_list");
                break;
            case 27:
                int i29 = MinorAccountListActivity.f34767f;
                i0.b0("/h5/conditions/ng/palmpay?showTitle=true");
                break;
            case 28:
                int i30 = HowToUnfreezeActivity.f28656H;
                q0.v("/main/home", "tab", "finance");
                break;
            default:
                int i31 = OcHomeMobileInstalmentStandaloneActivity.f28699e;
                if (!r0.U0()) {
                    i0.c0(com.transsnet.palmpay.core.config.d.c("home"));
                    break;
                }
                break;
        }
    }
}
