package com.transsnet.palmpay.core.bean.req;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/QueryMemberByKeyReq;", "", "keyword", "", "keywordType", "", "sources", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryMemberByKeyReq {

    @JvmField
    @NotNull
    public final String keyword;

    @JvmField
    public final int keywordType;

    @JvmField
    @NotNull
    public final List<String> sources;

    public QueryMemberByKeyReq(@NotNull String keyword, int i7, @NotNull List<String> sources) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.keyword = keyword;
        this.keywordType = i7;
        this.sources = sources;
    }
}
