package androidx.profileinstaller;

import H0.e;
import H0.g;
import android.content.Context;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import org.sufficientlysecure.htmltextview.h;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements Initializer<h> {
    @Override // androidx.startup.Initializer
    public final h create(Context context) {
        g.a(new e(this, context.getApplicationContext()));
        return new h(1);
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
