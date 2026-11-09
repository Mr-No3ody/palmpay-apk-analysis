package Y4;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.growingio.android.sdk.track.middleware.http.HttpDataFetcher;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.L;
import okhttp3.X;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements HttpDataFetcher, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f11286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p138j5.c f11287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoadDataFetcher.DataCallback f11288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0 f11289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Call f11290e;

    public a(Call.Factory factory, p138j5.c cVar) {
        this.f11286a = factory;
        this.f11287b = cVar;
    }

    @Override // com.growingio.android.sdk.track.middleware.http.HttpDataFetcher
    public final void cancel() {
        Call call = this.f11290e;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.growingio.android.sdk.track.middleware.http.HttpDataFetcher
    public final void cleanup() {
        h0 h0Var = this.f11289d;
        if (h0Var != null) {
            h0Var.close();
        }
        this.f11288c = null;
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public final Object executeData() {
        p138j5.b bVar;
        X x3 = new X();
        x3.k(this.f11287b.a());
        for (Map.Entry entry : this.f11287b.f38325b.entrySet()) {
            x3.a((String) entry.getKey(), (String) entry.getValue());
        }
        p138j5.c cVar = this.f11287b;
        if (cVar.f38328e != null) {
            x3.h(c0.create(L.f40589e.parse(cVar.f38329f), this.f11287b.f38328e));
        }
        try {
            this.f11290e = this.f11286a.newCall(x3.b());
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(this.f11290e);
            this.f11289d = e0VarExecute.f40734g;
            if (e0VarExecute.isSuccessful()) {
                this.f11289d.contentLength();
                return new p138j5.b(this.f11289d.byteStream());
            }
            h.c("OkHttpDataFetcher", "EventHttpSender failed with code:" + e0VarExecute.f40731d, new Object[0]);
            return new p138j5.b();
        } catch (IOException e10) {
            h.b("OkHttpDataFetcher", e10);
            bVar = new p138j5.b();
            return bVar;
        } catch (NullPointerException e11) {
            h.b("OkHttpDataFetcher", e11);
            bVar = new p138j5.b();
            return bVar;
        } finally {
            cleanup();
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public final Class getDataClass() {
        return p138j5.b.class;
    }

    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher
    public final void loadData(LoadDataFetcher.DataCallback dataCallback) {
        X x3 = new X();
        x3.k(this.f11287b.a());
        p138j5.c cVar = this.f11287b;
        if (cVar.f38328e != null) {
            x3.h(c0.create(L.f40589e.parse(cVar.f38329f), this.f11287b.f38328e));
        }
        for (Map.Entry entry : this.f11287b.f38325b.entrySet()) {
            x3.a((String) entry.getKey(), (String) entry.getValue());
        }
        this.f11288c = dataCallback;
        this.f11290e = this.f11286a.newCall(x3.b());
        FirebasePerfOkHttpClient.enqueue(this.f11290e, this);
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.f11288c.onLoadFailed(iOException);
        h.b("OkHttpDataFetcher", iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, e0 e0Var) {
        try {
            this.f11289d = e0Var.f40734g;
            if (e0Var.isSuccessful()) {
                h0 h0Var = this.f11289d;
                if (h0Var == null) {
                    throw new IllegalArgumentException("Must not be null or empty");
                }
                h0Var.contentLength();
                this.f11288c.onDataReady(new p138j5.b(this.f11289d.byteStream()));
            } else {
                this.f11288c.onLoadFailed(new Exception(e0Var.f40730c));
            }
            cleanup();
        } catch (Throwable th) {
            cleanup();
            throw th;
        }
    }
}
