package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {
    public static Font r(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iT = t(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int iT2 = t(fontStyle, font2.getStyle());
            if (iT2 < iT) {
                font = font2;
                iT = iT2;
            }
        }
        return font;
    }

    public static FontFamily s(androidx.core.provider.j[] jVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (androidx.core.provider.j jVar : jVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(jVar.f16128a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(jVar.f16130c).setSlant(jVar.f16131d ? 1 : 0).setTtcIndex(jVar.f16129b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException unused) {
                continue;
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int t(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.o
    public final Typeface f(Context context, Y.c cVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (Y.d dVar : cVar.f11237a) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.f11243f).setWeight(dVar.f11239b).setSlant(dVar.f11240c ? 1 : 0).setTtcIndex(dVar.f11242e).setFontVariationSettings(dVar.f11241d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(r(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public final Typeface g(Context context, androidx.core.provider.j[] jVarArr, int i7) {
        try {
            FontFamily fontFamilyS = s(jVarArr, context.getContentResolver());
            if (fontFamilyS == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyS).setStyle(r(fontFamilyS, i7).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public final Typeface h(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyS = s((androidx.core.provider.j[]) list.get(0), contentResolver);
            if (fontFamilyS == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyS);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily fontFamilyS2 = s((androidx.core.provider.j[]) list.get(i10), contentResolver);
                if (fontFamilyS2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyS2);
                }
            }
            return customFallbackBuilder.setStyle(r(fontFamilyS, i7).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public final Typeface i(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.o
    public final Typeface j(Context context, Resources resources, int i7, String str, int i10) {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public final androidx.core.provider.j n(androidx.core.provider.j[] jVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
