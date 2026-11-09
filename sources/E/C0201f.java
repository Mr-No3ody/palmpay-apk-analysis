package E;

import android.graphics.Matrix;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.impl.O0;

/* JADX INFO: renamed from: E.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201f implements ImageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0 f2020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f2023d;

    public C0201f(O0 o10, long j6, int i7, Matrix matrix) {
        if (o10 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f2020a = o10;
        this.f2021b = j6;
        this.f2022c = i7;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f2023d = matrix;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0201f) {
            C0201f c0201f = (C0201f) obj;
            if (this.f2020a.equals(c0201f.f2020a) && this.f2021b == c0201f.f2021b && this.f2022c == c0201f.f2022c && this.f2023d.equals(c0201f.f2023d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return this.f2022c;
    }

    @Override // androidx.camera.core.ImageInfo
    public final Matrix getSensorToBufferTransformMatrix() {
        return this.f2023d;
    }

    @Override // androidx.camera.core.ImageInfo
    public final O0 getTagBundle() {
        return this.f2020a;
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.f2021b;
    }

    public final int hashCode() {
        int iHashCode = (this.f2020a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f2021b;
        return ((((iHashCode ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f2022c) * 1000003) ^ this.f2023d.hashCode();
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(androidx.camera.core.impl.utils.i iVar) {
        iVar.d(this.f2022c);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f2020a + ", timestamp=" + this.f2021b + ", rotationDegrees=" + this.f2022c + ", sensorToBufferTransformMatrix=" + this.f2023d + "}";
    }
}
