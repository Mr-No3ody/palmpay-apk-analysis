package com.transsnet.palmpay.betting.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/betting/bean/BettingSportsCodeTabBean;", "", "title", "", "bookingList", "", "Lcom/transsnet/palmpay/betting/bean/BettingSportItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getBookingList", "()Ljava/util/List;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingSportsCodeTabBean {

    @Nullable
    private final List<BettingSportItem> bookingList;

    @Nullable
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public BettingSportsCodeTabBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final List<BettingSportItem> getBookingList() {
        return this.bookingList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public BettingSportsCodeTabBean(@Nullable String str, @Nullable List<BettingSportItem> list) {
        this.title = str;
        this.bookingList = list;
    }

    public /* synthetic */ BettingSportsCodeTabBean(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list);
    }
}
