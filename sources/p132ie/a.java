package p132ie;

import android.content.DialogInterface;
import com.transsnet.palmpay.ui.activity.bankcard.BankAccountDetailActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountDetailActivity f37577b;

    public /* synthetic */ a(BankAccountDetailActivity bankAccountDetailActivity, int i7) {
        this.f37576a = i7;
        this.f37577b = bankAccountDetailActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        BankAccountDetailActivity bankAccountDetailActivity = this.f37577b;
        switch (this.f37576a) {
            case 0:
                BankAccountDetailActivity.a aVar = BankAccountDetailActivity.f34631f;
                bankAccountDetailActivity.finish();
                break;
            default:
                BankAccountDetailActivity.a aVar2 = BankAccountDetailActivity.f34631f;
                bankAccountDetailActivity.finish();
                break;
        }
    }
}
