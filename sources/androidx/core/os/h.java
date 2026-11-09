package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f16097b = new h(new i(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16098a;

    public h(i iVar) {
        this.f16098a = iVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return f16097b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArrSplit[i7];
            int i10 = g.f16096a;
            localeArr[i7] = Locale.forLanguageTag(str2);
        }
        return new h(new i(new LocaleList(localeArr)));
    }

    public final Locale b(int i7) {
        return this.f16098a.f16099a.get(i7);
    }

    public final boolean c() {
        return this.f16098a.f16099a.isEmpty();
    }

    public final int d() {
        return this.f16098a.f16099a.size();
    }

    public final String e() {
        return this.f16098a.f16099a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f16098a.equals(((h) obj).f16098a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16098a.f16099a.hashCode();
    }

    public final String toString() {
        return this.f16098a.f16099a.toString();
    }
}
