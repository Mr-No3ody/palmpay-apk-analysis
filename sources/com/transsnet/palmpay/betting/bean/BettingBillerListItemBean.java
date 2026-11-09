package com.transsnet.palmpay.betting.bean;

import com.transsnet.palmpay.teller.bean.BettingBillerBannerBean;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;", "<init>", "()V", "bannerInfo", "Lcom/transsnet/palmpay/teller/bean/BettingBillerBannerBean;", "getBannerInfo", "()Lcom/transsnet/palmpay/teller/bean/BettingBillerBannerBean;", "setBannerInfo", "(Lcom/transsnet/palmpay/teller/bean/BettingBillerBannerBean;)V", "itemType", "", "getItemType", "()I", "setItemType", "(I)V", "header", "", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingBillerListItemBean extends BillerListItemBean {

    @Nullable
    private BettingBillerBannerBean bannerInfo;

    @Nullable
    private String header;
    private int itemType;

    @Nullable
    public final BettingBillerBannerBean getBannerInfo() {
        return this.bannerInfo;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final void setBannerInfo(@Nullable BettingBillerBannerBean bettingBillerBannerBean) {
        this.bannerInfo = bettingBillerBannerBean;
    }

    public final void setHeader(@Nullable String str) {
        this.header = str;
    }

    public final void setItemType(int i7) {
        this.itemType = i7;
    }
}
