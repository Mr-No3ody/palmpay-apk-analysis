package p310ub;

import Kd.C0408q1;
import android.content.DialogInterface;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankViewModel;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42767b;

    public /* synthetic */ K(Object obj, int i7) {
        this.f42766a = i7;
        this.f42767b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj = this.f42767b;
        switch (this.f42766a) {
            case 0:
                int i7 = OcFeedbackActivity.f29425H;
                ((OcFeedbackActivity) obj).finish();
                break;
            case 1:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) ((TransferToBankInputAmountActivity) obj).l();
                if (transferToBankViewModel != null) {
                    f.s(transferToBankViewModel, new C0408q1(1, null), new l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            default:
                LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                ((LoanHomeFragment) obj).A();
                break;
        }
    }
}
