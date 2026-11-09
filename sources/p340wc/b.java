package p340wc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDrawCreateResp;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f43389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithdrawListFragment f43390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommonResult commonResult, Continuation continuation, ReferEarnWithdrawListFragment referEarnWithdrawListFragment) {
        super(2, continuation);
        this.f43389a = commonResult;
        this.f43390b = referEarnWithdrawListFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f43389a, continuation, this.f43390b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
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
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f43389a;
        ReferEarnWithdrawListFragment referEarnWithdrawListFragment = this.f43390b;
        referEarnWithdrawListFragment.showLoadingDialog(false);
        if (!commonBeanResult.isSuccess() || (referEarnWithDrawCreateResp5 = (ReferEarnWithDrawCreateResp) commonBeanResult.data) == null || (num5 = referEarnWithDrawCreateResp5.status) == null || num5.intValue() != 1) {
            if (commonBeanResult.isSuccess() && (referEarnWithDrawCreateResp4 = (ReferEarnWithDrawCreateResp) commonBeanResult.data) != null && (num4 = referEarnWithDrawCreateResp4.status) != null && num4.intValue() == 2) {
                int re_type_withdraw_fail_risk = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_FAIL_RISK();
                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp6 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                referEarnWithdrawListFragment.v(re_type_withdraw_fail_risk, referEarnWithDrawCreateResp6 != null ? referEarnWithDrawCreateResp6.remark : null, "", referEarnWithDrawCreateResp6.referId);
            } else if (commonBeanResult.isSuccess() && (referEarnWithDrawCreateResp3 = (ReferEarnWithDrawCreateResp) commonBeanResult.data) != null && (num3 = referEarnWithDrawCreateResp3.status) != null && num3.intValue() == 3) {
                int re_type_withdraw_manual_review = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_MANUAL_REVIEW();
                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp7 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                referEarnWithdrawListFragment.v(re_type_withdraw_manual_review, referEarnWithDrawCreateResp7 != null ? referEarnWithDrawCreateResp7.remark : null, "", "");
            } else if (commonBeanResult.isSuccess() && (referEarnWithDrawCreateResp2 = (ReferEarnWithDrawCreateResp) commonBeanResult.data) != null && (num2 = referEarnWithDrawCreateResp2.status) != null && num2.intValue() == 4) {
                int re_type_real_name_rate = ReferEarnRichDialog.INSTANCE.getRE_TYPE_REAL_NAME_RATE();
                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp8 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                referEarnWithdrawListFragment.v(re_type_real_name_rate, referEarnWithDrawCreateResp8 != null ? referEarnWithDrawCreateResp8.remark : null, "", referEarnWithDrawCreateResp8.referId);
            } else if (!commonBeanResult.isSuccess() || (referEarnWithDrawCreateResp = (ReferEarnWithDrawCreateResp) commonBeanResult.data) == null || (num = referEarnWithDrawCreateResp.status) == null || num.intValue() != 5) {
                String respMsg = commonBeanResult.getRespMsg();
                y yVar = new y(referEarnWithdrawListFragment.requireContext());
                yVar.f31323a = respMsg;
                yVar.h();
            } else {
                int re_type_withdraw_manual_review2 = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_MANUAL_REVIEW();
                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp9 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                referEarnWithdrawListFragment.v(re_type_withdraw_manual_review2, referEarnWithDrawCreateResp9 != null ? referEarnWithDrawCreateResp9.remark : null, "", referEarnWithDrawCreateResp9.referId);
            }
        } else {
            long j6 = p367ya.a.d().f44149a.getLong("key_rate_dialog_show_time", -1L);
            if (p367ya.a.d().f44149a.getInt("key_rate_dialog_show_status", 0) != 0 || (System.currentTimeMillis() - j6 <= 2592000000L && j6 != -1)) {
                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp10 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                if (!referEarnWithDrawCreateResp10.bindCardEnable) {
                    if (referEarnWithDrawCreateResp10.commentEnable) {
                        int re_type_withdraw_succ_comment = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_COMMENT();
                        ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp11 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                        referEarnWithdrawListFragment.v(re_type_withdraw_succ_comment, referEarnWithDrawCreateResp11.remark, referEarnWithDrawCreateResp11.commentTips, referEarnWithDrawCreateResp11.orderNo);
                    } else {
                        referEarnWithdrawListFragment.v(ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC(), ((ReferEarnWithDrawCreateResp) commonBeanResult.data).remark, "", "");
                    }
                    return Unit.f38893a;
                }
                int re_type_withdraw_succ_bind = ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_BIND();
                ReferEarnWithDrawCreateResp referEarnWithDrawCreateResp12 = (ReferEarnWithDrawCreateResp) commonBeanResult.data;
                referEarnWithdrawListFragment.v(re_type_withdraw_succ_bind, referEarnWithDrawCreateResp12.remark, referEarnWithDrawCreateResp12.bindTips, "");
            } else {
                referEarnWithdrawListFragment.v(ReferEarnRichDialog.INSTANCE.getRE_TYPE_WITHDRAW_SUCC_RATE(), ((ReferEarnWithDrawCreateResp) commonBeanResult.data).remark, "", "");
            }
        }
        referEarnWithdrawListFragment.f31963o = 1;
        referEarnWithdrawListFragment.u();
        return Unit.f38893a;
    }
}
