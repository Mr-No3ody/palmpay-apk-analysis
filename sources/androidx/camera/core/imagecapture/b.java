package androidx.camera.core.imagecapture;

import E.j0;
import android.util.Size;
import androidx.camera.camera2.internal.J0;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.AbstractC0999q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f13734b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f13736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageReaderProxyProvider f13740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Size f13741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.camera.core.processing.g f13743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.camera.core.processing.g f13744l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0999q f13733a = new J0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f13735c = null;

    public b(Size size, int i7, int i10, boolean z3, ImageReaderProxyProvider imageReaderProxyProvider, Size size2, int i11, androidx.camera.core.processing.g gVar, androidx.camera.core.processing.g gVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f13736d = size;
        this.f13737e = i7;
        this.f13738f = i10;
        this.f13739g = z3;
        this.f13740h = imageReaderProxyProvider;
        this.f13741i = size2;
        this.f13742j = i11;
        this.f13743k = gVar;
        this.f13744l = gVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f13736d.equals(bVar.f13736d) && this.f13737e == bVar.f13737e && this.f13738f == bVar.f13738f && this.f13739g == bVar.f13739g) {
                ImageReaderProxyProvider imageReaderProxyProvider = bVar.f13740h;
                ImageReaderProxyProvider imageReaderProxyProvider2 = this.f13740h;
                if (imageReaderProxyProvider2 != null ? imageReaderProxyProvider2.equals(imageReaderProxyProvider) : imageReaderProxyProvider == null) {
                    Size size = bVar.f13741i;
                    Size size2 = this.f13741i;
                    if (size2 != null ? size2.equals(size) : size == null) {
                        if (this.f13742j == bVar.f13742j && this.f13743k.equals(bVar.f13743k) && this.f13744l.equals(bVar.f13744l)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13736d.hashCode() ^ 1000003) * 1000003) ^ this.f13737e) * 1000003) ^ this.f13738f) * 1000003) ^ (this.f13739g ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.f13740h;
        int iHashCode2 = (iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        Size size = this.f13741i;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f13742j) * 1000003) ^ this.f13743k.hashCode()) * 1000003) ^ this.f13744l.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f13736d + ", inputFormat=" + this.f13737e + ", outputFormat=" + this.f13738f + ", virtualCamera=" + this.f13739g + ", imageReaderProxyProvider=" + this.f13740h + ", postviewSize=" + this.f13741i + ", postviewImageFormat=" + this.f13742j + ", requestEdge=" + this.f13743k + ", errorEdge=" + this.f13744l + "}";
    }
}
