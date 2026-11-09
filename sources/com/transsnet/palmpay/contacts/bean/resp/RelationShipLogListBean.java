package com.transsnet.palmpay.contacts.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/contacts/bean/resp/RelationShipLogListBean;", "", "memberId", "", "phone", "relationship", "memberRelationshipLogMessageDTO", "Lcom/transsnet/palmpay/contacts/bean/resp/MemberRelationshipLogMessageDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/contacts/bean/resp/MemberRelationshipLogMessageDTO;)V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RelationShipLogListBean {

    @JvmField
    @Nullable
    public String memberId;

    @JvmField
    @Nullable
    public MemberRelationshipLogMessageDTO memberRelationshipLogMessageDTO;

    @JvmField
    @Nullable
    public String phone;

    @JvmField
    @Nullable
    public String relationship;

    public RelationShipLogListBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable MemberRelationshipLogMessageDTO memberRelationshipLogMessageDTO) {
        this.memberId = str;
        this.phone = str2;
        this.relationship = str3;
        this.memberRelationshipLogMessageDTO = memberRelationshipLogMessageDTO;
    }
}
