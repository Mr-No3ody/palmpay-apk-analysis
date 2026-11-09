package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class gq9gggq9gq9gg9q99g9q {
    static {
        q999ggg99999qqggqqg9qg("684746786a7846406a76675153", 115);
        q999ggg99999qqggqqg9qg("6841437d6c7e404b6c7d615755", 117);
        q999ggg99999qqggqqg9qg("687f7e4052407e7552435f697e", 75);
        q999ggg99999qqggqqg9qg("6876744a5b49777c5b4a566077", 66);
        q999ggg99999qqggqqg9qg("6855546a786a545f7869754341", 97);
        q999ggg99999qqggqqg9qg("684d4f7160724c4a607c6d5b59", 121);
        q999ggg99999qqggqqg9qg("681918263426181e3428390f18", 45);
        q999ggg99999qqggqqg9qg("68151729382a14123824350314", 33);
    }

    public static String q999ggg99999qqggqqg9qg(String str) {
        String strQ999ggg99999qqggqqg9qg = qqg999qq.q999ggg99999qqggqqg9qg();
        if (q999ggg99999qqggqqg9qg("6a4c5d4f", 68).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg)) {
            StringBuilder sbS = u.s(str);
            sbS.append(q999ggg99999qqggqqg9qg("6a544557", 92));
            str = sbS.toString();
        }
        if (strQ999ggg99999qqggqqg9qg == null) {
            return str;
        }
        StringBuilder sbS2 = u.s(str);
        sbS2.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 83));
        sbS2.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg));
        return sbS2.toString();
    }

    public static String qgq9qg99(String str) {
        String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 84) + cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
        StringBuilder sbS = u.s(str);
        sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 77));
        sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(str2));
        return sbS.toString();
    }

    public static String qqggggg9g9q99q9gq(String str) {
        String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 107) + cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 89) + qqg999qq.q999ggg99999qqggqqg9qg();
        StringBuilder sbS = u.s(str);
        sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 30));
        sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(str2));
        return sbS.toString();
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
            byte b7 = (byte) (i7 ^ 25);
            byte b10 = (byte) (bArr[0] ^ Ascii.SUB);
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

    public static void q999ggg99999qqggqqg9qg(Context context) {
        String strQgq9qg99 = qgq9qg99(q999ggg99999qqggqqg9qg("6e2a73632737", 35));
        String strQqggggg9g9q99q9gq = qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("6e7b22327666", 114));
        if (strQgq9qg99.equals(strQqggggg9g9q99q9gq)) {
            return;
        }
        String strQgq9qg910 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQgq9qg99, "");
        String strQgq9qg911 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQqggggg9g9q99q9gq, "");
        if (TextUtils.isEmpty(strQgq9qg910)) {
            return;
        }
        if (TextUtils.isEmpty(strQgq9qg911)) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQqggggg9g9q99q9gq, strQgq9qg910);
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQgq9qg99);
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str) {
        String strQ999ggg99999qqggqqg9qg;
        String str2;
        int i7;
        if (q999ggg99999qqggqqg9qg("696f7d6f", 100).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg)) {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("6845447a687a444f6879655344", 113);
            str2 = "6824251b091b25230915043225";
            i7 = 16;
        } else {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("681e1c2233211f1433223e081f", 42);
            str2 = "6837350b1a0836301a06172136";
            i7 = 3;
        }
        String strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(str2, i7);
        String strQ999ggg99999qqggqqg9qg3 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("7c58617f485a404452", 74), str, "");
        if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg3)) {
            String strQ999ggg99999qqggqqg9qg4 = qqg999qq.q999ggg99999qqggqqg9qg();
            if (strQ999ggg99999qqggqqg9qg4 != null) {
                StringBuilder sbS = u.s(str);
                sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 83));
                sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg4));
                strQ999ggg99999qqggqqg9qg3 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("7c1b223c0b19030711", 9), sbS.toString(), "");
            }
            if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg3)) {
                return;
            }
        }
        if (q999ggg99999qqggqqg9qg("4e49424555595d5b555554", 64).equals(str)) {
            if (q999ggg99999qqggqqg9qg("2b", 101).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg, ""))) {
                return;
            }
        }
        if (q999ggg99999qqggqqg9qg("6e3f6661202a232435766b226631", 54).equals(str)) {
            if (q999ggg99999qqggqqg9qg("2b", 38).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg2, ""))) {
                return;
            }
        }
        String strQ999ggg99999qqggqqg9qg5 = q999ggg99999qqggqqg9qg(str);
        if (!str.equals(strQ999ggg99999qqggqqg9qg5) && TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg5, ""))) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQ999ggg99999qqggqqg9qg5, strQ999ggg99999qqggqqg9qg3);
            if (q999ggg99999qqggqqg9qg("4e32393e2e2226202e2e2f", 59).equals(str)) {
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQ999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("2b", 125));
            }
            if (q999ggg99999qqggqqg9qg("6e154c4b0a00090e1f5c41084c1b", 28).equals(str)) {
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQ999ggg99999qqggqqg9qg2, q999ggg99999qqggqqg9qg("2b", 104));
            }
        }
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, String str2) {
        String strQ999ggg99999qqggqqg9qg;
        String str3;
        int i7;
        String strQ999ggg99999qqggqqg9qg2;
        File file = new File(str);
        if (q999ggg99999qqggqqg9qg("69584a58", 83).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg)) {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("6845447a687a444f6879655351", 113);
            str3 = "683f3e0012003e38120e1f292b";
            i7 = 11;
        } else {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("68090b35243608032435291f1d", 61);
            str3 = "6851536d7c6e50567c60714745";
            i7 = 101;
        }
        String strQ999ggg99999qqggqqg9qg3 = q999ggg99999qqggqqg9qg(str3, i7);
        if (!file.exists() && (strQ999ggg99999qqggqqg9qg2 = qqg999qq.q999ggg99999qqggqqg9qg()) != null) {
            StringBuilder sbS = u.s(str);
            sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_REFUND, 10));
            sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg2));
            file = new File(sbS.toString());
            if (!file.exists()) {
                return;
            }
        }
        String strQ999ggg99999qqggqqg9qg4 = q999ggg99999qqggqqg9qg(file.getName());
        if (file.getName().equals(strQ999ggg99999qqggqqg9qg4)) {
            return;
        }
        if (q999ggg99999qqggqqg9qg("4e5d5651414d494f414140", 84).equals(str2)) {
            if (q999ggg99999qqggqqg9qg("2b", 87).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg, ""))) {
                return;
            }
        }
        if (q999ggg99999qqggqqg9qg("6e297077363c353223607d347027", 32).equals(str2)) {
            if (q999ggg99999qqggqqg9qg("2b", 12).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg3, ""))) {
                return;
            }
        }
        File file2 = new File(file.getParent(), strQ999ggg99999qqggqqg9qg4);
        if (file.exists() && !file2.exists() && qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(file, file2)) {
            if (q999ggg99999qqggqqg9qg("4e63686f7f7377717f7f7e", 106).equals(str2)) {
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQ999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("2b", 23));
            }
            if (q999ggg99999qqggqqg9qg("6e6b3235747e777061223f763265", 98).equals(str2)) {
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, strQ999ggg99999qqggqqg9qg3, q999ggg99999qqggqqg9qg("2b", 43));
            }
        }
    }
}
