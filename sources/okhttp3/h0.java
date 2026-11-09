package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.text.Charsets;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 implements Closeable {

    @NotNull
    public static final g0 Companion = new g0(null);

    @Nullable
    private Reader reader;

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final h0 create(@NotNull Pg.m mVar, @Nullable L l5) {
        return Companion.create(mVar, l5);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().inputStream();
    }

    @NotNull
    public final Pg.m byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(androidx.camera.video.u.i(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            Pg.m byteString = bufferedSourceSource.readByteString();
            bufferedSourceSource.close();
            int iD = byteString.d();
            if (jContentLength == -1 || jContentLength == iD) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(androidx.camera.video.u.i(jContentLength, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            bufferedSourceSource.close();
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    @NotNull
    public final Reader charStream() {
        Charset charsetA;
        Reader f0Var = this.reader;
        if (f0Var == null) {
            BufferedSource bufferedSourceSource = source();
            L lContentType = contentType();
            if (lContentType == null || (charsetA = lContentType.a(Charsets.UTF_8)) == null) {
                charsetA = Charsets.UTF_8;
            }
            f0Var = new f0(bufferedSourceSource, charsetA);
            this.reader = f0Var;
        }
        return f0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Dg.c.c(source());
    }

    public abstract long contentLength();

    public abstract L contentType();

    public abstract BufferedSource source();

    @NotNull
    public final String string() throws IOException {
        Charset charsetA;
        BufferedSource bufferedSourceSource = source();
        try {
            L lContentType = contentType();
            if (lContentType == null || (charsetA = lContentType.a(Charsets.UTF_8)) == null) {
                charsetA = Charsets.UTF_8;
            }
            String string = bufferedSourceSource.readString(Dg.c.s(bufferedSourceSource, charsetA));
            bufferedSourceSource.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(bufferedSourceSource, th);
                throw th2;
            }
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final h0 create(@NotNull String str, @Nullable L l5) {
        return Companion.create(str, l5);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @NotNull
    public static final h0 create(@Nullable L l5, long j6, @NotNull BufferedSource bufferedSource) {
        return Companion.create(l5, j6, bufferedSource);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final h0 create(@Nullable L l5, @NotNull Pg.m mVar) {
        return Companion.create(l5, mVar);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final h0 create(@Nullable L l5, @NotNull String str) {
        return Companion.create(l5, str);
    }

    @Deprecated(level = EnumC2125d.f43962a, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final h0 create(@Nullable L l5, @NotNull byte[] bArr) {
        return Companion.create(l5, bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final h0 create(@NotNull BufferedSource bufferedSource, @Nullable L l5, long j6) {
        return Companion.create(bufferedSource, l5, j6);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final h0 create(@NotNull byte[] bArr, @Nullable L l5) {
        return Companion.create(bArr, l5);
    }
}
