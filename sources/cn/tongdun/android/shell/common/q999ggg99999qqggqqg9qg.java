package cn.tongdun.android.shell.common;

import C0.G;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final Map f19270q999ggg99999qqggqqg9qg;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class gqgg9q99qg9 {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        public static final gqgg9q99qg9 f19271q999ggg99999qqggqqg9qg = new gqgg9q99qg9(q999ggg99999qqggqqg9qg("476a7d606070777a636e67756079707b667c6c687578", 15), 0, q999ggg99999qqggqqg9qg("5656672f3f6d74262968656a6b713e286d2f2f62776e673f663a76636e787c2f387d69697d383e71253e76672f236d707b687f797f776c6b242e61667c726261707f7f776c6b2a", 24));
        private final String qgq9qg99;

        private gqgg9q99qg9(String str, int i7, String str2) {
            super(str, 0);
            this.qgq9qg99 = str2;
        }

        public final String q999ggg99999qqggqqg9qg() {
            return this.qgq9qg99;
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
                byte b7 = (byte) (i7 ^ 114);
                byte b10 = (byte) (bArr[0] ^ 2);
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

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
    public static final class EnumC0015q999ggg99999qqggqqg9qg {
        private final String qggqgq99q999g;

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        public static final EnumC0015q999ggg99999qqggqqg9qg f19272q999ggg99999qqggqqg9qg = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("25786f727262717e6f607b6173697572677674786e", 24), 0, q999ggg99999qqggqqg9qg("2106372c392b6e722a3f2e2c2036", 64));
        public static final EnumC0015q999ggg99999qqggqqg9qg qgq9qg99 = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("25697e636373606f7e716a70627868796669737b73", 9), 1, q999ggg99999qqggqqg9qg("2130011a0f1d58480619160c040c490d511d0805131744531602021653551a4e551d0c4448061b10031412141c07004f450a0d1719090a1b14141c070041", 118));
        public static final EnumC0015q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("257e69747464777869667d67756f7361746d64", 30), 2, q999ggg99999qqggqqg9qg("2128190217054050034a5c11041d14", HomeDialogState.PRIORITY_HIGHEST));
        public static final EnumC0015q999ggg99999qqggqqg9qg gqgg9q99qg9 = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("253c2b363626353a2b243f25372d302a2d3a20222f20322c232e", 92), 3, q999ggg99999qqggqqg9qg("214372697c6e2b36737463797b762634757a77327e226e7b7660643720657171652026693d266e7f373b756863706761676f74733c36797e646a7a796867676f747332", 5));
        public static final EnumC0015q999ggg99999qqggqqg9qg qgqq999g = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("256d7a676777646b7a756e74667c6b7b61716373606170", 13), 4, q999ggg99999qqggqqg9qg("213e0f14011356410e145b49061514054b4608415c19180b1c18", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
        public static final EnumC0015q999ggg99999qqggqqg9qg qg9gqgqqggg9q9qg = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("251d0a171707141b0a051e04160c1002170e070c110b1b1f020f", 125), 5, q999ggg99999qqggqqg9qg("344b7a323666776c796b2e34757877766c23357032327f6a737a227b276b7e73656132256074746025236c38236b7a323e706d66756264626a717639337c7b616f7f7c6d62626a717637", 0));
        public static final EnumC0015q999ggg99999qqggqqg9qg gqg99q9q9q = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("253a2d303020333c2d223923312b312f202d3e342a2528", 90), 6, q999ggg99999qqggqqg9qg("347d4c040050415a4f5d18054047504a48451507464944014d115d4845535704024a4c47490a4f1c5d0e074e44485712045c505b461b", 54));
        public static final EnumC0015q999ggg99999qqggqqg9qg q9q999qgg99gq9qq9qqq9g = new EnumC0015q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("25081f020212010e1f100b1103190f04031208121003120a0d160200", 104), 7, q999ggg99999qqggqqg9qg("216a5b40554702125c434c565e5613570b47525f494d1e1850565d53100f47561e0b47564e49524644161857465b4c4d58445a51565c521c0f40140f47561e1a4a5b4055470c", 44));

        private EnumC0015q999ggg99999qqggqqg9qg(String str, int i7, String str2) {
            super(str, i7);
            this.qggqgq99q999g = str2;
        }

        public final String q999ggg99999qqggqqg9qg() {
            return this.qggqgq99q999g;
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
                byte b7 = (byte) (i7 ^ 119);
                byte b10 = (byte) (bArr[0] ^ 96);
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

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class qgq9qg99 {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        public static final qgq9qg99 f19273q999ggg99999qqggqqg9qg = new qgq9qg99(q999ggg99999qqggqqg9qg("7931263b3b2b293735203c2d312b3c2e3b222b203d2737332e23", 3), 0, q999ggg99999qqggqqg9qg("6824155d48090b1e02130f4a5b1a171819034c5a1f5d5d10051c154d144804111c0a0e5d4a0f1b1b0f4a4c03574c04155d511f02091a0d0b0d051e19565c13140e001013020d0d051e1958", 61));
        private final String qgq9qg99;

        private qgq9qg99(String str, int i7, String str2) {
            super(str, 0);
            this.qgq9qg99 = str2;
        }

        public final String q999ggg99999qqggqqg9qg() {
            return this.qgq9qg99;
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
                byte b7 = (byte) (i7 ^ 37);
                byte b10 = (byte) (bArr[0] ^ 60);
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

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class qqggggg9g9q99q9gq {
        private final String q9g9qqqq9;

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        public static final qqggggg9g9q99q9gq f19274q999ggg99999qqggqqg9qg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("117d6a7777677c6d6d77", 57), 0, q999ggg99999qqggqqg9qg("642626", 117));
        private static qqggggg9g9q99q9gq ggg9gqqgq99q9g9gq9g9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("112a3d20203031212d2e3e3338", HomeDialogState.PRIORITY_HIGHEST), 1, q999ggg99999qqggqqg9qg("643031", 99));
        public static final qqggggg9g9q99q9gq qgq9qg99 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1151465b5b4b49445b4f49434f5c5f414e434f47", 21), 2, q999ggg99999qqggqqg9qg("640809", 90));
        public static final qqggggg9g9q99q9gq qqggggg9g9q99q9gq = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1174637e7e6e6c617e6a6c666a7978626a6e7b", 48), 3, q999ggg99999qqggqqg9qg("644341", 17));
        public static final qqggggg9g9q99q9gq gqgg9q99qg9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("112b3c21213130273b213a372a3b262d2b382b31", HomeDialogState.PRIORITY_HIGHEST_111), 4, q999ggg99999qqggqqg9qg("640d0e", 95));
        public static final qqggggg9g9q99q9gq qgqq999g = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1167706d6d7d6e7d6b66687a7c6b7178726b6d7671", 35), 5, q999ggg99999qqggqqg9qg("642024", 114));
        private static qqggggg9g9q99q9gq gq9g999g999 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("11736479796968787477676a617f7d636c61", 55), 6, q999ggg99999qqggqqg9qg("645a5f", 8));
        public static final qqggggg9g9q99q9gq qg9gqgqqggg9q9qg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("113e29343424222f3a26343c203436", 122), 7, q999ggg99999qqggqqg9qg("643f39", 109));
        public static final qqggggg9g9q99q9gq gqg99q9q9q = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1147504d4d5d415f454d4f434a4258414c575b", 3), 8, q999ggg99999qqggqqg9qg("643235", 96));
        private static qqggggg9g9q99q9gq gqq9gqqqq9qgqg9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("110b1c010111100b1b1e0f0a0705131915", 79), 9, q999ggg99999qqggqqg9qg("64373f", 101));
        public static final qqggggg9g9q99q9gq q9q999qgg99gq9qq9qqq9g = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("11180f121202170d1e0819180b100509151e14160f", 92), 10, q999ggg99999qqggqqg9qg("647e77", 44));
        private static qqggggg9g9q99q9gq qqqqgqg9qgqg9q99qq9qq = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1161766b6b7b636f6a777d61766b6b", 37), 11, q999ggg99999qqggqqg9qg("642a2a", 123));
        public static final qqggggg9g9q99q9gq qggqgq99q999g = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("11081f020212091818021405081f0202", 76), 12, q999ggg99999qqggqqg9qg("645d5c", 12));
        private static qqggggg9g9q99q9gq gqqgggqgg99qg9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("11687f626272647e777d6462797e6e6a66637e", 44), 13, q999ggg99999qqggqqg9qg("647b79", 42));
        public static final qqggggg9g9q99q9gq q99q99qq99q9g = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("112e3924243425363c353223322f342222383f2832303d", 106), 14, q999ggg99999qqggqqg9qg("644241", 19));
        private static qqggggg9g9q99q9gq qgq9q9999qg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("11786f72726263757c70757c6a6b6b72", 60), 15, q999ggg99999qqggqqg9qg("655858", 10));
        private static qqggggg9g9q99q9gq ggq9qqq = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1106110c0c1c0716160c1a02121f140a1d0d010b06110c0c", 66), 16, q999ggg99999qqggqqg9qg("663233", 97));
        private static qqggggg9g9q99q9gq qgqgq9qq9ggggg9g = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("11190e131303141d1d0514051d0d000b1502121e14190e1313", 93), 17, q999ggg99999qqggqqg9qg("660006", 83));
        public static final qqggggg9g9q99q9gq qqg999qq = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1167706d6d7d63737e756b7c6c606a6d6b7665746d7671", 35), 18, q999ggg99999qqggqqg9qg("664c4b", 31));
        public static final qqggggg9g9q99q9gq qq9gg99gqqqgqgq999gqg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1100170a0a1a0110100a1c041419120c1b0b070e101f120e1000", 68), 19, q999ggg99999qqggqqg9qg("667672", 37));
        public static final qqggggg9g9q99q9gq gqgqgq9qqqg999qggqqqg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("116b7c6161716a7b7b61776f7f72796770606c607063757a6661677a6978617a7d", 47), 20, q999ggg99999qqggqqg9qg("661411", 71));
        public static final qqggggg9g9q99q9gq gq9gggq9gq9gg9q99g9q = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1154435e5e4e5544445e4850404d46584f5f534e5445554442595c5059595e584556475e4542", 16), 21, q999ggg99999qqggqqg9qg("666963", 58));
        public static final qqggggg9g9q99q9gq qq9gg9q = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("110a1d0000100b1a1a00160e1e13180611010d00061b030f1d0b0c1a11041a1518041a0a", 78), 22, q999ggg99999qqggqqg9qg("66404b", 19));
        public static final qqggggg9g9q99q9gq ggq999qqgqgq9g9qqq = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1110071a1a0a1916070813091b011d1a0f1e1c1006", 84), 23, q999ggg99999qqggqqg9qg("66282a", 122));
        public static final qqggggg9g9q99q9gq q999qqg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("116e79646474676879766d77657f62787f6872707d72607e717c", 42), 24, q999ggg99999qqggqqg9qg("66282b", 122));
        public static final qqggggg9g9q99q9gq q9q9gqgqg9qgqg9qggq9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1123342929392a25343b203a283222332c23393139", MsgEvent.MSG_EVENT_STOP_FOREGROUND), 25, q999ggg99999qqggqqg9qg("661616", 68));
        public static final qqggggg9g9q99q9gq g99q9ggqg9gqgq9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("114e5944445456484a5f43524e544351445d54", 10), 26, q999ggg99999qqggqqg9qg("665756", 5));
        public static final qqggggg9g9q99q9gq q99g9q99 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1110071a1a0a0d0019141d0f1a030a", 84), 27, q999ggg99999qqggqqg9qg("666563", 55));
        public static final qqggggg9g9q99q9gq gq9qqgq9q9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1146514c4c5c4756564c5a5a4c55595b4b505a5d5b465c", 2), 28, q999ggg99999qqggqqg9qg("667c7b", 46));
        public static final qqggggg9g9q99q9gq g9qqg99qqg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("115d4a5757475c4d4d574141574e4240504b415458405d47", 25), 29, q999ggg99999qqggqqg9qg("663531", MsgEvent.MSG_EVENT_STOP_FOREGROUND));
        public static final qqggggg9g9q99q9gq g99gq9qg9gggq9qgg = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("1165726f6f7f6c63727d667c6e74637369796b7b686978", 33), 30, q999ggg99999qqggqqg9qg("663d38", HomeDialogState.PRIORITY_HIGHEST_111));
        public static final qqggggg9g9q99q9gq g9g9ggqqggqq99gqq9q99 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("115a4d505040535c4d425943514b5d5651405a40425140585f445052", 30), 31, q999ggg99999qqggqqg9qg("660b01", 89));
        public static final qqggggg9g9q99q9gq qg9qqq999gq = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("110d1a070717040b1a150e14061c0618171a09031d121f", 73), 32, q999ggg99999qqggqqg9qg("667b70", 41));
        public static final qqggggg9g9q99q9gq g9g9q9qq9 = new qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("117e6974746472686f7862606d62647e7f6a66706e616c", 58), 33, q999ggg99999qqggqqg9qg("660c0e", 89));

        private qqggggg9g9q99q9gq(String str, int i7, String str2) {
            super(str, i7);
            this.q9g9qqqq9 = str2;
        }

        public final String q999ggg99999qqggqqg9qg() {
            return this.q9g9qqqq9;
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
                byte b7 = (byte) (i7 ^ 83);
                byte b10 = (byte) (bArr[0] ^ 84);
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

    static {
        q999ggg99999qqggqqg9qg("264350464855", 8);
        q999ggg99999qqggqqg9qg("003d001b524c09101d060a45490813524306010a4f45001403160703141000490d511d0805131744531602021653551a4e551d0c4448061b10031412141c07004f450a0d1719090a1b14141c070041", 93);
        q999ggg99999qqggqqg9qg("1b4972273c7a3524657b6e6e747a34276e777b2c69", 47);
        q999ggg99999qqggqqg9qg("2717051218", 76);
        q999ggg99999qqggqqg9qg("2457424f595d0e195c48485c191f50041f57460e024c515a495e585e564d4a050f40475d534340515e5e564d4a0b", 23);
        q999ggg99999qqggqqg9qg("2462777a6c683b3d75737876357023623138717b77682d3b636f647924", 34);
        q999ggg99999qqggqqg9qg("20515549", 0);
        f19270q999ggg99999qqggqqg9qg = new Hashtable();
        q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq.f19274q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("107959101a554f001d534c4d505a111d535349", 8));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0104 A[Catch: Exception -> 0x0019, all -> 0x0089, TryCatch #0 {Exception -> 0x0019, blocks: (B:12:0x002b, B:14:0x007d, B:20:0x00b6, B:22:0x00bc, B:23:0x00c4, B:27:0x00f1, B:29:0x00f7, B:30:0x00ff, B:31:0x0104, B:33:0x010a, B:24:0x00c8, B:26:0x00ce, B:17:0x008c, B:19:0x0092), top: B:55:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0019 A[SYNTHETIC] */
    public static String gqgg9q99qg9() {
        String strQ999ggg99999qqggqqg9qg;
        String strQ999ggg99999qqggqqg9qg2;
        Map map = f19270q999ggg99999qqggqqg9qg;
        if (map.size() == 0) {
            return "";
        }
        synchronized (map) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : map.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str);
                            String strOptString = jSONObject2.optString(q999ggg99999qqggqqg9qg("261c0f19170a", 87));
                            String strOptString2 = jSONObject2.optString(q999ggg99999qqggqqg9qg("2073776b", 34));
                            String strOptString3 = jSONObject2.optString(q999ggg99999qqggqqg9qg("27594b5c56", 2));
                            String strOptString4 = jSONObject.optString(q999ggg99999qqggqqg9qg("26180b1d130e", 83));
                            String strOptString5 = jSONObject.optString(q999ggg99999qqggqqg9qg("2034302c", 101));
                            String strOptString6 = jSONObject.optString(q999ggg99999qqggqqg9qg("277c6e7973", 39));
                            if (TextUtils.isEmpty(strOptString4)) {
                                jSONObject.put(q999ggg99999qqggqqg9qg("265d4e58564b", 22), strOptString);
                            } else if (!strOptString4.contains(strOptString)) {
                                jSONObject.put(q999ggg99999qqggqqg9qg("26485b4d435e", 3), strOptString4 + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_BIND_BANK_CARD, 81) + strOptString);
                            }
                            if (TextUtils.isEmpty(strOptString5)) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("20212539", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
                            } else if (strOptString5.contains(strOptString2)) {
                                if (TextUtils.isEmpty(strOptString6)) {
                                    strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("274c5e4943", 23);
                                } else if (!strOptString6.contains(strOptString3)) {
                                    strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("274153444e", 26);
                                    strOptString3 = strOptString6 + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_BIND_BANK_CARD, 52) + strOptString3;
                                }
                                jSONObject.put(strQ999ggg99999qqggqqg9qg2, strOptString3);
                            } else {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("20484c50", 25);
                                strOptString2 = strOptString5 + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_BIND_BANK_CARD, 90) + strOptString2;
                            }
                            jSONObject.put(strQ999ggg99999qqggqqg9qg, strOptString2);
                            if (TextUtils.isEmpty(strOptString6)) {
                                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("274c5e4943", 23);
                            } else if (!strOptString6.contains(strOptString3)) {
                                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("274153444e", 26);
                                strOptString3 = strOptString6 + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_BIND_BANK_CARD, 52) + strOptString3;
                            }
                            jSONObject.put(strQ999ggg99999qqggqqg9qg2, strOptString3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (jSONObject.length() == 0) {
                    return "";
                }
                if (TextUtils.isEmpty(jSONObject.optString(q999ggg99999qqggqqg9qg("26584b5d534e", 19)))) {
                    jSONObject.remove(q999ggg99999qqggqqg9qg("267b687e706d", 48));
                }
                if (TextUtils.isEmpty(jSONObject.optString(q999ggg99999qqggqqg9qg("2013170b", 66)))) {
                    jSONObject.remove(q999ggg99999qqggqqg9qg("200a0e12", 91));
                }
                if (TextUtils.isEmpty(jSONObject.optString(q999ggg99999qqggqqg9qg("274e5c4b41", 21)))) {
                    jSONObject.remove(q999ggg99999qqggqqg9qg("2736243339", 109));
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
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
            byte b7 = (byte) (i7 ^ 92);
            byte b10 = (byte) (bArr[0] ^ 84);
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

    public static String qgq9qg99() {
        return f19270q999ggg99999qqggqqg9qg.keySet().toString();
    }

    public static boolean qqggggg9g9q99q9gq() {
        Set setKeySet = f19270q999ggg99999qqggqqg9qg.keySet();
        String[] strArr = {q999ggg99999qqggqqg9qg("66181a", 69), q999ggg99999qqggqqg9qg("666c6f", 49), q999ggg99999qqggqqg9qg("667979", 36), q999ggg99999qqggqqg9qg("66292c", 116), q999ggg99999qqggqqg9qg("667973", 36), q999ggg99999qqggqqg9qg("662c27", 113)};
        for (int i7 = 0; i7 < 6; i7++) {
            if (setKeySet.contains(strArr[i7])) {
                return true;
            }
        }
        return false;
    }

    public static JSONObject q999ggg99999qqggqqg9qg(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(q999ggg99999qqggqqg9qg("267063757b66", 59), th.getLocalizedMessage());
            jSONObject.put(q999ggg99999qqggqqg9qg("2022263a", 115), th.getClass().getName());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(q999ggg99999qqggqqg9qg("37773a20617b73796b613a3575706c677c77", 38))) {
                    jSONObject.put(q999ggg99999qqggqqg9qg("277c6e7973", 39), stackTraceElement.toString());
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void q999ggg99999qqggqqg9qg() {
        f19270q999ggg99999qqggqqg9qg.clear();
    }

    public static void q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar) {
        Map map = f19270q999ggg99999qqggqqg9qg;
        if (map.containsKey(qqggggg9g9q99q9gqVar.q9g9qqqq9)) {
            map.remove(qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg());
        }
    }

    public static void q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(q999ggg99999qqggqqg9qg("265340565845", 24), str);
        } catch (JSONException e10) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(e10.toString());
        }
        q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, jSONObject);
    }

    public static void q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar, JSONObject jSONObject) {
        Map map = f19270q999ggg99999qqggqqg9qg;
        if (!map.containsKey(qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg())) {
            if (jSONObject == null) {
                map.put(qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(), q999ggg99999qqggqqg9qg("2f4f", 21));
                return;
            } else {
                map.put(qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(), jSONObject.toString());
                return;
            }
        }
        if (jSONObject != null) {
            String string = jSONObject.toString();
            String str = (String) map.get(qqggggg9g9q99q9gqVar.q9g9qqqq9);
            if (str == null) {
                map.put(qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(), string);
            } else {
                if (str.contains(string)) {
                    return;
                }
                map.put(qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(), G.r(u.s(str), q999ggg99999qqggqqg9qg("7804", 84), string));
            }
        }
    }
}
