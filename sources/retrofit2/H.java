package retrofit2;

import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.X;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f41823l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f41824m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.J f41826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public okhttp3.H f41828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f41829e = new X();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F1.b f41830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public okhttp3.L f41831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final okhttp3.M f41833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.work.impl.model.b f41834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f41835k;

    public H(String str, okhttp3.J j6, String str2, okhttp3.F f10, okhttp3.L l5, boolean z3, boolean z8, boolean z10) {
        this.f41825a = str;
        this.f41826b = j6;
        this.f41827c = str2;
        this.f41831g = l5;
        this.f41832h = z3;
        if (f10 != null) {
            this.f41830f = f10.d();
        } else {
            this.f41830f = new F1.b(3);
        }
        if (z8) {
            this.f41834j = new androidx.work.impl.model.b(17);
        } else if (z10) {
            okhttp3.M m7 = new okhttp3.M();
            this.f41833i = m7;
            m7.a(okhttp3.Q.f40604g);
        }
    }

    public final void a(String name, String value, boolean z3) {
        androidx.work.impl.model.b bVar = this.f41834j;
        if (z3) {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = (ArrayList) bVar.f18580b;
            okhttp3.I i7 = okhttp3.J.f40577k;
            arrayList.add(okhttp3.I.canonicalize$okhttp$default(i7, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, null, 83, null));
            ((ArrayList) bVar.f18581c).add(okhttp3.I.canonicalize$okhttp$default(i7, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, null, 83, null));
            return;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList2 = (ArrayList) bVar.f18580b;
        okhttp3.I i10 = okhttp3.J.f40577k;
        arrayList2.add(okhttp3.I.canonicalize$okhttp$default(i10, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91, null));
        ((ArrayList) bVar.f18581c).add(okhttp3.I.canonicalize$okhttp$default(i10, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91, null));
    }

    public final void b(String str, String str2, boolean z3) {
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f41831g = okhttp3.L.f40589e.get(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(C0.G.o("Malformed content type: ", str2), e10);
            }
        } else {
            F1.b bVar = this.f41830f;
            if (z3) {
                bVar.e(str, str2);
            } else {
                bVar.b(str, str2);
            }
        }
    }

    public final void c(String encodedName, String str, boolean z3) {
        String str2 = this.f41827c;
        if (str2 != null) {
            okhttp3.J j6 = this.f41826b;
            okhttp3.H hG = j6.g(str2);
            this.f41828d = hG;
            if (hG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + j6 + ", Relative: " + this.f41827c);
            }
            this.f41827c = null;
        }
        if (!z3) {
            this.f41828d.a(encodedName, str);
            return;
        }
        okhttp3.H h7 = this.f41828d;
        h7.getClass();
        Intrinsics.checkNotNullParameter(encodedName, "encodedName");
        if (h7.f40575g == null) {
            h7.f40575g = new ArrayList();
        }
        List list = h7.f40575g;
        Intrinsics.e(list);
        okhttp3.I i7 = okhttp3.J.f40577k;
        list.add(okhttp3.I.canonicalize$okhttp$default(i7, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
        List list2 = h7.f40575g;
        Intrinsics.e(list2);
        list2.add(str != null ? okhttp3.I.canonicalize$okhttp$default(i7, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
    }
}
