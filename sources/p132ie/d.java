package p132ie;

import android.content.DialogInterface;
import com.transsnet.palmpay.ui.activity.bankcard.BankCardDetailActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankCardDetailActivity f37582b;

    public /* synthetic */ d(BankCardDetailActivity bankCardDetailActivity, int i7) {
        this.f37581a = i7;
        this.f37582b = bankCardDetailActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        BankCardDetailActivity bankCardDetailActivity = this.f37582b;
        switch (this.f37581a) {
            case 0:
                int i7 = BankCardDetailActivity.f34641p;
                bankCardDetailActivity.finish();
                break;
            default:
                int i10 = BankCardDetailActivity.f34641p;
                bankCardDetailActivity.finish();
                break;
        }
    }
}
