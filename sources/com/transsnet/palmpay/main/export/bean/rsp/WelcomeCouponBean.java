package com.transsnet.palmpay.main.export.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/WelcomeCouponBean;", "", "title", "", "description", "button", "reward", "androidUrl", "hot", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeCouponBean {

    @JvmField
    @Nullable
    public final String androidUrl;

    @JvmField
    @Nullable
    public final String button;

    @JvmField
    @Nullable
    public final String description;

    @JvmField
    public final int hot;

    @JvmField
    @Nullable
    public final Integer priority;

    @JvmField
    @Nullable
    public final String reward;

    @JvmField
    @Nullable
    public final String title;

    public WelcomeCouponBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i7, @Nullable Integer num) {
        this.title = str;
        this.description = str2;
        this.button = str3;
        this.reward = str4;
        this.androidUrl = str5;
        this.hot = i7;
        this.priority = num;
    }
}
