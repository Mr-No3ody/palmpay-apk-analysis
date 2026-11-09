package androidx.core.view;

import android.R;
import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1052d implements ContentInfoCompat$BuilderCompat, ContentInfoCompat$Compat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16209b;

    public C1052d(WindowInsetsController windowInsetsController) {
        this.f16208a = 4;
        C1070w c1070w = new C1070w(null, 3);
        c1070w.f16297d = windowInsetsController;
        this.f16209b = c1070w;
    }

    public void a() {
        View view = (View) this.f16209b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void b() {
        View viewFindViewById;
        View view = (View) this.f16209b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC1068u(viewFindViewById, 0));
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public C1054f build() {
        switch (this.f16208a) {
            case 0:
                return ((ContentInfoCompat$BuilderCompat) this.f16209b).build();
            default:
                return new C1054f(new C1052d(((ContentInfo.Builder) this.f16209b).build()));
        }
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public ClipData getClip() {
        return ((ContentInfo) this.f16209b).getClip();
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public Bundle getExtras() {
        return ((ContentInfo) this.f16209b).getExtras();
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public int getFlags() {
        return ((ContentInfo) this.f16209b).getFlags();
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public Uri getLinkUri() {
        return ((ContentInfo) this.f16209b).getLinkUri();
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public int getSource() {
        return ((ContentInfo) this.f16209b).getSource();
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public ContentInfo getWrapped() {
        return (ContentInfo) this.f16209b;
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setClip(ClipData clipData) {
        ((ContentInfo.Builder) this.f16209b).setClip(clipData);
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setExtras(Bundle bundle) {
        switch (this.f16208a) {
            case 0:
                ((ContentInfoCompat$BuilderCompat) this.f16209b).setExtras(bundle);
                break;
            default:
                ((ContentInfo.Builder) this.f16209b).setExtras(bundle);
                break;
        }
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setFlags(int i7) {
        switch (this.f16208a) {
            case 0:
                ((ContentInfoCompat$BuilderCompat) this.f16209b).setFlags(i7);
                break;
            default:
                ((ContentInfo.Builder) this.f16209b).setFlags(i7);
                break;
        }
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setLinkUri(Uri uri) {
        switch (this.f16208a) {
            case 0:
                ((ContentInfoCompat$BuilderCompat) this.f16209b).setLinkUri(uri);
                break;
            default:
                ((ContentInfo.Builder) this.f16209b).setLinkUri(uri);
                break;
        }
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setSource(int i7) {
        ((ContentInfo.Builder) this.f16209b).setSource(i7);
    }

    public String toString() {
        switch (this.f16208a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f16209b) + "}";
            default:
                return super.toString();
        }
    }

    public C1052d(View view, int i7) {
        this.f16208a = i7;
        switch (i7) {
            case 4:
                if (Build.VERSION.SDK_INT >= 30) {
                    C1070w c1070w = new C1070w(view, 3);
                    c1070w.f16296c = view;
                    this.f16209b = c1070w;
                } else {
                    this.f16209b = new C1052d(view, 3);
                }
                break;
            default:
                this.f16209b = view;
                break;
        }
    }

    public C1052d(ContentInfo contentInfo) {
        this.f16208a = 2;
        contentInfo.getClass();
        this.f16209b = U2.D.l(contentInfo);
    }

    public C1052d(ClipData clipData, int i7, int i10) {
        this.f16208a = i10;
        switch (i10) {
            case 1:
                this.f16209b = U2.D.j(clipData, i7);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f16209b = new C1052d(clipData, i7, 1);
                } else {
                    C1053e c1053e = new C1053e();
                    c1053e.f16212b = clipData;
                    c1053e.f16213c = i7;
                    this.f16209b = c1053e;
                }
                break;
        }
    }
}
