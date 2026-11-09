package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.camera.camera2.internal.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r implements EmojiCompat$MetadataRepoLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.core.provider.e f16921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z4.a f16922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f16924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f16925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f16926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f16927h;

    public r(Context context, androidx.core.provider.e eVar) {
        Z4.a aVar = s.f16928d;
        this.f16923d = new Object();
        p118hf.a.j(context, "Context cannot be null");
        this.f16920a = context.getApplicationContext();
        this.f16921b = eVar;
        this.f16922c = aVar;
    }

    public final void a() {
        synchronized (this.f16923d) {
            try {
                this.f16927h = null;
                Handler handler = this.f16924e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f16924e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f16926g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f16925f = null;
                this.f16926g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final androidx.core.provider.j b() {
        try {
            Z4.a aVar = this.f16922c;
            Context context = this.f16920a;
            androidx.core.provider.e eVar = this.f16921b;
            aVar.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C4.a aVarA = androidx.core.provider.d.a(context, Collections.unmodifiableList(arrayList));
            int i7 = aVarA.f1155b;
            if (i7 != 0) {
                throw new RuntimeException(F.c(i7, "fetchFonts failed (", ")"));
            }
            androidx.core.provider.j[] jVarArr = (androidx.core.provider.j[]) ((List) aVarA.f1156c).get(0);
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
    public final void load(h hVar) {
        p118hf.a.j(hVar, "LoaderCallback cannot be null");
        synchronized (this.f16923d) {
            this.f16927h = hVar;
        }
        synchronized (this.f16923d) {
            try {
                if (this.f16927h == null) {
                    return;
                }
                if (this.f16925f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f16926g = threadPoolExecutor;
                    this.f16925f = threadPoolExecutor;
                }
                this.f16925f.execute(new W8.o(this, 26));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
