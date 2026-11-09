package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1307w implements InstallReferrerReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19541b;

    public /* synthetic */ C1307w(Object obj, int i7) {
        this.f19540a = i7;
        this.f19541b = obj;
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public final void onFail(String str) {
        switch (this.f19540a) {
            case 0:
                ((ActivityHandler) this.f19541b).logger.debug(str, new Object[0]);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.f19541b).onFail(str);
                break;
        }
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public final void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        switch (this.f19540a) {
            case 0:
                ((ActivityHandler) this.f19541b).sendInstallReferrer(referrerDetails, str);
                break;
            default:
                ((OnGooglePlayInstallReferrerReadListener) this.f19541b).onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
                break;
        }
    }
}
