package com.palmpay.lib.webview.container.fast.utils;

import M.g;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.F;

/* JADX INFO: loaded from: classes3.dex */
public class HeaderUtils {
    public static final String HEADER_CACHE_SOURCE = "X-PP-Cache-Source";

    public static Map<String, String> generateHeadersMap(F f10, String str) {
        HashMap map = new HashMap();
        for (String str2 : f10.c()) {
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : listToSet(f10.g(str2))) {
                if (!TextUtils.isEmpty(sb2)) {
                    sb2.append(" ");
                }
                sb2.append(str3);
            }
            map.put(str2, sb2.toString().trim());
        }
        if (TextUtils.isEmpty(str)) {
            map.remove(HEADER_CACHE_SOURCE);
            return map;
        }
        map.put(HEADER_CACHE_SOURCE, str);
        return map;
    }

    private static Set<String> listToSet(List<String> list) {
        g gVar = new g(list.size());
        gVar.addAll(list);
        return gVar;
    }

    public static Map<String, String> generateHeadersMap(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = map.get(str).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                sb2.append(it.next());
                int i10 = i7 + 1;
                if (i7 > 0) {
                    sb2.append(",");
                }
                i7 = i10;
            }
            map2.put(str, sb2.toString());
        }
        return map2;
    }
}
