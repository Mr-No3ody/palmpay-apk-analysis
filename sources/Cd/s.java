package Cd;

import Pa.C0525w;
import Pa.r0;
import android.text.SpannableStringBuilder;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToBankFragment f1386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToBankFragment f1387c;

    public /* synthetic */ s(ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment, ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment2, int i7) {
        this.f1385a = i7;
        this.f1386b = scheduleTransferPaymentToBankFragment;
        this.f1387c = scheduleTransferPaymentToBankFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1387c;
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment2 = this.f1386b;
        switch (this.f1385a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (balanceAndLimitResp.isSuccess()) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        scheduleTransferPaymentToBankFragment.f33713B = balanceAndLimitData;
                        if (balanceAndLimitData != null) {
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("Enter " + r0.A(balanceAndLimitData.minAmount) + "-" + r0.A(balanceAndLimitData.maxAmount)).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            p223od.o oVar = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                            if (oVar != null) {
                                oVar.f40440d.setHintText(spannableStringBuilderCreate);
                            }
                            p223od.o oVar2 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                            if (oVar2 != null) {
                                oVar2.f40440d.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                            }
                        }
                    } else {
                        p220oa.h.y(scheduleTransferPaymentToBankFragment, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    p220oa.h.y(scheduleTransferPaymentToBankFragment, ((com.transsnet.palmpay.core.base.n) it).f27358a);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        MemberDetailResp memberDetailResp = (MemberDetailResp) commonBeanResult.data;
                        if (memberDetailResp != null) {
                            Postcard postcardWithString = d0.g(2, "/sm/schedule_transfer_create_v2", "extra_type").withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(memberDetailResp));
                            ScheduleTransferPaymentToBankFragment.a aVar = ScheduleTransferPaymentToBankFragment.f33711H;
                            p223od.o oVar3 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                            Postcard postcardWithString2 = postcardWithString.withString("extra_note", oVar3 != null ? oVar3.f40439c.getEditContent() : null);
                            p223od.o oVar4 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                            postcardWithString2.withDouble("extra_amount", oVar4 != null ? oVar4.f40440d.getDoubleAmount() : 0.0d).navigation();
                        }
                    } else {
                        p220oa.h.y(scheduleTransferPaymentToBankFragment, commonBeanResult.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    scheduleTransferPaymentToBankFragment2.showLoadingDialog(false, true);
                    p220oa.h.y(scheduleTransferPaymentToBankFragment, ((com.transsnet.palmpay.core.base.n) it2).f27358a);
                }
                return Unit.f38893a;
        }
    }
}
