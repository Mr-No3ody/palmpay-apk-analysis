package Xe;

import C0.G;
import E.AbstractC0198c;
import N8.q0;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public class a implements p057e.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p314uf.e f11185A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SSLSocketFactory f11192g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HostnameVerifier f11193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11194j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11196p;
    public final d t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f11197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ByteArrayInputStream f11198w;

    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    public a(String str, int i7) {
        String lowerCase;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder("----NoHttpFormBoundary");
        for (int i10 = 1; i10 < 12; i10++) {
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i10);
            long j6 = jCurrentTimeMillis % 3;
            if (j6 == 0) {
                sb2.append(((char) jCurrentTimeMillis) % '\t');
            } else {
                sb2.append((char) ((jCurrentTimeMillis % 26) + (j6 == 1 ? 65L : 97L)));
            }
        }
        String string = sb2.toString();
        this.f11186a = string;
        String strO = G.o("--", string);
        this.f11187b = strO;
        this.f11188c = q0.j(strO, "--");
        this.f11189d = 2;
        AbstractC0198c.b();
        this.f11192g = AbstractC0198c.f1997f.f11211d;
        AbstractC0198c.b();
        this.f11193i = AbstractC0198c.f1997f.f11212e;
        AbstractC0198c.b();
        this.f11194j = AbstractC0198c.f1997f.f11209b;
        AbstractC0198c.b();
        this.f11195o = AbstractC0198c.f1997f.f11210c;
        AbstractC0198c.b();
        AbstractC0198c.f1997f.getClass();
        this.f11190e = str;
        this.f11191f = i7;
        d dVar = new d(0);
        this.t = dVar;
        dVar.j(HttpHeaders.ACCEPT);
        dVar.e("application/json,application/xml,application/xhtml+xml,text/html;q=0.9,image/webp,*/*;q=0.8", HttpHeaders.ACCEPT);
        dVar.j(HttpHeaders.ACCEPT_ENCODING);
        dVar.e("gzip, deflate", HttpHeaders.ACCEPT_ENCODING);
        if (TextUtils.isEmpty(p226og.b.f40542a)) {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb3 = new StringBuilder(language);
            if (!TextUtils.isEmpty(country)) {
                sb3.append('-');
                sb3.append(country);
                sb3.append(',');
                sb3.append(language);
            }
            p226og.b.f40542a = sb3.toString();
        }
        String str4 = p226og.b.f40542a;
        dVar.j(HttpHeaders.ACCEPT_LANGUAGE);
        dVar.e(str4, HttpHeaders.ACCEPT_LANGUAGE);
        if (TextUtils.isEmpty(Z4.e.f11516e)) {
            StringBuffer stringBuffer = new StringBuffer();
            String str5 = Build.VERSION.RELEASE;
            stringBuffer.append(str5.length() <= 0 ? "1.0" : str5);
            stringBuffer.append("; ");
            Locale locale2 = Locale.getDefault();
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                stringBuffer.append(language2.toLowerCase(locale2));
                String country2 = locale2.getCountry();
                if (!TextUtils.isEmpty(country2)) {
                    stringBuffer.append("-");
                    lowerCase = country2.toLowerCase(locale2);
                }
                if ("REL".equals(Build.VERSION.CODENAME)) {
                    str3 = Build.MODEL;
                    if (str3.length() > 0) {
                        stringBuffer.append("; ");
                        stringBuffer.append(str3);
                    }
                }
                str2 = Build.ID;
                if (str2.length() > 0) {
                    stringBuffer.append(" Build/");
                    stringBuffer.append(str2);
                }
                Z4.e.f11516e = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/533.1 (KHTML, like Gecko) Version/5.0 Mobile Safari/533.1";
            } else {
                lowerCase = "en";
            }
            stringBuffer.append(lowerCase);
            if ("REL".equals(Build.VERSION.CODENAME)) {
                str3 = Build.MODEL;
                if (str3.length() > 0) {
                    stringBuffer.append("; ");
                    stringBuffer.append(str3);
                }
            }
            str2 = Build.ID;
            if (str2.length() > 0) {
                stringBuffer.append(" Build/");
                stringBuffer.append(str2);
            }
            Z4.e.f11516e = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/533.1 (KHTML, like Gecko) Version/5.0 Mobile Safari/533.1";
        }
        String str6 = Z4.e.f11516e;
        dVar.j("User-Agent");
        dVar.e(str6, "User-Agent");
        AbstractC0198c.b();
        for (Map.Entry entry : ((AbstractMap) AbstractC0198c.f1997f.f11213f.f1592b).entrySet()) {
            String str7 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                this.t.e((String) it.next(), str7);
            }
        }
        this.f11197v = new d(new g(), 8);
        AbstractC0198c.b();
        for (Map.Entry entry2 : ((AbstractMap) AbstractC0198c.f1997f.f11214g.f1592b).entrySet()) {
            Iterator it2 = ((List) entry2.getValue()).iterator();
            while (it2.hasNext()) {
                this.f11197v.e((String) it2.next(), (String) entry2.getKey());
            }
        }
    }

    public static StringBuilder a(d dVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : ((AbstractMap) dVar.f1592b).keySet()) {
            if (!TextUtils.isEmpty(str2)) {
                for (Object obj : dVar.i(str2)) {
                    if (obj != null && (obj instanceof CharSequence)) {
                        u.w(sb2, "&", str2, "=");
                        try {
                            sb2.append(URLEncoder.encode(obj.toString(), str));
                        } catch (UnsupportedEncodingException unused) {
                            sb2.append(obj.toString());
                        }
                    }
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(0);
        }
        return sb2;
    }

    public final void b(OutputStream outputStream) {
        ByteArrayInputStream byteArrayInputStream = this.f11198w;
        if (byteArrayInputStream != null) {
            if (outputStream instanceof p226og.a) {
                ((p226og.a) outputStream).f40541a.addAndGet(byteArrayInputStream.available());
                return;
            }
            byte[] bArr = new byte[4096];
            while (true) {
                int i7 = byteArrayInputStream.read(bArr);
                if (i7 == -1) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i7);
                }
            }
            ByteArrayInputStream byteArrayInputStream2 = this.f11198w;
            if (byteArrayInputStream2 != null) {
                try {
                    byteArrayInputStream2.close();
                } catch (Exception unused) {
                }
            }
            this.f11198w = null;
            return;
        }
        d dVar = this.f11197v;
        Iterator it = ((AbstractMap) dVar.f1592b).keySet().iterator();
        while (it.hasNext()) {
            for (Object obj : dVar.i((String) it.next())) {
                if ((obj instanceof p043d.b) || (obj instanceof File)) {
                    if (isCancelled()) {
                        return;
                    }
                    for (String str : ((AbstractMap) dVar.f1592b).keySet()) {
                        if (!TextUtils.isEmpty(str)) {
                            for (Object obj2 : dVar.i(str)) {
                                boolean z3 = obj2 instanceof String;
                                String str2 = this.f11187b;
                                if (z3) {
                                    if (!(outputStream instanceof p226og.a)) {
                                        G8.a.i(str + "=" + obj2, "i");
                                    }
                                    outputStream.write(q0.l(str2, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\n\r\n").getBytes(d()));
                                    outputStream.write(((String) obj2).getBytes(d()));
                                } else if (obj2 instanceof p043d.b) {
                                    if (!(outputStream instanceof p226og.a)) {
                                        G8.a.i(str + " is Binary", "i");
                                    }
                                    p043d.b bVar = (p043d.b) obj2;
                                    outputStream.write((str2 + "\r\nContent-Disposition: form-data; name=\"" + str + "\"; filename=\"" + bVar.getFileName() + "\"\r\nContent-Type: " + bVar.c() + "\r\n\r\n").getBytes());
                                    if (outputStream instanceof p226og.a) {
                                        ((p226og.a) outputStream).f40541a.addAndGet(bVar.b());
                                    } else {
                                        bVar.a();
                                    }
                                }
                                outputStream.write("\r\n".getBytes());
                            }
                        }
                    }
                    outputStream.write(this.f11188c.getBytes());
                    return;
                }
            }
        }
        StringBuilder sbA = a(dVar, d());
        if (sbA.length() > 0) {
            String string = sbA.toString();
            if (!(outputStream instanceof p226og.a)) {
                G8.a.i("Body: " + string, "i");
            }
            byte[] bytes = string.getBytes();
            if (bytes != null) {
                outputStream.write(bytes);
            }
        }
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f11196p)) {
            this.f11196p = "utf-8";
        }
        return this.f11196p;
    }

    public final String e() {
        String str = this.f11190e;
        StringBuilder sb2 = new StringBuilder(str);
        ByteArrayInputStream byteArrayInputStream = this.f11198w;
        d dVar = this.f11197v;
        if (byteArrayInputStream != null) {
            StringBuilder sbA = a(dVar, d());
            if (sbA.length() > 0) {
                if (str.contains("?") && str.contains("=")) {
                    sb2.append("&");
                } else if (!str.endsWith("?")) {
                    sb2.append("?");
                }
                sb2.append((CharSequence) sbA);
            }
            return sb2.toString();
        }
        if (J3.a.a(this.f11191f)) {
            return sb2.toString();
        }
        StringBuilder sbA2 = a(dVar, d());
        if (sbA2.length() > 0) {
            if (str.contains("?") && str.contains("=")) {
                sb2.append("&");
            } else if (!str.endsWith("?")) {
                sb2.append("?");
            }
            sb2.append((CharSequence) sbA2);
        }
        return sb2.toString();
    }

    @Override // p057e.a
    public final boolean isCancelled() {
        p314uf.e eVar = this.f11185A;
        return eVar != null && eVar.isCancelled();
    }
}
