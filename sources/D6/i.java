package D6;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f1655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f1656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f1657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap f1659g;

    public i(h directive, float f10, Boolean bool, File file, g gVar, String str, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(directive, "directive");
        this.f1653a = directive;
        this.f1654b = f10;
        this.f1655c = bool;
        this.f1656d = file;
        this.f1657e = gVar;
        this.f1658f = str;
        this.f1659g = bitmap;
    }

    public static i a(i iVar, h hVar, float f10, Boolean bool, File file, g gVar, String str, Bitmap bitmap, int i7) {
        if ((i7 & 1) != 0) {
            hVar = iVar.f1653a;
        }
        h directive = hVar;
        if ((i7 & 2) != 0) {
            f10 = iVar.f1654b;
        }
        float f11 = f10;
        if ((i7 & 4) != 0) {
            bool = iVar.f1655c;
        }
        Boolean bool2 = bool;
        if ((i7 & 8) != 0) {
            file = iVar.f1656d;
        }
        File file2 = file;
        if ((i7 & 16) != 0) {
            gVar = iVar.f1657e;
        }
        g gVar2 = gVar;
        if ((i7 & 32) != 0) {
            str = iVar.f1658f;
        }
        String str2 = str;
        if ((i7 & 64) != 0) {
            bitmap = iVar.f1659g;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(directive, "directive");
        return new i(directive, f11, bool2, file2, gVar2, str2, bitmap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1653a == iVar.f1653a && Float.compare(this.f1654b, iVar.f1654b) == 0 && Intrinsics.c(this.f1655c, iVar.f1655c) && Intrinsics.c(this.f1656d, iVar.f1656d) && this.f1657e == iVar.f1657e && Intrinsics.c(this.f1658f, iVar.f1658f) && Intrinsics.c(this.f1659g, iVar.f1659g);
    }

    public final int hashCode() {
        int iHashCode = (Float.hashCode(this.f1654b) + (this.f1653a.hashCode() * 31)) * 31;
        Boolean bool = this.f1655c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        File file = this.f1656d;
        int iHashCode3 = (iHashCode2 + (file == null ? 0 : file.hashCode())) * 31;
        g gVar = this.f1657e;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.f1658f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.f1659g;
        return iHashCode5 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "SelfieUiState(directive=" + this.f1653a + ", progress=" + this.f1654b + ", flash=" + this.f1655c + ", selfieToConfirm=" + this.f1656d + ", processingState=" + this.f1657e + ", errorMessage=" + this.f1658f + ", lastImage=" + this.f1659g + ")";
    }

    public /* synthetic */ i() {
        this(h.InitialInstruction, 0.0f, Boolean.FALSE, null, null, null, null);
    }
}
