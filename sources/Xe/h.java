package Xe;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f11218a;

    public h(HttpURLConnection httpURLConnection) {
        this.f11218a = httpURLConnection;
    }

    public final InputStream a(int i7, d dVar) throws IOException {
        String str = (String) dVar.a("Content-Encoding");
        HttpURLConnection httpURLConnection = this.f11218a;
        if (i7 >= 400) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            String str2 = p226og.b.f40542a;
            return (str == null || !str.contains("gzip")) ? errorStream : new GZIPInputStream(errorStream);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        String str3 = p226og.b.f40542a;
        return (str == null || !str.contains("gzip")) ? inputStream : new GZIPInputStream(inputStream);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f11218a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
