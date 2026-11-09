package p345x1;

import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.t;
import okhttp3.U;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f43561a;

    public c(U u6) {
        this.f43561a = u6;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, h hVar) {
        l lVar = (l) obj;
        return new t(lVar, new a(this.f43561a, lVar));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean handles(Object obj) {
        return true;
    }
}
