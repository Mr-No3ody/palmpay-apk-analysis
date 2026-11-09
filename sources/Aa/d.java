package Aa;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.core.receiver.VagueReceiver$OnKeyListener;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f98b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f99c = C2131j.b(new a(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f100a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        ComponentCallbacks2 topActivity;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || !Intrinsics.c(action, "android.intent.action.CLOSE_SYSTEM_DIALOGS") || (stringExtra = intent.getStringExtra("reason")) == null) {
            return;
        }
        F6.d.c("vague reason", stringExtra);
        int iHashCode = stringExtra.hashCode();
        if (iHashCode != 350448461) {
            if (iHashCode != 1092716832) {
                if (iHashCode != 2014770135 || !stringExtra.equals("fs_gesture")) {
                    return;
                }
            } else if (!stringExtra.equals("homekey")) {
                return;
            }
        } else if (!stringExtra.equals("recentapps")) {
            return;
        }
        if (System.currentTimeMillis() - this.f100a >= 500 && (topActivity = ActivityUtils.getTopActivity()) != null) {
            try {
                if (topActivity instanceof VagueReceiver$OnKeyListener) {
                    this.f100a = System.currentTimeMillis();
                    ((VagueReceiver$OnKeyListener) topActivity).onRecentClick();
                }
            } catch (Exception unused) {
            }
        }
    }
}
