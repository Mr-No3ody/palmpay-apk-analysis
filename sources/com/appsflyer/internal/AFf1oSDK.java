package com.appsflyer.internal;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 1;
    private static long getMonetizationNetwork;
    private static int getRevenue;

    static {
        AFAdRevenueData();
        ViewConfiguration.getTapTimeout();
        int i7 = getRevenue + 75;
        AFAdRevenueData = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 98 / 0;
        }
    }

    public static void AFAdRevenueData() {
        getMonetizationNetwork = -8862131506522755508L;
    }

    private static void a(String str, int i7, Object[] objArr) {
        $11 = ($10 + 79) % 128;
        Object obj = str;
        if (str != null) {
            char[] charArray = str.toCharArray();
            $11 = ($10 + 17) % 128;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        aFk1nSDK.AFAdRevenueData = i7;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1nSDK.getRevenue = 0;
        $10 = ($11 + 99) % 128;
        while (true) {
            int i10 = aFk1nSDK.getRevenue;
            if (i10 >= cArr.length) {
                break;
            }
            $10 = ($11 + 45) % 128;
            jArr[i10] = (((long) cArr[i10]) ^ (((long) i10) * ((long) aFk1nSDK.AFAdRevenueData))) ^ (getMonetizationNetwork ^ 7806791664571486981L);
            aFk1nSDK.getRevenue = i10 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1nSDK.getRevenue = 0;
        while (true) {
            int i11 = aFk1nSDK.getRevenue;
            if (i11 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i12 = $10 + 49;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr2[i11] = (char) jArr[i11];
            } else {
                cArr2[i11] = (char) jArr[i11];
                i11++;
            }
            aFk1nSDK.getRevenue = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        return r4.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r4.length() < 71) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r4.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r5 = com.appsflyer.internal.AFf1oSDK.AFAdRevenueData + 23;
        com.appsflyer.internal.AFf1oSDK.getRevenue = r5 % 128;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getMediationNetwork(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = com.appsflyer.internal.AFf1oSDK.getRevenue
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1oSDK.AFAdRevenueData = r1
            int r0 = r0 % 2
            r1 = 12
            java.lang.String r2 = "\u2063"
            java.lang.String r3 = ""
            if (r0 != 0) goto L28
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r3}
            java.lang.String r5 = android.text.TextUtils.join(r2, r5)
            java.lang.String r4 = com.appsflyer.internal.AFj1dSDK.getRevenue(r5, r4)
            int r5 = r4.length()
            r6 = 71
            if (r5 >= r6) goto L49
            goto L3a
        L28:
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r3}
            java.lang.String r5 = android.text.TextUtils.join(r2, r5)
            java.lang.String r4 = com.appsflyer.internal.AFj1dSDK.getRevenue(r5, r4)
            int r5 = r4.length()
            if (r5 >= r1) goto L49
        L3a:
            int r5 = com.appsflyer.internal.AFf1oSDK.AFAdRevenueData
            int r5 = r5 + 23
            int r6 = r5 % 128
            com.appsflyer.internal.AFf1oSDK.getRevenue = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L47
            return r4
        L47:
            r4 = 0
            throw r4
        L49:
            r5 = 0
            java.lang.String r4 = r4.substring(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1oSDK.getMediationNetwork(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @NonNull
    private static AFi1xSDK getMonetizationNetwork(@NonNull AFi1zSDK aFi1zSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String string;
        if (str == null) {
            return new AFi1xSDK(aFi1zSDK.AFAdRevenueData == AFh1fSDK.DEFAULT, AFi1uSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("絺璕溠悷嫆䳔䛤㣶㈂␗Ḩဵ\u0a4fﱞ\uf66f\ue87a\ue38b햠쾳쇁믗귫ꟷ餈錕蔮缻焸歛嵩坾争䂟㪰Ⳃ⛐ᣣኃІ︗\uf027\uea4b\udc4a혭졪쉻떈꾜ꆮ鯂跔蟣秲猅攑弡儶䬿㵝㝩⥹₉᪙\u0cd9", ((byte) KeyEvent.getModifierMetaStateMask()) + 2544, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1zSDK.AFAdRevenueData == AFh1fSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1zSDK.getRevenue, "android", "v1", string).equals(str);
        return new AFi1xSDK(zEquals, zEquals ? AFi1uSDK.SUCCESS : AFi1uSDK.FAILURE);
    }

    @NonNull
    public final AFi1xSDK getCurrencyIso4217Code(@NonNull AFi1zSDK aFi1zSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (aFi1zSDK != null) {
            int i7 = AFAdRevenueData + 41;
            getRevenue = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (str2 != null && str3 != null) {
                AFi1xSDK monetizationNetwork = getMonetizationNetwork(aFi1zSDK, str, str2, str3);
                int i10 = getRevenue + 81;
                AFAdRevenueData = i10 % 128;
                if (i10 % 2 != 0) {
                    return monetizationNetwork;
                }
                throw null;
            }
        }
        return new AFi1xSDK(false, AFi1uSDK.INTERNAL_ERROR);
    }
}
