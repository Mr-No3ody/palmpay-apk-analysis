package com.transsnet.palmpay.contacts.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\nB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListResp;", "", "headPortrait", "", "nickName", "phone", "pageDTO", "Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListResp$PageDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListResp$PageDTO;)V", "PageDTO", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RelationShipLogListResp {

    @JvmField
    @Nullable
    public String headPortrait;

    @JvmField
    @Nullable
    public String nickName;

    @JvmField
    @Nullable
    public PageDTO pageDTO;

    @JvmField
    @Nullable
    public String phone;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListResp$PageDTO;", "", "total", "", "totalPage", "curPage", "pageSize", "list", "", "Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListBean;", "<init>", "(IIIILjava/util/List;)V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageDTO {

        @JvmField
        public int curPage;

        @JvmField
        @Nullable
        public List<RelationShipLogListBean> list;

        @JvmField
        public int pageSize;

        @JvmField
        public int total;

        @JvmField
        public int totalPage;

        public PageDTO(int i7, int i10, int i11, int i12, @Nullable List<RelationShipLogListBean> list) {
            this.total = i7;
            this.totalPage = i10;
            this.curPage = i11;
            this.pageSize = i12;
            this.list = list;
        }
    }

    public RelationShipLogListResp(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable PageDTO pageDTO) {
        this.headPortrait = str;
        this.nickName = str2;
        this.phone = str3;
        this.pageDTO = pageDTO;
    }
}
