package E1;

import J1.c;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.gif.d;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ResourceTranscoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2178b = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2179a;

    public /* synthetic */ b(int i7) {
        this.f2179a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public final Resource transcode(Resource resource, h hVar) {
        byte[] bArrArray;
        switch (this.f2179a) {
            case 0:
                return resource;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((com.bumptech.glide.load.resource.gif.h) ((d) resource.get()).f20982a.f18151b).f20999a.f20477d.asReadOnlyBuffer();
                AtomicReference atomicReference = c.f4454a;
                J1.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new J1.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (bVar == null || bVar.f4451a != 0) {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                } else {
                    if (bVar.f4452b == ((byte[]) bVar.f4453c).length) {
                        bArrArray = byteBufferAsReadOnlyBuffer.array();
                    } else {
                        ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                        byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                        byteBufferAsReadOnlyBuffer3.get(bArr2);
                        bArrArray = bArr2;
                    }
                }
                return new B1.b(bArrArray);
        }
    }
}
