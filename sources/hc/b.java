package hc;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendBean;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f37373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommonResult commonResult, Continuation continuation, ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem) {
        super(2, continuation);
        this.f37373a = commonResult;
        this.f37374b = modelDataBundleHighlyRecommendItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f37373a, continuation, this.f37374b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        boolean zC;
        String string;
        String str;
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f37373a;
        ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37374b;
        DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean = null;
        Object obj2 = null;
        dataBundleHighlyRecommendItemBean = null;
        if (commonBeanResult != null && commonBeanResult.isSuccess()) {
            DataBundleHighlyRecommendBean dataBundleHighlyRecommendBean = (DataBundleHighlyRecommendBean) commonBeanResult.data;
            List<DataBundleHighlyRecommendItemBean> list = dataBundleHighlyRecommendBean != null ? dataBundleHighlyRecommendBean.items : null;
            if (list == null) {
                list = z.f38935a;
            }
            for (Object obj3 : list) {
                DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean2 = (DataBundleHighlyRecommendItemBean) obj3;
                String str2 = modelDataBundleHighlyRecommendItem.f31791v;
                if (str2 == null || StringsKt.F(str2) || (str = dataBundleHighlyRecommendItemBean2.billerId) == null || StringsKt.F(str)) {
                    String str3 = dataBundleHighlyRecommendItemBean2.billerName;
                    if (str3 == null || (string = StringsKt.V(str3).toString()) == null) {
                        zC = false;
                    } else {
                        String str4 = modelDataBundleHighlyRecommendItem.f31792w;
                        if (string.equalsIgnoreCase(str4 != null ? StringsKt.V(str4).toString() : null)) {
                            zC = true;
                        } else {
                            zC = false;
                        }
                    }
                } else {
                    zC = Intrinsics.c(modelDataBundleHighlyRecommendItem.f31791v, dataBundleHighlyRecommendItemBean2.billerId);
                }
                if (zC) {
                    DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = dataBundleHighlyRecommendItemBean2.item;
                    if ((dataBundleWalletItemChildBean != null ? dataBundleWalletItemChildBean.getPrice() : 0L) > 0) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
            dataBundleHighlyRecommendItemBean = (DataBundleHighlyRecommendItemBean) obj2;
        }
        int i7 = ModelDataBundleHighlyRecommendItem.f31780B;
        modelDataBundleHighlyRecommendItem.e(dataBundleHighlyRecommendItemBean);
        return Unit.f38893a;
    }
}
