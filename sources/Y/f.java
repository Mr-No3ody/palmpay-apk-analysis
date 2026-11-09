package Y;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f11249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f11250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11251c;

    public f(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f11249a = colorStateList;
        this.f11250b = configuration;
        this.f11251c = theme == null ? 0 : theme.hashCode();
    }
}
