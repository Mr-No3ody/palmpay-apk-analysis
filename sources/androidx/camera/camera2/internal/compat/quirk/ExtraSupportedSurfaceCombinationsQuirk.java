package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.C0995o;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.Quirk;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f13451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L0 f13452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f13453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f13454d;

    static {
        L0 l5 = new L0();
        M0 m7 = M0.VGA;
        F.g(2, m7, 0L, l5);
        M0 m10 = M0.PREVIEW;
        F.g(1, m10, 0L, l5);
        M0 m11 = M0.MAXIMUM;
        F.g(2, m11, 0L, l5);
        f13451a = l5;
        L0 l6 = new L0();
        l6.a(new C0995o(1, m10, 0L));
        l6.a(new C0995o(1, m7, 0L));
        F.g(2, m11, 0L, l6);
        f13452b = l6;
        f13453c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f13454d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean a() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f13454d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
