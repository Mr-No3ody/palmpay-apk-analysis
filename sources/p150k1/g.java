package p150k1;

import R4.b;
import S4.a;
import S4.d;
import S4.f;
import W1.l;
import X1.c;
import X1.e;
import android.media.MediaFormat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import com.luck.picture.lib.config.FileSizeUnit;
import com.palmpay.lib.webview.container.WebProgress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f38645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f38646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Date f38648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f38650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f38651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f38652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f38653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f38654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f38655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38656p;

    public g(int i7, MediaFormat format, boolean z3) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(format, "format");
        this.f38642b = new ArrayList();
        this.f38648h = new Date();
        ArrayList arrayList = new ArrayList();
        this.f38652l = arrayList;
        this.f38653m = z3;
        this.f38654n = new HashMap();
        this.f38656p = true;
        Map mapG = G.g(new Pair(96000, 0), new Pair(88200, 1), new Pair(64000, 2), new Pair(48000, 3), new Pair(44100, 4), new Pair(32000, 5), new Pair(24000, 6), new Pair(22050, 7), new Pair(16000, 8), new Pair(12000, 9), new Pair(11025, 10), new Pair(Integer.valueOf(WebProgress.MAX_UNIFORM_SPEED_DURATION), 11));
        this.f38654n = mapG;
        this.f38641a = i7;
        if (z3) {
            arrayList.add(Long.valueOf(FileSizeUnit.KB));
            this.f38643c = FileSizeUnit.KB;
            this.f38651k = 1.0f;
            this.f38647g = format.getInteger("sample-rate");
            this.f38644d = "soun";
            l lVar = new l();
            this.f38645e = lVar;
            c cVar = new c("mp4a");
            cVar.f10984w = format.getInteger("channel-count") == 1 ? 2 : format.getInteger("channel-count");
            cVar.f10973B = format.getInteger("sample-rate");
            cVar.f10967v = 1;
            cVar.f10972A = 16;
            b bVar = new b("esds");
            f fVar = new f();
            fVar.f8735i = 0;
            fVar.f8741o = new ArrayList();
            fVar.f8730d = 0;
            S4.l lVar2 = new S4.l();
            lVar2.f8744d = 2;
            fVar.f8740n = lVar2;
            d dVar = new d();
            dVar.f8727k = new ArrayList();
            dVar.f8720d = 64;
            dVar.f8721e = 5;
            dVar.f8723g = 1536;
            dVar.f8724h = 96000L;
            dVar.f8725i = 96000L;
            a aVar = new a();
            aVar.f8692e = 2;
            Object obj = mapG.get(Integer.valueOf((int) cVar.f10973B));
            Intrinsics.e(obj);
            aVar.f8693f = ((Number) obj).intValue();
            aVar.f8695h = cVar.f10984w;
            dVar.f8726j = aVar;
            fVar.f8739m = dVar;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(fVar.c());
            V1.a.s(3, byteBufferAllocate);
            byteBufferAllocate.put((byte) ((fVar.c() - 2) & 255));
            V1.a.q(fVar.f8730d, byteBufferAllocate);
            byteBufferAllocate.put((byte) (((fVar.f8731e << 7) | (fVar.f8732f << 6) | (fVar.f8733g << 5) | (fVar.f8734h & 31)) & 255));
            if (fVar.f8731e > 0) {
                V1.a.q(fVar.f8737k, byteBufferAllocate);
            }
            if (fVar.f8732f > 0) {
                byteBufferAllocate.put((byte) (fVar.f8735i & 255));
                byteBufferAllocate.put(V1.a.b(fVar.f8736j));
                i10 = 0;
                byteBufferAllocate.put((byte) 0);
            } else {
                i10 = 0;
            }
            if (fVar.f8733g > 0) {
                V1.a.q(fVar.f8738l, byteBufferAllocate);
            }
            d dVar2 = fVar.f8739m;
            a aVar2 = dVar2.f8726j;
            if (aVar2 == null) {
                i11 = i10;
            } else {
                if (aVar2.f8692e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i11 = 4;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11 + 15);
            V1.a.s(4, byteBufferAllocate2);
            a aVar3 = dVar2.f8726j;
            if (aVar3 != null) {
                if (aVar3.f8692e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i10 = 4;
            }
            byteBufferAllocate2.put((byte) ((i10 + 13) & 255));
            byteBufferAllocate2.put((byte) (dVar2.f8720d & 255));
            byteBufferAllocate2.put((byte) (((dVar2.f8721e << 2) | (dVar2.f8722f << 1) | 1) & 255));
            V1.a.r(dVar2.f8723g, byteBufferAllocate2);
            byteBufferAllocate2.putInt((int) dVar2.f8724h);
            byteBufferAllocate2.putInt((int) dVar2.f8725i);
            a aVar4 = dVar2.f8726j;
            if (aVar4 != null) {
                if (aVar4.f8692e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                V1.a.s(5, byteBufferAllocate3);
                if (aVar4.f8692e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                byteBufferAllocate3.put((byte) 2);
                S4.c cVar2 = new S4.c(byteBufferAllocate3, 1);
                cVar2.c(aVar4.f8692e, 5);
                cVar2.c(aVar4.f8693f, 4);
                if (aVar4.f8693f == 15) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                cVar2.c(aVar4.f8695h, 4);
                byteBufferAllocate2.put(byteBufferAllocate3.array());
            }
            S4.l lVar3 = fVar.f8740n;
            lVar3.getClass();
            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(3);
            V1.a.s(6, byteBufferAllocate4);
            byteBufferAllocate4.put((byte) 1);
            byteBufferAllocate4.put((byte) (lVar3.f8744d & 255));
            byteBufferAllocate.put(byteBufferAllocate2.array());
            byteBufferAllocate.put(byteBufferAllocate4.array());
            d0.s(org.aspectj.runtime.reflect.a.c(b.f7928M, bVar, bVar, fVar));
            d0.s(org.aspectj.runtime.reflect.a.c(R4.a.f7925H, bVar, bVar, fVar));
            d0.s(org.aspectj.runtime.reflect.a.c(R4.a.f7926L, bVar, bVar, byteBufferAllocate));
            bVar.f7927B = byteBufferAllocate;
            cVar.a(bVar);
            lVar.a(cVar);
            return;
        }
        arrayList.add(3015L);
        this.f38643c = 3015L;
        int integer = format.getInteger("width");
        this.f38650j = integer;
        int integer2 = format.getInteger("height");
        this.f38649i = integer2;
        this.f38647g = 90000;
        this.f38646f = new LinkedList();
        this.f38644d = "vide";
        l lVar4 = new l();
        this.f38645e = lVar4;
        String string = format.getString("mime");
        if (!Intrinsics.c(string, "video/avc")) {
            if (Intrinsics.c(string, "video/mp4v")) {
                e eVar = new e("mp4v");
                eVar.f10967v = 1;
                eVar.f10992M = 24;
                eVar.f10990H = 1;
                eVar.f10988B = 72.0d;
                eVar.f10989C = 72.0d;
                eVar.f10994w = integer;
                eVar.f10987A = integer2;
                eVar.f10991L = "AVC Coding";
                lVar4.a(eVar);
                return;
            }
            return;
        }
        e eVar2 = new e("avc1");
        eVar2.f10967v = 1;
        eVar2.f10992M = 24;
        eVar2.f10990H = 1;
        eVar2.f10988B = 72.0d;
        eVar2.f10989C = 72.0d;
        eVar2.f10994w = integer;
        eVar2.f10987A = integer2;
        eVar2.f10991L = "AVC Coding";
        O5.a aVar5 = new O5.a("avcC");
        O5.b bVar2 = new O5.b();
        bVar2.f6578f = new ArrayList();
        bVar2.f6579g = new ArrayList();
        bVar2.f6580h = true;
        bVar2.f6581i = 1;
        bVar2.f6582j = 0;
        bVar2.f6583k = 0;
        bVar2.f6584l = new ArrayList();
        bVar2.f6585m = 63;
        bVar2.f6586n = 7;
        bVar2.f6587o = 31;
        bVar2.f6588p = 31;
        bVar2.f6589q = 31;
        aVar5.t = bVar2;
        if (format.getByteBuffer("csd-0") != null) {
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer = format.getByteBuffer("csd-0");
            Intrinsics.e(byteBuffer);
            byteBuffer.position(4);
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            arrayList2.add(bArr);
            ArrayList arrayList3 = new ArrayList();
            ByteBuffer byteBuffer2 = format.getByteBuffer("csd-1");
            if (byteBuffer2 != null) {
                byteBuffer2.position(4);
                byte[] bArr2 = new byte[byteBuffer2.remaining()];
                byteBuffer2.get(bArr2);
                arrayList3.add(bArr2);
                d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6563H, aVar5, aVar5, arrayList2));
                aVar5.t.f6578f = arrayList2;
                d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6564L, aVar5, aVar5, arrayList3));
                aVar5.t.f6579g = arrayList3;
            }
        }
        if (format.containsKey(FirebaseAnalytics.Param.LEVEL)) {
            int integer3 = format.getInteger(FirebaseAnalytics.Param.LEVEL);
            if (integer3 == 1) {
                aVar5.h(1);
            } else if (integer3 != 2) {
                switch (integer3) {
                    case 4:
                        aVar5.h(11);
                        break;
                    case 8:
                        aVar5.h(12);
                        break;
                    case 16:
                        aVar5.h(13);
                        break;
                    case 32:
                        aVar5.h(2);
                        break;
                    case 64:
                        aVar5.h(21);
                        break;
                    case 128:
                        aVar5.h(22);
                        break;
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER /* 256 */:
                        aVar5.h(3);
                        break;
                    case 512:
                        aVar5.h(31);
                        break;
                    case 1024:
                        aVar5.h(32);
                        break;
                    case 2048:
                        aVar5.h(4);
                        break;
                    case 4096:
                        aVar5.h(41);
                        break;
                    case UserMetadata.MAX_INTERNAL_KEY_SIZE /* 8192 */:
                        aVar5.h(42);
                        break;
                    case 16384:
                        aVar5.h(5);
                        break;
                    case 32768:
                        aVar5.h(51);
                        break;
                    case 65536:
                        aVar5.h(52);
                        break;
                    default:
                        aVar5.h(13);
                        break;
                }
            } else {
                aVar5.h(27);
            }
        } else {
            aVar5.h(13);
        }
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6572w, aVar5, aVar5, new Integer(100)));
        aVar5.t.f6574b = 100;
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6566Q, aVar5, aVar5, new Integer(-1)));
        aVar5.t.f6582j = -1;
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6567X, aVar5, aVar5, new Integer(-1)));
        aVar5.t.f6583k = -1;
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6565M, aVar5, aVar5, new Integer(-1)));
        aVar5.t.f6581i = -1;
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6571v, aVar5, aVar5, new Integer(1)));
        aVar5.t.f6573a = 1;
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6562C, aVar5, aVar5, new Integer(3)));
        aVar5.t.f6577e = 3;
        d0.s(org.aspectj.runtime.reflect.a.c(O5.a.f6560A, aVar5, aVar5, new Integer(0)));
        aVar5.t.f6575c = 0;
        eVar2.a(aVar5);
        lVar4.a(eVar2);
    }
}
