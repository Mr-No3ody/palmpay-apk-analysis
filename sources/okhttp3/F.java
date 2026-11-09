package okhttp3;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f40566b = new E(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f40567a;

    public F(String[] strArr) {
        this.f40567a = strArr;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f40566b.get(this.f40567a, name);
    }

    public final String b(int i7) {
        return this.f40567a[i7 * 2];
    }

    public final Set c() {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.J.f38955a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            treeSet.add(b(i7));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final F1.b d() {
        F1.b bVar = new F1.b(3);
        kotlin.collections.v.p(bVar.f2516a, this.f40567a);
        return bVar;
    }

    public final TreeMap e() {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.J.f38955a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String strB = b(i7);
            Locale locale = Locale.US;
            String strQ = androidx.camera.video.u.q(locale, "US", strB, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strQ);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strQ, arrayList);
            }
            arrayList.add(f(i7));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            return Arrays.equals(this.f40567a, ((F) obj).f40567a);
        }
        return false;
    }

    public final String f(int i7) {
        return this.f40567a[(i7 * 2) + 1];
    }

    public final List g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if (kotlin.text.y.h(name, b(i7), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i7));
            }
        }
        if (arrayList == null) {
            return kotlin.collections.z.f38935a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40567a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i7 = 0; i7 < size; i7++) {
            pairArr[i7] = new Pair(b(i7), f(i7));
        }
        return AbstractC1859i.a(pairArr);
    }

    public final int size() {
        return this.f40567a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String strB = b(i7);
            String strF = f(i7);
            sb2.append(strB);
            sb2.append(": ");
            if (Dg.c.q(strB)) {
                strF = "██";
            }
            sb2.append(strF);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
