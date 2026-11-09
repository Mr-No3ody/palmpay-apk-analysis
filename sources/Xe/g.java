package Xe;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        String string;
        Object obj2 = obj;
        if (obj != null) {
            string = obj.toString();
            if (TextUtils.isEmpty(string)) {
                obj2 = string;
                obj2 = "";
            }
        }
        obj2 = string;
        return super.containsKey(obj2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        String string;
        Object obj2 = obj;
        if (obj != null) {
            string = obj.toString();
            if (TextUtils.isEmpty(string)) {
                obj2 = string;
                obj2 = "";
            }
        }
        obj2 = string;
        return (List) super.get(obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return (List) super.put(str, list);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        String string;
        Object obj2 = obj;
        if (obj != null) {
            string = obj.toString();
            if (TextUtils.isEmpty(string)) {
                obj2 = string;
                obj2 = "";
            }
        }
        obj2 = string;
        return (List) super.remove(obj2);
    }
}
