package X0;

import N8.q0;
import V0.C;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkTagDao;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10966a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(C.d("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) it.next();
            androidx.work.impl.model.d systemIdInfo = systemIdInfoDao.getSystemIdInfo(p140j8.f.j(kVar));
            Integer numValueOf = systemIdInfo != null ? Integer.valueOf(systemIdInfo.f18586c) : null;
            String str = kVar.f18612a;
            String strJ = CollectionsKt.J(workNameDao.getNamesForWorkSpecId(str), ",", null, null, null, 62);
            String strJ2 = CollectionsKt.J(workTagDao.getTagsForWorkSpecId(str), ",", null, null, null, 62);
            StringBuilder sbQ = q0.q(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, str, "\t ");
            sbQ.append(kVar.f18614c);
            sbQ.append("\t ");
            sbQ.append(numValueOf);
            sbQ.append("\t ");
            sbQ.append(kVar.f18613b.name());
            sbQ.append("\t ");
            sbQ.append(strJ);
            sbQ.append("\t ");
            sbQ.append(strJ2);
            sbQ.append('\t');
            sb2.append(sbQ.toString());
        }
        Intrinsics.checkNotNullExpressionValue(sb2.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
