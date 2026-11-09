package p019b3;

import android.os.SystemClock;
import com.facebook.imagepipeline.common.a;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NetworkFetcher.Callback f18768c;

    public d(b bVar, e eVar, NetworkFetcher.Callback callback) {
        this.f18766a = bVar;
        this.f18767b = eVar;
        this.f18768c = callback;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        e.access$handleException(this.f18767b, call, e10, this.f18768c);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, e0 response) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        b bVar = this.f18766a;
        bVar.f18762g = jElapsedRealtime;
        h0 h0Var = response.f40734g;
        NetworkFetcher.Callback callback = this.f18768c;
        e eVar = this.f18767b;
        try {
            if (h0Var == null) {
                e.access$handleException(eVar, call, e.access$makeExceptionFromResponse(eVar, "Response body null: " + response, response), callback);
                return;
            }
            try {
                if (response.isSuccessful()) {
                    a aVar = b.f21420c;
                    response.getClass();
                    Intrinsics.checkNotNullParameter(HttpHeaders.CONTENT_RANGE, "name");
                    b bVarFromContentRangeHeader = aVar.fromContentRangeHeader(response.b(HttpHeaders.CONTENT_RANGE, null));
                    if (bVarFromContentRangeHeader != null && (bVarFromContentRangeHeader.f21422a != 0 || bVarFromContentRangeHeader.f21423b != Integer.MAX_VALUE)) {
                        bVar.f21654e = bVarFromContentRangeHeader;
                        bVar.f21653d = 8;
                    }
                    callback.onResponse(h0Var.byteStream(), h0Var.contentLength() < 0 ? 0 : (int) h0Var.contentLength());
                } else {
                    e.access$handleException(eVar, call, e.access$makeExceptionFromResponse(eVar, "Unexpected HTTP code " + response, response), callback);
                }
            } catch (Exception e10) {
                e.access$handleException(eVar, call, e10, callback);
            }
            Unit unit = Unit.f38893a;
            h0Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(h0Var, th);
                throw th2;
            }
        }
    }
}
