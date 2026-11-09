package p374z1;

import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.x;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ModelLoaderFactory {
    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(x xVar) {
        return new c(xVar.c(l.class, InputStream.class));
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}
