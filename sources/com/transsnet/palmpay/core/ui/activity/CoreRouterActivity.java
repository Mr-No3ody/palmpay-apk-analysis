package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import Pa.n0;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.inf.IgnoreAppStartTimeTrack;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import com.transsnet.palmpay.core.provider.IAccountModule;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreRouterActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/callback/SafeLockCheck;", "Lcom/palmpay/lib/apm/inf/IgnoreAppStartTimeTrack;", "<init>", "()V", "com/transsnet/palmpay/core/ui/activity/L", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoreRouterActivity extends BaseActivity implements SafeLockCheck, IgnoreAppStartTimeTrack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L[] f27592a = {new L(true, "3", "water", "/quick_teller/bill_payment_home", "extra_type=0"), new L(true, "4", "electricity", "/quick_teller/bill_payment_home", "extra_type=1"), new L(true, "5", "tv", "/quick_teller/bill_payment_home", "extra_type=2"), new L(true, AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, "bundle", "/quick_teller/buy_bundle_ng", ""), new L(true, "7", "betting", "/quick_teller/betting_home", ""), new L(true, "8", "Internet", "/quick_teller/bill_payment_home", "extra_type=5"), new L(true, "9", "airtime", "/airtime/top_up_airtime", ""), new L(true, TransType.TRANS_TYPE_AIRTIME_LOAN, "WebView", "/common/webview", "deeplink=true"), new L(true, "14", "Send Money", "/send/money", ""), new L(true, "15", "QR scan", "/qrcode/scan", ""), new L(true, "16", "Me", "/main/personal_info", ""), new L(true, "19", "Mall shipping detail", "/coreImpl/expressage_infomation", "orderType=1I"), new L(true, TransType.TRANS_TYPE_P2P_CASH_IN, "OkCard Home", "/credit_score/oc_main_activity", ""), new L(false, "25", "launch Home page with specific page", "/main/home", ""), new L(true, "27", "Refer & Earn", "/refer_earn/homepage", ""), new L(true, TransType.TRANS_TYPE_BIND_BANK_CARD, "Pay Bills", "/app/life_bill_payment_page", ""), new L(true, "29", "Billing cycle", "/credit_score/oc_all_bill_activity", ""), new L(true, "30", "Flexi Cash", "/credit_score/cl_main_activity", ""), new L(true, "32", "Flex Protocol", "/credit_score/oc_protocol_activity", ""), new L(true, "33", "Flex Cash Protocol", "/credit_score/cl_protocol_activity", ""), new L(true, TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT, TransferTrackingUtils.PAGE_TYPE_TO_BANK, "/sm/trans_to_bank", ""), new L(true, TransType.TRANS_TYPE_AIRTIME_DISBURSEMENT, "Exchange Cash Home", "/p2p/exchange_cash", ""), new L(true, "43", "flexi and cash all bill page", "/credit_score/oc_total_bill_activity", ""), new L(true, TransType.TRANS_TYPE_BILLER_INSURANCE, "Flexi cash Home", "/credit_score/cl_main_activity", ""), new L(true, "46", "PayShop Home", "/credit_score/bind_merchant", ""), new L(true, TransType.TRANS_TYPE_FACE_TO_FACE_P2P_CASH_IN, "Withdraw Home", "/cashout/withdraw_home", ""), new L(true, TransType.TRANS_TYPE_FACE_TO_FACE_P2P_CASH_OUT, "CashBox Home", "/manage_money/cash_box_main_activity", ""), new L(true, TransType.TRANS_TYPE_RECEIVE_LUCKY_MONEY, "Bill History", "/credit_score/oc_bill_history_activity", ""), new L(true, TransType.TRANS_TYPE_REFUND_2, "Transaction History", "/main/trans_history", ""), new L(true, "51", "Flexi Repay Order Detail", "/credit_score/oc_repay_order_detail_activity", ""), new L(true, TransType.TRANS_TYPE_PALMFORCE_REWARD, "Flexi Cash Loan Records", "/credit_score/cl_record_activity", ""), new L(true, "55", "CashBox Campaign", "/manage_money/cash_box_campaign_activity", ""), new L(false, TransType.TRANS_TYPE_PAY_VIRTUAL_CARD_FEE, "Sign up", "/account/signup", ""), new L(false, TransType.TRANS_TYPE_FUND_VIRTUAL_CARD, "Log in", "/account/login", ""), new L(true, TransType.TRANS_TYPE_WITHDRAW_VIRTUAL_CARD, "WebView_v2", "/common/webview", "deeplink=true"), new L(true, "99", "RN Home", "/coreImpl/rn_host", ""), new L(true, "100", "SignUpSuccess", "/account/sign_up_success", ""), new L(true, "101", "InstallmentCashOpen", "/credit_score/cs_cl_upgrade_activity", ""), new L(true, "102", "DarkModeSetting", "/main/dark_mode_setting", ""), new L(true, "103", "TransferDetail", "/smorder/detail", ""), new L(true, "104", "TransferToPalmPayInput", "/sm/palmpay_personal_transfer", ""), new L(true, "105", "WithdrawInputAmount", "/sm/withdraw_input_amount", ""), new L(true, "106", "PayShopInputAmount", "/sm/pay_shop_input_amount", ""), new L(true, "107", "FixedSavings", "/manage_money/loading_activity", ""), new L(true, "108", "QuickBetting", "/quick_teller/betting_quickbet_create", ""), new L(true, "109", "MobileInstallment", "/credit_score/oc_home_mobile_installment_standalone_activity", "")};

    public static String l(Uri uri) {
        StringBuilder sb2 = new StringBuilder();
        HashSet hashSet = Pa.F.f7013a;
        String string = uri.toString();
        HashMap map = (TextUtils.isEmpty(string) || !string.contains("?")) ? new HashMap() : Pa.F.i(string.substring(string.indexOf("?") + 1));
        for (String str : map.keySet()) {
            Intrinsics.e(str);
            if (!kotlin.text.y.m(str, "A_", false) || str.length() <= 2) {
                sb2.append(str);
            } else {
                String strSubstring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb2.append(strSubstring);
            }
            sb2.append("=");
            sb2.append((String) map.get(str));
            sb2.append("&");
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (string2.length() <= 1) {
            return null;
        }
        String strSubstring2 = string2.substring(0, string2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        requestLayoutFullScreen();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.callback.SafeLockCheck
    public final boolean ignoreLock() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        L l5;
        String string;
        String stringExtra;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Uri data = getIntent().getData();
            if (data != null) {
                if ("mt.tb".equals(data.getHost())) {
                    String strL = l(data);
                    ActivityUtils.startActivity(this, Pa.F.a(this, !TextUtils.isEmpty(strL) ? C0.G.o("arouter://sm/trans_to_bank?", strL) : "arouter://sm/trans_to_bank"));
                } else if ("palmpay.onelink.me".equals(data.getHost())) {
                    IAccountModule iAccountModule = (IAccountModule) ARouter.getInstance().navigation(IAccountModule.class);
                    if (iAccountModule != null) {
                        iAccountModule.initAppsFlyer(getIntent());
                    }
                    finish();
                } else {
                    String queryParameter = data.getQueryParameter("pageId");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        L[] lArr = this.f27592a;
                        int length = lArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                l5 = null;
                                break;
                            }
                            l5 = lArr[i7];
                            if (Intrinsics.c(l5.f27661a, queryParameter)) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    } else {
                        l5 = null;
                        break;
                    }
                    if (l5 != null) {
                        String str = l5.f27661a;
                        if ((Intrinsics.c(str, TransType.TRANS_TYPE_PAY_VIRTUAL_CARD_FEE) || Intrinsics.c(str, TransType.TRANS_TYPE_FUND_VIRTUAL_CARD)) && BaseApplication.hasLogin()) {
                            i0.H(null);
                            return;
                        }
                        String strL2 = l(data);
                        boolean zIsEmpty = TextUtils.isEmpty(strL2);
                        String str2 = l5.f27663c;
                        String str3 = l5.f27664d;
                        if (zIsEmpty && TextUtils.isEmpty(str3)) {
                            string = C0.G.o("arouter:/", str2);
                        } else if (TextUtils.isEmpty(strL2)) {
                            string = C0.G.p("arouter:/", str2, "?", str3);
                        } else if (TextUtils.isEmpty(str3)) {
                            string = C0.G.p("arouter:/", str2, "?", strL2);
                        } else {
                            StringBuilder sbF = androidx.camera.camera2.internal.F.f("arouter:/", str2, "?", strL2, "&");
                            sbF.append(str3);
                            string = sbF.toString();
                        }
                        if (!l5.f27665e || BaseApplication.hasLogin()) {
                            Intent intentA = Pa.F.a(this, string);
                            if (Intrinsics.c(str, TransType.TRANS_TYPE_AIRTIME_LOAN) && intentA != null && (stringExtra = intentA.getStringExtra("linkUrl")) != null) {
                                if (TextUtils.isEmpty(stringExtra)) {
                                    stringExtra = null;
                                }
                                if (stringExtra != null) {
                                    intentA.putExtra("url", stringExtra);
                                }
                            }
                            if (intentA != null) {
                                ActivityUtils.startActivity(this, intentA, new View[0]);
                            } else {
                                i0.H(null);
                            }
                        } else {
                            i0.K(Constants.DEEPLINK, string);
                        }
                    }
                }
            }
            n0.p(getIntent());
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(com.transsnet.palmpay.custom_view.p.transparent_30)));
    }
}
