package com.transsnet.palmpay.cash_in.bean.response;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/response/GetFundConfigResp;", "", "nibssFundJumpPath", "", "nibssFundHighlightContent", "nibssFundContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetFundConfigResp {

    @JvmField
    @Nullable
    public final String nibssFundContent;

    @JvmField
    @Nullable
    public final String nibssFundHighlightContent;

    @JvmField
    @Nullable
    public final String nibssFundJumpPath;

    public GetFundConfigResp(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.nibssFundJumpPath = str;
        this.nibssFundHighlightContent = str2;
        this.nibssFundContent = str3;
    }
}
