package p285sc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p025ba.k;
import p295tc.b;

/* JADX INFO: renamed from: sc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2027a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f42203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnCommentListActivity f42204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2027a(CommonResult commonResult, Continuation continuation, ReferEarnCommentListActivity referEarnCommentListActivity) {
        super(2, continuation);
        this.f42203a = commonResult;
        this.f42204b = referEarnCommentListActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2027a(this.f42203a, continuation, this.f42204b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2027a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f42203a;
        if (commonBeanResult != null) {
            int i7 = ReferEarnCommentListActivity.f31856i;
            ReferEarnCommentListActivity referEarnCommentListActivity = this.f42204b;
            referEarnCommentListActivity.l().c();
            referEarnCommentListActivity.l().setRefreshing(false);
            if (commonBeanResult.isSuccess()) {
                T t = commonBeanResult.data;
                if (t != 0) {
                    CommentResp commentResp = (CommentResp) t;
                    if (commentResp.list != null) {
                        referEarnCommentListActivity.f31859c = commentResp.totalPage;
                        int i10 = commentResp.curPage;
                        referEarnCommentListActivity.f31860d = i10;
                        if (i10 == 1) {
                            ArrayList arrayList = referEarnCommentListActivity.f31861e;
                            if (arrayList == null) {
                                Intrinsics.n("mCommentList");
                                throw null;
                            }
                            arrayList.clear();
                        }
                        if (referEarnCommentListActivity.f31860d >= referEarnCommentListActivity.f31859c) {
                            referEarnCommentListActivity.l().b(referEarnCommentListActivity.getString(k.core_list_end));
                        }
                        ArrayList arrayList2 = referEarnCommentListActivity.f31861e;
                        if (arrayList2 == null) {
                            Intrinsics.n("mCommentList");
                            throw null;
                        }
                        arrayList2.addAll(((CommentResp) commonBeanResult.data).list);
                        b bVar = referEarnCommentListActivity.f31858b;
                        if (bVar != null) {
                            ArrayList arrayList3 = referEarnCommentListActivity.f31861e;
                            if (arrayList3 == null) {
                                Intrinsics.n("mCommentList");
                                throw null;
                            }
                            bVar.f4985b = arrayList3;
                        }
                        if (bVar != null) {
                            bVar.notifyDataSetChanged();
                        }
                    }
                }
            } else {
                ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
            }
        }
        return Unit.f38893a;
    }
}
