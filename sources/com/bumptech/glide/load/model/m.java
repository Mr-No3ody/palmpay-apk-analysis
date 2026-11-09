package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f20852d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20853a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f20854b = f20852d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20855c = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = property.charAt(i7);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            property = sb2.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new n(property)));
        }
        f20852d = Collections.unmodifiableMap(map);
    }

    public final void a() {
        if (this.f20853a) {
            this.f20853a = false;
            HashMap map = new HashMap(this.f20854b.size());
            for (Map.Entry entry : this.f20854b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f20854b = map;
        }
    }
}
