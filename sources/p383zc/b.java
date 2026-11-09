package p383zc;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReInviteListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnOrderLatestResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnPopResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDrawCreateResp;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f44634b;

    public /* synthetic */ b(m mVar, int i7) {
        this.f44633a = i7;
        this.f44634b = mVar;
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
        switch (this.f44633a) {
            case 0:
                CommonListResultV2<ReferEarnOrderLatestResp> response = (CommonListResultV2) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccess()) {
                    ReferEarnHomePageContract.View view = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                    if (view != null) {
                        view.queryOrderLatestResult(response);
                    }
                } else {
                    ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                }
                break;
            case 1:
                CommonBeanResult response2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                boolean zIsSuccess = response2.isSuccess();
                m mVar = this.f44634b;
                if (zIsSuccess && (referEarnWithDrawCreateResp5 = (ReferEarnWithDrawCreateResp) response2.data) != null && (num5 = referEarnWithDrawCreateResp5.status) != null && num5.intValue() == 1) {
                    long j6 = a.d().f44149a.getLong("key_rate_dialog_show_time", -1L);
                    if (a.d().f44149a.getInt("key_rate_dialog_show_status", 0) != 0 || (System.currentTimeMillis() - j6 <= 2592000000L && j6 != -1)) {
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp6 = (ReferEarnWithDrawCreateResp) response2.data;
                        if (referEarnWithDrawCreateResp6.bindCardEnable) {
                            ReferEarnHomePageContract.View view2 = (ReferEarnHomePageContract.View) mVar.f27351a;
                            if (view2 != null) {
                                int re_type_withdraw_succ_bind = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_BIND();
                                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp7 = (ReferEarnWithDrawCreateResp) response2.data;
                                view2.showRichDialog(re_type_withdraw_succ_bind, referEarnWithDrawCreateResp7.remark, referEarnWithDrawCreateResp7.bindTips, "");
                            }
                        } else if (referEarnWithDrawCreateResp6.commentEnable) {
                            ReferEarnHomePageContract.View view3 = (ReferEarnHomePageContract.View) mVar.f27351a;
                            if (view3 != null) {
                                int re_type_withdraw_succ_comment = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_COMMENT();
                                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp8 = (ReferEarnWithDrawCreateResp) response2.data;
                                view3.showRichDialog(re_type_withdraw_succ_comment, referEarnWithDrawCreateResp8.remark, referEarnWithDrawCreateResp8.commentTips, referEarnWithDrawCreateResp8.orderNo);
                            }
                        } else {
                            ReferEarnHomePageContract.View view4 = (ReferEarnHomePageContract.View) mVar.f27351a;
                            if (view4 != null) {
                                view4.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC(), ((ReferEarnWithDrawCreateResp) response2.data).remark, "", "");
                            }
                        }
                    } else {
                        ReferEarnHomePageContract.View view5 = (ReferEarnHomePageContract.View) mVar.f27351a;
                        if (view5 != null) {
                            view5.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_RATE(), ((ReferEarnWithDrawCreateResp) response2.data).remark, "", "");
                        }
                    }
                    break;
                } else if (response2.isSuccess() && (referEarnWithDrawCreateResp4 = (ReferEarnWithDrawCreateResp) response2.data) != null && (num4 = referEarnWithDrawCreateResp4.status) != null && num4.intValue() == 2) {
                    ReferEarnHomePageContract.View view6 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view6 != null) {
                        int re_type_withdraw_fail_risk = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_FAIL_RISK();
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp9 = (ReferEarnWithDrawCreateResp) response2.data;
                        view6.showRichDialog(re_type_withdraw_fail_risk, referEarnWithDrawCreateResp9 != null ? referEarnWithDrawCreateResp9.remark : null, "", referEarnWithDrawCreateResp9.referId);
                    }
                } else if (response2.isSuccess() && (referEarnWithDrawCreateResp3 = (ReferEarnWithDrawCreateResp) response2.data) != null && (num3 = referEarnWithDrawCreateResp3.status) != null && num3.intValue() == 3) {
                    ReferEarnHomePageContract.View view7 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view7 != null) {
                        int re_type_withdraw_manual_review = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_MANUAL_REVIEW();
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp10 = (ReferEarnWithDrawCreateResp) response2.data;
                        view7.showRichDialog(re_type_withdraw_manual_review, referEarnWithDrawCreateResp10 != null ? referEarnWithDrawCreateResp10.remark : null, "", "");
                    }
                } else if (response2.isSuccess() && (referEarnWithDrawCreateResp2 = (ReferEarnWithDrawCreateResp) response2.data) != null && (num2 = referEarnWithDrawCreateResp2.status) != null && num2.intValue() == 4) {
                    ReferEarnHomePageContract.View view8 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view8 != null) {
                        int re_type_real_name_rate = ReferEarnRichDialog.INSTANCE.getRE_TYPE_REAL_NAME_RATE();
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp11 = (ReferEarnWithDrawCreateResp) response2.data;
                        view8.showRichDialog(re_type_real_name_rate, referEarnWithDrawCreateResp11 != null ? referEarnWithDrawCreateResp11.remark : null, "", referEarnWithDrawCreateResp11.referId);
                    }
                } else if (!response2.isSuccess() || (referEarnWithDrawCreateResp = (ReferEarnWithDrawCreateResp) response2.data) == null || (num = referEarnWithDrawCreateResp.status) == null || num.intValue() != 5) {
                    ReferEarnHomePageContract.View view9 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view9 != null) {
                        view9.showToastDialog(response2.getRespMsg());
                    }
                } else {
                    ReferEarnHomePageContract.View view10 = (ReferEarnHomePageContract.View) mVar.f27351a;
                    if (view10 != null) {
                        int re_type_withdraw_manual_review2 = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_MANUAL_REVIEW();
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp12 = (ReferEarnWithDrawCreateResp) response2.data;
                        view10.showRichDialog(re_type_withdraw_manual_review2, referEarnWithDrawCreateResp12 != null ? referEarnWithDrawCreateResp12.remark : null, "", referEarnWithDrawCreateResp12.referId);
                    }
                }
                mVar.queryReferEarnHome();
                break;
            case 2:
                String str = (String) obj;
                ReferEarnHomePageContract.View view11 = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                if (view11 != null) {
                    view11.showToastDialog(str);
                }
                break;
            case 3:
                CommonBeanResult response3 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                boolean zIsSuccess2 = response3.isSuccess();
                m mVar2 = this.f44634b;
                if (zIsSuccess2 && ((ReferEarnPopResp) response3.data).popUps) {
                    ReferEarnHomePageContract.View view12 = (ReferEarnHomePageContract.View) mVar2.f27351a;
                    if (view12 != null) {
                        view12.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_RETAIN(), ((ReferEarnPopResp) response3.data).message, "", "");
                    }
                } else {
                    ReferEarnHomePageContract.View view13 = (ReferEarnHomePageContract.View) mVar2.f27351a;
                    if (view13 != null) {
                        view13.finishNow();
                    }
                }
                break;
            case 4:
                ReferEarnHomePageContract.View view14 = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                if (view14 != null) {
                    view14.finishNow();
                }
                break;
            case 5:
                CommonBeanResult<ReInviteListResp> response4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response4, "response");
                ReferEarnHomePageContract.View view15 = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                if (view15 != null) {
                    view15.queryReInviteListResult(response4);
                }
                break;
            case 6:
                CommonBeanResult<ReferEarnRecordsResp> response5 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response5, "response");
                if (response5.isSuccess()) {
                    ReferEarnHomePageContract.View view16 = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                    if (view16 != null) {
                        view16.queryReferRecordsResult(response5);
                    }
                } else {
                    ToastUtils.showLong(response5.getRespMsg(), new Object[0]);
                }
                break;
            case 7:
                CommonBeanResult<CommentResp> response6 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response6, "response");
                boolean zIsSuccess3 = response6.isSuccess();
                m mVar3 = this.f44634b;
                if (zIsSuccess3) {
                    ReferEarnHomePageContract.View view17 = (ReferEarnHomePageContract.View) mVar3.f27351a;
                    if (view17 != null) {
                        view17.commentListResult(response6);
                    }
                } else {
                    ReferEarnHomePageContract.View view18 = (ReferEarnHomePageContract.View) mVar3.f27351a;
                    if (view18 != null) {
                        view18.showToastDialog(response6.getRespMsg());
                    }
                }
                break;
            case 8:
                String str2 = (String) obj;
                ReferEarnHomePageContract.View view19 = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                if (view19 != null) {
                    view19.showToastDialog(str2);
                }
                break;
            case 9:
                CommonBeanResult<ReferEarnHomeResp> response7 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response7, "response");
                boolean zIsSuccess4 = response7.isSuccess();
                m mVar4 = this.f44634b;
                if (zIsSuccess4) {
                    ReferEarnHomePageContract.View view20 = (ReferEarnHomePageContract.View) mVar4.f27351a;
                    if (view20 != null) {
                        view20.queryReferEarnHomeResult(response7);
                    }
                    mVar4.commentList();
                } else {
                    ReferEarnHomePageContract.View view21 = (ReferEarnHomePageContract.View) mVar4.f27351a;
                    if (view21 != null) {
                        view21.queryReferEarnHomeResult(response7);
                    }
                }
                break;
            default:
                String str3 = (String) obj;
                ReferEarnHomePageContract.View view22 = (ReferEarnHomePageContract.View) this.f44634b.f27351a;
                if (view22 != null) {
                    view22.showToastDialog(str3);
                }
                break;
        }
        return Unit.f38893a;
    }
}
