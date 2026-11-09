package androidx.webkit;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.webkit.internal.p;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static C2085k0 a(WebSettings webSettings) {
        try {
            return new C2085k0((WebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) p.f18326a.f8871b).convertSettings(webSettings)), 15);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e10;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e10);
            return new androidx.webkit.internal.l(null, 15);
        }
    }
}
