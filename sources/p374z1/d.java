package p374z1;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.x;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f44419b;

    public d(Context context, Class cls) {
        this.f44418a = context;
        this.f44419b = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        Class cls = this.f44419b;
        return new f(this.f44418a, xVar.c(File.class, cls), xVar.c(Uri.class, cls), cls);
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}
