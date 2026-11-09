package p345x1;

import J1.e;
import Kf.d;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.l;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DataFetcher, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f43553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f43554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f43555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0 f43556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DataFetcher.DataCallback f43557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Call f43558f;

    public a(U u6, l lVar) {
        this.f43553a = u6;
        this.f43554b = lVar;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        Call call = this.f43558f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        try {
            e eVar = this.f43555c;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException unused) {
        }
        h0 h0Var = this.f43556d;
        if (h0Var != null) {
            h0Var.close();
        }
        this.f43557e = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20509b;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(g gVar, DataFetcher.DataCallback dataCallback) {
        X x3 = new X();
        x3.k(this.f43554b.b());
        for (Map.Entry<String, String> entry : this.f43554b.f20845b.getHeaders().entrySet()) {
            x3.a(entry.getKey(), entry.getValue());
        }
        Y yB = x3.b();
        this.f43557e = dataCallback;
        this.f43558f = this.f43553a.newCall(yB);
        FirebasePerfOkHttpClient.enqueue(this.f43558f, this);
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.f43557e.onLoadFailed(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, e0 e0Var) {
        this.f43556d = e0Var.f40734g;
        if (!e0Var.isSuccessful()) {
            this.f43557e.onLoadFailed(new d(e0Var.f40730c, e0Var.f40731d, (IOException) null));
            return;
        }
        h0 h0Var = this.f43556d;
        J1.g.c(h0Var, "Argument must not be null");
        e eVar = new e(this.f43556d.byteStream(), h0Var.contentLength());
        this.f43555c = eVar;
        this.f43557e.onDataReady(eVar);
    }
}
