package Ce;

import android.content.DialogInterface;
import com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment;

/* JADX INFO: renamed from: Ce.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0161c implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankCardAndAccountFragment f1469b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0161c(BankCardAndAccountFragment bankCardAndAccountFragment, int i7) {
        this.f1468a = i7;
        this.f1469b = bankCardAndAccountFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1468a) {
            case 0:
                this.f1469b.x();
                break;
            default:
                this.f1469b.x();
                break;
        }
    }
}
