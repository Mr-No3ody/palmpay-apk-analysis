package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Headers {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f20858c;

    public o(Map map) {
        this.f20857b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f20857b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strBuildHeader = ((LazyHeaderFactory) list.get(i7)).buildHeader();
                if (!TextUtils.isEmpty(strBuildHeader)) {
                    sb2.append(strBuildHeader);
                    if (i7 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f20857b.equals(((o) obj).f20857b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public final Map getHeaders() {
        if (this.f20858c == null) {
            synchronized (this) {
                try {
                    if (this.f20858c == null) {
                        this.f20858c = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20858c;
    }

    public final int hashCode() {
        return this.f20857b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f20857b + '}';
    }
}
