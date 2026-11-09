package Ga;

import C0.G;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.UploadContactsReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3194a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3195b = c.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3196c = {"contact_id", "display_name", "data1", "data2", "contact_last_updated_timestamp", "starred"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f3197d = {"contact_id", "data1"};

    public static int a(Context context, ArrayList arrayList, int i7) {
        String str;
        List<UploadContactsReq.Contact.Number> list;
        String str2 = "";
        String str3 = f3195b;
        StringBuilder sb2 = new StringBuilder("data1 ASC");
        sb2.append(" limit 200 ");
        if (i7 > 0) {
            sb2.append(" offset " + i7 + " ");
        }
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f3196c, "has_phone_number = '1'", null, sb2.toString());
        if (cursorQuery == null) {
            return 0;
        }
        HashMap map = new HashMap();
        int count = cursorQuery.getCount();
        try {
            int columnIndex = cursorQuery.getColumnIndex("contact_id");
            int columnIndex2 = cursorQuery.getColumnIndex("display_name");
            int columnIndex3 = cursorQuery.getColumnIndex("data1");
            int columnIndex4 = cursorQuery.getColumnIndex("data2");
            int columnIndex5 = cursorQuery.getColumnIndex("contact_last_updated_timestamp");
            int columnIndex6 = cursorQuery.getColumnIndex("starred");
            while (cursorQuery.moveToNext()) {
                cursorQuery.getCount();
                int i10 = cursorQuery.getInt(columnIndex);
                String string = cursorQuery.getString(columnIndex2);
                String string2 = cursorQuery.getString(columnIndex3);
                int i11 = cursorQuery.getInt(columnIndex4);
                long j6 = cursorQuery.getLong(columnIndex5);
                int i12 = cursorQuery.getInt(columnIndex6);
                if (!TextUtils.isEmpty(string2)) {
                    Intrinsics.e(string2);
                    String strK = y.k(y.k(y.k(string2, " ", str2), "-", str2), "+", str2);
                    if (map.containsKey(Integer.valueOf(i10))) {
                        try {
                            Integer num = (Integer) map.get(Integer.valueOf(i10));
                            if (num == null || (list = ((UploadContactsReq.Contact) arrayList.get(num.intValue())).numbers) == null) {
                                str = str2;
                            } else {
                                str = str2;
                                try {
                                    list.add(new UploadContactsReq.Contact.Number(strK, i11));
                                } catch (Exception e10) {
                                    e = e10;
                                    F6.d.c(str3, "getContact 1: ", e);
                                    Unit unit = Unit.f38893a;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = str2;
                        }
                    } else {
                        str = str2;
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new UploadContactsReq.Contact.Number(strK, i11));
                            Intrinsics.e(string);
                            arrayList.add(new UploadContactsReq.Contact(j6, string, arrayList2, i12));
                            map.put(Integer.valueOf(i10), Integer.valueOf(arrayList.size() > 0 ? arrayList.size() - 1 : 0));
                            if (arrayList.size() >= 200) {
                                count = arrayList.size();
                                break;
                            }
                        } catch (Exception e12) {
                            F6.d.c(str3, "getContact 2: ", e12);
                        }
                    }
                    str2 = str;
                }
            }
        } catch (Exception e13) {
            F6.d.c(str3, "getContact 3: ", e13);
        } finally {
            cursorQuery.close();
        }
        return count;
    }

    public static CommonResult b(String str, String str2, ArrayList arrayList, boolean z3, int i7, String str3) {
        try {
            PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
            if (str2 == null) {
                str2 = "4";
            }
            return (CommonResult) payApiService.uploadContactList(new UploadContactsReq(str2, str, arrayList, z3, i7, str3, i7, null, 128, null)).k(p298tf.f.f42629b).b();
        } catch (Exception e10) {
            F6.d.c(f3195b, "upload: ", e10);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int count;
        int i7;
        Boolean bool = Boolean.TRUE;
        String[] params = (String[]) objArr;
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Context context = BaseApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f3197d, "has_phone_number = '1'", null, null);
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    count = 0;
                }
                i7 = count;
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                int i10 = 100;
                boolean z3 = true;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = new ArrayList();
                    Context context2 = BaseApplication.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    int iA = a(context2, arrayList, i11);
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        if (iA < size) {
                            iA = size;
                        }
                        boolean z8 = iA < 200 || i11 + iA >= i7;
                        int i12 = i11;
                        int i13 = iA;
                        CommonResult commonResultB = b(params[0], params[1], arrayList, z8, i7, params[2]);
                        if (commonResultB == null || !commonResultB.isSuccess()) {
                            commonResultB = b(params[0], params[1], arrayList, z8, i7, params[2]);
                        }
                        if (commonResultB == null || !commonResultB.isSuccess()) {
                            if (z3 && ("4".equals(params[1]) || "2".equals(params[1]))) {
                                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_UPLOAD_CONTACTS_FAILED));
                            }
                        } else if (z3 && ("4".equals(params[1]) || "2".equals(params[1]))) {
                            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_UPLOAD_CONTACTS_SUCCESS));
                        }
                        if (commonResultB != null && commonResultB.isSuccess()) {
                            i11 = i12 + i13;
                            if (z8 || (i10 = i10 - 1) <= 0) {
                                break;
                            }
                            z3 = false;
                        } else {
                            break;
                        }
                    } else {
                        if (!"4".equals(params[1]) && !"2".equals(params[1])) {
                            break;
                        }
                        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_UPLOAD_CONTACTS_SUCCESS));
                        break;
                    }
                }
            } else {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_UPLOAD_CONTACTS_SUCCESS));
            }
        } catch (Exception e10) {
            if ("4".equals(params[1]) || "2".equals(params[1])) {
                G.u(MessageEvent.EVENT_UPLOAD_CONTACTS_FAILED, org.greenrobot.eventbus.c.b());
            }
            e10.printStackTrace();
        }
        return bool;
    }
}
