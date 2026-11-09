package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.aidl.MsgEvent;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1iSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 1;
    private static char[] getMediationNetwork;
    private static int[] getMonetizationNetwork;
    private static int getRevenue;
    private final Context AFAdRevenueData;
    private final Map<String, Object> getCurrencyIso4217Code;

    @VisibleForTesting
    public static class AFa1ySDK {
        @NonNull
        public static byte[] getCurrencyIso4217Code(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] getRevenue(@NonNull byte[] bArr) throws Exception {
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr[i7] = (byte) (bArr[i7] ^ ((i7 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getMediationNetwork();
        Color.red(0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Process.getThreadPriority(0);
        Color.blue(0);
        ViewConfiguration.getJumpTapTimeout();
        getRevenue = (component1 + 63) % 128;
    }

    @WorkerThread
    public AFc1iSDK(Map<String, Object> map, Context context) {
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = context;
        put(getMonetizationNetwork(), AFAdRevenueData());
    }

    @VisibleForTesting
    private static StringBuilder AFAdRevenueData(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i7 = 0;
        while (i7 < 3) {
            int i10 = component1 + 121;
            getRevenue = i10 % 128;
            if (i10 % 2 != 0) {
                arrayList.add(Integer.valueOf(strArr[i7].length()));
                i7 += 102;
            } else {
                arrayList.add(Integer.valueOf(strArr[i7].length()));
                i7++;
            }
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < iIntValue) {
            Integer numValueOf = null;
            int i12 = 0;
            while (i12 < 3) {
                int iCharAt = strArr[i12].charAt(i11);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
                i12++;
                component1 = (getRevenue + 45) % 128;
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
            i11++;
            component1 = (getRevenue + 37) % 128;
        }
        return sb2;
    }

    private static void a(int[] iArr, int i7, Object[] objArr) {
        int length;
        int[] iArr2;
        int i10;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getMonetizationNetwork;
        long j6 = -4948334679126034492L;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                $11 = ($10 + 79) % 128;
                iArr4[i11] = (int) (((long) iArr3[i11]) ^ (-4948334679126034492L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getMonetizationNetwork;
        if (iArr6 != null) {
            int i12 = $11 + 119;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i10 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i10 = 0;
            }
            while (i10 < length) {
                long j10 = j6;
                iArr2[i10] = (int) (((long) iArr6[i10]) ^ j10);
                i10++;
                j6 = j10;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFk1jSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i13 = aFk1jSDK.getCurrencyIso4217Code;
            if (i13 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i7);
                return;
            }
            int i14 = iArr[i13];
            char c6 = (char) (i14 >> 16);
            cArr[0] = c6;
            char c10 = (char) i14;
            cArr[1] = c10;
            char c11 = (char) (iArr[i13 + 1] >> 16);
            cArr[2] = c11;
            char c12 = (char) iArr[i13 + 1];
            cArr[3] = c12;
            aFk1jSDK.getMediationNetwork = (c6 << 16) + c10;
            aFk1jSDK.getRevenue = (c11 << 16) + c12;
            AFk1jSDK.getCurrencyIso4217Code(iArr5);
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = aFk1jSDK.getMediationNetwork ^ iArr5[i15];
                aFk1jSDK.getMediationNetwork = i16;
                int revenue = AFk1jSDK.getRevenue(i16) ^ aFk1jSDK.getRevenue;
                int i17 = aFk1jSDK.getMediationNetwork;
                aFk1jSDK.getMediationNetwork = revenue;
                aFk1jSDK.getRevenue = i17;
            }
            int i18 = aFk1jSDK.getMediationNetwork;
            int i19 = aFk1jSDK.getRevenue;
            aFk1jSDK.getMediationNetwork = i19;
            aFk1jSDK.getRevenue = i18;
            int i20 = i18 ^ iArr5[16];
            aFk1jSDK.getRevenue = i20;
            int i21 = i19 ^ iArr5[17];
            aFk1jSDK.getMediationNetwork = i21;
            cArr[0] = (char) (i21 >>> 16);
            cArr[1] = (char) i21;
            cArr[2] = (char) (i20 >>> 16);
            cArr[3] = (char) i20;
            AFk1jSDK.getCurrencyIso4217Code(iArr5);
            int i22 = aFk1jSDK.getCurrencyIso4217Code;
            cArr2[i22 * 2] = cArr[0];
            cArr2[(i22 * 2) + 1] = cArr[1];
            cArr2[(i22 * 2) + 2] = cArr[2];
            cArr2[(i22 * 2) + 3] = cArr[3];
            aFk1jSDK.getCurrencyIso4217Code = i22 + 2;
        }
    }

    private static void b(String str, boolean z3, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            int i7 = $11 + 9;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        char[] cArr = getMediationNetwork;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i14 = 0; i14 < length; i14++) {
                cArr2[i14] = (char) (((long) cArr[i14]) ^ (-6320700084807177384L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr, i10, cArr3, 0, i11);
        if (bArr != null) {
            char[] cArr4 = new char[i11];
            aFk1lSDK.getCurrencyIso4217Code = 0;
            char c6 = 0;
            while (true) {
                int i15 = aFk1lSDK.getCurrencyIso4217Code;
                if (i15 >= i11) {
                    break;
                }
                if (bArr[i15] == 1) {
                    int i16 = $10 + 17;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        cArr4[i15] = (char) (((cArr3[i15] - 5) % 1) % c6);
                    } else {
                        cArr4[i15] = (char) (((cArr3[i15] * 2) + 1) - c6);
                    }
                } else {
                    cArr4[i15] = (char) ((cArr3[i15] * 2) - c6);
                }
                c6 = cArr4[i15];
                aFk1lSDK.getCurrencyIso4217Code = i15 + 1;
            }
            cArr3 = cArr4;
        }
        if (i13 > 0) {
            char[] cArr5 = new char[i11];
            System.arraycopy(cArr3, 0, cArr5, 0, i11);
            int i17 = i11 - i13;
            System.arraycopy(cArr5, 0, cArr3, i17, i13);
            System.arraycopy(cArr5, i13, cArr3, 0, i17);
        }
        if (z3) {
            char[] cArr6 = new char[i11];
            aFk1lSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i18 = aFk1lSDK.getCurrencyIso4217Code;
                if (i18 >= i11) {
                    break;
                }
                $10 = ($11 + 13) % 128;
                cArr6[i18] = cArr3[(i11 - i18) - 1];
                aFk1lSDK.getCurrencyIso4217Code = i18 + 1;
            }
            cArr3 = cArr6;
        }
        if (i12 > 0) {
            aFk1lSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i19 = aFk1lSDK.getCurrencyIso4217Code;
                if (i19 >= i11) {
                    break;
                }
                cArr3[i19] = (char) (cArr3[i19] - iArr[2]);
                aFk1lSDK.getCurrencyIso4217Code = i19 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void getMediationNetwork() {
        getMonetizationNetwork = new int[]{-1954348329, 1944852038, -426415195, -952017518, 386734435, -1297247430, -280673043, 400361603, 288689280, 1705698129, 1217010715, -1622467877, -325912365, 1948135679, -383758323, -1226097496, 1984452941, 136545297};
        getMediationNetwork = new char[]{27497, 27442, 27441, 27455, 27441, 27441, 27543, 27529, 27534, 27532, 27528, 27638, 27639, 27530, 27533, 27533, 27535, 27533, 27534, 27522, 27535, 27534, 27639, 27625, 27532, 27529, 27639, 27625, 27532, 27523, 27616, 27631, 27524, 27522, 27522, 27624, 27638, 27522, 27521, 27528, 27534, 27526, 27522, 27520, 27522, 27544, 27585, 27393, 27540, 27578, 27527, 27537, 27627, 27627, 27458, 27499, 27503, 27488, 27499, 27502, 27424, 27563, 27223, 27241, 27214, 27496, 27442, 27446, 27443, 27442, 27419, 27421, 27440, 27453, 27419, 27411, 27443, 27454, 27432, 27445, 27454, 27454, 27444, 27453, 27420, 27420, 27395, 27454, 27432, 27445, 27418, 27419, 27451, 27453, 27442, 27440, 27452, 27418, 27419, 27454, 27441, 27441, 27443, 27553, 27631, 27617, 27499, 27592, 27499, 27454, 27444, 27453, 27420, 27420, 27395, 27454, 27432, 27445, 27418, 27418, 27443, 27434, 27432, 27432, 27488, 27400, 27411, 27441, 27455, 27442, 27446, 27453, 27410, 27498, 27401, 27400, 27400, 27400, 27401, 27400};
    }

    @NonNull
    private String getMonetizationNetwork() throws UnsupportedEncodingException {
        component1 = (getRevenue + 55) % 128;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a(new int[]{980391229, 1102192555, 27153251, 1977904325, -889417639, -1682227306}, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            b("\u0000\u0000\u0001\u0001\u0000", false, new int[]{0, 5, 0, 0}, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                component1 = (getRevenue + 57) % 128;
                Object[] objArr3 = new Object[1];
                a(new int[]{947306216, 181339687, -1871748506, -2055197842}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder sbAFAdRevenueData = AFAdRevenueData(string, string3, sb2.toString());
            int length = sbAFAdRevenueData.length();
            if (length > 4) {
                sbAFAdRevenueData.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    sbAFAdRevenueData.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            a(new int[]{1294318176, -507413706}, TextUtils.getTrimmedLength("") + 3, objArr4);
            sbAFAdRevenueData.insert(0, ((String) objArr4[0]).intern());
            return sbAFAdRevenueData.toString();
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            a(new int[]{1771977995, -1428688418, -1850534972, 93714261, 1791004008, 326480142, -1012264920, 73724127, 47637258, -237077082, 287749427, 228255015, -1661032273, -499181025, 1968517061, 228646080, -1139950919, 1894583359, -903527439, 22953865}, TextUtils.lastIndexOf("", '0', 0) + 41, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false, new int[]{5, 42, 108, 0}, objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e10);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            b("\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, new int[]{47, 7, 122, 1}, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x019e  */
    private String AFAdRevenueData() throws UnsupportedEncodingException {
        String string;
        String string2;
        int i7;
        String hexString;
        try {
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a(new int[]{980391229, 1102192555, 27153251, 1977904325, -889417639, -1682227306}, (-16777204) - Color.rgb(0, 0, 0), objArr);
            String string3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            a(new int[]{1571792838, 674247522, 739141429, -1416153811, -823625076, -1136020177, 1743888318, 108590352}, '?' - AndroidCharacter.getMirror('0'), objArr2);
            String string4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b("\u0001\u0001\u0000\u0001\u0001\u0000", true, new int[]{54, 6, 4, 0}, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b("\u0001\u0000\u0001\u0001\u0001", true, new int[]{60, 5, 199, 0}, objArr4);
            String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string3);
            sb2.append(string4);
            sb2.append(strReplaceAll);
            String strAFAdRevenueData = AFj1dSDK.AFAdRevenueData(sb2.toString());
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(strAFAdRevenueData.substring(0, 16));
            string = sb3.toString();
            getRevenue = (component1 + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            b("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", false, new int[]{65, 38, 0, 15}, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(new int[]{-1232785158, 272831520, 1695444853, 1126997819, -1356377673, 99049590, 211666892, 839552641, -1153506145, 575742380, 273610639, -891764663, -1029576467, 1163898775, -903527439, 22953865, 1765055690, -1192997118, 729958432, -1821964181, 1247620181, -1485515207}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e10);
            AFLogger.afRDLog(sb4.toString());
            StringBuilder sb5 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a(new int[]{-512522428, -854209529, 1343258283, -368441839, 723051000, -1445883292, -179578334, -2119523250, -1941713415, 1826562377}, (-16777198) - Color.rgb(0, 0, 0), objArr7);
            sb5.append(((String) objArr7[0]).intern());
            string = sb5.toString();
        }
        String str = string;
        try {
            Context context = this.AFAdRevenueData;
            Object[] objArr8 = new Object[1];
            a(new int[]{-948803707, -1963479724, 2062640710, -376105952, -1532640249, 1277458264, -2024908248, -1173688272, -1519475994, -1605943863, 1757550017, -1667053655, 1138365918, -1702648899, -1001657144, -468731466, -1083248146, -312326692, 642745632, 1617777981}, 37 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentRegisterReceiver != null) {
                Object[] objArr9 = new Object[1];
                a(new int[]{1746168609, -922948762, 287749427, 228255015, -706806397, -1955547404}, Color.alpha(0) + 11, objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.AFAdRevenueData.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                b(null, true, new int[]{MsgEvent.MSG_EVENT_STOP_FOREGROUND, 3, 129, 1}, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
            } else {
                i7 = 0;
            }
            Context context2 = this.AFAdRevenueData;
            Object[] objArr11 = new Object[1];
            a(new int[]{-1188633000, -297146056, -530866819, -1001671317}, 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb6 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            a(new int[]{253793766, 981645833}, 1 - View.resolveSize(0, 0), objArr12);
            sb6.append(((String) objArr12[0]).intern());
            sb6.append(intExtra);
            Object[] objArr13 = new Object[1];
            b("\u0001\u0000", false, new int[]{106, 2, 65, 0}, objArr13);
            sb6.append(((String) objArr13[0]).intern());
            sb6.append(i7);
            Object[] objArr14 = new Object[1];
            a(new int[]{-1693078705, -1553329325}, 2 - View.getDefaultSize(0, 0), objArr14);
            sb6.append(((String) objArr14[0]).intern());
            sb6.append(size);
            Object[] objArr15 = new Object[1];
            a(new int[]{-1520118425, 1386730432}, 3 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr15);
            sb6.append(((String) objArr15[0]).intern());
            sb6.append(this.getCurrencyIso4217Code.size());
            String string5 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            byte[] revenue = AFa1ySDK.getRevenue(AFa1ySDK.getCurrencyIso4217Code(string5));
            StringBuilder sb8 = new StringBuilder();
            int length = revenue.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = getRevenue + 117;
                component1 = i11 % 128;
                if (i11 % 2 == 0) {
                    hexString = Integer.toHexString(revenue[i10]);
                    if (hexString.length() == 0) {
                        hexString = "0".concat(hexString);
                    }
                } else {
                    hexString = Integer.toHexString(revenue[i10]);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(hexString);
                    }
                }
                sb8.append(hexString);
            }
            sb7.append(sb8.toString());
            string2 = sb7.toString();
        } catch (Exception e11) {
            Object[] objArr16 = new Object[1];
            b("\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false, new int[]{108, 16, 0, 0}, objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e11);
            StringBuilder sb9 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            a(new int[]{-1232785158, 272831520, 1695444853, 1126997819, -1356377673, 99049590, 211666892, 839552641, -1153506145, 575742380, 273610639, -891764663, -1029576467, 1163898775, -903527439, 22953865, 1765055690, -1192997118, 729958432, -1821964181, 1247620181, -1485515207}, TextUtils.indexOf("", "") + 44, objArr17);
            sb9.append(((String) objArr17[0]).intern());
            sb9.append(e11);
            AFLogger.afRDLog(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            Object[] objArr18 = new Object[1];
            b("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001", true, new int[]{124, 16, 0, 3}, objArr18);
            sb10.append(((String) objArr18[0]).intern());
            string2 = sb10.toString();
        }
        int i12 = getRevenue + 9;
        component1 = i12 % 128;
        if (i12 % 2 != 0) {
            return string2;
        }
        throw null;
    }
}
