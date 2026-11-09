package H5;

import android.content.res.Resources;
import com.mikepenz.iconics.IconicsExtractor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements IconicsExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f3734a;

    static {
        i iVar = new i(null);
        f3734a = iVar;
        iVar.dp(Float.valueOf(24.0f));
        iVar.dp(Float.valueOf(1.0f));
    }

    public abstract int a(Resources resources);

    public abstract float b(Resources resources);
}
