package com.transsnet.palmpay.betting.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/betting/bean/BettingGameItem;", "", "gameId", "", "gameName", "gameImg", "gameUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGameId", "()Ljava/lang/String;", "getGameName", "getGameImg", "getGameUrl", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingGameItem {

    @Nullable
    private final String gameId;

    @Nullable
    private final String gameImg;

    @Nullable
    private final String gameName;

    @Nullable
    private final String gameUrl;

    public BettingGameItem() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @Nullable
    public final String getGameImg() {
        return this.gameImg;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getGameUrl() {
        return this.gameUrl;
    }

    public BettingGameItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.gameId = str;
        this.gameName = str2;
        this.gameImg = str3;
        this.gameUrl = str4;
    }

    public /* synthetic */ BettingGameItem(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }
}
