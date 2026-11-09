package p296td;

import Kd.C0400o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.bean.resp.Data;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountBean;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountResp;
import com.transsnet.palmpay.send_money.bean.resp.VoiceNotifyResp;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.send_money.viewmodel.PayMeViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import p185ma.e;
import p220oa.h;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayMeActivity f42597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayMeActivity f42598c;

    public /* synthetic */ d(PayMeActivity payMeActivity, PayMeActivity payMeActivity2, int i7) {
        this.f42596a = i7;
        this.f42597b = payMeActivity;
        this.f42598c = payMeActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList<PosterAccountBean> accountDetailList;
        PayMeActivity payMeActivity = this.f42598c;
        PayMeActivity payMeActivity2 = this.f42597b;
        switch (this.f42596a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    payMeActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    payMeActivity2.showLoadingDialog(false, true);
                    PosterAccountResp posterAccountResp = (PosterAccountResp) ((p) it).f27360a;
                    if (posterAccountResp.isSuccess()) {
                        Data data = posterAccountResp.getData();
                        if (data != null) {
                            boolean zC = Intrinsics.c(data.isMerchant(), Boolean.TRUE);
                            t tVar = payMeActivity.f33310g;
                            if (zC) {
                                Object value = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                h.s((ConstraintLayout) value, true);
                                String merchantServiceUrl = data.getMerchantServiceUrl();
                                if (merchantServiceUrl != null && merchantServiceUrl.length() > 0) {
                                    Object value2 = tVar.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                                    ((ConstraintLayout) value2).setOnClickListener(new e(data, 13));
                                }
                                ArrayList<PosterAccountBean> accountDetailList2 = data.getAccountDetailList();
                                if (accountDetailList2 != null) {
                                    for (PosterAccountBean posterAccountBean : accountDetailList2) {
                                        if (posterAccountBean.getIsMerchant()) {
                                            PayMeViewModel payMeViewModel = (PayMeViewModel) payMeActivity.l();
                                            String mappingAccountNo = posterAccountBean.getMappingAccountNo();
                                            payMeViewModel.getClass();
                                            f.s(payMeViewModel, new C0400o(mappingAccountNo, null), payMeViewModel.f33985j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                                h.s(payMeActivity.n(), false);
                            } else {
                                Object value3 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                                h.s((ConstraintLayout) value3, false);
                                h.s(payMeActivity.n(), true);
                            }
                            ArrayList<PosterAccountBean> accountDetailList3 = data.getAccountDetailList();
                            if (accountDetailList3 != null && (!accountDetailList3.isEmpty())) {
                                ArrayList<PosterAccountBean> accountDetailList4 = data.getAccountDetailList();
                                if ((accountDetailList4 != null ? accountDetailList4.size() : 0) <= 1 && (accountDetailList = data.getAccountDetailList()) != null) {
                                    accountDetailList.add(new PosterAccountBean());
                                }
                                int i7 = PayMeActivity.t;
                                payMeActivity.o().setList(data.getAccountDetailList());
                            }
                        }
                    } else {
                        h.x(payMeActivity, posterAccountResp.getRespMsg());
                    }
                } else if (it instanceof m) {
                    payMeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    payMeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    payMeActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    payMeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        PosterAccountBean posterAccountBean2 = (PosterAccountBean) commonBeanResult.data;
                        if (posterAccountBean2 != null) {
                            ARouter.getInstance().build("/send/pay_me_merchant").withSerializable("extra_data", posterAccountBean2).navigation();
                        }
                        int i10 = PayMeActivity.t;
                        ((PayMeViewModel) payMeActivity.l()).d();
                    } else {
                        h.x(payMeActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    payMeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    payMeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    payMeActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    payMeActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it3).f27360a;
                    if (commonResult.isSuccess()) {
                        VoiceNotifyResp voiceNotifyResp = payMeActivity.f33313o;
                        if (voiceNotifyResp != null) {
                            Integer status = voiceNotifyResp.getStatus();
                            voiceNotifyResp.setStatus(Integer.valueOf((status == null || status.intValue() != 1) ? 1 : 0));
                        }
                        PayMeActivity.m(payMeActivity);
                    } else {
                        h.x(payMeActivity, commonResult.getRespMsg());
                    }
                } else if (it3 instanceof m) {
                    payMeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    payMeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
