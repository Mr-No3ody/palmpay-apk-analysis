package Y4;

import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import okhttp3.Call;
import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ModelLoaderFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile U f11291b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f11292a;

    public b(Call.Factory factory) {
        this.f11292a = factory;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public final ModelLoader build() {
        return new c(this.f11292a);
    }
}
