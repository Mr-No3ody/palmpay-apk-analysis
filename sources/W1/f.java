package W1;

import com.adjust.sdk.Constants;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.aidl.MsgEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends P4.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10377B;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f10379w;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(f.class, "FileTypeBox.java");
        f10376A = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"), 85);
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"), 94);
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", Constants.LONG, "minorVersion", "void"), MsgEvent.MSG_EVENT_STOP_FOREGROUND);
        f10377B = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", Constants.LONG), 113);
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"), 122);
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"), 126);
    }

    @Override // P4.a
    public final void a(ByteBuffer byteBuffer) {
        this.t = V1.a.d(byteBuffer);
        this.f10378v = V1.a.j(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.f10379w = new LinkedList();
        for (int i7 = 0; i7 < iRemaining; i7++) {
            this.f10379w.add(V1.a.d(byteBuffer));
        }
    }

    @Override // P4.a
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(V1.b.d(this.t));
        byteBuffer.putInt((int) this.f10378v);
        Iterator it = this.f10379w.iterator();
        while (it.hasNext()) {
            byteBuffer.put(V1.b.d((String) it.next()));
        }
    }

    @Override // P4.a
    public final long c() {
        return (this.f10379w.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10376A, this, this));
        sb2.append(this.t);
        sb2.append(";minorVersion=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10377B, this, this));
        sb2.append(this.f10378v);
        for (String str : this.f10379w) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
