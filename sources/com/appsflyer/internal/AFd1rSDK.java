package com.appsflyer.internal;

import N8.q0;
import com.luck.picture.lib.config.FileSizeUnit;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Pair;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.n;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13004#2,3:103\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n*L\n44#1:103,3\n*E\n"})
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
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

    @Nullable
    public static final Pair<Integer, Integer> getCurrencyIso4217Code(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        o oVarA = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").a(str);
        if (oVarA != null) {
            n nVar = oVarA.f39033c;
            MatchGroup matchGroup = nVar.get(1);
            Integer intOrNull = (matchGroup == null || (str4 = matchGroup.f38998a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroup2 = nVar.get(3);
            Integer intOrNull2 = (matchGroup2 == null || (str3 = matchGroup2.f38998a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroup3 = nVar.get(4);
            Integer intOrNull3 = (matchGroup3 == null || (str2 = matchGroup3.f38998a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * FileSizeUnit.ACCURATE_MB), Integer.valueOf(((intOrNull.intValue() + 1) * FileSizeUnit.ACCURATE_MB) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * FileSizeUnit.ACCURATE_MB)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * FileSizeUnit.ACCURATE_MB)) - 1));
            }
        }
        return null;
    }

    @Nullable
    public static final Pair<Integer, Integer> getMonetizationNetwork(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        o oVarA = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").a(str);
        if (oVarA != null) {
            n nVar = oVarA.f39033c;
            MatchGroup matchGroup = nVar.get(1);
            Integer intOrNull = (matchGroup == null || (str7 = matchGroup.f38998a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroup2 = nVar.get(2);
            Integer intOrNull2 = (matchGroup2 == null || (str6 = matchGroup2.f38998a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroup3 = nVar.get(3);
            Integer intOrNull3 = (matchGroup3 == null || (str5 = matchGroup3.f38998a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroup4 = nVar.get(4);
            Integer intOrNull4 = (matchGroup4 == null || (str4 = matchGroup4.f38998a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroup5 = nVar.get(5);
            Integer intOrNull5 = (matchGroup5 == null || (str3 = matchGroup5.f38998a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroup6 = nVar.get(6);
            Integer intOrNull6 = (matchGroup6 == null || (str2 = matchGroup6.f38998a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.e(intOrNull);
                int iIntValue = intOrNull.intValue() * FileSizeUnit.ACCURATE_MB;
                Intrinsics.e(intOrNull2);
                int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
                Intrinsics.e(intOrNull3);
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                Intrinsics.e(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * FileSizeUnit.ACCURATE_MB;
                Intrinsics.e(intOrNull5);
                int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
                Intrinsics.e(num);
                return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        return null;
    }

    private static boolean getRevenue(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !C1847n.p(objArr, null);
    }

    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }
}
