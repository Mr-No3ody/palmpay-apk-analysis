package cn.tongdun.android.shell;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq;
import cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg;
import cn.tongdun.android.shell.common.qgq9qg99;
import cn.tongdun.android.shell.inter.FMCallback;
import cn.tongdun.android.shell.inter.FMGetBlackBoxCodeCallback;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FMAgent {
    public static final String COLLECT_LEVEL_H;
    public static final String COLLECT_LEVEL_L;
    public static final String COLLECT_LEVEL_M;
    public static final String ENV_PRODUCTION;
    public static final String ENV_SANDBOX;

    @Deprecated
    public static final String OPTION_ALWAYS_DEMOTION;

    @Deprecated
    public static final String OPTION_APK_SIGNED_SHA256;

    @Deprecated
    public static final String OPTION_APPLICATION_ID_SHA256;

    @Deprecated
    public static final String OPTION_APP_KEY;

    @Deprecated
    public static final String OPTION_APP_NAME;

    @Deprecated
    public static final String OPTION_BLACKBOX_MAXSIZE;

    @Deprecated
    public static final String OPTION_CHANNEL;

    @Deprecated
    public static final String OPTION_COLLECT_LEVEL;

    @Deprecated
    public static final String OPTION_COUNTRY;

    @Deprecated
    public static final String OPTION_CUSTOM_MESSAGE;

    @Deprecated
    public static final String OPTION_CUSTOM_PATH;

    @Deprecated
    public static final String OPTION_CUSTOM_URL;

    @Deprecated
    public static final String OPTION_CUST_PROCESS;

    @Deprecated
    public static final String OPTION_DOMAIN;

    @Deprecated
    public static final String OPTION_FORCE_TLS_VERSION_ENABLE;

    @Deprecated
    public static final String OPTION_GOOGLE_AID_ENABLE;

    @Deprecated
    public static final String OPTION_HTTP_TIME_OUT;

    @Deprecated
    public static final String OPTION_INSTALLPACKAGES_ENABLE;

    @Deprecated
    public static final String OPTION_OAID_ENABLE;

    @Deprecated
    public static final String OPTION_PLATFORM;

    @Deprecated
    public static final String OPTION_SKIP_GPS;

    @Deprecated
    public static final String OPTION_STORAGE_ID_ENABLE;

    @Deprecated
    public static final String OPTION_TASK_ENABLE;

    @Deprecated
    public static final String OPTION_USE_DEMOTION;

    @Deprecated
    public static final String OPTION_WAIT_TIME;

    @Deprecated
    public static final String OPTION_WIFIMAC_ENABLE;

    @Deprecated
    public static final String STATUS_COLLECTING;

    @Deprecated
    public static final String STATUS_FAILED;

    @Deprecated
    public static final String STATUS_PROFILING;

    @Deprecated
    public static final String STATUS_SUCCESSFUL;
    public static FMGetBlackBoxCodeCallback mFMGetBlackBoxCodeCallback;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static q999ggg99999qqggqqg9qg f19267q999ggg99999qqggqqg9qg;
    public static boolean usbConnected;

    @Deprecated
    public static final String OPTION_READ_PHONE_ENABLE = q999ggg99999qqggqqg9qg("581f0c0d3327100f0903323203070b0601", 81);

    @Deprecated
    public static final String OPTION_KILL_DEBUGGER = q999ggg99999qqggqqg9qg("41626560535b617072606277", 57);

    @Deprecated
    public static final String OPTION_OVERRIDE_CERTI = q999ggg99999qqggqqg9qg("45767c786f74626e555369786972", 54);

    @Deprecated
    public static final String OPTION_MASK = q999ggg99999qqggqqg9qg("4518031a010636350b151f", 94);

    @Deprecated
    public static final String OPTION_SENSOR_ENABLE = q999ggg99999qqggqqg9qg("79172a3c3d3c160a2e222f28", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);

    @Deprecated
    public static final String STATUS_UNINIT = q999ggg99999qqggqqg9qg("5f382424243e", 122);

    @Deprecated
    public static final String STATUS_LOADING = q999ggg99999qqggqqg9qg("46666b6068626c", 60);

    @Deprecated
    public static final String OPTION_PARTNER_CODE = q999ggg99999qqggqqg9qg("5a76746176704a5b6b6c66", 62);

    @Deprecated
    public static class Builder {
        private boolean g99q9ggqg9gqgq9;
        private String ggq999qqgqgq9g9qqq;
        private int gq9gggq9gq9gg9q99g9q;
        private String gq9qqgq9q9;
        private String gqg99q9q9q;
        private String gqgg9q99qg9;
        private int gqgqgq9qqqg999qggqqqg = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private String f19268q999ggg99999qqggqqg9qg;
        private String q999qqg;
        private String q99g9q99;
        private String q99q99qq99q9g;
        private String q9q999qgg99gq9qq9qqq9g;
        private String q9q9gqgqg9qgqg9qggq9;
        private FMCallback qg9gqgqqggg9q9qg;
        private String qggqgq99q999g;
        private int qgq9qg99;
        private String qgqq999g;
        private String qq9gg99gqqqgqgq999gqg;
        private String qq9gg9q;
        private int qqg999qq;
        private String qqggggg9g9q99q9gq;

        public Builder() {
            platform(q999ggg99999qqggqqg9qg("2d2a382a", 118));
            waitTime(1000);
            httpTimeout(15000);
            q999ggg99999qqggqqg9qg(1);
            q999ggg99999qqggqqg9qg(2);
            q999ggg99999qqggqqg9qg(8);
            qgq9qg99(16);
            q999ggg99999qqggqqg9qg(32);
            q999ggg99999qqggqqg9qg(64);
            q999ggg99999qqggqqg9qg(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            q999ggg99999qqggqqg9qg(512);
            qgq9qg99(2048);
            q999ggg99999qqggqqg9qg(4096);
            qgq9qg99(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            collectLevel(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_REPAY_CASH_LOAN, 117));
            q999ggg99999qqggqqg9qg(16384);
            q999ggg99999qqggqqg9qg(32768);
            q999ggg99999qqggqqg9qg(131072);
            qgq9qg99(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
            this.g99q9ggqg9gqgq9 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder q999ggg99999qqggqqg9qg(int i7) {
            this.qgq9qg99 = i7 | this.qgq9qg99;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder qgq9qg99(int i7) {
            this.qgq9qg99 = (~i7) & this.qgq9qg99;
            return this;
        }

        public Builder alwaysDemotion() {
            q999ggg99999qqggqqg9qg(16);
            return this;
        }

        public Builder apkSignedSHA256(String str) {
            this.ggq999qqgqgq9g9qqq = str;
            return this;
        }

        public Builder appKey(String str) {
            this.q99g9q99 = str;
            return this;
        }

        public Builder appName(String str) {
            this.qgqq999g = str;
            return this;
        }

        public Builder applicationIdSHA256(String str) {
            this.q999qqg = str;
            return this;
        }

        public Builder blackBoxMaxSize(int i7) {
            this.gqgqgq9qqqg999qggqqqg = i7;
            return this;
        }

        public TDOption build() {
            TDOption tDOption = new TDOption();
            tDOption.setPlatform(this.f19268q999ggg99999qqggqqg9qg);
            tDOption.setMask(this.qgq9qg99);
            tDOption.setEnvironment(this.qqggggg9g9q99q9gq);
            tDOption.setPartnerCode(this.gqgg9q99qg9);
            tDOption.setAppName(this.qgqq999g);
            tDOption.setFMCallback(this.qg9gqgqqggg9q9qg);
            tDOption.setCustomProcessName(this.gqg99q9q9q);
            tDOption.setEnterpriseUrl(this.q9q999qgg99gq9qq9qqq9g);
            tDOption.setWaitTime(this.qqg999qq);
            tDOption.setDomain(this.q99q99qq99q9g);
            tDOption.setCustomFilePath(this.qq9gg99gqqqgqgq999gqg);
            tDOption.setBlackBoxMaxSize(this.gqgqgq9qqqg999qggqqqg);
            tDOption.setHttpTimeout(this.gq9gggq9gq9gg9q99g9q);
            tDOption.setTDChannel(this.qq9gg9q);
            tDOption.setApkSignedSHA256(this.ggq999qqgqgq9g9qqq);
            tDOption.setApplicationIdSHA256(this.q999qqg);
            tDOption.setCollectLevel(this.q9q9gqgqg9qgqg9qggq9);
            tDOption.q999ggg99999qqggqqg9qg(this.g99q9ggqg9gqgq9);
            tDOption.setAppKey(this.q99g9q99);
            tDOption.setCustomMessage(this.gq9qqgq9q9);
            tDOption.setCountry(this.qggqgq99q999g);
            return tDOption;
        }

        @Deprecated
        public Builder callback(FMCallback fMCallback) {
            this.qg9gqgqqggg9q9qg = fMCallback;
            throw new IllegalArgumentException(q999ggg99999qqggqqg9qg("0a073a216876332a273c307f73322968793c3b30757f3a2e392c3d392e2a3a73376b27323f292d7e692c38382c696f20746f27367e723c212a392e282e263d3a757f30372d233330212e2e263d3a7b", 117));
        }

        public Builder collectLevel(String str) {
            this.q9q9gqgqg9qgqg9qggq9 = str;
            return this;
        }

        public Builder country(String str) {
            this.qggqgq99q999g = str;
            return this;
        }

        public Builder customFilePath(String str) {
            this.qq9gg99gqqqgqgq999gqg = str;
            return this;
        }

        public Builder customMessage(String str) {
            this.gq9qqgq9q9 = str;
            return this;
        }

        public Builder customProcessName(String str) {
            this.gqg99q9q9q = str;
            return this;
        }

        public Builder disableDebugger() {
            qgq9qg99(8);
            return this;
        }

        public Builder disableGPS() {
            qgq9qg99(2);
            return this;
        }

        public Builder disableGoogleAid() {
            qgq9qg99(16384);
            return this;
        }

        public Builder disableInstallPackageList() {
            qgq9qg99(1);
            return this;
        }

        public Builder disableOaid() {
            qgq9qg99(32768);
            return this;
        }

        public Builder disableReadPhone() {
            qgq9qg99(64);
            return this;
        }

        public Builder disableRunningTasks() {
            qgq9qg99(32);
            return this;
        }

        public Builder disableSensor() {
            qgq9qg99(512);
            return this;
        }

        public Builder disableStorageId() {
            qgq9qg99(65536);
            return this;
        }

        public Builder disableVerifyCertificate() {
            qgq9qg99(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            return this;
        }

        public Builder disableWifiMac() {
            qgq9qg99(4096);
            return this;
        }

        public Builder domain(String str) {
            this.q99q99qq99q9g = str;
            return this;
        }

        public Builder enableGoogleAid() {
            q999ggg99999qqggqqg9qg(16384);
            return this;
        }

        public Builder enableOaid() {
            q999ggg99999qqggqqg9qg(32768);
            return this;
        }

        public Builder enableStorageId() {
            q999ggg99999qqggqqg9qg(65536);
            return this;
        }

        public Builder enableWifiMac() {
            q999ggg99999qqggqqg9qg(4096);
            return this;
        }

        public Builder forceTLSVersion() {
            q999ggg99999qqggqqg9qg(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            return this;
        }

        public Builder httpTimeout(int i7) {
            this.gq9gggq9gq9gg9q99g9q = i7;
            return this;
        }

        public Builder openLog() {
            qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg();
            qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("112309175248071d151f0d07524f0b1357501f14", 82));
            return this;
        }

        public Builder partner(String str) {
            this.gqgg9q99qg9 = str;
            return this;
        }

        public Builder platform(String str) {
            this.f19268q999ggg99999qqggqqg9qg = str;
            return this;
        }

        public Builder production(boolean z3) {
            String str;
            int i7;
            if (z3) {
                str = "2e544b5d4740414b5057";
                i7 = 24;
            } else {
                str = "2d55484d414a50";
                i7 = 9;
            }
            this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qg(str, i7);
            return this;
        }

        public Builder tdChannel(String str) {
            this.qq9gg9q = str;
            return this;
        }

        public Builder url(String str) {
            this.q9q999qgg99gq9qq9qqq9g = str;
            return this;
        }

        public Builder useDemotionData() {
            q999ggg99999qqggqqg9qg(2048);
            return this;
        }

        public Builder waitTime(int i7) {
            this.qqg999qq = i7;
            return this;
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
                byte b7 = (byte) (i7 ^ 78);
                byte b10 = (byte) (bArr[0] ^ 94);
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

        public static /* synthetic */ Builder q999ggg99999qqggqqg9qg(Builder builder) {
            builder.g99q9ggqg9gqgq9 = true;
            return builder;
        }
    }

    static {
        q999ggg99999qqggqqg9qg("430d2b2e0400170c1a163b30100a", 78);
        OPTION_SKIP_GPS = q999ggg99999qqggqqg9qg("596c766d5b4c6377", 45);
        OPTION_WAIT_TIME = q999ggg99999qqggqqg9qg("5d4957427474425b57", 6);
        OPTION_GOOGLE_AID_ENABLE = q999ggg99999qqggqqg9qg("4d555d55565467635550666756525e5354", 4);
        ENV_PRODUCTION = q999ggg99999qqggqqg9qg("5a76697f656263697275", 45);
        OPTION_ALWAYS_DEMOTION = q999ggg99999qqggqqg9qg("4b40565b554761764c454f56504b4c", 20);
        OPTION_DOMAIN = q999ggg99999qqggqqg9qg("4e161f11151a", 68);
        OPTION_HTTP_TIME_OUT = q999ggg99999qqggqqg9qg("420f13173c380e171b29230912", 74);
        OPTION_FORCE_TLS_VERSION_ENABLE = q999ggg99999qqggqqg9qg("4c55414d5a6677444370754f4b5d465a5d6d6657535f5255", 5);
        STATUS_SUCCESSFUL = q999ggg99999qqggqqg9qg("593c2c3a3c2c3a2f2923", 99);
        OPTION_APP_NAME = q999ggg99999qqggqqg9qg("6b08191608161511", 64);
        OPTION_CHANNEL = q999ggg99999qqggqqg9qg("49030107080301", 81);
        OPTION_PLATFORM = q999ggg99999qqggqqg9qg("5a75647c7b607476", 48);
        OPTION_CUSTOM_PATH = q999ggg99999qqggqqg9qg("497767667a63534e70747d", 56);
        STATUS_PROFILING = q999ggg99999qqggqqg9qg("5a504f5b5d5757555b", 11);
        OPTION_APPLICATION_ID_SHA256 = q999ggg99999qqggqqg9qg("4b0d1c0019161e09011a1d2d2a11", 69);
        OPTION_APK_SIGNED_SHA256 = q999ggg99999qqggqqg9qg("4b68624d556377707278425562702a7e7a", 32);
        OPTION_WIFIMAC_ENABLE = q999ggg99999qqggqqg9qg("5d6574745f57795d5074787572", 34);
        OPTION_CUSTOM_MESSAGE = q999ggg99999qqggqqg9qg("496070716d7444447e6076647074", 47);
        STATUS_COLLECTING = q999ggg99999qqggqqg9qg("4976797a737c6d677d73", 35);
        OPTION_USE_DEMOTION = q999ggg99999qqggqqg9qg("5f7f6f434278717b62647f78", 32);
        OPTION_CUSTOM_URL = q999ggg99999qqggqqg9qg("4955454458417169445d", 26);
        STATUS_FAILED = q999ggg99999qqggqqg9qg("4c3a3538343c", 100);
        COLLECT_LEVEL_L = q999ggg99999qqggqqg9qg("66", 7);
        COLLECT_LEVEL_M = q999ggg99999qqggqqg9qg("67", 78);
        COLLECT_LEVEL_H = q999ggg99999qqggqqg9qg("62", 75);
        OPTION_CUST_PROCESS = q999ggg99999qqggqqg9qg("492a3a3b17133e21303a2a3c", 101);
        OPTION_INSTALLPACKAGES_ENABLE = q999ggg99999qqggqqg9qg("432a302a38202d111c2f25272b2f3b1b06222e2324", 116);
        OPTION_TASK_ENABLE = q999ggg99999qqggqqg9qg("5844584344444a7b6856515b7779484c404d4a", 26);
        OPTION_APP_KEY = q999ggg99999qqggqqg9qg("4b46577863594b", 14);
        OPTION_COLLECT_LEVEL = q999ggg99999qqggqqg9qg("491916151c13023e261c06061c", 76);
        q999ggg99999qqggqqg9qg("4748475a5150527e63595d4b504c4b", 19);
        OPTION_COUNTRY = q999ggg99999qqggqqg9qg("49041213120e03", 81);
        OPTION_BLACKBOX_MAXSIZE = q999ggg99999qqggqqg9qg("4831323d37363228180d332634252c20", 102);
        ENV_SANDBOX = q999ggg99999qqggqqg9qg("59110c09050e14", 90);
        OPTION_STORAGE_ID_ENABLE = q999ggg99999qqggqqg9qg("59514d4b4550546c605b6d6c5d5955585f", 15);
        OPTION_OAID_ENABLE = q999ggg99999qqggqqg9qg("45434540767746424e4344", 20);
        usbConnected = false;
    }

    @Deprecated
    public static void collectAndReportInNeeded(Context context, Builder builder) {
        if (builder == null) {
            builder = new Builder();
        }
        Builder.q999ggg99999qqggqqg9qg(builder);
        init(context, builder);
    }

    @Deprecated
    public static String getInitStatus() {
        q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = f19267q999ggg99999qqggqqg9qg;
        return q999ggg99999qqggqqg9qgVar == null ? q999ggg99999qqggqqg9qg("5f495555554f", 11) : q999ggg99999qqggqqg9qgVar.qgq9qg99;
    }

    public static String getVersion() {
        return q999ggg99999qqggqqg9qg("1e7e7e7e79797f", 61);
    }

    public static void init(Context context, Builder builder) {
        if (builder == null) {
            builder = new Builder();
        }
        init(context, builder.build());
    }

    @Deprecated
    public static void initWithCallback(Context context, String str, FMCallback fMCallback) {
        HashMap map = new HashMap();
        map.put(q999ggg99999qqggqqg9qg("494050514d54647c5148", 15), str);
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("5a6b7462787f7e746f68", 48);
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context);
        q999ggg99999qqggqqg9qg(context, strQ999ggg99999qqggqqg9qg, map, fMCallback);
    }

    @Deprecated
    public static void initWithCallback2(Context context, String str, Map map, FMCallback fMCallback) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context);
        if (map == null) {
            map = new HashMap();
        }
        map.put(q999ggg99999qqggqqg9qg("491c0c0d110838200d14", 83), str);
        q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("5a6b7462787f7e746f68", 48), map, fMCallback);
    }

    @Deprecated
    public static void initWithDomain(Context context, String str) {
        HashMap map = new HashMap();
        map.put(q999ggg99999qqggqqg9qg("4e69606e6a65", 59), str);
        q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("5a1f00160c0b0a001b1c", 68), map, null);
    }

    @Deprecated
    public static void initWithOptions(Context context, String str, Map map) {
        q999ggg99999qqggqqg9qg(context, str, map, null);
    }

    public static String onEvent(Context context) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context);
        if (f19267q999ggg99999qqggqqg9qg == null) {
            f19267q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }
        return f19267q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
    }

    @Deprecated
    public static void openLog() {
        qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg();
        qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("652a001e5b410e141c16040e5b46021a5e59161d", 76));
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
            byte b7 = (byte) (i7 ^ 89);
            byte b10 = (byte) (bArr[0] ^ 42);
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

    private static Builder qgq9qg99(Context context, String str, Map map, FMCallback fMCallback) {
        Object obj;
        Builder builder = new Builder();
        if (fMCallback != null) {
            builder.callback(fMCallback);
        }
        if (q999ggg99999qqggqqg9qg("59120f0a060d17", 89).equals(str)) {
            builder.production(false);
        } else if (q999ggg99999qqggqqg9qg("5a4956405a5d5c564d4a", 18).equals(str)) {
            builder.production(true);
        }
        if (map == null) {
            builder.partner(qgq9qg99.q999ggg99999qqggqqg9qg(context));
            builder.appName(qgq9qg99.qgq9qg99(context));
            return builder;
        }
        builder.partner(map.containsKey(q999ggg99999qqggqqg9qg("5a47455047417b6a5a5d57", 15)) ? (String) map.get(q999ggg99999qqggqqg9qg("5a22203522241e0f3f3832", 106)) : qgq9qg99.q999ggg99999qqggqqg9qg(context));
        if (map.containsKey(q999ggg99999qqggqqg9qg("5d2a34211717213834", 101))) {
            builder.waitTime(((Integer) map.get(q999ggg99999qqggqqg9qg("5d4f51447272445d51", 0))).intValue());
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("486e6d6268696d7747526c796b7a737f", 57))) {
            builder.blackBoxMaxSize(Math.max(((Integer) map.get(q999ggg99999qqggqqg9qg("48292a252f2e2a3000152b3e2c3d3438", 126))).intValue(), 5120));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("59312b3006113e2a", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("59011b0036210e1a", 64))).booleanValue()) {
            builder.disableGPS();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("41797e7b48407a6b697b796c", 34)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("41424540737b415052404257", 25))).booleanValue()) {
            builder.disableDebugger();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4b37212c223016013b323821273c3b", 99)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("4b4b5d505e4c6a7d474e445d5b4047", 31))).booleanValue()) {
            builder.alwaysDemotion();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4e4c454b4f40", 30))) {
            builder.domain((String) map.get(q999ggg99999qqggqqg9qg("4e444d434748", 22)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("580a160d0a0a043526181f15393706020e0304", 84)) && !((Boolean) map.get(q999ggg99999qqggqqg9qg("5848544f48484677645a5d577b7544404c4146", 22))).booleanValue()) {
            builder.disableRunningTasks();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4938282905012c332228382e", 119))) {
            builder.customProcessName((String) map.get(q999ggg99999qqggqqg9qg("497363624e4a677869637365", 60)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("495747465a43736b465f", 24))) {
            builder.url((String) map.get(q999ggg99999qqggqqg9qg("493e2e2f332a1a022f36", 113)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("49607677766a67", 53))) {
            builder.country((String) map.get(q999ggg99999qqggqqg9qg("49504647465a57", 5)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("5a57465e59425654", 18))) {
            builder.platform((String) map.get(q999ggg99999qqggqqg9qg("5a07160e09120604", 66)));
        }
        builder.appName(map.containsKey(q999ggg99999qqggqqg9qg("6b00111e001e1d19", 72)) ? (String) map.get(q999ggg99999qqggqqg9qg("6b25343b253b383c", 109)) : qgq9qg99.qgq9qg99(context));
        if (map.containsKey(q999ggg99999qqggqqg9qg("45515b5f4853454972744e5f4e55", 17)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("45363c382f34222e151329382932", 118))).booleanValue()) {
            builder.disableVerifyCertificate();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("43746e74667e734f42717b7975716545587c707d7a", 42)) && !((Boolean) map.get(q999ggg99999qqggqqg9qg("435b415b49515c606d5e54565a5e4a6a77535f5255", 5))).booleanValue()) {
            builder.disableInstallPackageList();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("797f425455547e62464a4740", 16)) && !((Boolean) map.get(q999ggg99999qqggqqg9qg("79774a5c5d5c766a4e424f48", 24))).booleanValue()) {
            builder.disableSensor();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("5d2637371c143a1e13373b3631", 97))) {
            if (((Boolean) map.get(q999ggg99999qqggqqg9qg("5d6f7e7e555d73575a7e727f78", 40))).booleanValue()) {
                builder.enableWifiMac();
            } else {
                builder.disableWifiMac();
            }
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("490d1d1c001929340a0e07", 66))) {
            builder.customFilePath((String) map.get(q999ggg99999qqggqqg9qg("496474756970405d63676e", 43)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("42302c280307312824161c362d", 117))) {
            builder.httpTimeout(((Integer) map.get(q999ggg99999qqggqqg9qg("4274686c4743756c6052587269", 49))).intValue());
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("587063625c487f60666c5d5d6c6864696e", 62)) && !((Boolean) map.get(q999ggg99999qqggqqg9qg("585241407e6a5d42444e7f7f4e4a464b4c", 28))).booleanValue()) {
            builder.disableReadPhone();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("497674727d7674", 36))) {
            builder.tdChannel((String) map.get(q999ggg99999qqggqqg9qg("49121016191210", 64)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("5f0a1a36370d040e17110a0d", 85)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("5f7b6b47467c757f66607b7c", 36))).booleanValue()) {
            builder.useDemotionData();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4b171d322a1c080f0d073d2a1d0f550105", 95))) {
            builder.apkSignedSHA256((String) map.get(q999ggg99999qqggqqg9qg("4b040e21390f1b1c1e142e390e1c461216", 76)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4b36273b222d25323a212616112a", 126))) {
            builder.applicationIdSHA256((String) map.get(q999ggg99999qqggqqg9qg("4b6978647d727a6d657e79494e75", 33)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4c23373b2c100132350603393d2b302c2b1b102125292423", 115)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("4c27333f281405363102073d392f34282f1f1425212d2027", 119))).booleanValue()) {
            builder.forceTLSVersion();
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("490807040d02132f370d17170d", 93))) {
            builder.collectLevel((String) map.get(q999ggg99999qqggqqg9qg("49434c4f464958647c465c5c46", 22)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("437751547e7a6d76606c414a6a70", 52)) && ((Boolean) map.get(q999ggg99999qqggqqg9qg("43705653797d6a71676b464d6d77", 51))).booleanValue()) {
            Builder.q999ggg99999qqggqqg9qg(builder);
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4b3928071c2634", 113))) {
            builder.appKey((String) map.get(q999ggg99999qqggqqg9qg("4b07163922180a", 79)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("47111e0308090b273a000412091512", 74))) {
            String str2 = (String) map.get(q999ggg99999qqggqqg9qg("47626d707b7a7854497377617a6661", 57));
            if (!TextUtils.isEmpty(str2)) {
                cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.ggg9gqqgq99q9g9gq9g9 = str2;
            }
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("4d7a727a797b484c7a7f4948797d717c7b", 43))) {
            if (((Boolean) map.get(q999ggg99999qqggqqg9qg("4d2b232b282a191d2b2e1819282c202d2a", 122))).booleanValue()) {
                builder.enableGoogleAid();
            } else {
                builder.disableGoogleAid();
            }
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("45292f2a1c1d2c2824292e", 126))) {
            if (((Boolean) map.get(q999ggg99999qqggqqg9qg("453a3c390f0e3f3b373a3d", 109))).booleanValue()) {
                builder.enableOaid();
            } else {
                builder.disableOaid();
            }
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("49041415091020201a0412001410", 75))) {
            builder.customMessage((String) map.get(q999ggg99999qqggqqg9qg("494252534f5666665c4254465256", 13)));
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("59617d7b7560645c506b5d5c6d6965686f", 63)) && (obj = map.get(q999ggg99999qqggqqg9qg("592834323c292d151922141524202c2126", 118))) != null) {
            if (((Boolean) obj).booleanValue()) {
                builder.enableStorageId();
            } else {
                builder.disableStorageId();
            }
        }
        if (map.containsKey(q999ggg99999qqggqqg9qg("453229302b2c1c1f213f35", 116))) {
            Object obj2 = map.get(q999ggg99999qqggqqg9qg("455d465f444373704e505a", 27));
            if (obj2 instanceof Integer) {
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 32768) != 0) {
                    builder.q999ggg99999qqggqqg9qg(32768);
                } else {
                    builder.qgq9qg99(32768);
                }
                if ((iIntValue & 131072) != 0) {
                    builder.q999ggg99999qqggqqg9qg(131072);
                } else {
                    builder.qgq9qg99(131072);
                }
                if ((iIntValue & 16384) != 0) {
                    builder.q999ggg99999qqggqqg9qg(16384);
                } else {
                    builder.qgq9qg99(16384);
                }
                if ((iIntValue & 65536) != 0) {
                    builder.q999ggg99999qqggqqg9qg(65536);
                } else {
                    builder.qgq9qg99(65536);
                }
                if ((iIntValue & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0) {
                    builder.q999ggg99999qqggqqg9qg(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
                    return builder;
                }
                builder.qgq9qg99(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
            }
        }
        return builder;
    }

    public static void setOnErrorCodeListener(FMGetBlackBoxCodeCallback fMGetBlackBoxCodeCallback) {
        if (fMGetBlackBoxCodeCallback != null) {
            mFMGetBlackBoxCodeCallback = fMGetBlackBoxCodeCallback;
        }
    }

    @Deprecated
    public static void collectAndReportInNeeded(Context context, TDOption tDOption) {
        if (tDOption == null) {
            tDOption = new TDOption();
        }
        tDOption.q999ggg99999qqggqqg9qg(true);
        init(context, tDOption);
    }

    @Deprecated
    public static void init(Context context, @NonNull TDOption tDOption) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context);
        if (f19267q999ggg99999qqggqqg9qg == null) {
            f19267q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }
        f19267q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(tDOption);
    }

    public static void onEvent(Context context, FMCallback fMCallback) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context);
        if (f19267q999ggg99999qqggqqg9qg == null) {
            f19267q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        }
        f19267q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), fMCallback);
    }

    private static void q999ggg99999qqggqqg9qg(Context context, String str, Map map, FMCallback fMCallback) {
        init(context, qgq9qg99(context, str, map, fMCallback));
    }

    @Deprecated
    public static void collectAndReportInNeeded(Context context, String str, Map map, FMCallback fMCallback) {
        if (map == null) {
            map = new HashMap();
        }
        map.put(q999ggg99999qqggqqg9qg("43694f4a606473687e725f54746e", 42), Boolean.TRUE);
        q999ggg99999qqggqqg9qg(context, str, map, fMCallback);
    }

    @Deprecated
    public static void init(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("c2376821355316094a965c716a616d7ce21e6e0e1875a0776eda0e473a0546303b7e34367f", 41));
            return;
        }
        HashMap map = new HashMap();
        map.put(q999ggg99999qqggqqg9qg("490616170b12223a170e", 73), str);
        q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("5a7c63756f686963787f", 39), map, null);
    }
}
