package com.chad.library.adapter.base.entity;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/chad/library/adapter/base/entity/SectionEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "", "isHeader", "()Z", "", "getItemType", "()I", "itemType", "com.github.CymChad.brvah"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface SectionEntity extends MultiItemEntity {
    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    int getItemType();

    boolean isHeader();
}
