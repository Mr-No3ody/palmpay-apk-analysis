package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f13698e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f13699f = new Size(320, 240);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f13700g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f13701h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C0966z0 f13702i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f13703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Size f13704b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ab.r f13705c = new Ab.r(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p183m6.j f13706d = new p183m6.j();

    public C0966z0(Context context) {
        this.f13703a = (DisplayManager) context.getSystemService("display");
    }

    public static C0966z0 b(Context context) {
        if (f13702i == null) {
            synchronized (f13701h) {
                try {
                    if (f13702i == null) {
                        f13702i = new C0966z0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13702i;
    }

    public static Display d(Display[] displayArr, boolean z3) {
        Display display = null;
        int i7 = -1;
        for (Display display2 : displayArr) {
            if (!z3 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i10 = point.x * point.y;
                if (i10 > i7) {
                    display = display2;
                    i7 = i10;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size sizeA;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = androidx.camera.core.internal.utils.d.f14361a;
        if (size.getHeight() * size.getWidth() < androidx.camera.core.internal.utils.d.a(f13699f)) {
            size = ((SmallDisplaySizeQuirk) this.f13706d.f39520b) != null ? (Size) SmallDisplaySizeQuirk.f13471a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f13700g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f13698e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.f13705c.f139b) != null && (sizeA = ExtraCroppingQuirk.a(1)) != null) {
            if (sizeA.getHeight() * sizeA.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeA;
            }
        }
        return size;
    }

    public final Display c(boolean z3) {
        Display[] displays = this.f13703a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayD = d(displays, z3);
        if (displayD == null && z3) {
            displayD = d(displays, false);
        }
        if (displayD != null) {
            return displayD;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f13704b != null) {
            return this.f13704b;
        }
        this.f13704b = a();
        return this.f13704b;
    }
}
