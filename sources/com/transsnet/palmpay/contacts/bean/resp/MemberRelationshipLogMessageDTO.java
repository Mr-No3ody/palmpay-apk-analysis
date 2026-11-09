package com.transsnet.palmpay.contacts.bean.resp;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/contacts/bean/resp/MemberRelationshipLogMessageDTO;", "", "title", "", "source", ReactTextInputShadowNode.PROP_TEXT, "phone", "sendHeadPortrait", "self", "", "gmtCreatedTimestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MemberRelationshipLogMessageDTO {

    @JvmField
    public final long gmtCreatedTimestamp;

    @JvmField
    @Nullable
    public final String phone;

    @JvmField
    public final boolean self;

    @JvmField
    @Nullable
    public final String sendHeadPortrait;

    @JvmField
    @Nullable
    public final String source;

    @JvmField
    @Nullable
    public final String text;

    @JvmField
    @Nullable
    public final String title;

    public MemberRelationshipLogMessageDTO(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z3, long j6) {
        this.title = str;
        this.source = str2;
        this.text = str3;
        this.phone = str4;
        this.sendHeadPortrait = str5;
        this.self = z3;
        this.gmtCreatedTimestamp = j6;
    }
}
