package p314uf;

import Xe.a;
import Xe.d;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f42995B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Class f42996C;

    public b(Class cls, String str) {
        super(str, 2);
        this.f42995B = 1;
        this.f42996C = cls;
    }

    public final Object f(d dVar, byte[] bArr) {
        String str = "";
        if (bArr != null && bArr.length != 0) {
            String str2 = (String) dVar.a(HttpHeaders.CONTENT_TYPE);
            String str3 = p226og.b.f40542a;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty("charset")) {
                StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
                while (stringTokenizer.hasMoreElements()) {
                    String strNextToken = stringTokenizer.nextToken();
                    int iIndexOf = strNextToken.indexOf(61);
                    if (iIndexOf > 0 && "charset".equalsIgnoreCase(strNextToken.substring(0, iIndexOf).trim())) {
                        str = strNextToken.substring(iIndexOf + 1).trim();
                        break;
                    }
                }
            }
            try {
                str = new String(bArr, str);
            } catch (UnsupportedEncodingException unused) {
                str = new String(bArr);
            }
        }
        G8.a.i("=========================RESPONSE================================", "i");
        G8.a.i(str, "i");
        G8.a.i("=========================RESPONSE================================", "i");
        try {
            return new Gson().fromJson(str, this.f42996C);
        } catch (Exception e10) {
            G8.a.c(e10);
            throw new Exception("server error");
        }
    }
}
