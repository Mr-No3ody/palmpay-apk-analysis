package Ga;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import Wf.y0;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.UploadContactsItemBean;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f3214b = new e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3215c = k.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f3216d = {"contact_id", "display_name", "data1"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f3217e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p015ag.c f3218a;

    public k() {
        p042cg.f fVar = I.f10809a;
        p042cg.e eVar = p042cg.e.f19009c;
        v0 v0VarC = AbstractC0780y.c();
        eVar.getClass();
        this.f3218a = AbstractC0777v.a(kotlin.coroutines.e.c(eVar, v0VarC));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(k kVar, Ff.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i7 = fVar.f3202c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fVar.f3202c = i7 - Integer.MIN_VALUE;
            } else {
                fVar = new f(kVar, cVar);
            }
        } else {
            fVar = new f(kVar, cVar);
        }
        Object objCheckContactListResult = fVar.f3200a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = fVar.f3202c;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(objCheckContactListResult);
            PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
            fVar.f3202c = 1;
            objCheckContactListResult = payApiService.checkContactListResult(fVar);
            if (objCheckContactListResult == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(objCheckContactListResult);
        }
        CommonBeanResult commonBeanResult = (CommonBeanResult) objCheckContactListResult;
        return Boolean.valueOf(commonBeanResult.isSuccess() && Intrinsics.c(commonBeanResult.data, Boolean.TRUE));
    }

    public static final void b(k kVar) {
        AbstractC0777v.c(kVar.f3218a, null);
        f3214b.setCurrentTask(null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object c(k kVar, Ff.c cVar) throws Throwable {
        h hVar;
        List list;
        CommonResult commonResult;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i7 = hVar.f3208d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                hVar.f3208d = i7 - Integer.MIN_VALUE;
            } else {
                hVar = new h(kVar, cVar);
            }
        } else {
            hVar = new h(kVar, cVar);
        }
        h hVar2 = hVar;
        Object objF = hVar2.f3206b;
        Object obj = Ef.a.f2423a;
        int i10 = hVar2.f3208d;
        String str = f3215c;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    list = hVar2.f3205a;
                    androidx.camera.core.impl.utils.executor.g.M(objF);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(objF);
                }
                commonResult = (CommonResult) objF;
                if (commonResult != null && commonResult.isSuccess()) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            androidx.camera.core.impl.utils.executor.g.M(objF);
            Context context = BaseApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f3216d, "has_phone_number = '1'", null, null);
            int count = 0;
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                    cursorQuery.close();
                } catch (Exception e10) {
                    F6.d.c(str, "getContactCount error: ", e10);
                }
            }
            if (count <= 0) {
                return Boolean.TRUE;
            }
            ArrayList arrayList = new ArrayList();
            Context context2 = BaseApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            d(context2, arrayList);
            if (arrayList.isEmpty()) {
                return Boolean.TRUE;
            }
            hVar2.f3205a = arrayList;
            hVar2.f3208d = 1;
            Object objF2 = kVar.f(arrayList, hVar2);
            if (objF2 == obj) {
                return obj;
            }
            list = arrayList;
            objF = objF2;
            commonResult = (CommonResult) objF;
            if (commonResult == null || !commonResult.isSuccess()) {
                hVar2.f3205a = null;
                hVar2.f3208d = 2;
                objF = kVar.f(list, hVar2);
                if (objF == obj) {
                    return obj;
                }
                commonResult = (CommonResult) objF;
            }
            if (commonResult != null) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e11) {
            F6.d.c(str, "executeUpload error: ", e11);
            return Boolean.FALSE;
        }
    }

    public static void d(Context context, ArrayList arrayList) {
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f3216d, "has_phone_number = '1'", null, "data1 ASC limit 1000 ");
        if (cursorQuery != null) {
            cursorQuery.getCount();
            try {
                int columnIndex = cursorQuery.getColumnIndex("data1");
                int columnIndex2 = cursorQuery.getColumnIndex("display_name");
                if (columnIndex == -1) {
                    return;
                }
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    if (!TextUtils.isEmpty(string) && string.length() <= 50) {
                        String strK = y.k(y.k(y.k(string, " ", ""), "-", ""), "+", "");
                        if (TextUtils.isDigitsOnly(strK) || e(strK)) {
                            arrayList.add(new UploadContactsItemBean(strK, string2));
                        }
                    }
                }
            } catch (Exception e10) {
                F6.d.c(f3215c, "getContact 3: ", e10);
            } finally {
                cursorQuery.close();
            }
        }
    }

    public static boolean e(String str) {
        int length = str.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean z8 = Intrinsics.h(str.charAt(!z3 ? i7 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                }
                length--;
            } else if (z8) {
                i7++;
            } else {
                z3 = true;
            }
        }
        if (TextUtils.isEmpty(str.subSequence(i7, length + 1).toString())) {
            return false;
        }
        return y.m(str, "*565*", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(List list, Ff.c cVar) throws Throwable {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i7 = iVar.f3211c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iVar.f3211c = i7 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objT = iVar.f3209a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = iVar.f3211c;
        String str = f3215c;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(objT);
                j jVar = new j(list, null);
                iVar.f3211c = 1;
                objT = AbstractC0780y.t(300000L, jVar, iVar);
                if (objT == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(objT);
            }
            return (CommonResult) objT;
        } catch (y0 e10) {
            F6.d.c(str, "upload timeout after 300000ms", e10);
            return null;
        } catch (Exception e11) {
            F6.d.c(str, "upload error: ", e11);
            return null;
        }
    }
}
