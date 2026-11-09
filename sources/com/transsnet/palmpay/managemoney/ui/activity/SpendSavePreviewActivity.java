package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.mvp.contract.FixedSavingContract;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/spend_save_preview_activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/SpendSavePreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/m;", "LPc/b;", "Lcom/transsnet/palmpay/managemoney/ui/mvp/contract/FixedSavingContract$View;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpendSavePreviewActivity extends AbstractActivityC1479m implements FixedSavingContract.View {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f32192u0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final p355xf.t f32193Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p355xf.t f32194Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p355xf.t f32195k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final p355xf.t f32196p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final p355xf.t f32197q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final p355xf.t f32198r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final p355xf.t f32199s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f32200t0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public SpendSavePreviewActivity() {
        final int i7 = 0;
        this.f32193Y = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i7) {
                    case 0:
                        int i10 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i11 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i12 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i13 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i14 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i15 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
        final int i10 = 1;
        this.f32194Z = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i10) {
                    case 0:
                        int i11 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i12 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i13 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i14 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i15 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i17 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
        final int i11 = 2;
        this.f32195k0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i11) {
                    case 0:
                        int i12 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i13 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i14 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i15 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i17 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i18 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
        final int i12 = 3;
        this.f32196p0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i12) {
                    case 0:
                        int i13 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i14 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i15 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i17 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i18 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i19 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
        final int i13 = 4;
        this.f32197q0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i13) {
                    case 0:
                        int i14 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i15 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i17 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i18 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i19 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i110 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
        final int i14 = 5;
        this.f32198r0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i14) {
                    case 0:
                        int i15 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i17 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i18 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i19 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i110 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i111 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
        final int i15 = 6;
        this.f32199s0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32208b;

            {
                this.f32208b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32208b;
                switch (i15) {
                    case 0:
                        int i16 = SpendSavePreviewActivity.f32192u0;
                        return (RoundedTextView) spendSavePreviewActivity.findViewById(Jc.c.rtvPay);
                    case 1:
                        int i17 = SpendSavePreviewActivity.f32192u0;
                        return (ModelPreviewPaymentMethodItem) spendSavePreviewActivity.findViewById(Jc.c.paymentMethodItem);
                    case 2:
                        int i18 = SpendSavePreviewActivity.f32192u0;
                        return (IconicsImageView) spendSavePreviewActivity.findViewById(Jc.c.ivClose);
                    case 3:
                        int i19 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderNo");
                    case 4:
                        int i110 = SpendSavePreviewActivity.f32192u0;
                        return Long.valueOf(spendSavePreviewActivity.getIntent().getLongExtra("total_back_amount", 0L));
                    case 5:
                        int i111 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("transType");
                    default:
                        int i112 = SpendSavePreviewActivity.f32192u0;
                        return spendSavePreviewActivity.getIntent().getStringExtra("orderType");
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final int D() {
        return 1;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void N() {
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void O(PreviewPayInfoResp.DataBean dataBean) {
        if (S() != null) {
            S().setPaymentMethod(this.f27789d);
        }
    }

    public final void Q() {
        if (this.f27789d == null) {
            ToastUtils.showShort("please select a payment method", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f27793i)) {
            ToastUtils.showLong("orderNo is null", new Object[0]);
            finish();
        } else {
            if (r0.U0()) {
                return;
            }
            E();
        }
    }

    public final void R() {
        PaymentMethod paymentMethod = this.f27789d;
        if (paymentMethod == null) {
            S().setPaymentMethod(null);
            return;
        }
        PreviewPayInfoResp.DataBean dataBean = this.f32200t0;
        p355xf.t tVar = this.f32193Y;
        if (dataBean == null) {
            S().d(false);
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((RoundedTextView) value).setEnabled(false);
            return;
        }
        int i7 = paymentMethod.payType;
        boolean z3 = !(i7 == 1 || i7 == 18) || dataBean.payAmount <= paymentMethod.availableBalance;
        S().d(z3);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RoundedTextView) value2).setEnabled(z3);
    }

    public final ModelPreviewPaymentMethodItem S() {
        Object value = this.f32194Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelPreviewPaymentMethodItem) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_spend_save_preview_activity;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount */
    public final long getF29089u0() {
        Long l5 = (Long) this.f32197q0.getValue();
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        String str = (String) this.f32198r0.getValue();
        return str == null ? "" : str;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        this.f27793i = (String) this.f32196p0.getValue();
        setPayAmount(getF29089u0());
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new Pc.b();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            M(3);
            return;
        }
        this.f27789d = paymentMethod;
        S().setPaymentMethod(this.f27789d);
        Q();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Object value = this.f32195k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        ((IconicsImageView) value).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32202b;

            {
                this.f32202b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32202b;
                switch (i7) {
                    case 0:
                        int i10 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.finish();
                        break;
                    case 1:
                        int i11 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.M(3);
                        break;
                    default:
                        int i12 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.Q();
                        break;
                }
            }
        });
        final int i10 = 1;
        S().setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32202b;

            {
                this.f32202b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32202b;
                switch (i10) {
                    case 0:
                        int i11 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.finish();
                        break;
                    case 1:
                        int i12 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.M(3);
                        break;
                    default:
                        int i13 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.Q();
                        break;
                }
            }
        });
        Object value2 = this.f32193Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i11 = 2;
        ((RoundedTextView) value2).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpendSavePreviewActivity f32202b;

            {
                this.f32202b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpendSavePreviewActivity spendSavePreviewActivity = this.f32202b;
                switch (i11) {
                    case 0:
                        int i12 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.finish();
                        break;
                    case 1:
                        int i13 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.M(3);
                        break;
                    default:
                        int i14 = SpendSavePreviewActivity.f32192u0;
                        spendSavePreviewActivity.Q();
                        break;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.managemoney.ui.mvp.contract.FixedSavingContract.View
    public final void showPreviewInfoResp(PreviewPayInfoResp resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        this.f32200t0 = resp.getData();
        I(resp.getData());
        R();
    }

    @Override // com.transsnet.palmpay.managemoney.ui.mvp.contract.FixedSavingContract.View
    public final void showPreviewInfoRespError(String errMsg) {
        Intrinsics.checkNotNullParameter(errMsg, "errMsg");
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        setPayAmount(dataBean != null ? dataBean.payAmount : 0L);
        this.f32200t0 = dataBean;
        R();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        String str = (String) this.f32199s0.getValue();
        return str == null ? "" : str;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        return new PreviewPayInfoV2Req();
    }
}
