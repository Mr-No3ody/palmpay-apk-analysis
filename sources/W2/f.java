package W2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readHeaderFromStream(int i7, InputStream inputStream, byte[] bArr) throws IOException {
        if (bArr.length < i7) {
            throw new IllegalStateException("Check failed.");
        }
        if (!inputStream.markSupported()) {
            return p213o2.e.k(i7, inputStream, bArr);
        }
        try {
            inputStream.mark(i7);
            return p213o2.e.k(i7, inputStream, bArr);
        } finally {
            inputStream.reset();
        }
    }

    @JvmStatic
    @NotNull
    public final e getImageFormat(@NotNull InputStream is) throws IOException {
        Intrinsics.checkNotNullParameter(is, "is");
        g fVar = getInstance();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(is, "is");
        int i7 = fVar.f10550a;
        byte[] bArr = new byte[i7];
        e eVarDetermineFormat = fVar.f10551b.determineFormat(bArr, g.f10548d.readHeaderFromStream(i7, is, bArr));
        if (Intrinsics.c(eVarDetermineFormat, c.f10542m) && !fVar.f10552c) {
            eVarDetermineFormat = e.f10545c;
        }
        e eVar = e.f10545c;
        return eVarDetermineFormat != eVar ? eVarDetermineFormat : eVar;
    }

    @JvmStatic
    @NotNull
    public final e getImageFormat_WrapIOException(@NotNull InputStream is) {
        Intrinsics.checkNotNullParameter(is, "is");
        try {
            return getImageFormat(is);
        } catch (IOException e10) {
            p213o2.e.j(e10);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @JvmStatic
    @NotNull
    public final g getInstance() {
        return (g) g.f10549e.getValue();
    }

    private f() {
    }

    @JvmStatic
    @NotNull
    public final e getImageFormat(@Nullable String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    e imageFormat = getImageFormat(fileInputStream2);
                    p213o2.a.b(fileInputStream2);
                    return imageFormat;
                } catch (IOException unused) {
                    fileInputStream = fileInputStream2;
                    e eVar = e.f10545c;
                    p213o2.a.b(fileInputStream);
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    p213o2.a.b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused2) {
        }
    }
}
