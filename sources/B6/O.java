package B6;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0100w f410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f414e;

    public O(EnumC0100w enumC0100w, float f10, boolean z3, File file, Bitmap bitmap) {
        this.f410a = enumC0100w;
        this.f411b = f10;
        this.f412c = z3;
        this.f413d = file;
        this.f414e = bitmap;
    }

    public static O a(O o10, EnumC0100w enumC0100w, float f10, boolean z3, File file, Bitmap bitmap, int i7) {
        if ((i7 & 1) != 0) {
            enumC0100w = o10.f410a;
        }
        EnumC0100w enumC0100w2 = enumC0100w;
        if ((i7 & 2) != 0) {
            f10 = o10.f411b;
        }
        float f11 = f10;
        if ((i7 & 8) != 0) {
            file = o10.f413d;
        }
        File file2 = file;
        if ((i7 & 16) != 0) {
            bitmap = o10.f414e;
        }
        o10.getClass();
        return new O(enumC0100w2, f11, z3, file2, bitmap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f410a == o10.f410a && Float.compare(this.f411b, o10.f411b) == 0 && this.f412c == o10.f412c && Intrinsics.c(this.f413d, o10.f413d) && Intrinsics.c(this.f414e, o10.f414e);
    }

    public final int hashCode() {
        EnumC0100w enumC0100w = this.f410a;
        int iD = androidx.camera.video.u.d((Float.hashCode(this.f411b) + ((enumC0100w == null ? 0 : enumC0100w.hashCode()) * 31)) * 31, 31, this.f412c);
        File file = this.f413d;
        int iHashCode = (iD + (file == null ? 0 : file.hashCode())) * 31;
        Bitmap bitmap = this.f414e;
        return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "LivenessUiState(directive=" + this.f410a + ", progress=" + this.f411b + ", isProcessing=" + this.f412c + ", selfieToConfirm=" + this.f413d + ", lastImage=" + this.f414e + ")";
    }

    public /* synthetic */ O() {
        this(EnumC0100w.InitialInstruction, 0.0f, false, null, null);
    }
}
