package com.transsnet.palmpay.managemoney.bean.resp;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetNewMemberConfigResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetNewMemberConfigResp$NewMemberConfig;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetNewMemberConfigResp$NewMemberConfig;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetNewMemberConfigResp$NewMemberConfig;", "NewMemberConfig", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetNewMemberConfigResp extends CommonResult {

    @Nullable
    private final NewMemberConfig data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetNewMemberConfigResp$NewMemberConfig;", "", "bannerUrl", "", "darkBannerUrl", "headerBannerUrl", "darkHeaderBannerUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerUrl", "()Ljava/lang/String;", "getDarkBannerUrl", "getHeaderBannerUrl", "getDarkHeaderBannerUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewMemberConfig {

        @Nullable
        private final String bannerUrl;

        @Nullable
        private final String darkBannerUrl;

        @Nullable
        private final String darkHeaderBannerUrl;

        @Nullable
        private final String headerBannerUrl;

        public NewMemberConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.bannerUrl = str;
            this.darkBannerUrl = str2;
            this.headerBannerUrl = str3;
            this.darkHeaderBannerUrl = str4;
        }

        public static /* synthetic */ NewMemberConfig copy$default(NewMemberConfig newMemberConfig, String str, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = newMemberConfig.bannerUrl;
            }
            if ((i7 & 2) != 0) {
                str2 = newMemberConfig.darkBannerUrl;
            }
            if ((i7 & 4) != 0) {
                str3 = newMemberConfig.headerBannerUrl;
            }
            if ((i7 & 8) != 0) {
                str4 = newMemberConfig.darkHeaderBannerUrl;
            }
            return newMemberConfig.copy(str, str2, str3, str4);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBannerUrl() {
            return this.bannerUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDarkBannerUrl() {
            return this.darkBannerUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHeaderBannerUrl() {
            return this.headerBannerUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDarkHeaderBannerUrl() {
            return this.darkHeaderBannerUrl;
        }

        @NotNull
        public final NewMemberConfig copy(@Nullable String bannerUrl, @Nullable String darkBannerUrl, @Nullable String headerBannerUrl, @Nullable String darkHeaderBannerUrl) {
            return new NewMemberConfig(bannerUrl, darkBannerUrl, headerBannerUrl, darkHeaderBannerUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewMemberConfig)) {
                return false;
            }
            NewMemberConfig newMemberConfig = (NewMemberConfig) other;
            return Intrinsics.c(this.bannerUrl, newMemberConfig.bannerUrl) && Intrinsics.c(this.darkBannerUrl, newMemberConfig.darkBannerUrl) && Intrinsics.c(this.headerBannerUrl, newMemberConfig.headerBannerUrl) && Intrinsics.c(this.darkHeaderBannerUrl, newMemberConfig.darkHeaderBannerUrl);
        }

        @Nullable
        public final String getBannerUrl() {
            return this.bannerUrl;
        }

        @Nullable
        public final String getDarkBannerUrl() {
            return this.darkBannerUrl;
        }

        @Nullable
        public final String getDarkHeaderBannerUrl() {
            return this.darkHeaderBannerUrl;
        }

        @Nullable
        public final String getHeaderBannerUrl() {
            return this.headerBannerUrl;
        }

        public int hashCode() {
            String str = this.bannerUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.darkBannerUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerBannerUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.darkHeaderBannerUrl;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.bannerUrl;
            String str2 = this.darkBannerUrl;
            return G.s(F.f("NewMemberConfig(bannerUrl=", str, ", darkBannerUrl=", str2, ", headerBannerUrl="), this.headerBannerUrl, ", darkHeaderBannerUrl=", this.darkHeaderBannerUrl, ")");
        }
    }

    public GetNewMemberConfigResp(@Nullable NewMemberConfig newMemberConfig) {
        this.data = newMemberConfig;
    }

    @Nullable
    public final NewMemberConfig getData() {
        return this.data;
    }
}
