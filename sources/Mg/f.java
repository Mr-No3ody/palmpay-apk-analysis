package Mg;

import Pg.AbstractC0555b;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6024a = new f();

    public static List a(X509Certificate x509Certificate, int i7) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return z.f38935a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.c(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return z.f38935a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    public static boolean b(String host, X509Certificate certificate) {
        boolean zC;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = Dg.c.f1879a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (Dg.c.f1884f.b(host)) {
            String strB0 = p059e1.a.b0(host);
            List listA = a(certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c(strB0, p059e1.a.b0((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) AbstractC0555b.k(host))) {
            Locale locale = Locale.US;
            host = u.q(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(certificate, 2);
        if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
            for (String strQ : listA2) {
                if (host == null || host.length() == 0 || y.m(host, Consts.DOT, false) || y.g(host, "..", false) || strQ == null || strQ.length() == 0 || y.m(strQ, Consts.DOT, false) || y.g(strQ, "..", false)) {
                    zC = false;
                } else {
                    String strConcat = !y.g(host, Consts.DOT, false) ? host.concat(Consts.DOT) : host;
                    if (!y.g(strQ, Consts.DOT, false)) {
                        strQ = strQ.concat(Consts.DOT);
                    }
                    if (strQ.length() == ((int) AbstractC0555b.k(strQ))) {
                        Locale locale2 = Locale.US;
                        strQ = u.q(locale2, "US", strQ, locale2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!StringsKt.A(strQ, "*", false)) {
                        zC = Intrinsics.c(strConcat, strQ);
                    } else if (!y.m(strQ, "*.", false) || StringsKt.D(strQ, '*', 1, 4) != -1 || strConcat.length() < strQ.length() || "*.".equals(strQ)) {
                        zC = false;
                    } else {
                        String strSubstring = strQ.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (y.g(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || StringsKt.H(strConcat, '.', length - 1, 4) == -1)) {
                            zC = true;
                        } else {
                            zC = false;
                        }
                    }
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (host.length() == ((int) AbstractC0555b.k(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                Intrinsics.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
