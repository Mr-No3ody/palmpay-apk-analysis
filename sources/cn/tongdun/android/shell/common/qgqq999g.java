package cn.tongdun.android.shell.common;

import android.text.TextUtils;
import cn.tongdun.android.shell.FMAgent;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.mlkit.common.MlKitException;
import com.transsnet.palmpay.core.bean.bill.TransType;

/* JADX INFO: loaded from: classes.dex */
public final class qgqq999g extends q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private String f19277q999ggg99999qqggqqg9qg;
    private String qgq9qg99;

    public qgqq999g() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public static qg9gqgqqggg9q9qg q999ggg99999qqggqqg9qg(String str) {
        String str2;
        int i7;
        String strQ999ggg99999qqggqqg9qg = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        q999ggg99999qqggqqg9qg("4c1628282c3534637f3a293f312c", 100);
        int i10 = 200;
        if (!str.equals(q999ggg99999qqggqqg9qg.gqgg9q99qg9.f19271q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg())) {
            if (str.equals(q999ggg99999qqggqqg9qg.qgq9qg99.f19273q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg())) {
                str2 = "4d2110584d0c0e0e11150c0c0a4f4d0c0e1b07160a4f54074e581500191048114d0114190f0b585e16101b15565400495c1b1b151a5d";
                i7 = 84;
            } else {
                i10 = -1;
            }
            if (i10 == -1) {
                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4c1a24242039386f733625333d20", 104);
            }
            return new qg9gqgqqggg9q9qg(i10, strQ999ggg99999qqggqqg9qg);
        }
        str2 = "4d04357d68292b2b343029292f6a7b342223223e336171226b7d30253c356d346824313c2a2e7d7b33353e307371256c793e3e303f78";
        i7 = 113;
        strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(str2, i7);
        if (i10 == -1) {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4c1a24242039386f733625333d20", 104);
        }
        return new qg9gqgqqggg9q9qg(i10, strQ999ggg99999qqggqqg9qg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    public static qg9gqgqqggg9q9qg qgq9qg99(String str) {
        String str2;
        int i7;
        String strQ999ggg99999qqggqqg9qg = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        q999ggg99999qqggqqg9qg("4c0739393d2425726e2b382e203d", 117);
        int i10 = 200;
        if (str.equals(q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg())) {
            str2 = "4d08397164252727383c252523667525340f1a286d7d2e67713c293039613864283d30262271773f39323c7f7d29607532323c3374";
            i7 = 125;
        } else {
            if (!str.equals(q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg())) {
                if (str.equals(q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg())) {
                    str2 = "4d3001495c1d1f1f00041d1d1b5e4d1d0c37221055480d0a1d070508584a0b04094c005c1005081e1a494f07010a0447025110434a0309051a5f49111d160b56";
                    i7 = 69;
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4c704e4e4a535205195c4f59574a", 2);
                }
                return new qg9gqgqqggg9q9qg(i10, strQ999ggg99999qqggqqg9qg);
            }
            str2 = "4d36074f5a1b191906021b1b1d584b1b0a312416534310595d0f170b0341065a16030e181c4f4901070c024143175e4b0c0c020d4a";
            i7 = 67;
        }
        strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(str2, i7);
        if (i10 == -1) {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4c704e4e4a535205195c4f59574a", 2);
        }
        return new qg9gqgqqggg9q9qg(i10, strQ999ggg99999qqggqqg9qg);
    }

    private qgqq999g(String str, String str2) {
        this.f19277q999ggg99999qqggqqg9qg = str;
        this.qgq9qg99 = str2;
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
            byte b7 = (byte) (i7 ^ 73);
            byte b10 = (byte) (bArr[0] ^ Ascii.EM);
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

    public static void q999ggg99999qqggqqg9qg(int i7, String str) {
        if (FMAgent.mFMGetBlackBoxCodeCallback == null || TextUtils.isEmpty(str)) {
            return;
        }
        FMAgent.mFMGetBlackBoxCodeCallback.onResult(i7, str);
    }

    public static void q999ggg99999qqggqqg9qg(String str, String str2) {
        try {
            if (FMAgent.mFMGetBlackBoxCodeCallback != null) {
                qg9gqgqqggg9q9qg[] qg9gqgqqggg9q9qgVarArr = null;
                qgqq999g qgqq999gVar = new qgqq999g(null, null);
                if (TextUtils.isEmpty(qgqq999gVar.f19277q999ggg99999qqggqqg9qg) || TextUtils.isEmpty(qgqq999gVar.qgq9qg99)) {
                    qgqq999gVar.f19277q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.qgq9qg99();
                    qgqq999gVar.qgq9qg99 = q999ggg99999qqggqqg9qg.gqgg9q99qg9();
                }
                String str3 = qgqq999gVar.f19277q999ggg99999qqggqqg9qg;
                String str4 = qgqq999gVar.qgq9qg99;
                if (!TextUtils.isEmpty(str3) && !q999ggg99999qqggqqg9qg("427b", 52).equals(str3) && !TextUtils.isEmpty(str4)) {
                    String[] strArrSplit = str3.replace(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_AIRTIME_DISBURSEMENT, 12), "").replace(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_BILLER_INSURANCE, 73), "").split(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT, 21));
                    String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4c291717130a0b5c400516000e13", 91);
                    int length = strArrSplit.length;
                    qg9gqgqqggg9q9qg[] qg9gqgqqggg9q9qgVarArr2 = new qg9gqgqqggg9q9qg[length];
                    int i7 = -1;
                    for (int i10 = 0; i10 < length; i10++) {
                        String strTrim = strArrSplit[i10].trim();
                        if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.f19274q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg())) {
                            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d7849010d434359677a5958637b40594245591702575f49535942450a135256170a455f10074649444d45000643474d595301034655726a49464c6d6953130c4655726a49464c6d69537d764e5349", 13);
                            i7 = 100;
                        } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gqgg9q99qg9.q999ggg99999qqggqqg9qg())) {
                            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("584b7e7d7b3e387061292d7d6c3c3f6b797f6a6b33602571382f6e616c733f256b6b714f5271704b5368716a6d222d636628396a7a7a3f2b6e7d5a42616e6445417b343877232b6e7d38387061292e62616e6465617b", 37);
                            i7 = 101;
                        } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg())) {
                            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d6f5e161d5842504b4e4a18105f52535855444e55521d074e575b52171c4952071c4e01125441424401074f5e16124253030054464055540c5f1a4e0710515e534c001a54544e706d4e4f746c574e55521d125c5917145142657d5e515b7a7e446a6159445e1c5f125c59171154505a4e4416074f5e16124159445e58494e525249550010515e535d50515b1801444252544f4e0c5f1a4e0710515e534c00145142657d5e515b7a7e440b07481c14514207074f5e16115d5e515b5a5e44", 26);
                            i7 = 102;
                        } else {
                            if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg()) || strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999qqg.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d16276f7a3b393926223b3b3d786b3b2a110436736330797d2f372b2361267a36232e383c6f6921272c226163377e6b2c2c222d6a", 99);
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q99g9q99.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d4c7d35206163637c7861616722337c6a6b6a767b29396a2335786d747d257c206c7974626635337b7d76783b396d24317676787730", 57);
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d3d0c44511012120d0910101653511012071b0a1653481b5244091c050c540d511d0805131744420a0c07094a481c55400707090641", 72);
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d6f5e16034240405f5b42424401124253687d4f0a1a4900164e5b4a484452", 26);
                                i7 = MlKitException.CODE_SCANNER_CANCELLED;
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d3f0e46421203382d1f5a4d021857450a191809474a044d501514071014", 74);
                                i7 = MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED;
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g9g9ggqqggqq99gqq9q99.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4d7c4d050151407b6e5c19095a130f5b5c4d5712105c4d5552495d5f", 9);
                                i7 = MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE;
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("57566c7e656064362f6a69796d6b7a293b7a7578747c", 52);
                                i7 = 301;
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g9g9q9qq9.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4b1f3e2b3729353e6d6c2d3d3d696c292e3923212c352e29666e2f202d2129", 97);
                                i7 = 302;
                            } else if (strTrim.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqg999qq.q999ggg99999qqggqqg9qg())) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("555e7378392e61323b7a7578747c", 52);
                                i7 = 400;
                            }
                            i7 = 200;
                        }
                        qg9gqgqqggg9q9qgVarArr2[i10] = new qg9gqgqqggg9q9qg(i7, strQ999ggg99999qqggqqg9qg);
                    }
                    qg9gqgqqggg9q9qgVarArr = qg9gqgqqggg9q9qgVarArr2;
                }
                if (qg9gqgqqggg9q9qgVarArr != null) {
                    for (qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVar : qg9gqgqqggg9q9qgVarArr) {
                        FMAgent.mFMGetBlackBoxCodeCallback.onResult(qg9gqgqqggg9q9qgVar.f19275q999ggg99999qqggqqg9qg, qg9gqgqqggg9q9qgVar.qgq9qg99);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
