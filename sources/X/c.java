package X;

import Me.AbstractC0456a;
import V0.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.work.impl.constraints.trackers.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10926b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f10925a = i7;
        this.f10926b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj = this.f10926b;
        switch (this.f10925a) {
            case 0:
                try {
                    ((IntentSender) obj).sendIntent(context, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
                break;
            case 1:
                ((AbstractC0456a) obj).i();
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                androidx.work.impl.constraints.trackers.a aVar = (androidx.work.impl.constraints.trackers.a) obj;
                int i7 = aVar.f18508g;
                Intrinsics.checkNotNullParameter(intent, "intent");
                switch (i7) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            C c6 = C.c();
                            String str = androidx.work.impl.constraints.trackers.b.f18509a;
                            c6.getClass();
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            C c10 = C.c();
                            String str2 = androidx.work.impl.constraints.trackers.c.f18510a;
                            intent.getAction();
                            c10.getClass();
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.b(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            C c11 = C.c();
                            int i10 = j.f18523a;
                            intent.getAction();
                            c11.getClass();
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.b(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
        }
    }
}
