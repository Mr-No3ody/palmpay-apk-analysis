package p1;

import com.airbnb.lottie.network.LottieFetchResult;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class a implements LottieFetchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f41169a;

    public a(HttpURLConnection httpURLConnection) {
        this.f41169a = httpURLConnection;
    }

    public static String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public final InputStream bodyByteStream() {
        return this.f41169a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41169a.disconnect();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public final String contentType() {
        return this.f41169a.getContentType();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public final String error() {
        HttpURLConnection httpURLConnection = this.f41169a;
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + a(httpURLConnection);
        } catch (IOException | NullPointerException e10) {
            com.airbnb.lottie.utils.c.c("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public final boolean isSuccessful() {
        try {
            return this.f41169a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
