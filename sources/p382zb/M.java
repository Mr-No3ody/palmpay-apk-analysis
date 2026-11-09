package p382zb;

import Pa.C0525w;
import Pa.n0;
import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideFragment;
import kotlin.Unit;
import p186mb.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcGuideFragment f44536b;

    public /* synthetic */ M(OcGuideFragment ocGuideFragment, int i7) {
        this.f44535a = i7;
        this.f44536b = ocGuideFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer flexiRemainingDays;
        OcGuideFragment ocGuideFragment = this.f44536b;
        switch (this.f44535a) {
            case 0:
                int i7 = OcGuideFragment.f30422H;
                BaseActivity baseActivity = (BaseActivity) ocGuideFragment.getActivity();
                if (baseActivity != null) {
                    baseActivity.goBackToHome();
                }
                break;
            default:
                int i10 = OcGuideFragment.f30422H;
                if (BaseApplication.hasLogin()) {
                    b.f39631b.getInstance().f39633a = 1;
                    OkCardMainPageRspData okCardMainPageRspData = ocGuideFragment.f30369o;
                    if (((okCardMainPageRspData == null || (flexiRemainingDays = okCardMainPageRspData.getFlexiRemainingDays()) == null) ? 0 : flexiRemainingDays.intValue()) > 0) {
                        OkCardMainPageRspData okCardMainPageRspData2 = ocGuideFragment.f30369o;
                        String str = "Please try again after " + (okCardMainPageRspData2 != null ? okCardMainPageRspData2.getFlexiRemainingDays() : null) + " days";
                        Integer num = ocGuideFragment.f30368j;
                        ARouter.getInstance().build("/credit_score/oc_apply_result_activity").withString("oc_apply_result", ((Gson) C0525w.f().f7166b).toJson(new OcApplyResultData("", 2, 0L, 0L, 0L, str, Integer.valueOf(num != null ? num.intValue() : 2), "", null))).navigation();
                    } else {
                        OkCardMainPageRspData okCardMainPageRspData3 = ocGuideFragment.f30369o;
                        if ((okCardMainPageRspData3 != null ? okCardMainPageRspData3.getWallet() : null) == null) {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_protocol_activity");
                            Integer num2 = ocGuideFragment.f30368j;
                            Postcard postcardWithInt = postcardBuild.withInt("oc_apply_source", num2 != null ? num2.intValue() : 2);
                            Bundle arguments = ocGuideFragment.getArguments();
                            Postcard postcardWithString = postcardWithInt.withString("oc_installment_sn_no", arguments != null ? arguments.getString("oc_installment_sn_no") : null);
                            Bundle arguments2 = ocGuideFragment.getArguments();
                            postcardWithString.withString("oc_apply_enter_point", arguments2 != null ? arguments2.getString("oc_apply_enter_point") : null).navigation(ocGuideFragment.getContext());
                        }
                        Unit unit = Unit.f38893a;
                    }
                } else {
                    ARouter.getInstance().build("/account/login").navigation(ocGuideFragment.getContext());
                }
                n0.g().m(ocGuideFragment.getClass().getSimpleName().concat("_element_click"), "open_flexi_tv", "");
                break;
        }
    }
}
