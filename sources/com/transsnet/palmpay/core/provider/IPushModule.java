package com.transsnet.palmpay.core.provider;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/provider/IPushModule;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "refreshToken", "", "refreshedToken", "", "dealNotification", "pm", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "dealDataMessage", "stopForegroundNotification", "cancelAllNotification", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IPushModule extends IProvider {
    void cancelAllNotification();

    void dealDataMessage(@Nullable PushMessage pm);

    void dealNotification(@Nullable PushMessage pm);

    void refreshToken(@Nullable String refreshedToken);

    void stopForegroundNotification();
}
