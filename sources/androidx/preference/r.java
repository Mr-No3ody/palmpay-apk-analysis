package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f17660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f17661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PreferenceScreen f17664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PreferenceFragmentCompat f17665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PreferenceFragmentCompat f17666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PreferenceFragmentCompat f17667j;

    public final SharedPreferences.Editor a() {
        if (!this.f17662e) {
            return b().edit();
        }
        if (this.f17661d == null) {
            this.f17661d = b().edit();
        }
        return this.f17661d;
    }

    public final SharedPreferences b() {
        if (this.f17660c == null) {
            this.f17660c = this.f17658a.getSharedPreferences(this.f17663f, 0);
        }
        return this.f17660c;
    }
}
