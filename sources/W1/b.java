package W1;

import C0.G;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends P4.c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10372B;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(b.class, "ChunkOffsetBox.java");
        f10372B = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"), 18);
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10372B, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        sb2.append("[entryCount=");
        q qVar = (q) this;
        d0.s(org.aspectj.runtime.reflect.a.b(q.f10460H, qVar, qVar));
        return G.n(qVar.f10462C.length, "]", sb2);
    }
}
