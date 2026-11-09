package cn.tongdun.android.qgq9qg99;

import com.adjust.sdk.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class qgq9qg99 extends HashMap {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ q999ggg99999qqggqqg9qg f19114q999ggg99999qqggqqg9qg;

    public qgq9qg99(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        this.f19114q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar;
        put(q999ggg99999qqggqqg9qg("6b312d292e64382d643b7377362c242e3c366d6d263c", MsgEvent.MSG_EVENT_STOP_FOREGROUND), q999ggg99999qqggqqg9qg("6b0b1713145e02175b1a545c014958060e0a075d571c06", 93));
        put(q999ggg99999qqggqqg9qg("6b130f0b0c461a0f43024c441951401e16121f454f041e", 69), q999ggg99999qqggqqg9qg("6b24383c3b712d3874357b732e66772921252872783329", 114));
        put(q999ggg99999qqggqqg9qg("6b504c484f05594c055a485d5a4b1616574d454f5d570c0c475d", 6), q999ggg99999qqggqqg9qg("6b415d595e14485d11501e164b03124c44404d171d564c", 23));
        put(q999ggg99999qqggqqg9qg("6b5a4642450f53461a524750181c5d474f45575d06064d57", 12), q999ggg99999qqggqqg9qg("6b726e6a6d277b6e327a24257830217f77737e242e657f", 36));
        put(q999ggg99999qqggqqg9qg("6b24383c3b712d38642c72732e66772921252872783329", 114), q999ggg99999qqggqqg9qg("6b1a0602054f13065a124c4d105849171f1b164c460d17", 76));
        put(q999ggg99999qqggqqg9qg("6b4d5155521844510b5744470f0b4a505852404a11115a40", 27), q999ggg99999qqggqqg9qg("6b776b6f68227e6b316d35207d35247a72767b212b607a", 33));
        put(q999ggg99999qqggqqg9qg("6b1c0004034915005a065e4b165e4f11191d104a400b11", 74), q999ggg99999qqggqqg9qg("6b584440470d51441e421a0f521a0b555d59540e044f55", 14));
        put(q999ggg99999qqggqqg9qg("6b1c00040349150049141307165e5a1b010903111b40400b11", 74), q999ggg99999qqggqqg9qg("6b677b7f78326e7b307a33306d25346a62666b313b706a", 49));
        put(q999ggg99999qqggqqg9qg("6b465a5e59134f5a115b12114c04154b43474a101a514b", 16), q999ggg99999qqggqqg9qg("6b382420276d31246f256c6f327a6b353d39346e642f35", HomeDialogState.PRIORITY_HIGHEST));
        put(q999ggg99999qqggqqg9qg("6b25393d3a702c397f343b2f67632238303a282279793228", 115), q999ggg99999qqggqqg9qg("6b5f4347400a5643054e0a08551d0c525a5e5309034852", 9));
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
            byte b7 = (byte) (i7 ^ 74);
            byte b10 = (byte) (bArr[0] ^ 3);
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
}
