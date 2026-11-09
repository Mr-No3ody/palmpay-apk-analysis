package P3;

import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCoreCashierViewModel;
import com.flexibank.sdk.core.bean.FlexiBankBankInfo;
import com.flexibank.sdk.core.bean.FlexiBankPaymentMethod;
import com.flexibank.sdk.core.dialog.FlexiBankSelectBankDialogV2$CallBack;
import com.flexibank.sdk.q;
import com.flexibank.sdk.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends K3.d implements FlexiBankCashierSelectPayMethodDialog$CallBack, FlexiBankSelectBankDialogV2$CallBack {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f6877A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f6878B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f6879C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f6880H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f6881L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f6882M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f6883Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f6884X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f6885Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(FlexiBankCoreCashierViewModel.class);
        Intrinsics.checkNotNullParameter(FlexiBankCoreCashierViewModel.class, "viewModelClass");
        this.f6882M = -1L;
        final int i7 = 0;
        this.f6884X = C2131j.b(new Function0(this) { // from class: P3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f6874b;

            {
                this.f6874b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        c context = this.f6874b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        return new Q3.d(context, q.fb_layout_payment_fee_detail_dialog, s.fb_BaseDialogTheme);
                    default:
                        c context2 = this.f6874b;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new Q3.f(context2, q.fb_layout_payment_tax_detail_dialog, s.fb_BaseDialogTheme);
                }
            }
        });
        final int i10 = 1;
        this.f6885Y = C2131j.b(new Function0(this) { // from class: P3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f6874b;

            {
                this.f6874b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        c context = this.f6874b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        return new Q3.d(context, q.fb_layout_payment_fee_detail_dialog, s.fb_BaseDialogTheme);
                    default:
                        c context2 = this.f6874b;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new Q3.f(context2, q.fb_layout_payment_tax_detail_dialog, s.fb_BaseDialogTheme);
                }
            }
        });
    }

    public abstract void g(FlexiBankPayByOrderResp.DataBean dataBean);

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack
    public final void onAddNewBankAccountClick() {
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack
    public final void onAddNewBankCardClick() {
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack
    public final void onAddNewBankCardOrBankAccountClick() {
    }

    @Override // com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack
    public final void onUseNewMobileWalletClick() {
    }

    @Override // com.flexibank.sdk.core.dialog.FlexiBankSelectBankDialogV2$CallBack
    public final void onChooseBankClick(FlexiBankBankInfo flexiBankBankInfo) {
    }

    @Override // com.flexibank.sdk.core.dialog.FlexiBankSelectBankDialogV2$CallBack
    public final void onClickPayMethod(FlexiBankPaymentMethod flexiBankPaymentMethod) {
    }
}
