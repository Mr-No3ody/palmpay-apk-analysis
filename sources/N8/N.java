package N8;

import android.app.Activity;
import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.activity.SetNewPswActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetNewPswActivity f6167b;

    public /* synthetic */ N(SetNewPswActivity setNewPswActivity, int i7) {
        this.f6166a = i7;
        this.f6167b = setNewPswActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        SetNewPswActivity setNewPswActivity = this.f6167b;
        switch (this.f6166a) {
            case 0:
                int i7 = SetNewPswActivity.f25987e;
                Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.LogInActivity");
                if (activityIsActivityExistsInStack != null) {
                    ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                } else {
                    com.palmpay.lib.apm.launchcounter.util.d.H("/account/login", "_number", setNewPswActivity.f25990d);
                    setNewPswActivity.finish();
                }
                break;
            default:
                int i10 = SetNewPswActivity.f25987e;
                if (!BaseApplication.hasLogin()) {
                    Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.account.ui.activity.LogInActivity");
                    if (activityIsActivityExistsInStack2 != null) {
                        ActivityUtils.finishToActivity(activityIsActivityExistsInStack2, false);
                    } else {
                        com.palmpay.lib.apm.launchcounter.util.d.H("/account/login", "_number", setNewPswActivity.f25990d);
                        setNewPswActivity.finish();
                    }
                } else {
                    int i11 = setNewPswActivity.f25989c;
                    if (4 == i11 || 6 == i11) {
                        BaseApplication.get().getUser().enableLoginPsw();
                        BaseApplication.get().getUser().setLoginPswFlag(true);
                        io.fastkv.n.M(false);
                    } else {
                        ActivityUtils.finishAllActivitiesExceptNewest();
                        Pa.i0.H(null);
                    }
                    setNewPswActivity.finish();
                }
                break;
        }
    }
}
