package com.facebook.hermes.intl;

import U2.AbstractC0610a;
import U2.B;
import U2.C;
import android.icu.lang.UCharacter;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class Intl {
    @DoNotStrip
    public static List<String> getCanonicalLocales(List<String> list) throws B {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new B("Incorrect locale information provided", 0);
            }
            if (str.isEmpty()) {
                throw new B("Incorrect locale information provided", 0);
            }
            String canonicalTag = AbstractC0610a.g(str).toCanonicalTag();
            if (!canonicalTag.isEmpty() && !arrayList.contains(canonicalTag)) {
                arrayList.add(canonicalTag);
            }
        }
        return arrayList;
    }

    @DoNotStrip
    public static String toLocaleLowerCase(List<String> list, String str) throws B {
        C c6 = (C) AbstractC0610a.e((String[]) list.toArray(new String[list.size()])).f41178b;
        c6.a();
        return UCharacter.toLowerCase(c6.f9108a, str);
    }

    @DoNotStrip
    public static String toLocaleUpperCase(List<String> list, String str) throws B {
        C c6 = (C) AbstractC0610a.e((String[]) list.toArray(new String[list.size()])).f41178b;
        c6.a();
        return UCharacter.toUpperCase(c6.f9108a, str);
    }
}
