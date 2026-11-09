package H0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    @DoNotInline
    public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
