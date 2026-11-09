package p212o1;

import C0.G;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f40004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f40005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40007e;

    public d(ArrayList arrayList, char c6, double d2, String str, String str2) {
        this.f40003a = arrayList;
        this.f40004b = c6;
        this.f40005c = d2;
        this.f40006d = str;
        this.f40007e = str2;
    }

    public static int a(char c6, String str, String str2) {
        return str2.hashCode() + G.c(c6 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f40004b, this.f40007e, this.f40006d);
    }
}
