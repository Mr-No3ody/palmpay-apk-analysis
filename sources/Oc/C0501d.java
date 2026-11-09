package Oc;

import android.widget.CompoundButton;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserOpenDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserUseCouponDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0501d implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoundedTextView f6760b;

    public /* synthetic */ C0501d(RoundedTextView roundedTextView, int i7) {
        this.f6759a = i7;
        this.f6760b = roundedTextView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        RoundedTextView roundedTextView = this.f6760b;
        switch (this.f6759a) {
            case 0:
                CashBoxNewUserOpenDialogFragment.a aVar = CashBoxNewUserOpenDialogFragment.f32282L;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                roundedTextView.setEnabled(z3);
                break;
            default:
                int i7 = CashBoxNewUserUseCouponDialogFragment.f32283L;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                roundedTextView.setEnabled(z3);
                break;
        }
    }
}
