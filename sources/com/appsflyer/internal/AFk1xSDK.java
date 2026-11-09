package com.appsflyer.internal;

import N8.q0;
import com.luck.picture.lib.config.FileSizeUnit;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.n;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,126:1\n13004#2,3:127\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n54#1:127,3\n*E\n"})
public final class AFk1xSDK {
    public static final int getMediationNetwork(@NotNull String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        o oVarA = new Regex("(\\d+).(\\d+).(\\d+).*").a(str);
        if (oVarA == null) {
            return -1;
        }
        n nVar = oVarA.f39033c;
        MatchGroup matchGroup = nVar.get(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroup == null || (str4 = matchGroup.f38998a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * FileSizeUnit.ACCURATE_MB;
        MatchGroup matchGroup2 = nVar.get(2);
        int iIntValue3 = (((matchGroup2 == null || (str3 = matchGroup2.f38998a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroup3 = nVar.get(3);
        if (matchGroup3 != null && (str2 = matchGroup3.f38998a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }

    public static final String getRevenue(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strJ = "";
        for (byte b7 : bArrDigest) {
            strJ = q0.j(strJ, com.airbnb.lottie.model.layer.d.n(new Object[]{Byte.valueOf(b7)}, 1, "%02x", ""));
        }
        return strJ;
    }
}
