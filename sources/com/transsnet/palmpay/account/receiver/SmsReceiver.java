package com.transsnet.palmpay.account.receiver;

import C0.G;
import F6.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/receiver/SmsReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) (extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null);
            if (status == null || status.getStatusCode() != 0) {
                return;
            }
            String string = extras != null ? extras.getString(SmsRetriever.EXTRA_SMS_MESSAGE) : null;
            if (TextUtils.isEmpty(string)) {
                return;
            }
            d.h("SmsReceiver", 3, G.o("onReceive: ", string));
            MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_SMS_RETRIEVED);
            messageEvent.setEventContent(string);
            c.b().f(messageEvent);
        }
    }
}
