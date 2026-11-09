package com.google.firebase.datastorage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p193n0.b;
import p193n0.e;
import p193n0.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ln0/g;", "Ln0/e;", "key", "defaultValue", "getOrDefault", "(Ln0/g;Ln0/e;Ljava/lang/Object;)Ljava/lang/Object;", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorageKt {
    public static final <T> T getOrDefault(@NotNull g gVar, @NotNull e key, T t) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        b bVar = (b) gVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = (T) bVar.f39807a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = (T) Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkNotNullExpressionValue(obj, "copyOf(this, size)");
        }
        return obj == null ? t : (T) obj;
    }
}
