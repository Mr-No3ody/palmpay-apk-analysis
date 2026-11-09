package p222oc;

import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.x;
import java.io.InputStream;
import p374z1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f40274b;

    public d(int i7) {
        this.f40273a = i7;
        switch (i7) {
            case 1:
                this.f40274b = new s(0);
                break;
            case 2:
                this.f40274b = new s(500L);
                break;
            default:
                this.f40274b = new s(0);
                break;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        switch (this.f40273a) {
            case 0:
                return new e(xVar.c(l.class, InputStream.class), this.f40274b, 0);
            case 1:
                return new e(xVar.c(l.class, InputStream.class), this.f40274b, 1);
            default:
                return new a(this.f40274b);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
        switch (this.f40273a) {
            case 0:
                F6.d.h("MerchantLogoUrlLoader", 3, "teardown: ");
                break;
            case 1:
                F6.d.h("ImageUrlV2Loader", 3, "teardown: ");
                break;
        }
    }

    private final void a() {
    }
}
