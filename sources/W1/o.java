package W1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends P4.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10453C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10454H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10455L;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f10456B;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(o.class, "SampleToChunkBox.java");
        f10453C = aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"), 47);
        f10454H = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "void"), 51);
        f10455L = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"), 84);
        aVar.e(aVar.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"), 95);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        int iR = p140j8.f.r(V1.a.j(byteBuffer));
        this.f10456B = new ArrayList(iR);
        for (int i7 = 0; i7 < iR; i7++) {
            this.f10456B.add(new n(V1.a.j(byteBuffer), V1.a.j(byteBuffer), V1.a.j(byteBuffer)));
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f10456B.size());
        for (n nVar : this.f10456B) {
            byteBuffer.putInt((int) nVar.f10450a);
            byteBuffer.putInt((int) nVar.f10451b);
            byteBuffer.putInt((int) nVar.f10452c);
        }
    }

    @Override // P4.a
    public final long c() {
        return (this.f10456B.size() * 12) + 8;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10455L, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        return "SampleToChunkBox[entryCount=" + this.f10456B.size() + "]";
    }
}
