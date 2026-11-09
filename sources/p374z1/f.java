package p374z1;

import I1.d;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.impl.utils.executor.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.t;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoader f44432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelLoader f44433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f44434d;

    public f(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Class cls) {
        this.f44431a = context.getApplicationContext();
        this.f44432b = modelLoader;
        this.f44433c = modelLoader2;
        this.f44434d = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new t(new d(uri), new e(this.f44431a, this.f44432b, this.f44433c, uri, i7, i10, hVar, this.f44434d));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && g.y((Uri) obj);
    }
}
