package Ce;

import android.os.Bundle;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.bridge.WritableMap;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimData;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Ce.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0181x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1543b;

    public /* synthetic */ C0181x(HomeFragmentHomeTab homeFragmentHomeTab, String str) {
        this.f1542a = 0;
        this.f1543b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i7 = 0;
        String fallbackAccountNo = this.f1543b;
        switch (this.f1542a) {
            case 0:
                ClipboardMatchInfoResp matchInfo = (ClipboardMatchInfoResp) obj;
                int i10 = HomeFragmentHomeTab.f35093A0;
                Intrinsics.checkNotNullParameter(matchInfo, "matchInfo");
                Intrinsics.checkNotNullParameter(fallbackAccountNo, "fallbackAccountNo");
                String accountNo = matchInfo.getAccountNo();
                if (accountNo != null) {
                    String str = StringsKt.F(accountNo) ? null : accountNo;
                    if (str != null) {
                        fallbackAccountNo = str;
                    }
                }
                if (!StringsKt.F(fallbackAccountNo)) {
                    Bundle bundleE = p002a.a.e(new Pair("core_order_source_type", "CLIPBOARD"), new Pair("MEMBER_ID", matchInfo.getPayeeMemberId()), new Pair("extra_data", matchInfo.getPpAccountNo()));
                    String transType = matchInfo.getTransType();
                    if (Intrinsics.c(transType, TransType.TRANS_TYPE_WITHDRAW_TO_AGENT) || Intrinsics.c(transType, TransType.TRANS_TYPE_PAY_SHOP)) {
                        Pa.r0.O0(matchInfo.getTransType(), matchInfo.getBusinessType(), fallbackAccountNo, bundleE);
                    } else {
                        Integer matchType = matchInfo.getMatchType();
                        if (matchType != null && matchType.intValue() == 1) {
                            BankInfo bankInfo = new BankInfo();
                            bankInfo.bankCode = matchInfo.getBankCode();
                            bankInfo.bankName = matchInfo.getBankName();
                            bankInfo.bankUrl = matchInfo.getBankPic();
                            Integer businessType = matchInfo.getBusinessType();
                            if (businessType != null && businessType.intValue() == 9) {
                                i7 = 1;
                            }
                            bankInfo.mmo = i7;
                            ARouter.getInstance().build("/sm/trans_to_bank_confirm").withString("BANK_ACCOUNT_NUMBER", fallbackAccountNo).withParcelable("BANK_CARD_INFO", bankInfo).withString("contact_name", matchInfo.getAccountName()).withString("core_order_source_type", "CLIPBOARD").navigation();
                        } else {
                            if ((matchType != null && matchType.intValue() == 2) || (matchType != null && matchType.intValue() == 5)) {
                                C0.G.z("/sm/trans_to_bank", "core_order_source_type", "CLIPBOARD", "accountNo", fallbackAccountNo);
                            } else if ((matchType != null && matchType.intValue() == 3) || (matchType != null && matchType.intValue() == 4)) {
                                String transType2 = matchInfo.getTransType();
                                if (transType2 == null) {
                                    transType2 = "03";
                                }
                                Integer businessType2 = matchInfo.getBusinessType();
                                Pa.r0.O0(transType2, Integer.valueOf(businessType2 != null ? businessType2.intValue() : 2), fallbackAccountNo, bundleE);
                            }
                        }
                    }
                }
                return Unit.f38893a;
            case 1:
                return PPRNBridge.commonShareDialog$lambda$15$lambda$14(fallbackAccountNo, (WritableMap) obj);
            case 2:
                QueryCouponClaimData queryCouponClaimData = (QueryCouponClaimData) obj;
                int i11 = ModelClaimCouponListItemView.f28296e;
                return Boolean.valueOf(Intrinsics.c(queryCouponClaimData != null ? queryCouponClaimData.getCouponCode() : null, fallbackAccountNo));
            case 3:
                return Boolean.valueOf(ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$8(fallbackAccountNo, (String) obj));
            default:
                CommonStringResult response = (CommonStringResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccess()) {
                    String strSubstring = fallbackAccountNo.substring(1, 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strSubstring2 = fallbackAccountNo.substring(5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    PhoneUtils.sendSms(N8.q0.k("+", strSubstring, strSubstring2), response.data);
                } else {
                    ToastUtils.showShort(response.getRespMsg(), new Object[0]);
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ C0181x(String str, int i7) {
        this.f1542a = i7;
        this.f1543b = str;
    }
}
