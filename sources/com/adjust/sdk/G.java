package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AsyncTaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f19315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnLastDeeplinkReadListener f19316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustInstance f19317c;

    public G(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.f19317c = adjustInstance;
        this.f19315a = context;
        this.f19316b = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        try {
            return Uri.parse(this.f19317c.getCachedDeeplink(this.f19315a));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.f19316b.onLastDeeplinkRead((Uri) obj);
    }
}
