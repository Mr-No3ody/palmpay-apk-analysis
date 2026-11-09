package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AsyncTaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19314b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f19313a = i7;
        this.f19314b = obj;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        switch (this.f19313a) {
            case 0:
                return Util.getSdkVersion();
            case 1:
                return Boolean.valueOf(Util.isEnabledFromActivityStateFile(((Context[]) objArr)[0]));
            default:
                ILogger logger = AdjustFactory.getLogger();
                String googleAdId = Util.getGoogleAdId(((Context[]) objArr)[0]);
                logger.debug(C0.G.o("GoogleAdId read ", googleAdId), new Object[0]);
                return googleAdId;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        switch (this.f19313a) {
            case 0:
                ((OnSdkVersionReadListener) this.f19314b).onSdkVersionRead((String) obj);
                break;
            case 1:
                ((OnIsEnabledListener) this.f19314b).onIsEnabledRead(((Boolean) obj).booleanValue());
                break;
            default:
                String str = (String) obj;
                OnGoogleAdIdReadListener onGoogleAdIdReadListener = (OnGoogleAdIdReadListener) this.f19314b;
                if (onGoogleAdIdReadListener != null) {
                    onGoogleAdIdReadListener.onGoogleAdIdRead(str);
                }
                break;
        }
    }
}
