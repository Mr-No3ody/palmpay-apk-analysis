package N8;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdV2Activity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetTouchIdV2Activity f6185b;

    public /* synthetic */ X(SetTouchIdV2Activity setTouchIdV2Activity, int i7) {
        this.f6184a = i7;
        this.f6185b = setTouchIdV2Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SetTouchIdV2Activity setTouchIdV2Activity = this.f6185b;
        switch (this.f6184a) {
            case 0:
                int i7 = SetTouchIdV2Activity.f26022g;
                setTouchIdV2Activity.setResult(0);
                setTouchIdV2Activity.finish();
                break;
            case 1:
                int i10 = SetTouchIdV2Activity.f26022g;
                try {
                    Intent intent = new Intent(Build.VERSION.SDK_INT > 27 ? "android.settings.FINGERPRINT_ENROLL" : "android.settings.SECURITY_SETTINGS");
                    intent.addFlags(268435456);
                    setTouchIdV2Activity.startActivity(intent);
                } catch (Exception e10) {
                    F6.d.c(setTouchIdV2Activity.TAG, "launcherTouchIdSettingPage: ", e10);
                    return;
                }
                break;
            default:
                int i11 = SetTouchIdV2Activity.f26022g;
                setTouchIdV2Activity.setResult(0);
                setTouchIdV2Activity.finish();
                break;
        }
    }
}
