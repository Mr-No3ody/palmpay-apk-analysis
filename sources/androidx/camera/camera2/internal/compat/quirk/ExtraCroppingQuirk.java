package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.Quirk;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements Quirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13450a;

    static {
        HashMap map = new HashMap();
        f13450a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    public static Size a(int i7) {
        if (!b()) {
            return null;
        }
        int i10 = F.i(i7);
        if (i10 == 0) {
            return new Size(1920, 1080);
        }
        if (i10 == 1) {
            return new Size(1280, 720);
        }
        if (i10 != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean b() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap map = f13450a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
