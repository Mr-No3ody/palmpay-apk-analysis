package C9;

import Nc.AbstractC0482a;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import com.palmpay.lib.ui.picker.picker.date.BaseDatePickerFragment;
import com.palmpay.lib.ui.picker.picker.date.XDatePickerFragment;
import com.transsnet.palmpay.account.bean.rsp.CheckSecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQResp;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpGuideFragment;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.cash_in.bean.response.WithdrawHomeEntranceBean;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.FlashSaleDataBundleBeanV2;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import com.transsnet.palmpay.custom_view.interfac.OnItemClickListener;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.main.export.bean.req.ThirdAuthorizationCodeReq;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.teller.bean.resp.DataBundleHomeLinkBean;
import com.transsnet.palmpay.ui.activity.detail.MerchantOrderDetailActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1284c;

    public /* synthetic */ V(int i7, Object obj, Object obj2) {
        this.f1282a = i7;
        this.f1283b = obj;
        this.f1284c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView;
        Object obj = this.f1283b;
        Object obj2 = this.f1284c;
        switch (this.f1282a) {
            case 0:
                ActivityUtils.startActivity(Pa.F.a((WithdrawHomeActivity) obj, ((WithdrawHomeEntranceBean) obj2).jumpUrl));
                return;
            case 1:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                T t = commonBeanResult.data;
                if (((CheckSecurityVerifyMethodRsp) t).retryFlag) {
                    return;
                }
                VerifyAccountActivity verifyAccountActivity = (VerifyAccountActivity) obj2;
                if (TextUtils.isEmpty(((CheckSecurityVerifyMethodRsp) t).jumpUrl)) {
                    verifyAccountActivity.setResult(0);
                    return;
                } else {
                    ActivityUtils.startActivity(Pa.F.a(verifyAccountActivity, ((CheckSecurityVerifyMethodRsp) commonBeanResult.data).jumpUrl));
                    return;
                }
            case 2:
                OnItemClickListener onItemClickListener = ((AbstractC0482a) obj2).f6305a;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(obj);
                    return;
                }
                return;
            case 3:
                if (r0.U0()) {
                    return;
                }
                O6.c cVar = new O6.c(((ModelDataPlanFlashSaleItem) obj).getContext());
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj2;
                FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV2 = (FlashSaleDataBundleBeanV2) commonBeanResult2.data;
                cVar.f6596b = O6.d.f(flashSaleDataBundleBeanV2 != null ? flashSaleDataBundleBeanV2.ruleTitle : null);
                FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV3 = (FlashSaleDataBundleBeanV2) commonBeanResult2.data;
                cVar.f6598d = flashSaleDataBundleBeanV3 != null ? flashSaleDataBundleBeanV3.ruleContent : null;
                cVar.f6614u = 3;
                cVar.g();
                return;
            case 4:
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                    return;
                }
                Activity activity = (Activity) ((W9.u) obj2).f10650c.f4984a;
                int i7 = PalmPayContactsSearchActivity.f27238g;
                activity.startActivity(new Intent(activity, (Class<?>) PalmPayContactsSearchActivity.class), ActivityOptions.makeSceneTransitionAnimation(activity, (View) obj, "searchTransition").toBundle());
                return;
            case 5:
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                    return;
                }
                Activity activity2 = (Activity) ((W9.x) obj2).f10654c.f4984a;
                int i10 = PalmPayContactsSearchActivity.f27238g;
                activity2.startActivity(new Intent(activity2, (Class<?>) PalmPayContactsSearchActivity.class), ActivityOptions.makeSceneTransitionAnimation(activity2, (View) obj, "searchTransition").toBundle());
                return;
            case 6:
                View view2 = (View) obj;
                view2.setClickable(false);
                ((X6.b) obj2).dismiss();
                view2.postDelayed(new X6.a(view2, 0), 2000L);
                return;
            case 7:
                View view3 = (View) obj;
                view3.setClickable(false);
                ((X6.g) obj2).invoke();
                view3.postDelayed(new X6.a(view3, 1), 2000L);
                return;
            case 8:
                View view4 = (View) obj;
                view4.setClickable(false);
                ((X6.o) obj2).dismiss();
                view4.postDelayed(new X6.a(view4, 3), 2000L);
                return;
            case 9:
                ((Yb.b) obj2).getClass();
                return;
            case 10:
                View view5 = (View) obj;
                view5.setClickable(false);
                XDatePickerFragment xDatePickerFragment = (XDatePickerFragment) obj2;
                Bc.l lVar = xDatePickerFragment.f24541o;
                if (lVar == null) {
                    Intrinsics.n("pickerBinding");
                    throw null;
                }
                long time = ((TimePickerView) lVar.f755c).getTime();
                BaseDatePickerFragment.DatePickerCallback datePickerCallback = xDatePickerFragment.f24519i;
                if (datePickerCallback != null) {
                    datePickerCallback.positiveAction(time, null);
                }
                view5.postDelayed(new X6.a(view5, 17), 2000L);
                return;
            case 11:
                n0.g().l("PalmPay_CashBoxOld_Go_Click");
                CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                Intent intentA = Pa.F.a(((CashBoxMainFragment) obj).f27319c, (String) obj2);
                if (intentA != null) {
                    ActivityUtils.startActivity(intentA);
                    return;
                }
                return;
            case 12:
                DataBundleHomeLinkBean dataBundleHomeLinkBean = (DataBundleHomeLinkBean) ((CommonBeanResult) obj2).data;
                ActivityUtils.startActivity(Pa.F.a((BuyBundleHomePageActivity) obj, dataBundleHomeLinkBean != null ? dataBundleHomeLinkBean.link : null));
                return;
            case 13:
                if (Intrinsics.c(((CommonResult) obj).getRespMsg(), "A000008")) {
                    int i11 = AirtimeBillDetailActivity.f26454i;
                    Rd.I i12 = (Rd.I) ((AirtimeBillDetailActivity) obj2).f27334c;
                    if (i12 == null || (textView = i12.f8081j) == null) {
                        return;
                    }
                    p220oa.h.c(textView);
                    return;
                }
                return;
            case 14:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                MerchantOrderDetailActivity merchantOrderDetailActivity = (MerchantOrderDetailActivity) obj2;
                ARouter.getInstance().build("/main/merchant_order_detail").withString("orderId", str).navigation(merchantOrderDetailActivity);
                merchantOrderDetailActivity.finish();
                return;
            case 15:
                if (r0.U0()) {
                    return;
                }
                CommonBeanResult commonBeanResult3 = (CommonBeanResult) obj;
                if (!TextUtils.isEmpty(((ScheduleTopUpFAQResp) commonBeanResult3.data).getFaqUrl())) {
                    ActivityUtils.startActivity(Pa.F.a(((ScheduleTopUpGuideFragment) obj2).requireContext(), ((ScheduleTopUpFAQResp) commonBeanResult3.data).getFaqUrl()));
                }
                n0.g().l("Schedule_Top_Up_Airtime_Homepage_Faqs_All");
                return;
            case 16:
                if (r0.U0()) {
                    return;
                }
                CommonBeanResult commonBeanResult4 = (CommonBeanResult) obj;
                if (!TextUtils.isEmpty(((ScheduleTopUpFAQResp) commonBeanResult4.data).getFaqUrl())) {
                    ActivityUtils.startActivity(Pa.F.a(((ScheduleTopUpTaskListFragment) obj2).requireContext(), ((ScheduleTopUpFAQResp) commonBeanResult4.data).getFaqUrl()));
                }
                n0.g().l("Schedule_Top_Up_Airtime_Homepage_Faqs_All");
                return;
            default:
                ThirdAuthorizationCodeReq thirdAuthorizationCodeReq = (ThirdAuthorizationCodeReq) obj;
                String callbackID = thirdAuthorizationCodeReq.getCallbackID();
                int i13 = ThirdPartyMerchantActivity.f34991g;
                ((ThirdPartyMerchantActivity) obj2).m(thirdAuthorizationCodeReq, callbackID);
                return;
        }
    }

    public /* synthetic */ V(Object obj, int i7, Object obj2, boolean z3) {
        this.f1282a = i7;
        this.f1284c = obj;
        this.f1283b = obj2;
    }
}
