package S6;

import L6.e;
import Pa.b0;
import Y.j;
import android.content.Context;
import android.graphics.Typeface;
import androidx.camera.core.impl.utils.executor.g;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.o;
import p355xf.p;
import p355xf.q;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ITypeface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8814a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f8815b = C2131j.b(new b0(6));

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getAuthor() {
        return "PalmPay";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final Map getCharacters() {
        return (Map) f8815b.getValue();
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getDescription() {
        return "PalmPay icon collection";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getFontName() {
        return "PalmPay IconFont";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final int getFontRes() {
        return e.lib_ui_palmpay_font_v1_0_0_6;
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final IIcon getIcon(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a.valueOf(key);
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final int getIconCount() {
        return getCharacters().size();
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final List getIcons() {
        Set setKeySet = getCharacters().keySet();
        LinkedList linkedList = new LinkedList();
        CollectionsKt.V(setKeySet, linkedList);
        return linkedList;
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getLicense() {
        return "";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getLicenseUrl() {
        return "";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getMappingPrefix() {
        return "pay";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final Typeface getRawTypeface() {
        Object objF;
        try {
            o oVar = q.f43977a;
            Context context = M5.a.f5769b;
            if (context == null) {
                Intrinsics.checkNotNullExpressionValue("A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage.", "StringBuilder().apply(builderAction).toString()");
                throw new RuntimeException("A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage.");
            }
            objF = j.a(e.lib_ui_palmpay_font_v1_0_0_6, context);
            if (objF instanceof p) {
                objF = null;
            }
            Typeface typeface = (Typeface) objF;
            if (typeface != null) {
                return typeface;
            }
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getUrl() {
        return "";
    }

    @Override // com.mikepenz.iconics.typeface.ITypeface
    public final String getVersion() {
        return "1.0.0.6";
    }
}
