package P3;

import android.os.SystemClock;
import android.view.View;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.p;
import com.flexibank.sdk.r;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6894b;

    public /* synthetic */ g(com.flexibank.sdk.cashier.ui.activity.a aVar, int i7) {
        this.f6893a = i7;
        this.f6894b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6893a) {
            case 0:
                this.f6894b.finish();
                break;
            case 1:
                this.f6894b.finish();
                break;
            case 2:
                this.f6894b.t();
                break;
            case 3:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - D3.a.f1586b >= 500) {
                    D3.a.f1586b = jElapsedRealtime;
                    this.f6894b.finish();
                    break;
                }
                break;
            default:
                com.flexibank.sdk.cashier.ui.activity.a aVar = this.f6894b;
                aVar.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (jElapsedRealtime2 - D3.a.f1586b >= 500) {
                    D3.a.f1586b = jElapsedRealtime2;
                    FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = aVar.f21991u0;
                    if (flexiBankCashierPaymentMethodBean != null) {
                        long j6 = aVar.f6882M;
                        Intrinsics.checkNotNullParameter(flexiBankCashierPaymentMethodBean, "<this>");
                        int senderAccountType = flexiBankCashierPaymentMethodBean.getSenderAccountType();
                        if ((senderAccountType == 1 || senderAccountType == 28) && flexiBankCashierPaymentMethodBean.getAvailableBalance() < j6) {
                            aVar.t();
                        } else if (aVar.f21989s0 == null) {
                            aVar.j();
                        } else if (aVar.f21991u0 == null) {
                            View viewFindViewById = aVar.findViewById(p.fb_cl_cashier_preview);
                            if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
                                aVar.finish();
                            }
                        } else {
                            aVar.u();
                        }
                    } else {
                        ToastUtils.showLong(r.fb_msg_select_payment_method);
                    }
                    break;
                }
                break;
        }
    }
}
