package androidx.camera.core.impl;

import E.C0211p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0211p f13946a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0984i0(2));
        f13946a = new C0211p(linkedHashSet);
    }

    public static void a(Context context, N2.a aVar, C0211p c0211p) throws P {
        Integer numB;
        int i7 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && androidx.camera.core.imagecapture.i.f(context) != 0) {
            LinkedHashSet linkedHashSetB = aVar.b();
            if (linkedHashSetB.isEmpty()) {
                throw new P("No cameras available", 0, null);
            }
            androidx.camera.core.imagecapture.i.f(context);
            linkedHashSetB.size();
            p140j8.f.G("CameraValidator");
            return;
        }
        if (c0211p != null) {
            try {
                numB = c0211p.b();
                if (numB == null) {
                    p140j8.f.G("CameraValidator");
                    return;
                }
            } catch (IllegalStateException e10) {
                p140j8.f.h("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            numB = null;
        }
        String str = Build.DEVICE;
        p140j8.f.G("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c0211p == null || numB.intValue() == 1)) {
                C0211p.f2092c.c(aVar.b());
                i7 = 1;
            }
        } catch (IllegalArgumentException e11) {
            illegalArgumentException = e11;
            p140j8.f.G("CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c0211p == null || numB.intValue() == 0)) {
                C0211p.f2091b.c(aVar.b());
                i7++;
            }
        } catch (IllegalArgumentException e12) {
            illegalArgumentException = e12;
            p140j8.f.G("CameraValidator");
        }
        try {
            f13946a.c(aVar.b());
            p140j8.f.G("CameraValidator");
            i7++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        p140j8.f.g("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + aVar.b());
        throw new P("Expected camera missing from device.", i7, illegalArgumentException);
    }
}
