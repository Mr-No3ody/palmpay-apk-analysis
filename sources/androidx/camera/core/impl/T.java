package androidx.camera.core.impl;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0971c f13963i = new C0971c("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0971c f13964j = new C0971c("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0971c f13965k = new C0971c("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1000q0 f13967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O0 f13972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CameraCaptureResult f13973h;

    public T(ArrayList arrayList, C1000q0 c1000q0, int i7, boolean z3, ArrayList arrayList2, boolean z8, O0 o10, CameraCaptureResult cameraCaptureResult) {
        this.f13966a = arrayList;
        this.f13967b = c1000q0;
        this.f13968c = i7;
        this.f13970e = Collections.unmodifiableList(arrayList2);
        this.f13971f = z8;
        this.f13972g = o10;
        this.f13973h = cameraCaptureResult;
        this.f13969d = z3;
    }

    public final int a() {
        Object obj = this.f13972g.f13941a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Object objRetrieveOption = 0;
        try {
            objRetrieveOption = this.f13967b.retrieveOption(UseCaseConfig.f13991W);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objRetrieveOption;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Object objRetrieveOption = 0;
        try {
            objRetrieveOption = this.f13967b.retrieveOption(UseCaseConfig.f13992a0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objRetrieveOption;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
