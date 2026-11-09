package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import cn.tongdun.android.shell.FMAgent;
import cn.tongdun.android.shell.TDOption;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q9q999qgg99gq9qq9qqq9g {
    @Nullable
    public static String q999ggg99999qqggqqg9qg(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile(q999ggg99999qqggqqg9qg("4a7c0a4a160a0e401f0a0c5f5e4a160a0e09431f0a0c0d0f1e1c0c", 36)).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 46);
            byte b10 = (byte) (bArr[0] ^ Ascii.DC4);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0172  */
    public static void q999ggg99999qqggqqg9qg(TDOption tDOption) {
        String string;
        String str;
        int i7;
        StringBuilder sb2;
        String str2;
        int i10;
        String strQ999ggg99999qqggqqg9qg;
        String str3;
        int i11;
        String strQ999ggg99999qqggqqg9qg2;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg = tDOption.getPlatform();
        if (q999ggg99999qqggqqg9qg("646f7e6c", 80).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("72053c2215071d190f35211f0e1c", 32));
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g = tDOption.getPartnerCode();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqg999qq = tDOption.getAppName();
        if (TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g = cn.tongdun.android.shell.common.qgq9qg99.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g;
        if (TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqg999qq)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqg999qq = cn.tongdun.android.shell.common.qgq9qg99.qgq9qg99(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9qg99 = tDOption.getEnvironment();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq = tDOption.getWaitTime();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qggqgq99q999g = Math.max(tDOption.getBlackBoxMaxSize(), 5120);
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g = tDOption.getDomain();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqq9gqqqq9qgqg9 = tDOption.getCountry();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q9q9gqgqg9qgqg9qggq9 = tDOption.getCustomProcessName();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqgg9q99qg9 = tDOption.getEnterpriseUrl();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999qqg = tDOption.getCustomFilePath();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9qqg99qqg = tDOption.getApkSignedSHA256();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99gq9qg9gggq9qgg = tDOption.getApplicationIdSHA256();
        String collectLevel = tDOption.getCollectLevel();
        if (q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_WITHDRAW_VIRTUAL_CARD, 54).equals(collectLevel)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9qqq999gq = 0;
        } else if (q999ggg99999qqggqqg9qg("59", 35).equals(collectLevel)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9qqq999gq = 1;
        } else if (q999ggg99999qqggqqg9qg("5c", 16).equals(collectLevel)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9qqq999gq = 2;
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9qqgq9q9 = Math.max(tDOption.getHttpTimeout(), com.google.firebase.perf.util.Constants.MAX_URL_LENGTH);
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9qg99 = tDOption.getTDChannel();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9q9qq9 = tDOption.getAppKey();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9g999g999 = tDOption.getCustomMessage();
        if (TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqgg9q99qg9)) {
            String str4 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqq9gqqqq9qgqg9;
            if (TextUtils.isEmpty(str4)) {
                string = null;
            } else {
                if (str4.equals(q999ggg99999qqggqqg9qg("4125", 13))) {
                    str = "7c081410175d01144e124a5f024a5b050d09045e541f05";
                    i7 = 58;
                } else if (str4.equals(q999ggg99999qqggqqg9qg("521017", 42))) {
                    str = "7c74686c6b217d68236920237e36277971757822286379";
                    i7 = 70;
                } else if (str4.equals(q999ggg99999qqggqqg9qg("4765", 95))) {
                    str = "7c392521266c302579316f6e337b6a343c38356f652e34";
                    i7 = 11;
                } else if (str4.equals(q999ggg99999qqggqqg9qg("576a", 73))) {
                    str = "7c273b3f38722e3b773678702d65742a22262b717b302a";
                    i7 = 21;
                } else {
                    if (str4.equals(q999ggg99999qqggqqg9qg("5d1e191c", 61))) {
                        str = "7c2b3733347e2237713a7e7c216978262e2a277d773c26";
                        i7 = 25;
                    } else {
                        string = "";
                    }
                    if (!TextUtils.isEmpty(string)) {
                        StringBuilder sbS = u.s(string);
                        sbS.append(q999ggg99999qqggqqg9qg("3b08494c505b404b0d1f01", 104));
                        string = sbS.toString();
                    }
                }
                string = q999ggg99999qqggqqg9qg(str, i7);
                if (!TextUtils.isEmpty(string)) {
                    StringBuilder sbS2 = u.s(string);
                    sbS2.append(q999ggg99999qqggqqg9qg("3b08494c505b404b0d1f01", 104));
                    string = sbS2.toString();
                }
            }
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg = string;
            if (q999ggg99999qqggqqg9qg("6418091b", 39).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg)) {
                if (!TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g)) {
                    sb2 = new StringBuilder();
                    sb2.append(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g);
                    str2 = "3b09484d515a414a102b205018455a4e48424e0c035e5b46";
                    i10 = 105;
                    strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(str2, i10);
                    sb2.append(strQ999ggg99999qqggqqg9qg);
                    strQ999ggg99999qqggqqg9qg2 = sb2.toString();
                    cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg = strQ999ggg99999qqggqqg9qg2;
                }
            } else if (TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g)) {
                if (q999ggg99999qqggqqg9qg("643827312b2c2d273c3b", 20).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9qg99)) {
                    str3 = "7c7d6165622874612d6c222a773f2e70787c712b216a703a2f6e6b777c676c2a3826";
                    i11 = 79;
                } else if (q999ggg99999qqggqqg9qg("676d7075797268", 81).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9qg99)) {
                    str3 = "7c716d696e24786d247b697c7b6a3737766c646e7c762d2d667c362362677b706b6026342a";
                    i11 = 67;
                }
                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(str3, i11);
                cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg = strQ999ggg99999qqggqqg9qg2;
            } else {
                if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g.contains(q999ggg99999qqggqqg9qg("752820242973793228", 23))) {
                    sb2 = new StringBuilder();
                    sb2.append(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g);
                    strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("3b61202539322922647668", 1);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g);
                    str2 = "3b7a3b3e22293239635853236b36293d3b313d7f702d2835";
                    i10 = 26;
                    strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(str2, i10);
                }
                sb2.append(strQ999ggg99999qqggqqg9qg);
                strQ999ggg99999qqggqqg9qg2 = sb2.toString();
                cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg = strQ999ggg99999qqggqqg9qg2;
            }
        } else {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqgg9q99qg9;
        }
        int mask = tDOption.getMask();
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg = (mask & 2) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqg99q9q9q = (mask & 8) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g = (mask & 16) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.ggq999qqgqgq9g9qqq = (mask & 32) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qq9gg99gqqqgqgq999gqg = (mask & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqgqgq9qqqg999qggqqqg = (mask & 1) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q = (mask & 512) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qq9gg9q = (mask & 4096) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqqqgqg9qgqg9q99qq9qq = (mask & 16384) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99q9ggqg9gqgq9 = (mask & 64) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99g9q99 = (mask & 2048) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9ggqqggqq99gqq9q99 = (mask & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqqgggqgg99qg9 = (32768 & mask) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9q9999qg = (65536 & mask) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.ggq9qqq = (131072 & mask) != 0;
        cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqgq9qq9ggggg9g = (mask & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0;
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context, Object obj, String str) {
        if (obj != null && (!(obj instanceof String) || !TextUtils.isEmpty((String) obj))) {
            return true;
        }
        if (!qqg999qq.q999ggg99999qqggqqg9qg(context)) {
            return false;
        }
        if (FMAgent.mFMGetBlackBoxCodeCallback != null) {
            new cn.tongdun.android.shell.common.qgqq999g();
            cn.tongdun.android.shell.common.qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVarQ999ggg99999qqggqqg9qg = cn.tongdun.android.shell.common.qgqq999g.q999ggg99999qqggqqg9qg(str);
            if (qg9gqgqqggg9q9qgVarQ999ggg99999qqggqqg9qg != null) {
                FMAgent.mFMGetBlackBoxCodeCallback.onResult(qg9gqgqqggg9q9qgVarQ999ggg99999qqggqqg9qg.f19275q999ggg99999qqggqqg9qg, qg9gqgqqggg9q9qgVarQ999ggg99999qqggqqg9qg.qgq9qg99);
            }
        }
        throw new IllegalArgumentException(str);
    }
}
