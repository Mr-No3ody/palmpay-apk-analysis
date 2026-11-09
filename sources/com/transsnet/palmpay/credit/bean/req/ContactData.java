package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/ContactData;", "", "nickName", "", "phone", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "getPhone", "getTag", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactData {

    @Nullable
    private final String nickName;

    @Nullable
    private final String phone;

    @Nullable
    private final String tag;

    public ContactData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.nickName = str;
        this.phone = str2;
        this.tag = str3;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }
}
