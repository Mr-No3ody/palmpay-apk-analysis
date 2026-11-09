package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.didi.drouter.annotation.Service;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/appInfo/get"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AppInfoBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Ljava/lang/Void;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "AppInfoBean", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppInfoBridge extends AsyncBridge<Void> {

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/AppInfoBridge$AppInfoBean;", "", "token", "", "version", "deviceId", "lang", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, OfflineConstant.PARAM_ENV, "deviceModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getVersion", "getDeviceId", "getLang", "getCountryCode", "getEnv", "getDeviceModel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppInfoBean {

        @Nullable
        private final String countryCode;

        @Nullable
        private final String deviceId;

        @Nullable
        private final String deviceModel;

        @Nullable
        private final String env;

        @Nullable
        private final String lang;

        @Nullable
        private final String token;

        @Nullable
        private final String version;

        public AppInfoBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.token = str;
            this.version = str2;
            this.deviceId = str3;
            this.lang = str4;
            this.countryCode = str5;
            this.env = str6;
            this.deviceModel = str7;
        }

        public static /* synthetic */ AppInfoBean copy$default(AppInfoBean appInfoBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = appInfoBean.token;
            }
            if ((i7 & 2) != 0) {
                str2 = appInfoBean.version;
            }
            if ((i7 & 4) != 0) {
                str3 = appInfoBean.deviceId;
            }
            if ((i7 & 8) != 0) {
                str4 = appInfoBean.lang;
            }
            if ((i7 & 16) != 0) {
                str5 = appInfoBean.countryCode;
            }
            if ((i7 & 32) != 0) {
                str6 = appInfoBean.env;
            }
            if ((i7 & 64) != 0) {
                str7 = appInfoBean.deviceModel;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return appInfoBean.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getEnv() {
            return this.env;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @NotNull
        public final AppInfoBean copy(@Nullable String token, @Nullable String version, @Nullable String deviceId, @Nullable String lang, @Nullable String countryCode, @Nullable String env, @Nullable String deviceModel) {
            return new AppInfoBean(token, version, deviceId, lang, countryCode, env, deviceModel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppInfoBean)) {
                return false;
            }
            AppInfoBean appInfoBean = (AppInfoBean) other;
            return Intrinsics.c(this.token, appInfoBean.token) && Intrinsics.c(this.version, appInfoBean.version) && Intrinsics.c(this.deviceId, appInfoBean.deviceId) && Intrinsics.c(this.lang, appInfoBean.lang) && Intrinsics.c(this.countryCode, appInfoBean.countryCode) && Intrinsics.c(this.env, appInfoBean.env) && Intrinsics.c(this.deviceModel, appInfoBean.deviceModel);
        }

        @Nullable
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @Nullable
        public final String getEnv() {
            return this.env;
        }

        @Nullable
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        public final String getToken() {
            return this.token;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.token;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.version;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deviceId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.lang;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.countryCode;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.env;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.deviceModel;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.token;
            String str2 = this.version;
            String str3 = this.deviceId;
            String str4 = this.lang;
            String str5 = this.countryCode;
            String str6 = this.env;
            String str7 = this.deviceModel;
            StringBuilder sbF = F.f("AppInfoBean(token=", str, ", version=", str2, ", deviceId=");
            u.x(sbF, str3, ", lang=", str4, ", countryCode=");
            u.x(sbF, str5, ", env=", str6, ", deviceModel=");
            return G.r(sbF, str7, ")");
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        BaseBridge.handleSuccess$default(this, new AppInfoBean(BaseApplication.get().getToken(), BaseApplication.get().getVersionName(), PhoneUtils.getUniqueId(), "en", BaseApplication.getCountryLocale(), "3", DeviceUtils.getModel()), null, 2, null);
    }
}
