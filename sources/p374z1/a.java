package p374z1;

import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.q;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.t;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ModelLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f44412b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f44413a;

    public a(s sVar) {
        this.f44413a = sVar;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, h hVar) {
        l lVar = (l) obj;
        s sVar = this.f44413a;
        if (sVar != null) {
            r rVarA = r.a(0, 0, lVar);
            Object objA = ((q) sVar.f20866a).a(rVarA);
            ArrayDeque arrayDeque = r.f20862d;
            synchronized (arrayDeque) {
                arrayDeque.offer(rVarA);
            }
            l lVar2 = (l) objA;
            if (lVar2 == null) {
                ((q) sVar.f20866a).d(r.a(0, 0, lVar), lVar);
            } else {
                lVar = lVar2;
            }
        }
        return new t(lVar, new i(lVar, ((Integer) hVar.a(f44412b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean handles(Object obj) {
        return true;
    }
}
