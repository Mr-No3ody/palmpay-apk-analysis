package androidx.camera.video.internal.config;

import E.C0216v;
import E.m0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.encoder.d;
import androidx.camera.video.internal.encoder.e;
import androidx.camera.video.j;
import androidx.core.util.Supplier;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Supplier {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f14636g = new Size(1280, 720);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Range f14637h = new Range(1, 60);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f14639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f14640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f14641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0216v f14642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range f14643f;

    public c(String str, P0 p3, j jVar, Size size, C0216v c0216v, Range range) {
        this.f14638a = str;
        this.f14639b = p3;
        this.f14640c = jVar;
        this.f14641d = size;
        this.f14642e = c0216v;
        this.f14643f = range;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        Integer num;
        Range range = m0.f2054p;
        Range range2 = this.f14643f;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) f14637h.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj);
        f.G("VidEncCfgDefaultRslvr");
        f.G("VidEncCfgDefaultRslvr");
        Range range3 = this.f14640c.f14787c;
        f.G("VidEncCfgDefaultRslvr");
        C0216v c0216v = this.f14642e;
        int i7 = c0216v.f2129b;
        Size size = this.f14641d;
        int width = size.getWidth();
        Size size2 = f14636g;
        int iC = b.c(14000000, i7, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range3);
        HashMap map = androidx.camera.video.internal.utils.b.f14773e;
        String str = this.f14638a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(c0216v)) == null) ? -1 : num.intValue();
        e eVarA = b.a(iIntValue2, str);
        androidx.camera.video.internal.encoder.c cVarA = d.a();
        cVarA.f14648a = str;
        P0 p3 = this.f14639b;
        if (p3 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        cVarA.f14650c = p3;
        cVarA.f14651d = size;
        cVarA.f14656i = Integer.valueOf(iC);
        cVarA.f14654g = Integer.valueOf(iIntValue);
        cVarA.f14649b = Integer.valueOf(iIntValue2);
        cVarA.f14653f = eVarA;
        return cVarA.a();
    }
}
