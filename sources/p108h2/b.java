package p108h2;

import com.facebook.binaryresource.BinaryResource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements BinaryResource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37259b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f37260a;

    public b(File file) {
        this.f37260a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return Intrinsics.c(this.f37260a, ((b) obj).f37260a);
    }

    public final int hashCode() {
        return this.f37260a.hashCode();
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public final InputStream openStream() {
        return new FileInputStream(this.f37260a);
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public final byte[] read() throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(this.f37260a);
            try {
                byte[] bArrL = e.l(fileInputStream2, fileInputStream2.getChannel().size());
                fileInputStream2.close();
                Intrinsics.checkNotNullExpressionValue(bArrL, "toByteArray(...)");
                return bArrL;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public final long size() {
        return this.f37260a.length();
    }
}
