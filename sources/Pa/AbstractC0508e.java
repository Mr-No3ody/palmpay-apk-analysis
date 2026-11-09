package Pa;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: Pa.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0508e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f7078a = new Regex("^\\d{10,11}$");

    public static boolean a(Context context, String accountNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountNo, "accountNo");
        try {
            if (Intrinsics.c(c(context), accountNo)) {
                Object systemService = context.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    try {
                        try {
                            if (clipboardManager.hasPrimaryClip()) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    clipboardManager.clearPrimaryClip();
                                } else {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception unused3) {
            return false;
        }
    }

    public static String b(String accountNo) {
        Intrinsics.checkNotNullParameter(accountNo, "accountNo");
        int length = accountNo.length();
        if (length == 10) {
            String strSubstring = accountNo.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = accountNo.substring(3, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String strSubstring3 = accountNo.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return CollectionsKt.J(C1850q.h(strSubstring, strSubstring2, strSubstring3), "  ", null, null, null, 62);
        }
        if (length != 11) {
            return accountNo;
        }
        String strSubstring4 = accountNo.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        String strSubstring5 = accountNo.substring(3, 7);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        String strSubstring6 = accountNo.substring(7);
        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
        return CollectionsKt.J(C1850q.h(strSubstring4, strSubstring5, strSubstring6), "  ", null, null, null, 62);
    }

    public static String c(Context context) {
        ClipData primaryClip;
        CharSequence text;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0 && (text = primaryClip.getItemAt(primaryClip.getItemCount() - 1).getText()) != null && (string = text.toString()) != null) {
                String strK = kotlin.text.y.k(string, " ", "");
                if (f7078a.b(strK)) {
                    return strK;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean d() {
        try {
            return p183m6.n.f39523a.instance().b("featureClipboardAccountPrompt", true);
        } catch (Exception unused) {
            return true;
        }
    }
}
