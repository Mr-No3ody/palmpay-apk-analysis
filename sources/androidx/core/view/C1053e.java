package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: androidx.core.view.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1053e implements ContentInfoCompat$BuilderCompat, ContentInfoCompat$Compat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16211a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f16212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f16215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f16216f;

    public /* synthetic */ C1053e() {
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public C1054f build() {
        return new C1054f(new C1053e(this));
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public ClipData getClip() {
        return this.f16212b;
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public Bundle getExtras() {
        return this.f16216f;
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public int getFlags() {
        return this.f16214d;
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public Uri getLinkUri() {
        return this.f16215e;
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public int getSource() {
        return this.f16213c;
    }

    @Override // androidx.core.view.ContentInfoCompat$Compat
    public ContentInfo getWrapped() {
        return null;
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setClip(ClipData clipData) {
        this.f16212b = clipData;
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setExtras(Bundle bundle) {
        this.f16216f = bundle;
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setFlags(int i7) {
        this.f16214d = i7;
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setLinkUri(Uri uri) {
        this.f16215e = uri;
    }

    @Override // androidx.core.view.ContentInfoCompat$BuilderCompat
    public void setSource(int i7) {
        this.f16213c = i7;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f16211a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f16212b.getDescription());
                sb2.append(", source=");
                int i7 = this.f16213c;
                if (i7 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i7 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i7 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i7 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i7 != 4) {
                    strValueOf = i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i10 = this.f16214d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                Uri uri = this.f16215e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return C0.G.r(sb2, this.f16216f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C1053e(C1053e c1053e) {
        ClipData clipData = c1053e.f16212b;
        clipData.getClass();
        this.f16212b = clipData;
        int i7 = c1053e.f16213c;
        p118hf.a.h(i7, 0, 5, "source");
        this.f16213c = i7;
        int i10 = c1053e.f16214d;
        if ((i10 & 1) == i10) {
            this.f16214d = i10;
            this.f16215e = c1053e.f16215e;
            this.f16216f = c1053e.f16216f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
