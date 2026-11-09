package I1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f3962a = new ConcurrentHashMap();

    public static Key a(Context context) {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = f3962a;
        Key key = (Key) concurrentHashMap.get(packageName);
        if (key != null) {
            return key;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            packageInfo = null;
        }
        d dVar = new d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        Key key2 = (Key) concurrentHashMap.putIfAbsent(packageName, dVar);
        return key2 == null ? dVar : key2;
    }
}
