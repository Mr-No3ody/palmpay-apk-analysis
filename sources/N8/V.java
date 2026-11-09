package N8;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetTouchIdActivity f6181b;

    public /* synthetic */ V(SetTouchIdActivity setTouchIdActivity, int i7) {
        this.f6180a = i7;
        this.f6181b = setTouchIdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SetTouchIdActivity setTouchIdActivity = this.f6181b;
        switch (this.f6180a) {
            case 0:
                setTouchIdActivity.setResult(0);
                if (!setTouchIdActivity.f26020i.booleanValue()) {
                    setTouchIdActivity.finish();
                }
                break;
            case 1:
                int i7 = SetTouchIdActivity.f26012o;
                setTouchIdActivity.l();
                try {
                    Intent intent = new Intent(Build.VERSION.SDK_INT > 27 ? "android.settings.FINGERPRINT_ENROLL" : "android.settings.SECURITY_SETTINGS");
                    intent.addFlags(268435456);
                    setTouchIdActivity.startActivity(intent);
                } catch (Exception e10) {
                    F6.d.c(setTouchIdActivity.TAG, "launcherTouchIdSettingPage: ", e10);
                    return;
                }
                break;
            default:
                if (view.getId() == F8.d.acsti_use_pattern_tv) {
                    ARouter.getInstance().build("/account/set_pattern_pin").withBoolean("IS_FORCE_SETTING_MODE", true).navigation();
                    setTouchIdActivity.finish();
                }
                break;
        }
    }
}
