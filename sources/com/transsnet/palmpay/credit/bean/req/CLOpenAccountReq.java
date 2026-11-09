package com.transsnet.palmpay.credit.bean.req;

import C0.G;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLOpenAccountReq;", "", "channelEnum", "", "applyId", "deviceTag", "appNum", "", "phoneLockIsActive", "", "phoneLockIsInstall", "routeTag", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "brand", CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, "deviceModel", "deviceVersion", "imei", "resolution", "systemType", "loanProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelEnum", "()Ljava/lang/String;", "getApplyId", "getDeviceTag", "getAppNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhoneLockIsActive", "()Z", "getPhoneLockIsInstall", "getRouteTag", "getAppVersion", "getBrand", "getDeviceInfo", "getDeviceModel", "getDeviceVersion", "getImei", "getResolution", "getSystemType", "getLoanProduct", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLOpenAccountReq {

    @Nullable
    private final Integer appNum;

    @Nullable
    private final String appVersion;

    @Nullable
    private final String applyId;

    @Nullable
    private final String brand;

    @Nullable
    private final String channelEnum;

    @Nullable
    private final String deviceInfo;

    @Nullable
    private final String deviceModel;

    @Nullable
    private final String deviceTag;

    @Nullable
    private final String deviceVersion;

    @Nullable
    private final String imei;

    @Nullable
    private final String loanProduct;
    private final boolean phoneLockIsActive;
    private final boolean phoneLockIsInstall;

    @Nullable
    private final String resolution;

    @Nullable
    private final String routeTag;

    @Nullable
    private final String systemType;

    public CLOpenAccountReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, boolean z3, boolean z8, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        this.channelEnum = str;
        this.applyId = str2;
        this.deviceTag = str3;
        this.appNum = num;
        this.phoneLockIsActive = z3;
        this.phoneLockIsInstall = z8;
        this.routeTag = str4;
        this.appVersion = str5;
        this.brand = str6;
        this.deviceInfo = str7;
        this.deviceModel = str8;
        this.deviceVersion = str9;
        this.imei = str10;
        this.resolution = str11;
        this.systemType = str12;
        this.loanProduct = str13;
    }

    @Nullable
    public final Integer getAppNum() {
        return this.appNum;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getChannelEnum() {
        return this.channelEnum;
    }

    @Nullable
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getDeviceTag() {
        return this.deviceTag;
    }

    @Nullable
    public final String getDeviceVersion() {
        return this.deviceVersion;
    }

    @Nullable
    public final String getImei() {
        return this.imei;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    public final boolean getPhoneLockIsActive() {
        return this.phoneLockIsActive;
    }

    public final boolean getPhoneLockIsInstall() {
        return this.phoneLockIsInstall;
    }

    @Nullable
    public final String getResolution() {
        return this.resolution;
    }

    @Nullable
    public final String getRouteTag() {
        return this.routeTag;
    }

    @Nullable
    public final String getSystemType() {
        return this.systemType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CLOpenAccountReq(String str, String str2, String str3, Integer num, boolean z3, boolean z8, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        String str14;
        String str15 = (i7 & 4) != 0 ? "" : str3;
        Integer num2 = (i7 & 8) != 0 ? 0 : num;
        boolean z10 = (i7 & 16) != 0 ? false : z3;
        boolean z11 = (i7 & 32) != 0 ? false : z8;
        String str16 = (i7 & 64) != 0 ? null : str4;
        String appVersionName = (i7 & 128) != 0 ? AppUtils.getAppVersionName() : str5;
        String manufacturer = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? DeviceUtils.getManufacturer() : str6;
        String androidID = (i7 & 512) != 0 ? DeviceUtils.getAndroidID() : str7;
        String model = (i7 & 1024) != 0 ? DeviceUtils.getModel() : str8;
        String strO = (i7 & 2048) != 0 ? G.o("Android", DeviceUtils.getSDKVersionName()) : str9;
        String imei = (i7 & 4096) != 0 ? PhoneUtils.getIMEI() : str10;
        if ((i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str14 = ScreenUtils.getScreenHeight() + "X" + ScreenUtils.getScreenWidth() + "_" + ScreenUtils.getScreenDensityDpi();
        } else {
            str14 = str11;
        }
        this(str, str2, str15, num2, z10, z11, str16, appVersionName, manufacturer, androidID, model, strO, imei, str14, (i7 & 16384) != 0 ? "Android" : str12, (i7 & 32768) != 0 ? null : str13);
    }
}
