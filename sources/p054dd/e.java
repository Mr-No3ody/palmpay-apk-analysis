package p054dd;

import C0.G;
import L6.b;
import Pa.C0525w;
import Pa.r0;
import Rd.C0607x;
import android.widget.TextView;
import com.google.gson.Gson;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35876a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashHomeActivity f35877b;

    public e(Recharge2CashHomeActivity recharge2CashHomeActivity) {
        this.f35877b = recharge2CashHomeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35877b;
        switch (this.f35876a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    recharge2CashHomeActivity.showLoadingDialog(true, true);
                } else {
                    if (it instanceof p) {
                        recharge2CashHomeActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        C0525w c0525wF = C0525w.f();
                        ArrayList arrayList = (ArrayList) commonBeanResult.data;
                        d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList != null ? arrayList : ""));
                    } else if (it instanceof m) {
                        recharge2CashHomeActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        recharge2CashHomeActivity.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ((n) it).getClass();
                        d.G("/main/trans_history", "");
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonLongResult commonLongResult = (CommonLongResult) ((p) it2).f27360a;
                        if (commonLongResult.isSuccess()) {
                            long data = commonLongResult.getData();
                            ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                            if (data > 0) {
                                C0607x c0607x = (C0607x) recharge2CashHomeActivity.f27334c;
                                if (c0607x != null) {
                                    ((TextView) c0607x.f8543c.f702i).setText(G.i("Airtime balance:").append(r0.B(data, false)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, recharge2CashHomeActivity)).create());
                                }
                                C0607x c0607x2 = (C0607x) recharge2CashHomeActivity.f27334c;
                                if (c0607x2 != null) {
                                    h.C((TextView) c0607x2.f8543c.f702i);
                                }
                            } else {
                                C0607x c0607x3 = (C0607x) recharge2CashHomeActivity.f27334c;
                                if (c0607x3 != null) {
                                    h.c((TextView) c0607x3.f8543c.f702i);
                                }
                            }
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }

    public e(Recharge2CashHomeActivity recharge2CashHomeActivity, Recharge2CashHomeActivity recharge2CashHomeActivity2) {
        this.f35877b = recharge2CashHomeActivity2;
    }
}
