package Ce;

import android.content.DialogInterface;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: renamed from: Ce.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0168j implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1492a;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0168j(int i7) {
        this.f1492a = i7;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1492a) {
            case 0:
                break;
            case 1:
                int i7 = PinSafeWithPatternActivity.f25946g;
                break;
            case 2:
                int i10 = SetNewPinV2Activity.f25976v;
                ARouter.getInstance().build("/account/login").navigation();
                ActivityUtils.finishAllActivities();
                break;
            case 3:
                Pa.D.f7011a = false;
                break;
            case 4:
                int i11 = OcApplyResultActivity.f29276O0;
                com.palmpay.lib.apm.launchcounter.util.d.H("/main/home", "tab", "finance");
                break;
            default:
                int i12 = OcContactActivity.f29378l1;
                break;
        }
    }
}
