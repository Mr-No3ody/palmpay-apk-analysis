package C1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ResourceDecoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1138b = new g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f20802e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1139a;

    public e(Context context) {
        this.f1139a = context.getApplicationContext();
    }

    public final Resource a(Uri uri, h hVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f1139a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) hVar.a(f1138b) : null;
        Drawable drawableN = theme == null ? androidx.camera.core.impl.utils.executor.g.n(context, contextCreatePackageContext, identifier, null) : androidx.camera.core.impl.utils.executor.g.n(context, context, identifier, theme);
        if (drawableN != null) {
            return new d(drawableN, 0);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ Resource decode(Object obj, int i7, int i10, h hVar) {
        return a((Uri) obj, hVar);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, h hVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
