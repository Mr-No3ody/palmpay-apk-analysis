package androidx.webkit;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.webkit.internal.ConditionallySupportedFeature;
import androidx.webkit.internal.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a(String str) {
        androidx.webkit.internal.b bVar = o.f18308a;
        Set<ConditionallySupportedFeature> setUnmodifiableSet = Collections.unmodifiableSet(androidx.webkit.internal.c.f18293c);
        HashSet hashSet = new HashSet();
        for (ConditionallySupportedFeature conditionallySupportedFeature : setUnmodifiableSet) {
            if (conditionallySupportedFeature.getPublicFeatureName().equals(str)) {
                hashSet.add(conditionallySupportedFeature);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConditionallySupportedFeature) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    public static boolean b(Context context, String str) {
        boolean z3;
        boolean z8;
        androidx.webkit.internal.b bVar = o.f18308a;
        Set<androidx.webkit.internal.k> setUnmodifiableSet = Collections.unmodifiableSet(androidx.webkit.internal.k.f18302d);
        HashSet<androidx.webkit.internal.k> hashSet = new HashSet();
        for (androidx.webkit.internal.k kVar : setUnmodifiableSet) {
            if (kVar.f18303a.equals(str)) {
                hashSet.add(kVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        for (androidx.webkit.internal.k kVar2 : hashSet) {
            switch (kVar2.f18305c) {
                default:
                    if (Build.VERSION.SDK_INT >= 28) {
                        z3 = true;
                        break;
                    }
                case 0:
                    z3 = false;
                    break;
            }
            if (z3) {
                z8 = true;
            } else {
                PackageInfo packageInfoB = j.b(context);
                Bundle bundle = null;
                if (packageInfoB != null) {
                    ComponentName componentName = new ComponentName(packageInfoB.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                    if (Build.VERSION.SDK_INT >= 33) {
                        try {
                            bundle = context.getPackageManager().getServiceInfo(componentName, PackageManager.ComponentInfoFlags.of(640L)).metaData;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } else {
                        bundle = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                    }
                }
                if (bundle == null ? false : bundle.containsKey(kVar2.f18304b)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }
}
