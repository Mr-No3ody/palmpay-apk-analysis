package com.dylanvann.fastimage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.j;
import com.facebook.react.modules.network.OkHttpClientProvider;
import okhttp3.Interceptor;
import okhttp3.S;
import okhttp3.U;

/* JADX INFO: loaded from: classes.dex */
@GlideModule
public class FastImageOkHttpProgressGlideModule extends com.bumptech.glide.module.b {
    private static final b progressListener = new b();

    public interface ResponseProgressListener {
        void update(String str, long j6, long j10);
    }

    private static Interceptor createInterceptor(ResponseProgressListener responseProgressListener) {
        return new a(responseProgressListener);
    }

    public static void expect(String str, FastImageProgressListener fastImageProgressListener) {
        progressListener.f21162a.put(str, fastImageProgressListener);
    }

    public static void forget(String str) {
        b bVar = progressListener;
        bVar.f21162a.remove(str);
        bVar.f21163b.remove(str);
    }

    @Override // com.bumptech.glide.module.b, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(@NonNull Context context, @NonNull com.bumptech.glide.b bVar, @NonNull j jVar) {
        S sA = OkHttpClientProvider.getOkHttpClient().a();
        sA.a(createInterceptor(progressListener));
        jVar.j(new p345x1.b(new U(sA)));
    }
}
