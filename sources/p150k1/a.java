package p150k1;

import T4.e;
import W1.d;
import W1.f;
import W1.g;
import W1.h;
import W1.i;
import W1.j;
import W1.k;
import W1.m;
import W1.n;
import W1.o;
import W1.p;
import W1.q;
import W1.s;
import W1.t;
import W1.u;
import W1.v;
import W1.w;
import W1.x;
import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.c;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.horcrux.svg.d0;
import com.luck.picture.lib.config.FileSizeUnit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f38607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f38608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileOutputStream f38609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f38610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38613g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f38614h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f38615i;

    public static long e(long j6, long j10) {
        return j10 == 0 ? j6 : e(j10, j6 % j10);
    }

    public static long f(c cVar) {
        boolean zIsEmpty = ((ArrayList) cVar.f14623d).isEmpty();
        ArrayList arrayList = (ArrayList) cVar.f14623d;
        long jE = !zIsEmpty ? ((g) arrayList.iterator().next()).f38647g : 0L;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jE = e(((g) it.next()).f38647g, jE);
        }
        return jE;
    }

    public final int a(MediaFormat mediaFormat, boolean z3) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        c cVar = this.f38608b;
        if (cVar == null) {
            Intrinsics.n("currentMp4Movie");
            throw null;
        }
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        ArrayList arrayList = (ArrayList) cVar.f14623d;
        arrayList.add(new g(arrayList.size(), mediaFormat, z3));
        return arrayList.size() - 1;
    }

    public final void b(c mp4Movie) throws IOException {
        Intrinsics.checkNotNullParameter(mp4Movie, "mp4Movie");
        this.f38608b = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream((File) mp4Movie.f14622c);
        this.f38609c = fileOutputStream;
        FileChannel channel = fileOutputStream.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "fos.channel");
        this.f38610d = channel;
        List listH = C1850q.h("isom", "iso2", "mp41");
        f fVar = new f("ftyp");
        List list = Collections.EMPTY_LIST;
        fVar.t = "mp42";
        fVar.f10378v = 0L;
        fVar.f10379w = listH;
        FileChannel fileChannel = this.f38610d;
        if (fileChannel == null) {
            Intrinsics.n("fc");
            throw null;
        }
        fVar.getBox(fileChannel);
        long size = fVar.getSize() + this.f38611e;
        this.f38611e = size;
        this.f38612f = size;
        b bVar = new b();
        bVar.f38617b = FileSizeUnit.GB;
        this.f38607a = bVar;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(4)");
        this.f38615i = byteBufferAllocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v31, types: [P4.b, P4.e, com.coremedia.iso.boxes.Box] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v45, types: [P4.b, P4.e, com.coremedia.iso.boxes.Box] */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r22v0, types: [P4.b, P4.e] */
    /* JADX WARN: Type inference failed for: r24v1, types: [P4.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4, types: [P4.b, P4.e] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2, types: [P4.a, P4.c, W1.w, com.coremedia.iso.boxes.Box, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.coremedia.iso.boxes.Box] */
    public final void c() throws IOException {
        HashMap map;
        String str;
        long[] jArr;
        ArrayList arrayList;
        String str2;
        e eVar;
        a aVar = this;
        b bVar = aVar.f38607a;
        if (bVar == null) {
            Intrinsics.n("mdat");
            throw null;
        }
        if (bVar.f38617b != 0) {
            aVar.d();
        }
        c cVar = aVar.f38608b;
        if (cVar == null) {
            Intrinsics.n("currentMp4Movie");
            throw null;
        }
        Iterator it = ((ArrayList) cVar.f14623d).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = aVar.f38614h;
            str = "track";
            if (!zHasNext) {
                break;
            }
            g track = (g) it.next();
            ArrayList arrayList2 = track.f38642b;
            int size = arrayList2.size();
            long[] jArr2 = new long[size];
            for (int i7 = 0; i7 < size; i7++) {
                jArr2[i7] = ((e) arrayList2.get(i7)).f38630b;
            }
            Intrinsics.checkNotNullExpressionValue(track, "track");
            map.put(track, jArr2);
        }
        c cVar2 = aVar.f38608b;
        if (cVar2 == null) {
            Intrinsics.n("currentMp4Movie");
            throw null;
        }
        d dVar = new d("moov");
        j jVar = new j("mvhd");
        jVar.f10431M = 1.0d;
        jVar.f10432Q = 1.0f;
        e eVar2 = e.f8946j;
        jVar.f10433X = eVar2;
        Date date = new Date();
        d0.s(org.aspectj.runtime.reflect.a.c(j.f10414B0, jVar, jVar, date));
        jVar.f10427B = date;
        ?? r12 = 1;
        if (b.p(date) >= 4294967296L) {
            jVar.setVersion(1);
        }
        Date date2 = new Date();
        d0.s(org.aspectj.runtime.reflect.a.c(j.f10415C0, jVar, jVar, date2));
        jVar.f10428C = date2;
        if (b.p(date2) >= 4294967296L) {
            jVar.setVersion(1);
        }
        d0.s(org.aspectj.runtime.reflect.a.c(j.f10418F0, jVar, jVar, eVar2));
        jVar.f10433X = eVar2;
        long jF = f(cVar2);
        ArrayList<g> arrayList3 = (ArrayList) cVar2.f14623d;
        long j6 = 0;
        for (g gVar : arrayList3) {
            e eVar3 = eVar2;
            d dVar2 = dVar;
            long j10 = (gVar.f38643c * jF) / ((long) gVar.f38647g);
            if (j10 > j6) {
                j6 = j10;
            }
            eVar2 = eVar3;
            dVar = dVar2;
        }
        ?? r22 = dVar;
        e eVar4 = eVar2;
        d0.s(org.aspectj.runtime.reflect.a.c(j.f10417E0, jVar, jVar, new Long(j6)));
        jVar.f10430L = j6;
        if (j6 >= 4294967296L) {
            jVar.setVersion(1);
        }
        d0.s(org.aspectj.runtime.reflect.a.c(j.f10416D0, jVar, jVar, new Long(jF)));
        jVar.f10429H = jF;
        long size2 = arrayList3.size() + 1;
        d0.s(org.aspectj.runtime.reflect.a.c(j.f10419G0, jVar, jVar, new Long(size2)));
        jVar.f10434Y = size2;
        r22.a(jVar);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            Intrinsics.checkNotNullExpressionValue(gVar2, str);
            ?? dVar3 = new d("trak");
            ?? wVar = new w("tkhd");
            e eVar5 = eVar4;
            wVar.f10503Y = eVar5;
            org.aspectj.runtime.reflect.c cVarC = org.aspectj.runtime.reflect.a.c(w.f10482K0, wVar, wVar, new Boolean((boolean) r12));
            P4.f.a().getClass();
            P4.f.b(cVarC);
            wVar.setFlags((wVar.getFlags() | r12) == true ? 1 : 0);
            org.aspectj.runtime.reflect.c cVarC2 = org.aspectj.runtime.reflect.a.c(w.f10484M0, wVar, wVar, new Boolean((boolean) r12));
            P4.f.a().getClass();
            P4.f.b(cVarC2);
            wVar.setFlags(wVar.getFlags() | 4);
            org.aspectj.runtime.reflect.c cVarC3 = org.aspectj.runtime.reflect.a.c(w.f10483L0, wVar, wVar, new Boolean((boolean) r12));
            P4.f.a().getClass();
            P4.f.b(cVarC3);
            wVar.setFlags(wVar.getFlags() | 2);
            e eVar6 = gVar2.f38653m ? eVar5 : (e) cVar2.f14621b;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10479H0, wVar, wVar, eVar6));
            wVar.f10503Y = eVar6;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10477F0, wVar, wVar, new Integer(0)));
            wVar.f10501Q = 0;
            Date date3 = gVar2.f38648h;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10472A0, wVar, wVar, date3));
            wVar.f10496B = date3;
            if (b.p(date3) >= 4294967296L) {
                wVar.setVersion(r12);
            }
            long jF2 = f(cVar2) * gVar2.f38643c;
            long j11 = gVar2.f38647g;
            long j12 = jF2 / j11;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10475D0, wVar, wVar, new Long(j12)));
            wVar.f10499L = j12;
            if (j12 >= 4294967296L) {
                wVar.setFlags(1);
            }
            double d2 = gVar2.f38649i;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10481J0, wVar, wVar, new Double(d2)));
            wVar.f10505k0 = d2;
            double d10 = gVar2.f38650j;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10480I0, wVar, wVar, new Double(d10)));
            wVar.f10504Z = d10;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10476E0, wVar, wVar, new Integer(0)));
            wVar.f10500M = 0;
            Date date4 = new Date();
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10473B0, wVar, wVar, date4));
            wVar.f10497C = date4;
            if (b.p(date4) >= 4294967296L) {
                wVar.setVersion(1);
            }
            long j13 = gVar2.f38641a + 1;
            d0.s(org.aspectj.runtime.reflect.a.c(w.f10474C0, wVar, wVar, new Long(j13)));
            wVar.f10498H = j13;
            org.aspectj.runtime.reflect.b bVar2 = w.f10478G0;
            float f10 = gVar2.f38651k;
            d0.s(org.aspectj.runtime.reflect.a.c(bVar2, wVar, wVar, new Float(f10)));
            wVar.f10502X = f10;
            dVar3.a(wVar);
            d dVar4 = new d("mdia");
            dVar3.a(dVar4);
            i iVar = new i("mdhd");
            iVar.f10408B = new Date();
            iVar.f10409C = new Date();
            iVar.f10412M = "eng";
            d0.s(org.aspectj.runtime.reflect.a.c(i.f10403p0, iVar, iVar, date3));
            iVar.f10408B = date3;
            long j14 = gVar2.f38643c;
            d0.s(org.aspectj.runtime.reflect.a.c(i.f10405r0, iVar, iVar, new Long(j14)));
            iVar.f10411L = j14;
            d0.s(org.aspectj.runtime.reflect.a.c(i.f10404q0, iVar, iVar, new Long(j11)));
            iVar.f10410H = j11;
            d0.s(org.aspectj.runtime.reflect.a.c(i.f10406s0, iVar, iVar, "eng"));
            iVar.f10412M = "eng";
            dVar4.a(iVar);
            g gVar3 = new g("hdlr");
            gVar3.f10387C = null;
            gVar3.f10391Q = true;
            String str3 = gVar2.f38653m ? "SoundHandle" : "VideoHandle";
            d0.s(org.aspectj.runtime.reflect.a.c(g.f10382k0, gVar3, gVar3, str3));
            gVar3.f10387C = str3;
            org.aspectj.runtime.reflect.b bVar3 = g.f10383p0;
            String str4 = gVar2.f38644d;
            d0.s(org.aspectj.runtime.reflect.a.c(bVar3, gVar3, gVar3, str4));
            gVar3.f10386B = str4;
            dVar4.a(gVar3);
            ?? dVar5 = new d("minf");
            if (Intrinsics.c(str4, "vide")) {
                x xVar = new x("vmhd");
                xVar.f10509B = 0;
                xVar.f10510C = new int[3];
                xVar.setFlags(1);
                dVar5.a(xVar);
            } else if (Intrinsics.c(str4, "soun")) {
                dVar5.a(new p("smhd"));
            } else if (Intrinsics.c(str4, ReactTextInputShadowNode.PROP_TEXT)) {
                dVar5.a(new k());
            } else if (Intrinsics.c(str4, "subt")) {
                dVar5.a(new s("sthd"));
            } else if (Intrinsics.c(str4, "hint")) {
                dVar5.a(new h("hmhd"));
            } else if (Intrinsics.c(str4, "sbtl")) {
                dVar5.a(new k());
            }
            ?? dVar6 = new d("dinf");
            W1.e eVar7 = new W1.e("dref");
            dVar6.a(eVar7);
            W1.c cVar3 = new W1.c("url ");
            cVar3.setFlags(1);
            eVar7.a(cVar3);
            dVar5.a(dVar6);
            d dVar7 = new d("stbl");
            dVar7.a(gVar2.f38645e);
            ArrayList arrayList4 = new ArrayList();
            u uVar = null;
            for (Long delta : gVar2.f38652l) {
                if (uVar == null || delta == null) {
                    str2 = str;
                    eVar = eVar5;
                    Intrinsics.checkNotNullExpressionValue(delta, "delta");
                    uVar = new u(1L, delta.longValue());
                    arrayList4.add(uVar);
                    cVar2 = cVar2;
                    str = str2;
                    eVar5 = eVar;
                } else {
                    str2 = str;
                    eVar = eVar5;
                    if (uVar.f10468b == delta.longValue()) {
                        uVar.f10467a++;
                        str = str2;
                        eVar5 = eVar;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(delta, "delta");
                        uVar = new u(1L, delta.longValue());
                        arrayList4.add(uVar);
                        cVar2 = cVar2;
                        str = str2;
                        eVar5 = eVar;
                    }
                }
            }
            c cVar4 = cVar2;
            String str5 = str;
            e eVar8 = eVar5;
            v vVar = new v("stts");
            vVar.f10471B = Collections.EMPTY_LIST;
            d0.s(org.aspectj.runtime.reflect.a.c(v.f10469C, vVar, vVar, arrayList4));
            vVar.f10471B = arrayList4;
            dVar7.a(vVar);
            LinkedList linkedList = gVar2.f38646f;
            if (linkedList == null || linkedList.isEmpty()) {
                jArr = null;
            } else {
                jArr = new long[linkedList.size()];
                int size3 = linkedList.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    jArr[i10] = ((Number) linkedList.get(i10)).intValue();
                }
            }
            if (jArr != null && jArr.length != 0) {
                t tVar = new t("stss");
                d0.s(org.aspectj.runtime.reflect.a.c(t.f10465H, tVar, tVar, jArr));
                tVar.f10466B = jArr;
                dVar7.a(tVar);
            }
            o oVar = new o("stsc");
            oVar.f10456B = Collections.EMPTY_LIST;
            LinkedList linkedList2 = new LinkedList();
            d0.s(org.aspectj.runtime.reflect.a.c(o.f10454H, oVar, oVar, linkedList2));
            oVar.f10456B = linkedList2;
            ArrayList arrayList5 = gVar2.f38642b;
            int size4 = arrayList5.size();
            int i11 = -1;
            int i12 = 1;
            int i13 = 0;
            int i14 = 0;
            ?? r10 = dVar3;
            while (i13 < size4) {
                Iterator it3 = it2;
                Object obj = arrayList5.get(i13);
                int i15 = size4;
                Intrinsics.checkNotNullExpressionValue(obj, "track.getSamples()[a]");
                e eVar9 = (e) obj;
                ?? r11 = r10;
                d dVar8 = dVar4;
                long j15 = eVar9.f38629a + eVar9.f38630b;
                i14++;
                if (i13 != i15 - 1) {
                    Object obj2 = arrayList5.get(i13 + 1);
                    arrayList = arrayList5;
                    Intrinsics.checkNotNullExpressionValue(obj2, "track.getSamples()[a + 1]");
                    if (j15 != ((e) obj2).f38629a) {
                    }
                    i13++;
                    r10 = r11;
                    it2 = it3;
                    size4 = i15;
                    dVar4 = dVar8;
                    arrayList5 = arrayList;
                } else {
                    arrayList = arrayList5;
                }
                if (i11 != i14) {
                    d0.s(org.aspectj.runtime.reflect.a.b(o.f10453C, oVar, oVar));
                    oVar.f10456B.add(new n(i12, i14, 1L));
                    i11 = i14;
                }
                i12++;
                i14 = 0;
                i13++;
                r10 = r11;
                it2 = it3;
                size4 = i15;
                dVar4 = dVar8;
                arrayList5 = arrayList;
            }
            ArrayList<e> arrayList6 = arrayList5;
            Iterator it4 = it2;
            ?? r13 = r10;
            ?? r24 = dVar4;
            dVar7.a(oVar);
            m mVar = new m("stsz");
            mVar.f10448C = new long[0];
            long[] jArr3 = (long[]) map.get(gVar2);
            d0.s(org.aspectj.runtime.reflect.a.c(m.f10445Q, mVar, mVar, jArr3));
            mVar.f10448C = jArr3;
            dVar7.a(mVar);
            ArrayList arrayList7 = new ArrayList();
            long j16 = -1;
            for (e eVar10 : arrayList6) {
                long j17 = eVar10.f38629a;
                if (j16 != -1 && j16 != j17) {
                    j16 = -1;
                }
                if (j16 == -1) {
                    arrayList7.add(Long.valueOf(j17));
                }
                j16 = eVar10.f38630b + j17;
            }
            long[] jArr4 = new long[arrayList7.size()];
            int size5 = arrayList7.size();
            for (int i16 = 0; i16 < size5; i16++) {
                Object obj3 = arrayList7.get(i16);
                Intrinsics.checkNotNullExpressionValue(obj3, "chunksOffsets[a]");
                jArr4[i16] = ((Number) obj3).longValue();
            }
            q qVar = new q("stco");
            qVar.f10462C = new long[0];
            d0.s(org.aspectj.runtime.reflect.a.c(q.f10461L, qVar, qVar, jArr4));
            qVar.f10462C = jArr4;
            dVar7.a(qVar);
            dVar5.a(dVar7);
            r24.a(dVar5);
            r22.a(r13);
            aVar = this;
            cVar2 = cVar4;
            str = str5;
            r12 = 1;
            it2 = it4;
            eVar4 = eVar8;
        }
        FileChannel fileChannel = aVar.f38610d;
        if (fileChannel == null) {
            Intrinsics.n("fc");
            throw null;
        }
        r22.getBox(fileChannel);
        FileOutputStream fileOutputStream = aVar.f38609c;
        if (fileOutputStream == null) {
            Intrinsics.n("fos");
            throw null;
        }
        fileOutputStream.flush();
        FileChannel fileChannel2 = aVar.f38610d;
        if (fileChannel2 == null) {
            Intrinsics.n("fc");
            throw null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream2 = aVar.f38609c;
        if (fileOutputStream2 == null) {
            Intrinsics.n("fos");
            throw null;
        }
        fileOutputStream2.close();
    }

    public final void d() throws IOException {
        FileChannel fileChannel = this.f38610d;
        if (fileChannel == null) {
            Intrinsics.n("fc");
            throw null;
        }
        long jPosition = fileChannel.position();
        FileChannel fileChannel2 = this.f38610d;
        if (fileChannel2 == null) {
            Intrinsics.n("fc");
            throw null;
        }
        b bVar = this.f38607a;
        if (bVar == null) {
            Intrinsics.n("mdat");
            throw null;
        }
        fileChannel2.position(bVar.f38618c);
        b bVar2 = this.f38607a;
        if (bVar2 == null) {
            Intrinsics.n("mdat");
            throw null;
        }
        FileChannel fileChannel3 = this.f38610d;
        if (fileChannel3 == null) {
            Intrinsics.n("fc");
            throw null;
        }
        bVar2.getBox(fileChannel3);
        FileChannel fileChannel4 = this.f38610d;
        if (fileChannel4 == null) {
            Intrinsics.n("fc");
            throw null;
        }
        fileChannel4.position(jPosition);
        b bVar3 = this.f38607a;
        if (bVar3 == null) {
            Intrinsics.n("mdat");
            throw null;
        }
        bVar3.f38618c = 0L;
        if (bVar3 == null) {
            Intrinsics.n("mdat");
            throw null;
        }
        bVar3.f38617b = 0L;
        FileOutputStream fileOutputStream = this.f38609c;
        if (fileOutputStream != null) {
            fileOutputStream.flush();
        } else {
            Intrinsics.n("fos");
            throw null;
        }
    }

    public final void g(int i7, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean z3) {
        boolean z8;
        Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (this.f38613g) {
            b bVar = this.f38607a;
            if (bVar == null) {
                Intrinsics.n("mdat");
                throw null;
            }
            bVar.f38617b = 0L;
            FileChannel fileChannel = this.f38610d;
            if (fileChannel == null) {
                Intrinsics.n("fc");
                throw null;
            }
            bVar.getBox(fileChannel);
            long j6 = this.f38611e;
            bVar.f38618c = j6;
            long j10 = 16;
            this.f38611e = j6 + j10;
            this.f38612f += j10;
            this.f38613g = false;
        }
        b bVar2 = this.f38607a;
        if (bVar2 == null) {
            Intrinsics.n("mdat");
            throw null;
        }
        long j11 = bVar2.f38617b;
        long j12 = bufferInfo.size;
        bVar2.f38617b = j11 + j12;
        long j13 = this.f38612f + j12;
        this.f38612f = j13;
        if (j13 >= 32768) {
            d();
            this.f38613g = true;
            this.f38612f = 0L;
            z8 = true;
        } else {
            z8 = false;
        }
        c cVar = this.f38608b;
        if (cVar == null) {
            Intrinsics.n("currentMp4Movie");
            throw null;
        }
        long j14 = this.f38611e;
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (i7 >= 0) {
            ArrayList arrayList = (ArrayList) cVar.f14623d;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "tracks[trackIndex]");
                g gVar = (g) obj;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                boolean z10 = (gVar.f38653m || (bufferInfo.flags & 1) == 0) ? false : true;
                ArrayList arrayList2 = gVar.f38642b;
                long j15 = bufferInfo.size;
                e eVar = new e();
                eVar.f38629a = j14;
                eVar.f38630b = j15;
                arrayList2.add(eVar);
                LinkedList linkedList = gVar.f38646f;
                if (linkedList != null && z10) {
                    linkedList.add(Integer.valueOf(arrayList2.size()));
                }
                long j16 = bufferInfo.presentationTimeUs;
                long j17 = j16 - gVar.f38655o;
                gVar.f38655o = j16;
                long j18 = ((j17 * ((long) gVar.f38647g)) + 500000) / 1000000;
                if (!gVar.f38656p) {
                    ArrayList arrayList3 = gVar.f38652l;
                    arrayList3.add(arrayList3.size() - 1, Long.valueOf(j18));
                    gVar.f38643c += j18;
                }
                gVar.f38656p = false;
            }
        }
        if (z3) {
            byteBuf.position(bufferInfo.offset);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        } else {
            byteBuf.position(bufferInfo.offset + 4);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer = this.f38615i;
            if (byteBuffer == null) {
                Intrinsics.n("sizeBuffer");
                throw null;
            }
            byteBuffer.position(0);
            ByteBuffer byteBuffer2 = this.f38615i;
            if (byteBuffer2 == null) {
                Intrinsics.n("sizeBuffer");
                throw null;
            }
            byteBuffer2.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer3 = this.f38615i;
            if (byteBuffer3 == null) {
                Intrinsics.n("sizeBuffer");
                throw null;
            }
            byteBuffer3.position(0);
            FileChannel fileChannel2 = this.f38610d;
            if (fileChannel2 == null) {
                Intrinsics.n("fc");
                throw null;
            }
            ByteBuffer byteBuffer4 = this.f38615i;
            if (byteBuffer4 == null) {
                Intrinsics.n("sizeBuffer");
                throw null;
            }
            fileChannel2.write(byteBuffer4);
        }
        FileChannel fileChannel3 = this.f38610d;
        if (fileChannel3 == null) {
            Intrinsics.n("fc");
            throw null;
        }
        fileChannel3.write(byteBuf);
        this.f38611e += (long) bufferInfo.size;
        if (z8) {
            FileOutputStream fileOutputStream = this.f38609c;
            if (fileOutputStream != null) {
                fileOutputStream.flush();
            } else {
                Intrinsics.n("fos");
                throw null;
            }
        }
    }
}
