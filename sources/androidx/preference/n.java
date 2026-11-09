package androidx.preference;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Preference.OnPreferenceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f17641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17642b;

    public n(p pVar, PreferenceGroup preferenceGroup) {
        this.f17642b = pVar;
        this.f17641a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        PreferenceGroup preferenceGroup = this.f17641a;
        preferenceGroup.f17597H0 = Integer.MAX_VALUE;
        this.f17642b.onPreferenceHierarchyChange(preference);
        preferenceGroup.getClass();
        return true;
    }
}
