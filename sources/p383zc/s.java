package p383zc;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDrawCreateResp;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f44659b;

    public /* synthetic */ s(y yVar, int i7) {
        this.f44658a = i7;
        this.f44659b = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp;
        Integer num;
        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp2;
        Integer num2;
        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp3;
        Integer num3;
        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp4;
        Integer num4;
        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp5;
        Integer num5;
        switch (this.f44658a) {
            case 0:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean zIsSuccess = response.isSuccess();
                y yVar = this.f44659b;
                if (zIsSuccess) {
                    ((ReferEarnResolveContract.View) yVar.f27351a).withDrawCallback();
                } else if (!"Order_Disable".equals(response.getRespCode())) {
                    "Order_Confirm".equals(response.getRespCode());
                }
                if (response.isSuccess() && (referEarnWithDrawCreateResp5 = (ReferEarnWithDrawCreateResp) response.data) != null && (num5 = referEarnWithDrawCreateResp5.status) != null && num5.intValue() == 1) {
                    long j6 = a.d().f44149a.getLong("key_rate_dialog_show_time", -1L);
                    if (a.d().f44149a.getInt("key_rate_dialog_show_status", 0) != 0 || (System.currentTimeMillis() - j6 <= 2592000000L && j6 != -1)) {
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp6 = (ReferEarnWithDrawCreateResp) response.data;
                        if (referEarnWithDrawCreateResp6.bindCardEnable) {
                            ReferEarnResolveContract.View view = (ReferEarnResolveContract.View) yVar.f27351a;
                            int re_type_withdraw_succ_bind = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_BIND();
                            ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp7 = (ReferEarnWithDrawCreateResp) response.data;
                            view.showRichDialog(re_type_withdraw_succ_bind, referEarnWithDrawCreateResp7.remark, referEarnWithDrawCreateResp7.bindTips, "");
                        } else if (referEarnWithDrawCreateResp6.commentEnable) {
                            ReferEarnResolveContract.View view2 = (ReferEarnResolveContract.View) yVar.f27351a;
                            int re_type_withdraw_succ_comment = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_COMMENT();
                            ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp8 = (ReferEarnWithDrawCreateResp) response.data;
                            view2.showRichDialog(re_type_withdraw_succ_comment, referEarnWithDrawCreateResp8.remark, referEarnWithDrawCreateResp8.commentTips, referEarnWithDrawCreateResp8.orderNo);
                        } else {
                            ((ReferEarnResolveContract.View) yVar.f27351a).showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC(), ((ReferEarnWithDrawCreateResp) response.data).remark, "", "");
                        }
                    } else {
                        ((ReferEarnResolveContract.View) yVar.f27351a).showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_RATE(), ((ReferEarnWithDrawCreateResp) response.data).remark, "", "");
                    }
                    break;
                } else if (response.isSuccess() && (referEarnWithDrawCreateResp4 = (ReferEarnWithDrawCreateResp) response.data) != null && (num4 = referEarnWithDrawCreateResp4.status) != null && num4.intValue() == 2) {
                    ReferEarnResolveContract.View view3 = (ReferEarnResolveContract.View) yVar.f27351a;
                    int re_type_withdraw_fail_risk = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_FAIL_RISK();
                    ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp9 = (ReferEarnWithDrawCreateResp) response.data;
                    view3.showRichDialog(re_type_withdraw_fail_risk, referEarnWithDrawCreateResp9 != null ? referEarnWithDrawCreateResp9.remark : null, "", referEarnWithDrawCreateResp9.referId);
                } else if (response.isSuccess() && (referEarnWithDrawCreateResp3 = (ReferEarnWithDrawCreateResp) response.data) != null && (num3 = referEarnWithDrawCreateResp3.status) != null && num3.intValue() == 3) {
                    ReferEarnResolveContract.View view4 = (ReferEarnResolveContract.View) yVar.f27351a;
                    int re_type_withdraw_manual_review = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_MANUAL_REVIEW();
                    ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp10 = (ReferEarnWithDrawCreateResp) response.data;
                    view4.showRichDialog(re_type_withdraw_manual_review, referEarnWithDrawCreateResp10 != null ? referEarnWithDrawCreateResp10.remark : null, "", "");
                } else if (response.isSuccess() && (referEarnWithDrawCreateResp2 = (ReferEarnWithDrawCreateResp) response.data) != null && (num2 = referEarnWithDrawCreateResp2.status) != null && num2.intValue() == 4) {
                    ReferEarnResolveContract.View view5 = (ReferEarnResolveContract.View) yVar.f27351a;
                    int re_type_real_name_rate = ReferEarnRichDialog.INSTANCE.getRE_TYPE_REAL_NAME_RATE();
                    ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp11 = (ReferEarnWithDrawCreateResp) response.data;
                    view5.showRichDialog(re_type_real_name_rate, referEarnWithDrawCreateResp11 != null ? referEarnWithDrawCreateResp11.remark : null, "", referEarnWithDrawCreateResp11.referId);
                } else if (!response.isSuccess() || (referEarnWithDrawCreateResp = (ReferEarnWithDrawCreateResp) response.data) == null || (num = referEarnWithDrawCreateResp.status) == null || num.intValue() != 5) {
                    ((ReferEarnResolveContract.View) yVar.f27351a).showToastDialog(response.getRespMsg());
                } else {
                    ReferEarnResolveContract.View view6 = (ReferEarnResolveContract.View) yVar.f27351a;
                    int re_type_withdraw_manual_review2 = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_MANUAL_REVIEW();
                    ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp12 = (ReferEarnWithDrawCreateResp) response.data;
                    view6.showRichDialog(re_type_withdraw_manual_review2, referEarnWithDrawCreateResp12 != null ? referEarnWithDrawCreateResp12.remark : null, "", referEarnWithDrawCreateResp12.referId);
                }
                ((ReferEarnResolveContract.View) yVar.f27351a).withDrawCallback();
                break;
            case 1:
                String str = (String) obj;
                IBaseView iBaseView = this.f44659b.f27351a;
                if (iBaseView != null) {
                    ((ReferEarnResolveContract.View) iBaseView).showToastDialog(str);
                }
                break;
            case 2:
                String str2 = (String) obj;
                ReferEarnResolveContract.View view7 = (ReferEarnResolveContract.View) this.f44659b.f27351a;
                if (view7 != null) {
                    view7.showToastDialog(str2);
                }
                break;
            default:
                CommonBeanResult<ReferEarnRecordsResp> response2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                if (response2.isSuccess()) {
                    ((ReferEarnResolveContract.View) this.f44659b.f27351a).queryReferRecordsResult(response2);
                } else {
                    ToastUtils.showLong(response2.getRespMsg(), new Object[0]);
                }
                break;
        }
        return Unit.f38893a;
    }
}
