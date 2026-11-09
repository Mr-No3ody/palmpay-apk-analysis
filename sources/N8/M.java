package N8;

import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetNewPinV2Activity f6165b;

    public /* synthetic */ M(SetNewPinV2Activity setNewPinV2Activity, int i7) {
        this.f6164a = i7;
        this.f6165b = setNewPinV2Activity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        SetNewPinV2Activity setNewPinV2Activity = this.f6165b;
        switch (this.f6164a) {
            case 0:
                int i7 = SetNewPinV2Activity.f25976v;
                if (BaseApplication.hasLogin()) {
                    ActivityUtils.finishAllActivitiesExceptNewest();
                    Pa.i0.H(null);
                } else {
                    ActivityUtils.finishAllActivitiesExceptNewest();
                    setNewPinV2Activity.p();
                }
                setNewPinV2Activity.finish();
                break;
            case 1:
                int i10 = SetNewPinV2Activity.f25976v;
                setNewPinV2Activity.finish();
                break;
            default:
                int i11 = SetNewPinV2Activity.f25976v;
                setNewPinV2Activity.p();
                break;
        }
    }
}
