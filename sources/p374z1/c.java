package p374z1;

import I1.d;
import android.content.Context;
import android.net.Uri;
import androidx.camera.core.impl.utils.executor.g;
import com.bumptech.glide.load.data.mediastore.a;
import com.bumptech.glide.load.data.mediastore.b;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.t;
import com.bumptech.glide.load.resource.bitmap.G;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44417b;

    public c(ModelLoader modelLoader) {
        this.f44416a = 2;
        this.f44417b = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, h hVar) {
        Long l5;
        switch (this.f44416a) {
            case 0:
                Uri uri = (Uri) obj;
                if (i7 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i7 > 512 || i10 > 384) {
                    return null;
                }
                d dVar = new d(uri);
                Context context = (Context) this.f44417b;
                return new t(dVar, b.a(context, uri, new a(context.getContentResolver(), 0)));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i7 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i7 > 512 || i10 > 384 || (l5 = (Long) hVar.a(G.f20898d)) == null || l5.longValue() != -1) {
                    return null;
                }
                d dVar2 = new d(uri2);
                Context context2 = (Context) this.f44417b;
                return new t(dVar2, b.a(context2, uri2, new a(context2.getContentResolver(), 1)));
            default:
                return ((ModelLoader) this.f44417b).buildLoadData(new l((URL) obj), i7, i10, hVar);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        switch (this.f44416a) {
            case 0:
                Uri uri = (Uri) obj;
                return g.y(uri) && !uri.getPathSegments().contains("video");
            case 1:
                Uri uri2 = (Uri) obj;
                return g.y(uri2) && uri2.getPathSegments().contains("video");
            default:
                return true;
        }
    }

    public c(Context context, int i7) {
        this.f44416a = i7;
        switch (i7) {
            case 1:
                this.f44417b = context.getApplicationContext();
                break;
            default:
                this.f44417b = context.getApplicationContext();
                break;
        }
    }
}
