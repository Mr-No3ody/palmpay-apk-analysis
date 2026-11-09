package com.transsnet.palmpay.contacts.ui.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/viewmodel/FindInviteFriendsViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FindInviteFriendsViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f27299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f27300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f27301g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindInviteFriendsViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f27299e = new l();
        this.f27300f = new l();
        this.f27301g = new l();
    }
}
