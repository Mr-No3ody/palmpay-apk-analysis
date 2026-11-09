package F5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;
import com.masteratul.exceptionhandler.DefaultErrorScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultErrorScreen f2590b;

    public /* synthetic */ a(DefaultErrorScreen defaultErrorScreen, int i7) {
        this.f2589a = i7;
        this.f2590b = defaultErrorScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DefaultErrorScreen defaultErrorScreen = this.f2590b;
        switch (this.f2589a) {
            case 0:
                if (defaultErrorScreen.f23568d.getVisibility() == 0) {
                    defaultErrorScreen.f23568d.setVisibility(8);
                    defaultErrorScreen.f23567c.setText("SHOW DETAILS");
                    return;
                } else {
                    defaultErrorScreen.f23568d.setVisibility(0);
                    defaultErrorScreen.f23567c.setText("HIDE DETAILS");
                    return;
                }
            default:
                Context applicationContext = defaultErrorScreen.getApplicationContext();
                int i7 = DefaultErrorScreen.f23564e;
                try {
                    if (applicationContext == null) {
                        throw new Exception("Was not able to restart application, Context null");
                    }
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager == null) {
                        throw new Exception("Was not able to restart application, PM null");
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(applicationContext.getPackageName());
                    if (launchIntentForPackage == null) {
                        throw new Exception("Was not able to restart application, mStartActivity null");
                    }
                    launchIntentForPackage.addFlags(67108864);
                    ((AlarmManager) applicationContext.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(applicationContext, 654311, launchIntentForPackage, 268435456));
                    System.exit(0);
                    return;
                } catch (Exception unused) {
                    Log.e("RN_ERROR_HANDLER", "Was not able to restart application");
                    return;
                }
        }
    }
}
