package p091g1;

import N8.q0;
import Wf.AbstractC0777v;
import android.content.Context;
import com.abedelazizshe.lightcompressorlibrary.config.StorageConfiguration;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p015ag.c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f36833b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f36834a = AbstractC0777v.b();

    public static final File a(e eVar, Context context, String str, StorageConfiguration storageConfiguration, Boolean bool, String str2, boolean z3) {
        eVar.getClass();
        if (str == null) {
            return null;
        }
        File file = new File(str);
        f36833b.getClass();
        if (bool != null && bool.booleanValue()) {
            str2 = q0.j(str2, "_temp");
        }
        if (!StringsKt.A(str2, "mp4", false)) {
            str2 = str2.concat(".mp4");
        }
        return storageConfiguration.createFileToSave(context, file, str2, z3);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF17355b() {
        return this.f36834a.f11932a;
    }
}
