package p075f2;

import N8.q0;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.didi.drouter.store.IRouterProxy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p092g2.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f36364h = Pattern.compile("<[a-zA-Z_]+\\w*>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f36366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IRouterProxy f36367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean[] f36369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f36370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36371g;

    public static b b(int i7) {
        b bVar = new b();
        bVar.f36369e = new Boolean[3];
        bVar.f36365a = i7;
        return bVar;
    }

    public final void a(Class cls, IRouterProxy iRouterProxy, String str, int i7) {
        this.f36366b = cls;
        this.f36367c = iRouterProxy;
        this.f36371g = str;
        this.f36368d = i7;
    }

    public final String c() {
        Class cls = this.f36366b;
        if (cls != null) {
            return cls.getSimpleName();
        }
        return null;
    }

    public final boolean d(int i7) {
        Boolean[] boolArr = this.f36369e;
        Boolean bool = boolArr[i7];
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        boolean zFind = f36364h.matcher(null).find();
        boolArr[i7] = Boolean.valueOf(zFind);
        return zFind;
    }

    public final boolean e(String str, int i7, Bundle bundle) {
        if (!d(i7) || str == null) {
            return true;
        }
        Bundle bundle2 = new Bundle();
        String strK = q0.k("@@", str, Consts.SEPARATOR);
        String strSubstring = "@@null$$";
        String[] strArrSplit = "@@null$$".split("<[a-zA-Z_]+\\w*>");
        int i10 = 0;
        while (i10 < strArrSplit.length) {
            int i11 = i10 + 1;
            if (i11 < strArrSplit.length) {
                String str2 = strArrSplit[i10];
                String strSubstring2 = strSubstring.substring(str2.length());
                if (!strK.startsWith(str2)) {
                    break;
                }
                String strSubstring3 = strK.substring(str2.length());
                Matcher matcher = f36364h.matcher(strSubstring2);
                String strGroup = matcher.find() ? matcher.group() : "";
                String strReplace = strGroup.replace("<", "").replace(">", "");
                int iIndexOf = strSubstring3.indexOf(strArrSplit[i11]);
                String strSubstring4 = strSubstring3.substring(0, iIndexOf);
                if (strReplace == null || strReplace.length() == 0) {
                    break;
                }
                bundle2.putString(strReplace, strSubstring4);
                strSubstring = strSubstring2.substring(strGroup.length());
                strK = strSubstring3.substring(iIndexOf);
            } else if (strK.equals(strSubstring)) {
                Object[] objArr = {null, str, bundle2};
                if (c.c()) {
                    c.a("inject <> success, annoPart=%s, uriPart=%s, result=%s", objArr);
                }
                bundle.putAll(bundle2);
                return true;
            }
            i10 = i11;
        }
        Object[] objArr2 = {null, str};
        if (c.c()) {
            Log.e("DRouterCore", c.a("inject place holder error, annoPart=%s, uriPart=%s", objArr2));
        }
        return false;
    }
}
