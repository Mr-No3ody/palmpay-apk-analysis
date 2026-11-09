package com.transsnet.palmpay.send_money.bean.resp;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/AddFavoriteRelationshipBean;", "", "<init>", "()V", "show", "", "getShow", "()Ljava/lang/Boolean;", "setShow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "tagDesc", "", "getTagDesc", "()Ljava/lang/String;", "setTagDesc", "(Ljava/lang/String;)V", "labelDetails", "", "Lcom/transsnet/palmpay/send_money/bean/resp/LabelBean;", "getLabelDetails", "()Ljava/util/List;", "setLabelDetails", "(Ljava/util/List;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddFavoriteRelationshipBean {

    @Nullable
    private List<LabelBean> labelDetails;

    @Nullable
    private Boolean show;

    @Nullable
    private String tagDesc;

    @Nullable
    public final List<LabelBean> getLabelDetails() {
        return this.labelDetails;
    }

    @Nullable
    public final Boolean getShow() {
        return this.show;
    }

    @Nullable
    public final String getTagDesc() {
        return this.tagDesc;
    }

    public final void setLabelDetails(@Nullable List<LabelBean> list) {
        this.labelDetails = list;
    }

    public final void setShow(@Nullable Boolean bool) {
        this.show = bool;
    }

    public final void setTagDesc(@Nullable String str) {
        this.tagDesc = str;
    }
}
