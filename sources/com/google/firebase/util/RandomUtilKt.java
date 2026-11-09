package com.google.firebase.util;

import C0.G;
import Pf.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LPf/d;", "", "length", "", "nextAlphanumericString", "(LPf/d;I)Ljava/lang/String;", "ALPHANUMERIC_ALPHABET", "Ljava/lang/String;", "getALPHANUMERIC_ALPHABET$annotations", "()V", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRandomUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1#2:43\n1557#3:44\n1628#3,3:45\n*S KotlinDebug\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n*L\n34#1:44\n34#1:45,3\n*E\n"})
public final class RandomUtilKt {

    @NotNull
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    @NotNull
    public static final String nextAlphanumericString(@NotNull d random, int i7) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "invalid length: ").toString());
        }
        IntRange intRangeF = b.f(0, i7);
        ArrayList arrayList = new ArrayList(r.l(intRangeF, 10));
        Iterator it = intRangeF.iterator();
        while (((Rf.b) it).f8613c) {
            ((C) it).a();
            Intrinsics.checkNotNullParameter(ALPHANUMERIC_ALPHABET, "<this>");
            Intrinsics.checkNotNullParameter(random, "random");
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(random.c(30))));
        }
        return CollectionsKt.J(arrayList, "", null, null, null, 62);
    }
}
