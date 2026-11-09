package p294tb;

import C0.G;
import android.content.DialogInterface;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpgradeInstallmentTransParentActivity f42533b;

    public /* synthetic */ z0(UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity, int i7) {
        this.f42532a = i7;
        this.f42533b = upgradeInstallmentTransParentActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity = this.f42533b;
        switch (this.f42532a) {
            case 0:
                int i7 = UpgradeInstallmentTransParentActivity.f29187u0;
                upgradeInstallmentTransParentActivity.y();
                break;
            case 1:
                int i10 = UpgradeInstallmentTransParentActivity.f29187u0;
                ARouter.getInstance().build("/main/home").navigation();
                upgradeInstallmentTransParentActivity.y();
                break;
            case 2:
                int i11 = UpgradeInstallmentTransParentActivity.f29187u0;
                upgradeInstallmentTransParentActivity.y();
                G.u(MessageEvent.EVENT_CL_OPEN_SUCCESS, c.b());
                break;
            default:
                int i12 = UpgradeInstallmentTransParentActivity.f29187u0;
                upgradeInstallmentTransParentActivity.y();
                break;
        }
    }
}
