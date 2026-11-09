package p312ud;

import Pa.r0;
import android.text.SpannableStringBuilder;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferCreateResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferHomeResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p173ld.f;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateActivity f42967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateActivity f42968c;

    public /* synthetic */ d(ScheduleTransferCreateActivity scheduleTransferCreateActivity, ScheduleTransferCreateActivity scheduleTransferCreateActivity2, int i7) {
        this.f42966a = i7;
        this.f42967b = scheduleTransferCreateActivity;
        this.f42968c = scheduleTransferCreateActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42966a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42967b;
                if (z3) {
                    scheduleTransferCreateActivity.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    ScheduleTransferCreateActivity scheduleTransferCreateActivity2 = this.f42968c;
                    if (z8) {
                        scheduleTransferCreateActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            ScheduleTransferHomeResp scheduleTransferHomeResp = (ScheduleTransferHomeResp) commonBeanResult.data;
                            if (scheduleTransferHomeResp != null) {
                                List<ScheduleTransferHomeResp.Payment> payTypeList = scheduleTransferHomeResp.getPayTypeList();
                                if (payTypeList != null && !payTypeList.isEmpty()) {
                                    List<ScheduleTransferHomeResp.Payment> payTypeList2 = scheduleTransferHomeResp.getPayTypeList();
                                    Intrinsics.e(payTypeList2);
                                    payTypeList2.get(0).setDefaultOption(Boolean.TRUE);
                                    List<ScheduleTransferHomeResp.Payment> payTypeList3 = scheduleTransferHomeResp.getPayTypeList();
                                    Intrinsics.e(payTypeList3);
                                    scheduleTransferCreateActivity2.f33364v0 = payTypeList3.get(0).getPaymentType();
                                }
                                ((f) scheduleTransferCreateActivity2.f33341M0.getValue()).setList(scheduleTransferHomeResp.getPayTypeList());
                            }
                        } else {
                            h.x(scheduleTransferCreateActivity2, commonBeanResult.getRespMsg());
                        }
                    } else if (it instanceof m) {
                        scheduleTransferCreateActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        scheduleTransferCreateActivity.showLoadingDialog(false, true);
                        n nVar = (n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        h.x(scheduleTransferCreateActivity2, nVar.f27358a);
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                ScheduleTransferCreateActivity scheduleTransferCreateActivity3 = this.f42967b;
                if (z10) {
                    scheduleTransferCreateActivity3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    ScheduleTransferCreateActivity scheduleTransferCreateActivity4 = this.f42968c;
                    if (z11) {
                        scheduleTransferCreateActivity3.showLoadingDialog(false, true);
                        BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((p) it2).f27360a;
                        if (balanceAndLimitResp.isSuccess()) {
                            BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                            scheduleTransferCreateActivity4.f33344X = balanceAndLimitData;
                            if (balanceAndLimitData != null) {
                                SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("Enter " + r0.A(balanceAndLimitData.minAmount) + "-" + r0.A(balanceAndLimitData.maxAmount)).setFontSize(18, true).create();
                                Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                                PpAmountEditText ppAmountEditTextS = scheduleTransferCreateActivity4.s();
                                if (ppAmountEditTextS != null) {
                                    ppAmountEditTextS.setHintText(spannableStringBuilderCreate);
                                }
                                PpAmountEditText ppAmountEditTextS2 = scheduleTransferCreateActivity4.s();
                                if (ppAmountEditTextS2 != null) {
                                    ppAmountEditTextS2.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                                }
                            }
                        } else {
                            h.x(scheduleTransferCreateActivity4, balanceAndLimitResp.getRespMsg());
                        }
                    } else if (it2 instanceof m) {
                        scheduleTransferCreateActivity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        scheduleTransferCreateActivity3.showLoadingDialog(false, true);
                        n nVar2 = (n) it2;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        h.x(scheduleTransferCreateActivity4, nVar2.f27358a);
                    }
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z12 = it3 instanceof o;
                ScheduleTransferCreateActivity scheduleTransferCreateActivity5 = this.f42967b;
                if (z12) {
                    scheduleTransferCreateActivity5.showLoadingDialog(true, true);
                } else {
                    boolean z13 = it3 instanceof p;
                    ScheduleTransferCreateActivity scheduleTransferCreateActivity6 = this.f42968c;
                    if (z13) {
                        scheduleTransferCreateActivity5.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it3).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            ScheduleTransferCreateResp scheduleTransferCreateResp = (ScheduleTransferCreateResp) commonBeanResult2.data;
                            if (scheduleTransferCreateResp != null) {
                                ARouter.getInstance().build("/sm/schedule_transfer_create_result").withParcelable("extra_data", scheduleTransferCreateResp).navigation();
                            }
                        } else {
                            h.x(scheduleTransferCreateActivity6, commonBeanResult2.getRespMsg());
                        }
                    } else if (it3 instanceof m) {
                        scheduleTransferCreateActivity5.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        scheduleTransferCreateActivity5.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                        h.x(scheduleTransferCreateActivity6, ((n) it3).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}
