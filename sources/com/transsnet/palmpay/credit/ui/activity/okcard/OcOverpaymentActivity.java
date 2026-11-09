package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Jb.z;
import Pa.r0;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.resp.OcTotalOverpaymentData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOverpaymentActivity;
import com.transsnet.palmpay.credit.viewmodel.OcOverpaymentViewModel;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC溢缴款页", path = "/credit_score/oc_overpayment_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcOverpaymentActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcOverpaymentViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcOverpaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcOverpaymentActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcOverpaymentActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,85:1\n260#2,10:86\n296#2:96\n*S KotlinDebug\n*F\n+ 1 OcOverpaymentActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcOverpaymentActivity\n*L\n51#1:86,10\n51#1:96\n*E\n"})
public final class OcOverpaymentActivity extends CreditBaseMvvmActivity<OcOverpaymentViewModel> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f29634v = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29636g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29638j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29640p;
    public OcTotalOverpaymentData t;

    public OcOverpaymentActivity() {
        final int i7 = 0;
        this.f29635f = C2131j.b(new Function0(this) { // from class: ub.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOverpaymentActivity f42735b;

            {
                this.f42735b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOverpaymentActivity ocOverpaymentActivity = this.f42735b;
                switch (i7) {
                    case 0:
                        int i10 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_time_ll);
                    case 1:
                        int i11 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_tv);
                    case 2:
                        int i12 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_ll);
                    case 3:
                        int i13 = OcOverpaymentActivity.f29634v;
                        return ocOverpaymentActivity.findViewById(e.overpayment_divider_view);
                    case 4:
                        int i14 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_content_tv);
                    default:
                        int i15 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_amount_tv);
                }
            }
        });
        final int i10 = 1;
        this.f29636g = C2131j.b(new Function0(this) { // from class: ub.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOverpaymentActivity f42735b;

            {
                this.f42735b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOverpaymentActivity ocOverpaymentActivity = this.f42735b;
                switch (i10) {
                    case 0:
                        int i11 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_time_ll);
                    case 1:
                        int i12 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_tv);
                    case 2:
                        int i13 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_ll);
                    case 3:
                        int i14 = OcOverpaymentActivity.f29634v;
                        return ocOverpaymentActivity.findViewById(e.overpayment_divider_view);
                    case 4:
                        int i15 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_content_tv);
                    default:
                        int i16 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_amount_tv);
                }
            }
        });
        final int i11 = 2;
        this.f29637i = C2131j.b(new Function0(this) { // from class: ub.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOverpaymentActivity f42735b;

            {
                this.f42735b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOverpaymentActivity ocOverpaymentActivity = this.f42735b;
                switch (i11) {
                    case 0:
                        int i12 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_time_ll);
                    case 1:
                        int i13 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_tv);
                    case 2:
                        int i14 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_ll);
                    case 3:
                        int i15 = OcOverpaymentActivity.f29634v;
                        return ocOverpaymentActivity.findViewById(e.overpayment_divider_view);
                    case 4:
                        int i16 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_content_tv);
                    default:
                        int i17 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_amount_tv);
                }
            }
        });
        final int i12 = 3;
        this.f29638j = C2131j.b(new Function0(this) { // from class: ub.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOverpaymentActivity f42735b;

            {
                this.f42735b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOverpaymentActivity ocOverpaymentActivity = this.f42735b;
                switch (i12) {
                    case 0:
                        int i13 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_time_ll);
                    case 1:
                        int i14 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_tv);
                    case 2:
                        int i15 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_ll);
                    case 3:
                        int i16 = OcOverpaymentActivity.f29634v;
                        return ocOverpaymentActivity.findViewById(e.overpayment_divider_view);
                    case 4:
                        int i17 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_content_tv);
                    default:
                        int i18 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_amount_tv);
                }
            }
        });
        final int i13 = 4;
        this.f29639o = C2131j.b(new Function0(this) { // from class: ub.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOverpaymentActivity f42735b;

            {
                this.f42735b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOverpaymentActivity ocOverpaymentActivity = this.f42735b;
                switch (i13) {
                    case 0:
                        int i14 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_time_ll);
                    case 1:
                        int i15 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_tv);
                    case 2:
                        int i16 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_ll);
                    case 3:
                        int i17 = OcOverpaymentActivity.f29634v;
                        return ocOverpaymentActivity.findViewById(e.overpayment_divider_view);
                    case 4:
                        int i18 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_content_tv);
                    default:
                        int i19 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_amount_tv);
                }
            }
        });
        final int i14 = 5;
        this.f29640p = C2131j.b(new Function0(this) { // from class: ub.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOverpaymentActivity f42735b;

            {
                this.f42735b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOverpaymentActivity ocOverpaymentActivity = this.f42735b;
                switch (i14) {
                    case 0:
                        int i15 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_time_ll);
                    case 1:
                        int i16 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_tv);
                    case 2:
                        int i17 = OcOverpaymentActivity.f29634v;
                        return (LinearLayout) ocOverpaymentActivity.findViewById(e.overpayment_receive_acc_ll);
                    case 3:
                        int i18 = OcOverpaymentActivity.f29634v;
                        return ocOverpaymentActivity.findViewById(e.overpayment_divider_view);
                    case 4:
                        int i19 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_content_tv);
                    default:
                        int i110 = OcOverpaymentActivity.f29634v;
                        return (TextView) ocOverpaymentActivity.findViewById(e.overpayment_amount_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_overpayment_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        OcOverpaymentViewModel ocOverpaymentViewModel = (OcOverpaymentViewModel) l();
        ocOverpaymentViewModel.getClass();
        p140j8.f.s(ocOverpaymentViewModel, new z(1, null), ocOverpaymentViewModel.f30921e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String strY;
        String strSubstring;
        super.setupView();
        initStatusBar(getColor(Ya.b.cs_oc_overpayment_bg_color));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String strX = r0.X(BaseApplication.getInstance().getUser().getPhoneNumber());
        Object value = this.f29636g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        if ((strX != null ? strX.length() : 0) >= 4) {
            if (strX != null) {
                strSubstring = strX.substring(strX.length() - 4, strX.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            strY = G.o("**** ", strSubstring);
        } else {
            strY = r0.Y(strX);
        }
        textView.setText(strY);
        l lVar = ((OcOverpaymentViewModel) l()).f30921e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 26), 0, (char) 0));
        }
    }
}
