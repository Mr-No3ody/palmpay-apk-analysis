package Pa;

import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f7010b;

    public /* synthetic */ C(BaseActivity baseActivity, int i7) {
        this.f7009a = i7;
        this.f7010b = baseActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7009a) {
            case 0:
                BaseActivity activity = this.f7010b;
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                    intent.addFlags(268435456);
                    activity.startActivity(intent);
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.settings.SETTINGS");
                    intent2.addFlags(268435456);
                    ActivityUtils.startActivity(intent2);
                    return;
                }
                break;
            default:
                this.f7010b.lambda$bindDebugScreenshotClick$3(view);
                break;
        }
    }
}
