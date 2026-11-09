package com.palmpay.lib.bridgewrapper.version;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/version/get"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/version/VersionGetBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "", "()V", "onHandle", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "(Lkotlin/Unit;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "VersionBean", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VersionGetBridge extends AsyncBridge<Unit> {

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/version/VersionGetBridge$VersionBean;", "", "version", "", "versionCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getVersion", "()Ljava/lang/String;", "getVersionCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/palmpay/lib/bridgewrapper/version/VersionGetBridge$VersionBean;", "equals", "", "other", "hashCode", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class VersionBean {

        @Nullable
        private final String version;

        @Nullable
        private final Integer versionCode;

        public VersionBean(@Nullable String str, @Nullable Integer num) {
            this.version = str;
            this.versionCode = num;
        }

        public static /* synthetic */ VersionBean copy$default(VersionBean versionBean, String str, Integer num, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = versionBean.version;
            }
            if ((i7 & 2) != 0) {
                num = versionBean.versionCode;
            }
            return versionBean.copy(str, num);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getVersionCode() {
            return this.versionCode;
        }

        @NotNull
        public final VersionBean copy(@Nullable String version, @Nullable Integer versionCode) {
            return new VersionBean(version, versionCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VersionBean)) {
                return false;
            }
            VersionBean versionBean = (VersionBean) other;
            return Intrinsics.c(this.version, versionBean.version) && Intrinsics.c(this.versionCode, versionBean.versionCode);
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        @Nullable
        public final Integer getVersionCode() {
            return this.versionCode;
        }

        public int hashCode() {
            String str = this.version;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.versionCode;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VersionBean(version=" + this.version + ", versionCode=" + this.versionCode + ')';
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Unit params, @Nullable IBridgeCallback callback) {
        try {
            Activity activity = getActivity();
            Unit unit = null;
            String packageName = activity != null ? activity.getPackageName() : null;
            if (packageName != null) {
                Activity activity2 = getActivity();
                PackageManager packageManager = activity2 != null ? activity2.getPackageManager() : null;
                PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(packageName, 0) : null;
                BaseBridge.handleSuccess$default(this, new VersionBean(packageInfo != null ? packageInfo.versionName : null, packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null), null, 2, null);
                unit = Unit.f38893a;
            }
            if (unit == null) {
                handleIllegalArgument("can not get package name!");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            handleFail(e10);
        }
    }
}
