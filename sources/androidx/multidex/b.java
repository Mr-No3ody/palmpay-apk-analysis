package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (a.f17488b) {
            return;
        }
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException unused) {
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            a.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
        } catch (Exception e10) {
            Log.e("MultiDex", "MultiDex installation failure", e10);
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }
}
