package Hg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3929a;

    public /* synthetic */ c(int i7) {
        this.f3929a = i7;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f3929a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Dg.c.f1883e);
                return simpleDateFormat;
            case 1:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 2:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 3:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 4:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return org.chromium.support_lib_boundary.util.b.S();
                }
                if (Looper.myLooper() != null) {
                    return new androidx.camera.core.impl.utils.executor.d(new Handler(Looper.myLooper()));
                }
                return null;
            case 5:
                return new PathMeasure();
            case 6:
                return new Path();
            case 7:
                return new Path();
            case 8:
                return new float[4];
            case 9:
                return new org.greenrobot.eventbus.b();
            case 10:
                c cVar = p262r2.a.f41548a;
                return ByteBuffer.allocate(16384);
            case 11:
                try {
                    return Cipher.getInstance("RSA/ECB/OAEPPadding");
                } catch (Exception unused) {
                    return null;
                }
            case 12:
                try {
                    return Cipher.getInstance("AES/GCM/NoPadding");
                } catch (Exception unused2) {
                    return null;
                }
            default:
                return new SecureRandom();
        }
    }
}
