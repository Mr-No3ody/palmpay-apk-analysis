package B6;

import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: B6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0079a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputImage f443b;

    public C0079a(List faces, InputImage inputImage) {
        Intrinsics.checkNotNullParameter(faces, "faces");
        Intrinsics.checkNotNullParameter(inputImage, "inputImage");
        this.f442a = faces;
        this.f443b = inputImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0079a)) {
            return false;
        }
        C0079a c0079a = (C0079a) obj;
        return Intrinsics.c(this.f442a, c0079a.f442a) && Intrinsics.c(this.f443b, c0079a.f443b);
    }

    public final int hashCode() {
        return this.f443b.hashCode() + (this.f442a.hashCode() * 31);
    }

    public final String toString() {
        return "DetectionResult(faces=" + this.f442a + ", inputImage=" + this.f443b + ")";
    }
}
