package com.transsnet.palmpay.credit.ui.activity.okcard;

import Jb.A;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.resp.OcDefaultPayMethodStatusData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSetDefaultPayMethodActivity;
import com.transsnet.palmpay.credit.viewmodel.OcSetDefaultPayMethodViewModel;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p284sb.C2023v;
import p285sc.x;
import p310ub.s1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC设置默认支付方式页", path = "/credit_score/oc_set_default_pay_method_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcSetDefaultPayMethodActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcSetDefaultPayMethodViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcSetDefaultPayMethodActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcSetDefaultPayMethodActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcSetDefaultPayMethodActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,118:1\n260#2,10:119\n296#2:129\n260#2,10:130\n296#2:140\n*S KotlinDebug\n*F\n+ 1 OcSetDefaultPayMethodActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcSetDefaultPayMethodActivity\n*L\n45#1:119,10\n45#1:129\n57#1:130,10\n57#1:140\n*E\n"})
public final class OcSetDefaultPayMethodActivity extends CreditBaseMvvmActivity<OcSetDefaultPayMethodViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29865j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29867g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OcDefaultPayMethodStatusData f29868i;

    public OcSetDefaultPayMethodActivity() {
        final int i7 = 0;
        this.f29866f = C2131j.b(new Function0(this) { // from class: ub.r1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSetDefaultPayMethodActivity f42914b;

            {
                this.f42914b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity = this.f42914b;
                switch (i7) {
                    case 0:
                        int i10 = OcSetDefaultPayMethodActivity.f29865j;
                        return (TextView) ocSetDefaultPayMethodActivity.findViewById(e.set_now_tv);
                    default:
                        int i11 = OcSetDefaultPayMethodActivity.f29865j;
                        return (TextView) ocSetDefaultPayMethodActivity.findViewById(e.set_def_pay_method_title_tv);
                }
            }
        });
        final int i10 = 1;
        this.f29867g = C2131j.b(new Function0(this) { // from class: ub.r1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcSetDefaultPayMethodActivity f42914b;

            {
                this.f42914b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity = this.f42914b;
                switch (i10) {
                    case 0:
                        int i11 = OcSetDefaultPayMethodActivity.f29865j;
                        return (TextView) ocSetDefaultPayMethodActivity.findViewById(e.set_now_tv);
                    default:
                        int i12 = OcSetDefaultPayMethodActivity.f29865j;
                        return (TextView) ocSetDefaultPayMethodActivity.findViewById(e.set_def_pay_method_title_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_set_defalult_pay_method_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((OcSetDefaultPayMethodViewModel) l()).f30922e;
        if (lVar != null) {
            lVar.e(this, new C2023v(new s1(this, this, 0), 8));
        }
        l lVar2 = ((OcSetDefaultPayMethodViewModel) l()).f30923f;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new s1(this, this, 1), 8));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        OcSetDefaultPayMethodViewModel ocSetDefaultPayMethodViewModel = (OcSetDefaultPayMethodViewModel) l();
        ocSetDefaultPayMethodViewModel.getClass();
        p140j8.f.s(ocSetDefaultPayMethodViewModel, new A(1, null), ocSetDefaultPayMethodViewModel.f30922e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        BarUtils.setStatusBarLightMode((Activity) this, true);
        Object value = this.f29866f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.l(new x(this, 28), (TextView) value);
    }
}
