package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.custom_view.input.OperatorItemExtraInfo;
import com.transsnet.palmpay.custom_view.input.OperatorSelectImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryOneLoopInfoNetworkItem;", "Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;", "name", "", "iconUrl", "showPin", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getIconUrl", "getShowPin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "getItemName", "getItemId", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryOneLoopInfoNetworkItem implements OperatorSelectImpl {

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String name;

    @Nullable
    private final Boolean showPin;

    public QueryOneLoopInfoNetworkItem(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.name = str;
        this.iconUrl = str2;
        this.showPin = bool;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    public OperatorItemExtraInfo addExtraInfo() {
        return OperatorSelectImpl.DefaultImpls.addExtraInfo(this);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    public String getItemName() {
        return this.name;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getShowPin() {
        return this.showPin;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OperatorSelectImpl
    @Nullable
    public Boolean isSuspend() {
        return OperatorSelectImpl.DefaultImpls.isSuspend(this);
    }
}
