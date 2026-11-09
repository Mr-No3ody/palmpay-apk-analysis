package C2;

import F2.f;
import android.content.Context;
import android.net.Uri;
import androidx.appcompat.widget.m1;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.imagepipeline.common.i;
import com.facebook.imagepipeline.request.d;
import com.facebook.imagepipeline.request.e;
import p061e3.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f1148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m1 f1149k;

    public b(Context context, m1 m1Var, k kVar) {
        b();
        this.f1148j = kVar;
        this.f1149k = m1Var;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            this.f2561b = null;
            return;
        }
        e eVarD = e.d(uri);
        eVarD.f21668e = i.f21434c.autoRotateAtRenderTime();
        this.f2561b = eVarD.a();
    }

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    public final /* bridge */ /* synthetic */ SimpleDraweeControllerBuilder setUri(Uri uri) {
        d(uri);
        return this;
    }

    @Override // com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
    public final SimpleDraweeControllerBuilder setUri(String str) {
        if (str == null || str.isEmpty()) {
            this.f2561b = d.fromUri(str);
            return this;
        }
        d(Uri.parse(str));
        return this;
    }
}
