package com.transsnet.palmpay.credit.bean.req;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/PermissionReq;", "", "uploadNode", "", "uploadNodeDetail", "createTime", "", "updateTime", "permissionList", "", "Lcom/transsnet/palmpay/credit/bean/req/CLPermissionInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getUploadNode", "()Ljava/lang/String;", "getUploadNodeDetail", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpdateTime", "getPermissionList", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PermissionReq {

    @Nullable
    private final Long createTime;

    @Nullable
    private final List<CLPermissionInfo> permissionList;

    @Nullable
    private final Long updateTime;

    @Nullable
    private final String uploadNode;

    @Nullable
    private final String uploadNodeDetail;

    public PermissionReq(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Long l6, @Nullable List<CLPermissionInfo> list) {
        this.uploadNode = str;
        this.uploadNodeDetail = str2;
        this.createTime = l5;
        this.updateTime = l6;
        this.permissionList = list;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final List<CLPermissionInfo> getPermissionList() {
        return this.permissionList;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getUploadNode() {
        return this.uploadNode;
    }

    @Nullable
    public final String getUploadNodeDetail() {
        return this.uploadNodeDetail;
    }
}
