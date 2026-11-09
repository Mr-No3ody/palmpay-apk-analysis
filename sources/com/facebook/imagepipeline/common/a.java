package com.facebook.imagepipeline.common;

import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Pattern getHeaderParsingRegEx() {
        Object value = b.f21421d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Pattern) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String valueOrEmpty(int i7) {
        return i7 == Integer.MAX_VALUE ? "" : String.valueOf(i7);
    }

    @JvmStatic
    @NotNull
    public final b from(int i7) {
        p213o2.e.a(Boolean.valueOf(i7 >= 0));
        return new b(i7, Integer.MAX_VALUE);
    }

    @JvmStatic
    @Nullable
    public final b fromContentRangeHeader(@Nullable String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        try {
            String[] strArrSplit = getHeaderParsingRegEx().split(str);
            p213o2.e.a(Boolean.valueOf(strArrSplit.length == 4));
            p213o2.e.a(Boolean.valueOf(Intrinsics.c(strArrSplit[0], "bytes")));
            String str2 = strArrSplit[1];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            int i7 = Integer.parseInt(str2);
            String str3 = strArrSplit[2];
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            int i10 = Integer.parseInt(str3);
            String str4 = strArrSplit[3];
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            int i11 = Integer.parseInt(str4);
            p213o2.e.a(Boolean.valueOf(i10 > i7));
            p213o2.e.a(Boolean.valueOf(i11 > i10));
            return i10 < i11 - 1 ? new b(i7, i10) : new b(i7, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(com.airbnb.lottie.model.layer.d.o(new Object[]{str}, 1, null, "Invalid Content-Range header value: \"%s\"", "format(...)"), e10);
        }
    }

    @JvmStatic
    @NotNull
    public final b toMax(int i7) {
        p213o2.e.a(Boolean.valueOf(i7 > 0));
        return new b(0, i7);
    }

    private a() {
    }
}
