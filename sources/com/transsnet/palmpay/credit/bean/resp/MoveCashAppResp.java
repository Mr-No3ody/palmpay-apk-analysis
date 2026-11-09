package com.transsnet.palmpay.credit.bean.resp;

import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/MoveCashAppResp;", "", "moveStrategy", "", "downloadOpenType", "", CodePushConstants.DOWNLOAD_URL_KEY, "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "getMoveStrategy", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDownloadOpenType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDownloadUrl", "()Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoveCashAppResp {

    @Nullable
    private final Integer downloadOpenType;

    @Nullable
    private final String downloadUrl;

    @Nullable
    private final Boolean moveStrategy;

    public MoveCashAppResp(@Nullable Boolean bool, @Nullable Integer num, @Nullable String str) {
        this.moveStrategy = bool;
        this.downloadOpenType = num;
        this.downloadUrl = str;
    }

    @Nullable
    public final Integer getDownloadOpenType() {
        return this.downloadOpenType;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final Boolean getMoveStrategy() {
        return this.moveStrategy;
    }
}
