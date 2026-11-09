package androidx.core.provider;

import android.util.Base64;
import androidx.camera.video.u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16114e;

    public e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f16110a = str;
        str2.getClass();
        this.f16111b = str2;
        this.f16112c = str3;
        list.getClass();
        this.f16113d = list;
        this.f16114e = u.n(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f16110a + ", mProviderPackage: " + this.f16111b + ", mQuery: " + this.f16112c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f16113d;
            if (i7 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i7);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i7++;
        }
    }
}
