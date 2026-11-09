package p022b6;

import Z5.c;
import com.nimbusds.jose.shaded.gson.m;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18785b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18786a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        Collections.unmodifiableSet(hashSet);
    }

    public b(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f18786a = linkedHashMap2;
        linkedHashMap2.putAll(linkedHashMap);
    }

    public final List a() throws ParseException {
        List list;
        String[] strArr;
        LinkedHashMap linkedHashMap = this.f18786a;
        if (linkedHashMap.get("aud") == null) {
            list = null;
        } else {
            try {
                list = (List) linkedHashMap.get("aud");
            } catch (ClassCastException unused) {
                throw new ParseException("The aud claim is not a list / JSON array", 0);
            }
        }
        if (list == null) {
            strArr = null;
        } else {
            int size = list.size();
            strArr = new String[size];
            for (int i7 = 0; i7 < size; i7++) {
                try {
                    strArr[i7] = (String) list.get(i7);
                } catch (ClassCastException unused2) {
                    throw new ParseException("The aud claim is not a list / JSON array of strings", 0);
                }
            }
        }
        if (strArr == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Objects.equals(this.f18786a, ((b) obj).f18786a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18786a);
    }

    public final String toString() {
        List listA;
        m mVar = c.f11523a;
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = this.f18786a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() instanceof Date) {
                map.put(entry.getKey(), Long.valueOf(((Date) entry.getValue()).getTime() / 1000));
            } else if ("aud".equals(entry.getKey())) {
                Object obj = linkedHashMap.get("aud");
                if (obj instanceof String) {
                    listA = Collections.singletonList((String) obj);
                } else {
                    try {
                        listA = a();
                        if (listA == null) {
                            listA = Collections.EMPTY_LIST;
                        }
                    } catch (ParseException unused) {
                        listA = Collections.EMPTY_LIST;
                    }
                }
                if (listA != null && !listA.isEmpty()) {
                    if (listA.size() == 1) {
                        map.put("aud", listA.get(0));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(listA);
                        map.put("aud", arrayList);
                    }
                }
            } else if (entry.getValue() != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return c.h(map);
    }
}
