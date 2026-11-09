package kotlin.text;

import com.google.android.material.navigation.NavigationBarView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER)
public final class CharsKt extends C1862a {
    private CharsKt() {
    }

    public static boolean b(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }
}
