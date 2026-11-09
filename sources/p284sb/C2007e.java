package p284sb;

import L6.b;
import L6.i;
import O6.c;
import Ya.d;
import Ya.g;
import android.text.TextUtils;
import androidx.core.widget.NestedScrollView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.FlexiCashBalance;
import com.transsnet.palmpay.credit.bean.FlexiCashBalanceData;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.FlexiCashUnfreezeItem;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p054dd.n;
import p355xf.l;
import p355xf.t;
import p355xf.u;

/* JADX INFO: renamed from: sb.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2007e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HowToUnfreezeActivity f42158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HowToUnfreezeActivity f42159c;

    public /* synthetic */ C2007e(HowToUnfreezeActivity howToUnfreezeActivity, HowToUnfreezeActivity howToUnfreezeActivity2, int i7) {
        this.f42157a = i7;
        this.f42158b = howToUnfreezeActivity;
        this.f42159c = howToUnfreezeActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u uVar;
        Integer num;
        FlexiCashBalance flexiCashBalance;
        HowToUnfreezeActivity howToUnfreezeActivity = this.f42159c;
        HowToUnfreezeActivity howToUnfreezeActivity2 = this.f42158b;
        boolean z3 = true;
        switch (this.f42157a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    howToUnfreezeActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    howToUnfreezeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (!commonBeanResult.isSuccess() || (uVar = (u) commonBeanResult.data) == null || (num = (Integer) uVar.f43986b) == null || num.intValue() != 1) {
                        int i7 = HowToUnfreezeActivity.f28656H;
                        c cVar = new c(howToUnfreezeActivity);
                        cVar.e(k.core_declined);
                        cVar.f6607m = d.cs_failed_img;
                        cVar.f6598d = new SpanUtils().append(howToUnfreezeActivity.getString(g.cs_unfreeze_failed_msg)).setForegroundColor(howToUnfreezeActivity.getColor(b.ppColorTextNormal)).setFontSize(DensityUtil.dp2px(14.0f)).append("\n\n").append(howToUnfreezeActivity.getString(g.cs_unfreeze_failed_tips)).setForegroundColor(howToUnfreezeActivity.getColor(b.ppColorTextDisable)).setFontSize(DensityUtil.dp2px(12.0f)).create();
                        cVar.f6615v = i.ppFlexiDialogTheme;
                        cVar.d(g.cs_got_it, null);
                        cVar.g();
                    } else {
                        u uVar2 = (u) commonBeanResult.data;
                        int i10 = HowToUnfreezeActivity.f28656H;
                        if (TextUtils.equals(uVar2 != null ? (String) uVar2.f43985a : null, TransType.TRANS_TYPE_OK_CARD)) {
                            c cVar2 = new c(howToUnfreezeActivity);
                            cVar2.e(k.core_congratulations);
                            cVar2.f6607m = d.cs_success_icon;
                            cVar2.f6598d = howToUnfreezeActivity.getString(g.cs_oc_unfreeze_success_tips);
                            cVar2.f6615v = i.ppFlexiDialogTheme;
                            cVar2.d(g.cs_oc_pay_with_flexi_now, new n(26, uVar2, howToUnfreezeActivity));
                            cVar2.f6604j = new ViewOnClickListenerC2004b(howToUnfreezeActivity, 0);
                            cVar2.g();
                        } else {
                            c cVar3 = new c(howToUnfreezeActivity);
                            cVar3.e(k.core_congratulations);
                            cVar3.f6607m = d.cs_success_icon;
                            cVar3.f6598d = howToUnfreezeActivity.getString(g.cs_cl_unfreeze_success_tips);
                            cVar3.f6615v = i.ppFlexiCashDialogTheme;
                            cVar3.d(g.cs_cl_borrow_now, new ViewOnClickListenerC2004b(howToUnfreezeActivity, 1));
                            cVar3.f6604j = new ViewOnClickListenerC2004b(howToUnfreezeActivity, 2);
                            cVar3.g();
                        }
                    }
                } else if (it instanceof m) {
                    howToUnfreezeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    howToUnfreezeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    howToUnfreezeActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    howToUnfreezeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        FlexiCashBalanceData flexiCashBalanceData = (FlexiCashBalanceData) commonBeanResult2.data;
                        FlexiCashBalance flexiCashBalance2 = flexiCashBalanceData.flexiBalanceDto;
                        if ((flexiCashBalance2 == null || flexiCashBalance2.accountStatus != 4) && ((flexiCashBalance = flexiCashBalanceData.cashBalanceDto) == null || flexiCashBalance.accountStatus != 4)) {
                            z3 = false;
                        }
                        NestedScrollView nestedScrollView = (NestedScrollView) howToUnfreezeActivity.f28669v.getValue();
                        if (nestedScrollView != null) {
                            nestedScrollView.setVisibility(z3 ? 0 : 8);
                        }
                        howToUnfreezeActivity.m(z3);
                        t tVar = howToUnfreezeActivity.t;
                        FlexiCashUnfreezeItem flexiCashUnfreezeItem = (FlexiCashUnfreezeItem) tVar.getValue();
                        if (flexiCashUnfreezeItem != null) {
                            FlexiCashBalance flexiCashBalance3 = ((FlexiCashBalanceData) commonBeanResult2.data).flexiBalanceDto;
                            flexiCashUnfreezeItem.setVisibility((flexiCashBalance3 == null || flexiCashBalance3.accountStatus != 4) ? 8 : 0);
                        }
                        t tVar2 = howToUnfreezeActivity.f28668p;
                        FlexiCashUnfreezeItem flexiCashUnfreezeItem2 = (FlexiCashUnfreezeItem) tVar2.getValue();
                        if (flexiCashUnfreezeItem2 != null) {
                            FlexiCashBalance flexiCashBalance4 = ((FlexiCashBalanceData) commonBeanResult2.data).cashBalanceDto;
                            flexiCashUnfreezeItem2.setVisibility((flexiCashBalance4 == null || flexiCashBalance4.accountStatus != 4) ? 8 : 0);
                        }
                        FlexiCashUnfreezeItem flexiCashUnfreezeItem3 = (FlexiCashUnfreezeItem) tVar.getValue();
                        if (flexiCashUnfreezeItem3 != null) {
                            flexiCashUnfreezeItem3.e(((FlexiCashBalanceData) commonBeanResult2.data).flexiBalanceDto);
                        }
                        FlexiCashUnfreezeItem flexiCashUnfreezeItem4 = (FlexiCashUnfreezeItem) tVar2.getValue();
                        if (flexiCashUnfreezeItem4 != null) {
                            flexiCashUnfreezeItem4.e(((FlexiCashBalanceData) commonBeanResult2.data).cashBalanceDto);
                        }
                    } else {
                        int i11 = HowToUnfreezeActivity.f28656H;
                        howToUnfreezeActivity.m(false);
                    }
                } else if (it2 instanceof m) {
                    howToUnfreezeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    howToUnfreezeActivity2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    int i12 = HowToUnfreezeActivity.f28656H;
                    howToUnfreezeActivity.m(false);
                }
                return Unit.f38893a;
        }
    }
}
