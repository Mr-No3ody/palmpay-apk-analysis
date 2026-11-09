package Ad;

import android.view.View;
import com.transsnet.palmpay.send_money.ui.dialog.NotificationEmailDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class S implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationEmailDialog f186b;

    public /* synthetic */ S(NotificationEmailDialog notificationEmailDialog, int i7) {
        this.f185a = i7;
        this.f186b = notificationEmailDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f185a) {
            case 0:
                NotificationEmailDialog.initViews$lambda$5(this.f186b, view);
                break;
            default:
                NotificationEmailDialog.onClickListener$lambda$9(this.f186b, view);
                break;
        }
    }
}
