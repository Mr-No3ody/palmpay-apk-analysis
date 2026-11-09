package Yd;

import android.view.View;
import com.transsnet.palmpay.teller.ui.dialog.InputPaymentItemAmountDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputPaymentItemAmountDialog f11344b;

    public /* synthetic */ l(InputPaymentItemAmountDialog inputPaymentItemAmountDialog, int i7) {
        this.f11343a = i7;
        this.f11344b = inputPaymentItemAmountDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11343a) {
            case 0:
                this.f11344b.dismiss();
                break;
            case 1:
                InputPaymentItemAmountDialog.initViews$lambda$4(this.f11344b, view);
                break;
            default:
                InputPaymentItemAmountDialog.mAmountItemClickListener_delegate$lambda$2$lambda$1(this.f11344b, view);
                break;
        }
    }
}
