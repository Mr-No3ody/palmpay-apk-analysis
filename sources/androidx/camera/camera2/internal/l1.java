package androidx.camera.camera2.internal;

import E.C0216v;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.ImageProxy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements ZslControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.internal.utils.e f13586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13587c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13588d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E.d0 f13591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E.V f13592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public E.j0 f13593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageWriter f13594j;

    public l1(androidx.camera.camera2.internal.compat.l lVar) {
        this.f13589e = false;
        this.f13590f = false;
        this.f13585a = lVar;
        this.f13589e = J3.a.z(lVar, 4);
        this.f13590f = androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ZslDisablerQuirk.class) != null;
        this.f13586b = new androidx.camera.core.internal.utils.e(3, new W(3));
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final void addZslConfig(androidx.camera.core.impl.C0 c0) {
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        androidx.camera.camera2.internal.compat.l lVar = this.f13585a;
        while (true) {
            androidx.camera.core.internal.utils.e eVar = this.f13586b;
            if (eVar.isEmpty()) {
                break;
            } else {
                ((ImageProxy) eVar.dequeue()).close();
            }
        }
        E.j0 j0Var = this.f13593i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (j0Var != null) {
            E.d0 d0Var = this.f13591g;
            if (d0Var != null) {
                androidx.camera.core.impl.utils.futures.j.e(j0Var.f14025e).addListener(new RunnableC0961x(d0Var, 10), org.chromium.support_lib_boundary.util.b.S());
                this.f13591g = null;
            }
            j0Var.a();
            this.f13593i = null;
        }
        ImageWriter imageWriter = this.f13594j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f13594j = null;
        }
        if (this.f13587c) {
            c0.f13839b.f13957c = 1;
            return;
        }
        if (this.f13590f) {
            c0.f13839b.f13957c = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) lVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e10) {
            p140j8.f.g("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e10.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i7 : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i7);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new androidx.camera.core.impl.utils.d(true));
                    map.put(Integer.valueOf(i7), inputSizes[0]);
                }
            }
        }
        if (this.f13589e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) lVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i10 : validOutputFormatsForInput) {
                if (i10 == 256) {
                    Size size = (Size) map.get(34);
                    E.W w3 = new E.W(size.getWidth(), size.getHeight(), 34, 9);
                    this.f13592h = w3.f1959b;
                    this.f13591g = new E.d0(w3);
                    w3.setOnImageAvailableListener(new C0936k(this, 8), org.chromium.support_lib_boundary.util.b.M());
                    E.j0 j0Var2 = new E.j0(this.f13591g.getSurface(), new Size(this.f13591g.getWidth(), this.f13591g.getHeight()), 34);
                    this.f13593i = j0Var2;
                    E.d0 d0Var2 = this.f13591g;
                    ListenableFuture listenableFutureE = androidx.camera.core.impl.utils.futures.j.e(j0Var2.f14025e);
                    Objects.requireNonNull(d0Var2);
                    listenableFutureE.addListener(new RunnableC0961x(d0Var2, 10), org.chromium.support_lib_boundary.util.b.S());
                    c0.c(this.f13593i, C0216v.f2122d, -1);
                    c0.a(this.f13592h);
                    C0943n0 c0943n0 = new C0943n0(this, 2);
                    ArrayList arrayList = c0.f13841d;
                    if (!arrayList.contains(c0943n0)) {
                        arrayList.add(c0943n0);
                    }
                    c0.f13844g = new InputConfiguration(this.f13591g.getWidth(), this.f13591g.getHeight(), this.f13591g.getImageFormat());
                    return;
                }
            }
        }
        c0.f13839b.f13957c = 1;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final ImageProxy dequeueImageFromBuffer() {
        try {
            return (ImageProxy) this.f13586b.dequeue();
        } catch (NoSuchElementException unused) {
            p140j8.f.g("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        Image image = imageProxy.getImage();
        ImageWriter imageWriter = this.f13594j;
        if (imageWriter != null && image != null) {
            try {
                imageWriter.queueInputImage(image);
                return true;
            } catch (IllegalStateException e10) {
                p140j8.f.g("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final boolean isZslDisabledByFlashMode() {
        return this.f13588d;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final boolean isZslDisabledByUserCaseConfig() {
        return this.f13587c;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final void setZslDisabledByFlashMode(boolean z3) {
        this.f13588d = z3;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public final void setZslDisabledByUserCaseConfig(boolean z3) {
        this.f13587c = z3;
    }
}
