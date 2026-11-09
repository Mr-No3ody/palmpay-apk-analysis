package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class H implements NotificationBuilderWithBuilderAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f15920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f15921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f15922d;

    public H(B b7) {
        ArrayList arrayList;
        new ArrayList();
        this.f15922d = new Bundle();
        this.f15921c = b7;
        Context context = b7.f15897a;
        this.f15919a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15920b = E.a(context, b7.t);
        } else {
            this.f15920b = new Notification.Builder(b7.f15897a);
        }
        Notification notification = b7.f15917v;
        int i7 = 0;
        this.f15920b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(b7.f15901e).setContentText(b7.f15902f).setContentInfo(null).setContentIntent(b7.f15903g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(b7.f15905i).setProgress(0, 0, false);
        Notification.Builder builder = this.f15920b;
        IconCompat iconCompat = b7.f15904h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        this.f15920b.setSubText(null).setUsesChronometer(false).setPriority(b7.f15906j);
        for (v vVar : b7.f15898b) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat iconCompatA = vVar.a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.g(null) : null, vVar.f16006f, vVar.f16007g);
            Bundle bundle = vVar.f16001a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z3 = vVar.f16003c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            builder2.setAllowGeneratedReplies(z3);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i10 >= 28) {
                F.a(builder2);
            }
            if (i10 >= 29) {
                AbstractC1038g.d(builder2);
            }
            if (i10 >= 31) {
                G.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", vVar.f16004d);
            builder2.addExtras(bundle2);
            this.f15920b.addAction(builder2.build());
        }
        Bundle bundle3 = b7.f15911o;
        if (bundle3 != null) {
            this.f15922d.putAll(bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f15920b.setShowWhen(b7.f15907k);
        this.f15920b.setLocalOnly(b7.f15909m);
        this.f15920b.setGroup(null);
        this.f15920b.setSortKey(null);
        this.f15920b.setGroupSummary(false);
        this.f15920b.setCategory(b7.f15910n);
        this.f15920b.setColor(b7.f15912p);
        this.f15920b.setVisibility(b7.f15913q);
        this.f15920b.setPublicVersion(null);
        this.f15920b.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = b7.f15918w;
        ArrayList arrayList3 = b7.f15899c;
        if (i11 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    M.g gVar = new M.g(arrayList2.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                this.f15920b.addPerson((String) it2.next());
            }
        }
        ArrayList arrayList4 = b7.f15900d;
        if (arrayList4.size() > 0) {
            if (b7.f15911o == null) {
                b7.f15911o = new Bundle();
            }
            Bundle bundle4 = b7.f15911o.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList4.size()) {
                String string = Integer.toString(i12);
                v vVar2 = (v) arrayList4.get(i12);
                Bundle bundle7 = new Bundle();
                IconCompat iconCompatA2 = vVar2.a();
                bundle7.putInt("icon", iconCompatA2 != null ? iconCompatA2.c() : i7);
                bundle7.putCharSequence("title", vVar2.f16006f);
                bundle7.putParcelable("actionIntent", vVar2.f16007g);
                Bundle bundle8 = vVar2.f16001a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", vVar2.f16003c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", vVar2.f16004d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i12++;
                i7 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (b7.f15911o == null) {
                b7.f15911o = new Bundle();
            }
            b7.f15911o.putBundle("android.car.EXTENSIONS", bundle4);
            this.f15922d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i13 = Build.VERSION.SDK_INT;
        this.f15920b.setExtras(b7.f15911o);
        this.f15920b.setRemoteInputHistory(null);
        RemoteViews remoteViews = b7.f15914r;
        if (remoteViews != null) {
            this.f15920b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = b7.f15915s;
        if (remoteViews2 != null) {
            this.f15920b.setCustomBigContentView(remoteViews2);
        }
        if (i13 >= 26) {
            E.b(this.f15920b);
            E.d(this.f15920b);
            E.e(this.f15920b);
            E.f(this.f15920b);
            E.c(this.f15920b);
            if (!TextUtils.isEmpty(b7.t)) {
                this.f15920b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i13 >= 29) {
            AbstractC1038g.b(this.f15920b, b7.f15916u);
            AbstractC1038g.c(this.f15920b);
        }
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public final Notification.Builder getBuilder() {
        return this.f15920b;
    }
}
