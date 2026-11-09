package Yd;

import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PickPaymentItemDialog f11352b;

    public /* synthetic */ o(PickPaymentItemDialog pickPaymentItemDialog, int i7) {
        this.f11351a = i7;
        this.f11352b = pickPaymentItemDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11351a) {
            case 0:
                return PickPaymentItemDialog.mPaymentList_delegate$lambda$0(this.f11352b);
            default:
                return Boolean.valueOf(PickPaymentItemDialog.initViews$lambda$5$lambda$4(this.f11352b));
        }
    }
}
