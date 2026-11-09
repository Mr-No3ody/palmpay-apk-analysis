package com.google.android.gms.internal.measurement;

import com.google.common.base.Joiner;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsp {
    private static final Pattern zza = Pattern.compile("(\\w+).*");

    public static String zza(String str) {
        Matcher matcher = zza.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
    }

    @Nullable
    public static String zzb(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(String.valueOf(Joiner.on("+").join(list)));
    }
}
