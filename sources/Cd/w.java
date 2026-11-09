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
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToPalmPayFragment f1393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToPalmPayFragment f1394c;

    public /* synthetic */ w(ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment, ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment2, int i7) {
        this.f1392a = i7;
        this.f1393b = scheduleTransferPaymentToPalmPayFragment;
        this.f1394c = scheduleTransferPaymentToPalmPayFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment = this.f1394c;
        ScheduleTransferPaymentToPalmPayFragment scheduleTransferPaymentToPalmPayFragment2 = this.f1393b;
        switch (this.f1392a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (balanceAndLimitResp.isSuccess()) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        scheduleTransferPaymentToPalmPayFragment.f33721B = balanceAndLimitData;
                        if (balanceAndLimitData != null) {
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("Enter " + r0.A(balanceAndLimitData.minAmount) + "-" + r0.A(balanceAndLimitData.maxAmount)).setFontSize(18, true).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            p223od.p pVar = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                            if (pVar != null) {
                                pVar.f40446d.setHintText(spannableStringBuilderCreate);
                            }
                            p223od.p pVar2 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                            if (pVar2 != null) {
                                pVar2.f40446d.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                            }
                        }
                    } else {
                        p220oa.h.y(scheduleTransferPaymentToPalmPayFragment, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    p220oa.h.y(scheduleTransferPaymentToPalmPayFragment, ((com.transsnet.palmpay.core.base.n) it).f27358a);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        MemberDetailResp memberDetailResp = (MemberDetailResp) commonBeanResult.data;
                        if (memberDetailResp != null) {
                            Postcard postcardWithString = d0.g(2, "/sm/schedule_transfer_create_v2", "extra_type").withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(memberDetailResp));
                            ScheduleTransferPaymentToPalmPayFragment.a aVar = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                            p223od.p pVar3 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                            Postcard postcardWithString2 = postcardWithString.withString("extra_note", pVar3 != null ? pVar3.f40445c.getEditContent() : null);
                            p223od.p pVar4 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                            postcardWithString2.withDouble("extra_amount", pVar4 != null ? pVar4.f40446d.getDoubleAmount() : 0.0d).navigation();
                        }
                    } else {
                        p220oa.h.y(scheduleTransferPaymentToPalmPayFragment, commonBeanResult.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    scheduleTransferPaymentToPalmPayFragment2.showLoadingDialog(false, true);
                    String str = ((com.transsnet.palmpay.core.base.n) it2).f27358a;
                    ScheduleTransferPaymentToPalmPayFragment.a aVar2 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                    p223od.p pVar5 = (p223od.p) scheduleTransferPaymentToPalmPayFragment.f27335j;
                    if (pVar5 != null) {
                        pVar5.f40448f.b(str);
                    }
                }
                return Unit.f38893a;
        }
    }
}
