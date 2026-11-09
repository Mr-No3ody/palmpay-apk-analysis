package Y4;

import com.growingio.android.sdk.track.modelloader.ModelLoader;
import okhttp3.Call;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f11293a;

    public c(Call.Factory factory) {
        this.f11293a = factory;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoader
    public final p247q5.a buildLoadData(Object obj) {
        return new p247q5.a(new a(this.f11293a, (p138j5.c) obj));
    }
}
