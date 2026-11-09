package Y;

import M.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f11254a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f11255b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11256c = new Object();

    public static Typeface a(int i7, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i7, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    public static Typeface b(Context context, int i7, TypedValue typedValue, int i10, h hVar, boolean z3, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i7) + "\" (" + Integer.toHexString(i7) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            l lVar = androidx.core.graphics.h.f16066b;
            Typeface typeface = (Typeface) lVar.get(androidx.core.graphics.h.b(resources, i7, string, i11, i10));
            if (typeface != null) {
                if (hVar != null) {
                    hVar.callbackSuccessAsync(typeface, null);
                }
                typefaceA = typeface;
            } else if (!z8) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat$FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntryI = a.i(resources, resources.getXml(i7));
                        if (fontResourcesParserCompat$FamilyResourceEntryI == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (hVar != null) {
                                hVar.callbackFailAsync(-3, null);
                            }
                        } else {
                            typefaceA = androidx.core.graphics.h.a(context, fontResourcesParserCompat$FamilyResourceEntryI, resources, i7, string, typedValue.assetCookie, i10, hVar, z3);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        Typeface typefaceJ = androidx.core.graphics.h.f16065a.j(context, resources, i7, string, i10);
                        if (typefaceJ != null) {
                            lVar.put(androidx.core.graphics.h.b(resources, i7, string, i12, i10), typefaceJ);
                        }
                        if (hVar != null) {
                            if (typefaceJ != null) {
                                hVar.callbackSuccessAsync(typefaceJ, null);
                            } else {
                                hVar.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceA = typefaceJ;
                    }
                } catch (IOException e10) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e10);
                    if (hVar != null) {
                        hVar.callbackFailAsync(-3, null);
                    }
                } catch (XmlPullParserException e11) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e11);
                    if (hVar != null) {
                        hVar.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (hVar != null) {
            hVar.callbackFailAsync(-3, null);
        }
        if (typefaceA != null || hVar != null || z8) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }
}
