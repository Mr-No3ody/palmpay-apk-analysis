package B6;

import com.google.mlkit.vision.face.FaceDetectorOptions;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: B6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0081c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaceDetectorOptions f464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f465b;

    public C0081c() {
        FaceDetectorOptions.Builder builder = new FaceDetectorOptions.Builder();
        builder.setPerformanceMode(1);
        builder.enableTracking();
        builder.setLandmarkMode(2);
        builder.setClassificationMode(2);
        builder.setContourMode(2);
        FaceDetectorOptions faceDetectorOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptionsBuild, "build(...)");
        this.f464a = faceDetectorOptionsBuild;
        this.f465b = C2131j.b(new Ae.j(this, 1));
    }
}
