package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p279s5.d f13798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f13799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f13802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f13803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13804h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.concurrent.futures.m f13806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13807k = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f13805i = new ArrayList();

    public t(CaptureBundle captureBundle, p279s5.d dVar, Rect rect, int i7, int i10, Matrix matrix, v vVar, androidx.concurrent.futures.m mVar, int i11) {
        this.f13797a = i11;
        this.f13798b = dVar;
        this.f13801e = i10;
        this.f13800d = i7;
        this.f13799c = rect;
        this.f13802f = matrix;
        this.f13803g = vVar;
        this.f13804h = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        Iterator<CaptureStage> it = captureStages.iterator();
        while (it.hasNext()) {
            this.f13805i.add(Integer.valueOf(it.next().getId()));
        }
        this.f13806j = mVar;
    }
}
