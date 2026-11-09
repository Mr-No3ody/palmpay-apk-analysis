package Wc;

import android.view.View;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayDepositDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PItemView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f10678b;

    public /* synthetic */ g(Runnable runnable, int i7) {
        this.f10677a = i7;
        this.f10678b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable = this.f10678b;
        switch (this.f10677a) {
            case 0:
                PayDepositDialog.lambda$setNotice$3(runnable, view);
                break;
            case 1:
                PayDepositDialog.lambda$setNotice$4(runnable, view);
                break;
            case 2:
                int i7 = P2PItemView.f33016f;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 3:
                int i10 = P2PItemView.f33016f;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                int i11 = P2PItemView.f33016f;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
