package p337w8;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.tencent.mmkv.MMKV;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f43322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f43323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f43322a = list;
        this.f43323b = lVar;
        this.f43324c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f43322a, this.f43323b, this.f43324c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List list = this.f43322a;
        boolean zIsEmpty = list.isEmpty();
        String str = this.f43324c;
        l lVar = this.f43323b;
        if (zIsEmpty) {
            int i7 = l.f43326m;
            MMKV mmkvB = lVar.b();
            if (mmkvB != null) {
                mmkvB.remove(str);
            }
            return Unit.f38893a;
        }
        int i10 = l.f43326m;
        MMKV mmkvB2 = lVar.b();
        if (mmkvB2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String address = ((InetAddress) it.next()).getHostAddress();
                if (!TextUtils.isEmpty(address)) {
                    Intrinsics.checkNotNullExpressionValue(address, "address");
                    linkedHashSet.add(address);
                }
            }
            linkedHashSet.toString();
            if (!linkedHashSet.isEmpty()) {
                mmkvB2.j(str, linkedHashSet);
            }
        }
        return Unit.f38893a;
    }
}
