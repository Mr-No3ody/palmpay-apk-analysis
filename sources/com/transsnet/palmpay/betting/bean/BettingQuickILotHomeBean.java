package com.transsnet.palmpay.betting.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/betting/bean/BettingQuickILotHomeBean;", "", "tips1", "", "tips2", "iLotLink1", "iLotLink2", "gameTab", "Lcom/transsnet/palmpay/betting/bean/BettingGameTabBean;", "sportsCodeTab", "Lcom/transsnet/palmpay/betting/bean/BettingSportsCodeTabBean;", "billerIcon", "billerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/betting/bean/BettingGameTabBean;Lcom/transsnet/palmpay/betting/bean/BettingSportsCodeTabBean;Ljava/lang/String;Ljava/lang/String;)V", "getTips1", "()Ljava/lang/String;", "getTips2", "getILotLink1", "getILotLink2", "getGameTab", "()Lcom/transsnet/palmpay/betting/bean/BettingGameTabBean;", "getSportsCodeTab", "()Lcom/transsnet/palmpay/betting/bean/BettingSportsCodeTabBean;", "getBillerIcon", "getBillerName", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingQuickILotHomeBean {

    @Nullable
    private final String billerIcon;

    @Nullable
    private final String billerName;

    @Nullable
    private final BettingGameTabBean gameTab;

    @Nullable
    private final String iLotLink1;

    @Nullable
    private final String iLotLink2;

    @Nullable
    private final BettingSportsCodeTabBean sportsCodeTab;

    @Nullable
    private final String tips1;

    @Nullable
    private final String tips2;

    public BettingQuickILotHomeBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String getBillerIcon() {
        return this.billerIcon;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final BettingGameTabBean getGameTab() {
        return this.gameTab;
    }

    @Nullable
    public final String getILotLink1() {
        return this.iLotLink1;
    }

    @Nullable
    public final String getILotLink2() {
        return this.iLotLink2;
    }

    @Nullable
    public final BettingSportsCodeTabBean getSportsCodeTab() {
        return this.sportsCodeTab;
    }

    @Nullable
    public final String getTips1() {
        return this.tips1;
    }

    @Nullable
    public final String getTips2() {
        return this.tips2;
    }

    public BettingQuickILotHomeBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BettingGameTabBean bettingGameTabBean, @Nullable BettingSportsCodeTabBean bettingSportsCodeTabBean, @Nullable String str5, @Nullable String str6) {
        this.tips1 = str;
        this.tips2 = str2;
        this.iLotLink1 = str3;
        this.iLotLink2 = str4;
        this.gameTab = bettingGameTabBean;
        this.sportsCodeTab = bettingSportsCodeTabBean;
        this.billerIcon = str5;
        this.billerName = str6;
    }

    public /* synthetic */ BettingQuickILotHomeBean(String str, String str2, String str3, String str4, BettingGameTabBean bettingGameTabBean, BettingSportsCodeTabBean bettingSportsCodeTabBean, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : bettingGameTabBean, (i7 & 32) != 0 ? null : bettingSportsCodeTabBean, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6);
    }
}
