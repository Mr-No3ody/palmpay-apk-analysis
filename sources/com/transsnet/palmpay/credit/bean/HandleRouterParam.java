package com.transsnet.palmpay.credit.bean;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010!\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010 R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;", "", "key", "", "routeInfo", "pageInfo", "applyId", "curRouteId", "loanProduct", "creditType", "channelEnum", "routeTag", "customerTag", "routeInfoList", "bindCard", "", "creditResult", "Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountData;", "externalParams", "style", "source", "needRepaymentInfo", "path", "productSubId", "", "availableBalance", "", "sceneSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "Ljava/lang/Long;", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HandleRouterParam {

    @JvmField
    @Nullable
    public final String applyId;

    @JvmField
    @Nullable
    public final Long availableBalance;

    @JvmField
    @Nullable
    public final Boolean bindCard;

    @JvmField
    @Nullable
    public final String channelEnum;

    @JvmField
    @Nullable
    public final CLOpenAccountData creditResult;

    @JvmField
    @Nullable
    public final String creditType;

    @JvmField
    @Nullable
    public final String curRouteId;

    @JvmField
    @Nullable
    public final String customerTag;

    @JvmField
    @Nullable
    public final String externalParams;

    @JvmField
    @Nullable
    public final String key;

    @JvmField
    @Nullable
    public final String loanProduct;

    @JvmField
    @Nullable
    public final Boolean needRepaymentInfo;

    @JvmField
    @Nullable
    public final String pageInfo;

    @JvmField
    @Nullable
    public final String path;

    @JvmField
    @Nullable
    public final Integer productSubId;

    @JvmField
    @Nullable
    public final String routeInfo;

    @JvmField
    @Nullable
    public final String routeInfoList;

    @JvmField
    @Nullable
    public final String routeTag;

    @JvmField
    @Nullable
    public final Integer sceneSource;

    @JvmField
    @Nullable
    public final String source;

    @JvmField
    @Nullable
    public final String style;

    public HandleRouterParam() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.routeInfo;
        String str3 = this.pageInfo;
        String str4 = this.applyId;
        String str5 = this.curRouteId;
        String str6 = this.loanProduct;
        String str7 = this.creditType;
        String str8 = this.channelEnum;
        String str9 = this.routeTag;
        String str10 = this.customerTag;
        String str11 = this.routeInfoList;
        Boolean bool = this.bindCard;
        CLOpenAccountData cLOpenAccountData = this.creditResult;
        String str12 = this.externalParams;
        String str13 = this.style;
        String str14 = this.source;
        Boolean bool2 = this.needRepaymentInfo;
        StringBuilder sbF = F.f("HandleRouterParam(key=", str, ", routeInfo=", str2, ", pageInfo=");
        u.x(sbF, str3, ", applyId=", str4, ", curRouteId=");
        u.x(sbF, str5, ", loanProduct=", str6, ", creditType=");
        u.x(sbF, str7, ", channelEnum=", str8, ", routeTag=");
        u.x(sbF, str9, "customerTag=", str10, ", routeInfoList=");
        sbF.append(str11);
        sbF.append(", bindCard=");
        sbF.append(bool);
        sbF.append(", creditResult=");
        sbF.append(cLOpenAccountData);
        sbF.append(", externalParams=");
        sbF.append(str12);
        sbF.append(", style=");
        u.x(sbF, str13, ", source=", str14, ", needRepaymentInfo=");
        sbF.append(bool2);
        sbF.append(")");
        return sbF.toString();
    }

    public HandleRouterParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool, @Nullable CLOpenAccountData cLOpenAccountData, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Boolean bool2, @Nullable String str15, @Nullable Integer num, @Nullable Long l5, @Nullable Integer num2) {
        this.key = str;
        this.routeInfo = str2;
        this.pageInfo = str3;
        this.applyId = str4;
        this.curRouteId = str5;
        this.loanProduct = str6;
        this.creditType = str7;
        this.channelEnum = str8;
        this.routeTag = str9;
        this.customerTag = str10;
        this.routeInfoList = str11;
        this.bindCard = bool;
        this.creditResult = cLOpenAccountData;
        this.externalParams = str12;
        this.style = str13;
        this.source = str14;
        this.needRepaymentInfo = bool2;
        this.path = str15;
        this.productSubId = num;
        this.availableBalance = l5;
        this.sceneSource = num2;
    }

    public /* synthetic */ HandleRouterParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, CLOpenAccountData cLOpenAccountData, String str12, String str13, String str14, Boolean bool2, String str15, Integer num, Long l5, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : str7, (i7 & 128) != 0 ? null : str8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str9, (i7 & 512) != 0 ? null : str10, (i7 & 1024) != 0 ? null : str11, (i7 & 2048) != 0 ? null : bool, (i7 & 4096) != 0 ? null : cLOpenAccountData, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str12, (i7 & 16384) != 0 ? null : str13, (i7 & 32768) != 0 ? null : str14, (i7 & 65536) != 0 ? null : bool2, (i7 & 131072) != 0 ? null : str15, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : num, (i7 & 524288) != 0 ? null : l5, (i7 & 1048576) != 0 ? null : num2);
    }
}
