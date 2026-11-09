package p374z1;

import android.content.Context;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.x;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f44415b;

    public /* synthetic */ b(Context context, int i7) {
        this.f44414a = i7;
        this.f44415b = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f44414a) {
            case 0:
                return new c(this.f44415b, 0);
            default:
                return new c(this.f44415b, 1);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        int i7 = this.f44414a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
