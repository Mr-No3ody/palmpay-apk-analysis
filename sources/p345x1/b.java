package p345x1;

import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.x;
import okhttp3.U;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ModelLoaderFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile U f43559b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f43560a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b() {
        this(f43559b);
        if (f43559b == null) {
            synchronized (b.class) {
                try {
                    if (f43559b == null) {
                        f43559b = new U();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        return new c(this.f43560a);
    }

    public b(U u6) {
        this.f43560a = u6;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}
