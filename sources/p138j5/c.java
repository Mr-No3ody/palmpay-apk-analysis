package p138j5;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38324a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f38328e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f38325b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38326c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f38327d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38329f = "application/json";

    public c(String str) {
        this.f38324a = str;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder(this.f38324a);
        for (String str : this.f38326c) {
            if (sb2.charAt(sb2.length() - 1) != '/') {
                sb2.append("/");
            }
            sb2.append(str);
        }
        HashMap map = this.f38327d;
        if (!map.isEmpty()) {
            sb2.append("?");
            for (String str2 : map.keySet()) {
                sb2.append(str2);
                sb2.append("=");
                sb2.append((String) map.get(str2));
                sb2.append("&");
            }
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.f38324a);
        for (String str : this.f38326c) {
            if (sb2.charAt(sb2.length() - 1) != '/') {
                sb2.append("/");
            }
            sb2.append(str);
        }
        HashMap map = this.f38327d;
        if (!map.isEmpty()) {
            sb2.append("?");
            for (String str2 : map.keySet()) {
                sb2.append(str2);
                sb2.append("=");
                sb2.append((String) map.get(str2));
                sb2.append("&");
            }
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
