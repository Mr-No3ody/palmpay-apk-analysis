package com.transsnet.palmpay.ui.widget;

import Ac.e;
import Ac.f;
import Ne.a;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes4.dex */
public class DataBundleAppWidgetProvider extends a {
    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i7 : iArr) {
            Intent intent = new Intent("com.transsnet.palmpay.intent.action.WIDGET_BUNDLE");
            intent.setClassName(context, "com.transsnet.palmpay.ui.activity.SplashActivity");
            PendingIntent activity = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent, 67108864) : PendingIntent.getActivity(context, 0, intent, 0);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), f.main_layout_widget_bundle);
            remoteViews.setOnClickPendingIntent(e.imageViewIcon, activity);
            appWidgetManager.updateAppWidget(i7, remoteViews);
        }
    }
}
