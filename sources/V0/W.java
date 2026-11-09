package V0;

import com.alibaba.android.arouter.utils.Consts;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class W {
    public /* synthetic */ W(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String deriveTraceTagFromClassName(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Consts.DOT}, false, 0, 6, null);
        String str2 = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) CollectionsKt.K(listSplit$default);
        return str2.length() <= 127 ? str2 : kotlin.text.F.z(127, str2);
    }

    private W() {
    }
}
