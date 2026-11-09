package C1;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.h;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ResourceDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1140a;

    public /* synthetic */ f(int i7) {
        this.f1140a = i7;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, h hVar) {
        switch (this.f1140a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new d(drawable, 0);
                }
                return null;
            default:
                return new B1.b((File) obj);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean handles(Object obj, h hVar) {
        switch (this.f1140a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
