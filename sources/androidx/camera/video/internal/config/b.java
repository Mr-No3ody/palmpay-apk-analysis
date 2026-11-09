package androidx.camera.video.internal.config;

import E.C0216v;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.P0;
import androidx.camera.video.C1016e;
import androidx.camera.video.internal.d;
import androidx.camera.video.internal.encoder.e;
import androidx.camera.video.j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f14634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P0 f14635b;

    static {
        HashMap map = new HashMap();
        f14634a = map;
        f14635b = P0.f13943a;
        HashMap map2 = new HashMap();
        e eVar = e.f14666d;
        map2.put(1, eVar);
        e eVar2 = e.f14668f;
        map2.put(2, eVar2);
        e eVar3 = e.f14669g;
        map2.put(4096, eVar3);
        Integer numValueOf = Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        map2.put(numValueOf, eVar3);
        HashMap map3 = new HashMap();
        map3.put(1, eVar);
        map3.put(2, eVar2);
        map3.put(4096, eVar3);
        map3.put(numValueOf, eVar3);
        HashMap map4 = new HashMap();
        map4.put(1, eVar);
        map4.put(4, eVar2);
        map4.put(4096, eVar3);
        map4.put(16384, eVar3);
        map4.put(2, eVar);
        map4.put(8, eVar2);
        map4.put(numValueOf, eVar3);
        map4.put(32768, eVar3);
        HashMap map5 = new HashMap();
        map5.put(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), eVar2);
        map5.put(512, e.f14667e);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static e a(int i7, String str) {
        e eVar;
        Map map = (Map) f14634a.get(str);
        if (map != null && (eVar = (e) map.get(Integer.valueOf(i7))) != null) {
            return eVar;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i7));
        f.G("VideoConfigUtil");
        return e.f14666d;
    }

    public static a b(C1016e c1016e, C0216v c0216v, d dVar) {
        C0977f c0977f;
        p118hf.a.k(c0216v.b(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c0216v + "]");
        int i7 = c1016e.f14592c;
        String str = "video/avc";
        String str2 = i7 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i10 = c0216v.f2128a;
        if (dVar == null) {
            c0977f = null;
        } else {
            Set set = (Set) androidx.camera.video.internal.utils.b.f14770b.get(Integer.valueOf(i10));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) androidx.camera.video.internal.utils.b.f14769a.get(Integer.valueOf(c0216v.f2129b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator it = ((androidx.camera.video.internal.a) dVar).f14614d.iterator();
            while (true) {
                if (it.hasNext()) {
                    c0977f = (C0977f) it.next();
                    if (set.contains(Integer.valueOf(c0977f.f14057j)) && set2.contains(Integer.valueOf(c0977f.f14055h))) {
                        String str3 = c0977f.f14049b;
                        if (str2.equals(str3)) {
                            f.G("VideoConfigUtil");
                        } else if (i7 == -1) {
                            c0216v.toString();
                            f.G("VideoConfigUtil");
                        }
                        str2 = str3;
                    }
                } else {
                    c0977f = null;
                }
            }
        }
        if (c0977f == null) {
            if (i7 == -1) {
                if (i10 != 1) {
                    if (i10 == 3 || i10 == 4 || i10 == 5) {
                        str = "video/hevc";
                    } else {
                        if (i10 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + c0216v + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (dVar == null) {
                c0216v.toString();
                f.G("VideoConfigUtil");
            } else {
                c0216v.toString();
                f.G("VideoConfigUtil");
            }
        }
        if (str2 != null) {
            return new a(str2, -1, c0977f != null ? c0977f : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    public static int c(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Range range) {
        Rational rational = new Rational(i10, i11);
        Rational rational2 = new Rational(i12, i13);
        Rational rational3 = new Rational(i14, i15);
        Rational rational4 = new Rational(i16, i17);
        int iDoubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * ((double) i7));
        if (f.o("VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(iDoubleValue));
        }
        if (!j.f14783f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (f.o("VideoConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        f.G("VideoConfigUtil");
        return iDoubleValue;
    }

    public static androidx.camera.video.internal.encoder.d d(C0977f c0977f) {
        androidx.camera.video.internal.encoder.c cVarA = androidx.camera.video.internal.encoder.d.a();
        String str = c0977f.f14049b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        cVarA.f14648a = str;
        cVarA.f14649b = Integer.valueOf(c0977f.f14054g);
        cVarA.f14651d = new Size(c0977f.f14052e, c0977f.f14053f);
        cVarA.f14654g = Integer.valueOf(c0977f.f14051d);
        cVarA.f14656i = Integer.valueOf(c0977f.f14050c);
        P0 p3 = f14635b;
        if (p3 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        cVarA.f14650c = p3;
        return cVarA.a();
    }
}
