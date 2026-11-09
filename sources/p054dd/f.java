package p054dd;

import O6.c;
import Pa.i0;
import Pa.r0;
import Rd.C0607x;
import Wd.C0751z;
import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.airtime.bean.rsp.R2CCreateOrderResp;
import com.transsnet.palmpay.airtime.bean.rsp.R2CHomeInfoResp;
import com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashLoginActivity;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p038ca.e;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashHomeActivity f35879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashHomeActivity f35880c;

    public /* synthetic */ f(Recharge2CashHomeActivity recharge2CashHomeActivity, Recharge2CashHomeActivity recharge2CashHomeActivity2, int i7) {
        this.f35878a = i7;
        this.f35879b = recharge2CashHomeActivity;
        this.f35880c = recharge2CashHomeActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        C0607x c0607x;
        Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35879b;
        int i7 = 0;
        int i10 = 1;
        switch (this.f35878a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    recharge2CashHomeActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    recharge2CashHomeActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    boolean zIsSuccess = commonBeanResult.isSuccess();
                    Recharge2CashHomeActivity recharge2CashHomeActivity2 = this.f35880c;
                    if (zIsSuccess) {
                        ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                        C0607x c0607x2 = (C0607x) recharge2CashHomeActivity2.f27334c;
                        if (c0607x2 != null) {
                            c0607x2.f8544d.setError("");
                        }
                        T data = commonBeanResult.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        R2CCreateOrderResp r2CCreateOrderResp = (R2CCreateOrderResp) data;
                        C0751z c0751z = new C0751z(recharge2CashHomeActivity2, 6);
                        c0751z.f4971b = r2CCreateOrderResp.orderNo;
                        c0751z.f4974e = r2CCreateOrderResp.orderType;
                        c0751z.f4972c = r2CCreateOrderResp.transType;
                        c0751z.c(Long.valueOf(r2CCreateOrderResp.sharedAmount));
                        c0751z.f4978i = r2CCreateOrderResp.calculationExtInfo;
                        ArrayList arrayList2 = new ArrayList();
                        Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = recharge2CashHomeActivity2.f33120o;
                        arrayList2.add(new CoreCashierPaymentExtra("Provider", recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.billerName : null));
                        arrayList2.add(new CoreCashierPaymentExtra("Mobile Number", PhoneBaseNumberUtils.INSTANCE.formatMobileNumber(r2CCreateOrderResp.senderPhoneNo, false)));
                        c0751z.b(arrayList2);
                        c0751z.d();
                    } else if (Intrinsics.c(commonBeanResult.getRespCode(), "34000062")) {
                        c cVar = new c(recharge2CashHomeActivity2);
                        cVar.e(k.core_oops);
                        cVar.f6598d = commonBeanResult.getRespMsg();
                        cVar.f6606l = 17;
                        g gVar = new g(recharge2CashHomeActivity2, i7);
                        cVar.f6600f = "Migrate Plan";
                        cVar.f6602h = gVar;
                        cVar.c(k.core_cancel, h.f35883a);
                        cVar.g();
                    } else if (Intrinsics.c(commonBeanResult.getRespCode(), "CFRONT_300010")) {
                        ArrayList arrayList3 = Recharge2CashHomeActivity.f33117v;
                        Intent intent = new Intent(recharge2CashHomeActivity2, (Class<?>) Recharge2CashLoginActivity.class);
                        intent.putExtra("PHONE_NUM", recharge2CashHomeActivity2.f33119j);
                        intent.putExtra("extra_data", recharge2CashHomeActivity2.f33120o);
                        e f28604i = recharge2CashHomeActivity2.getF28604i();
                        if (f28604i != null) {
                            f28604i.f(intent, new c(recharge2CashHomeActivity2));
                        }
                    } else if (Intrinsics.c(commonBeanResult.getRespCode(), "11100011")) {
                        c cVar2 = new c(recharge2CashHomeActivity2);
                        cVar2.e(k.core_oops);
                        cVar2.f6598d = commonBeanResult.getRespMsg();
                        cVar2.f6606l = 17;
                        cVar2.f6600f = recharge2CashHomeActivity2.getString(k.core_confirm);
                        cVar2.f6602h = null;
                        cVar2.g();
                    } else if (Intrinsics.c(commonBeanResult.getRespCode(), "CFRONT_800101")) {
                        c cVar3 = new c(recharge2CashHomeActivity2);
                        cVar3.e(Pd.f.qt_airtime_confirm_mobile);
                        cVar3.f6598d = commonBeanResult.getRespMsg();
                        cVar3.f6606l = 17;
                        String string = recharge2CashHomeActivity2.getString(k.core_continue);
                        g gVar2 = new g(recharge2CashHomeActivity2, i10);
                        cVar3.f6600f = string;
                        cVar3.f6602h = gVar2;
                        cVar3.c(k.core_change, null);
                        cVar3.g();
                    } else {
                        ArrayList arrayList4 = Recharge2CashHomeActivity.f33117v;
                        C0607x c0607x3 = (C0607x) recharge2CashHomeActivity2.f27334c;
                        if (c0607x3 != null) {
                            c0607x3.f8544d.setError(commonBeanResult.getRespMsg());
                        }
                    }
                } else if (it instanceof m) {
                    recharge2CashHomeActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    recharge2CashHomeActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    recharge2CashHomeActivity.showLoadingDialog(true, true);
                } else {
                    boolean z3 = it2 instanceof p;
                    Recharge2CashHomeActivity recharge2CashHomeActivity3 = this.f35880c;
                    if (z3) {
                        recharge2CashHomeActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            R2CHomeInfoResp r2CHomeInfoResp = (R2CHomeInfoResp) commonBeanResult2.data;
                            if (r2CHomeInfoResp != null) {
                                ArrayList arrayList5 = Recharge2CashHomeActivity.f33117v;
                                List<Recharge2CashProviderV2Rsp> list = r2CHomeInfoResp.billerList;
                                if (list != null) {
                                    List<Recharge2CashProviderV2Rsp> list2 = !list.isEmpty() ? list : null;
                                    if (list2 != null) {
                                        recharge2CashHomeActivity3.f33121p = list2;
                                        C0607x c0607x4 = (C0607x) recharge2CashHomeActivity3.f27334c;
                                        if (c0607x4 != null) {
                                            ModelMobileWithIconInputLayout.initModelMobileInputLayout$default(c0607x4.f8544d, recharge2CashHomeActivity3, list2, recharge2CashHomeActivity3, BaseApplication.getCountryLocale(), null, null, null, recharge2CashHomeActivity3.isDarkMode(), HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
                                        }
                                        R2CHomeInfoResp.PhoneInfo phoneInfo = r2CHomeInfoResp.phoneInfo;
                                        if (phoneInfo != null) {
                                            String str2 = phoneInfo.network;
                                            recharge2CashHomeActivity3.q(str2 != null ? str2 : "");
                                            String str3 = phoneInfo.phoneNo;
                                            if (str3 != null) {
                                                if (TextUtils.isEmpty(str3)) {
                                                    str3 = null;
                                                }
                                                if (str3 != null && (c0607x = (C0607x) recharge2CashHomeActivity3.f27334c) != null) {
                                                    c0607x.f8544d.setPhoneNumber(i0.j(str3));
                                                }
                                            }
                                        } else {
                                            recharge2CashHomeActivity3.q("");
                                            Unit unit = Unit.f38893a;
                                        }
                                    }
                                }
                                String str4 = (!recharge2CashHomeActivity3.isDarkMode() || (str = r2CHomeInfoResp.darkInstruction) == null || str.length() <= 0) ? r2CHomeInfoResp.instruction : r2CHomeInfoResp.darkInstruction;
                                if (str4 != null) {
                                    if (str4.length() <= 0) {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        C0607x c0607x5 = (C0607x) recharge2CashHomeActivity3.f27334c;
                                        r0.l1(str4, c0607x5 != null ? c0607x5.f8546f : null);
                                    }
                                }
                            }
                        } else {
                            h.x(recharge2CashHomeActivity3, commonBeanResult2.getRespMsg());
                        }
                    } else if (it2 instanceof m) {
                        recharge2CashHomeActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        recharge2CashHomeActivity.showLoadingDialog(false, true);
                        h.x(recharge2CashHomeActivity3, ((n) it2).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}
