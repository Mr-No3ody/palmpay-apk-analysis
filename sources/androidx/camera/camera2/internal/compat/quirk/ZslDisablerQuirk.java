package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements Quirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f13475a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f13476b = Arrays.asList("MI 8");

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
