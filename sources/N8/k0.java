package N8;

import android.view.View;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountActivity f6231b;

    public /* synthetic */ k0(VerifyAccountActivity verifyAccountActivity, int i7) {
        this.f6230a = i7;
        this.f6231b = verifyAccountActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VerifyAccountActivity verifyAccountActivity = this.f6231b;
        switch (this.f6230a) {
            case 0:
                verifyAccountActivity.finish();
                break;
            default:
                VerifyAccountActivity.a aVar = VerifyAccountActivity.f26062o;
                verifyAccountActivity.getClass();
                p059e1.a.X("key_location_permission_requested", true);
                verifyAccountActivity.checkLocationPermission(3);
                break;
        }
    }
}
