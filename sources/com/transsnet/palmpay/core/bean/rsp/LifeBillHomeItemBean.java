package com.transsnet.palmpay.core.bean.rsp;

import com.chad.library.adapter.base.entity.SectionEntity;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/LifeBillHomeItemBean;", "Lcom/transsnet/palmpay/core/bean/HomePageMenuData;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "<init>", "()V", "menu", "(Lcom/transsnet/palmpay/core/bean/HomePageMenuData;)V", "isHeader", "", "()Z", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifeBillHomeItemBean extends HomePageMenuData implements SectionEntity {
    private final boolean isHeader;

    public LifeBillHomeItemBean() {
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return l.j(this);
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity
    /* JADX INFO: renamed from: isHeader, reason: from getter */
    public boolean getIsHeader() {
        return this.isHeader;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifeBillHomeItemBean(@NotNull HomePageMenuData menu) {
        this();
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.type = menu.type;
        this.cornerImgUrl = menu.cornerImgUrl;
        this.newFun = menu.newFun;
        this.menuDesc = menu.menuDesc;
        this.billerNames = menu.billerNames;
        this.menuGroupName = menu.menuGroupName;
        this.billCategoryName = menu.billCategoryName;
        this.menuName = menu.menuName;
        this.menuId = menu.menuId;
        this.iconUrl = menu.iconUrl;
        this.iconUrlBig = menu.iconUrlBig;
        this.jumpPath = menu.jumpPath;
        this.jumpType = menu.jumpType;
        this.jumpParams = menu.jumpParams;
        this.cornerText = menu.cornerText;
        this.editEnable = menu.editEnable;
    }
}
