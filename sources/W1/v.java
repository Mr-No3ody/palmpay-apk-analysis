package W1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v extends P4.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10469C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10470H;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f10471B;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(v.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"), 79);
        f10469C = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "void"), 83);
        f10470H = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"), 87);
        new WeakHashMap();
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        int iR = p140j8.f.r(V1.a.j(byteBuffer));
        this.f10471B = new ArrayList(iR);
        for (int i7 = 0; i7 < iR; i7++) {
            this.f10471B.add(new u(V1.a.j(byteBuffer), V1.a.j(byteBuffer)));
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f10471B.size());
        for (u uVar : this.f10471B) {
            byteBuffer.putInt((int) uVar.f10467a);
            byteBuffer.putInt((int) uVar.f10468b);
        }
    }

    @Override // P4.a
    public final long c() {
        return (this.f10471B.size() * 8) + 8;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10470H, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        return "TimeToSampleBox[entryCount=" + this.f10471B.size() + "]";
    }
}
