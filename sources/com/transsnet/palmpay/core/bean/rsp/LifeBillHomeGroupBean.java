package com.transsnet.palmpay.core.bean.rsp;

import com.chad.library.adapter.base.entity.SectionEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/LifeBillHomeGroupBean;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "title", "", "isHeader", "", "<init>", "(Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "()Z", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifeBillHomeGroupBean implements SectionEntity {
    private final boolean isHeader;

    @Nullable
    private String title;

    /* JADX WARN: Multi-variable type inference failed */
    public LifeBillHomeGroupBean() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return l.j(this);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity
    /* JADX INFO: renamed from: isHeader, reason: from getter */
    public boolean getIsHeader() {
        return this.isHeader;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public LifeBillHomeGroupBean(@Nullable String str, boolean z3) {
        this.title = str;
        this.isHeader = z3;
    }

    public /* synthetic */ LifeBillHomeGroupBean(String str, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? true : z3);
    }
}
