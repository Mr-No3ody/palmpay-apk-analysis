package com.transsnet.palmpay.core.provider;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import com.alibaba.android.arouter.facade.template.IProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/provider/IAccountModule;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "initModule", "", "buildAutoLogoutOptionsDialog", "Landroid/app/Dialog;", "activity", "Landroid/app/Activity;", "initAppsFlyer", "intent", "Landroid/content/Intent;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IAccountModule extends IProvider {
    @NotNull
    Dialog buildAutoLogoutOptionsDialog(@Nullable Activity activity);

    void initAppsFlyer(@Nullable Intent intent);

    void initModule();
}
